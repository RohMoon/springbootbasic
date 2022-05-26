package com.sm.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    Logger logger = LoggerFactory.getLogger(sampleController.class);
    @Autowired
    private SampleService sampleService;

    @GetMapping("/helloSample")
    public String hello() {
        logger.info("sangmoon");

        return "hello" + sampleService.getName();
    }

}
