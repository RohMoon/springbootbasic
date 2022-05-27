package com.sm.sample;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@WebMvcTest(SampleController2.class)
public class SampleControllerTest4 {

    @Autowired
    WebClient webClient;

    @Test
    public void hello() throws Exception{
        HtmlPage page = webClient.getPage("/hello");

        HtmlHeading1 h1 = page.getFirstByXPath("//h1");

        assertThat(h1.getTextContent()).isEqualToIgnoringCase("sangmoon");
    }

}