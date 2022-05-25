package com.sm.springWebMVCHttpMessageConverters;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest{

    @Autowired
    MockMvc mockMvc ; //@WebMvcTest를 사용하면 자동으로 Bean으로 등록됨.

    @Test
    public void createUser_JSON() throws Exception{
        String userJson = "{\"username\": \"sangmoon\", \"password\":\"1234\"}";

        mockMvc.perform(post("/users/create") //요청을 만드는 단계
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(userJson))
                //응답을 확인하는 단계
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.username",is(equalTo("sangMoon"))))
                .andExpect(jsonPath("$.password",is(equalTo("1234"))));
    }
}