package com.sm;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
//@TestPropertySource(properties =  "my.age=2" , locations = "classpath:/test.properties")
@SpringBootTest
class ApplicationTest {
    /**
     * Unit test {@link Application#main(String[])}
     */
    @Autowired
    Environment environment;
    @Test
    public void contextLoads(){
//        assertThat(environment.getProperty("my.name"))
//                .isEqualTo("aramoon");
    }

}