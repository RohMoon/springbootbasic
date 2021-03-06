package com.sm.springWebMVCHttpMessageConverters;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


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
                .andExpect(jsonPath("$.username",is(equalTo("sangmoon"))))
                .andExpect(jsonPath("$.password",is(equalTo("1234"))));
    }
    @Test// 여기서는 응답은 json으로 보내고 요청은 xml로 받는다.
    public void createUser_XML() throws Exception{
        String userJson = "{\"username\": \"sangmoon\", \"password\":\"1234\"}";

        mockMvc.perform(post("/users/create") //요청을 마드는 단계
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_XML)
                .content(userJson))
                //응답을 확인하는 단계
                .andExpect(status().isOk())
                .andExpect(xpath("/User/username").string("sangmoon"))
                .andExpect(xpath("/User/password").string("1234"));
    }
}