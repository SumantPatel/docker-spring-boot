package com.spatel.dockerspringboot.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/hello")
public class HelloResource {

    Logger logger = LoggerFactory.getLogger(HelloResource.class);

    @GetMapping
    public String hello(){
        logger.info("Hello Resource");
        return "Hello Docker";
    }

}
