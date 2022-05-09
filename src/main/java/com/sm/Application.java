package com.sm;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hello")
    public String hello(){
        return "hello Spring!";
    }
    /*
    //static Method 사용 커스터마이징 할 수 없음.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    */
    //위와 동일한 코드지만 분해하여 커스터마이징이 가능하다.
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new SampleListener());
        app.run(args);
   }

    // SpringApplicationBuilder
/*    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);
    }*/

    @Bean
    public ServletWebServerFactory serverFactory(){
        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.addAdditionalTomcatConnectors(createStandardConnector()); //톰캣에 Connector 추가
        return tomcatServletWebServerFactory;
    }

    private Connector createStandardConnector(){
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080); // 포트 설정 (https랑 달라야함.)
        return connector;
    }
}
