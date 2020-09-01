package com.springcloud.eurekaconsumerclient.eurekaconsumerclient.controller;

import com.springcloud.eurekaconsumerclient.eurekaconsumerclient.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private InfoService infoservice;

    @RequestMapping(value = "/first/test", method = RequestMethod.GET)
    public String test() throws Exception {
        String test = infoservice.test();
        return test;
    }
}
