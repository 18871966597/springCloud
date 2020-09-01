package com.springcloud.eurekaconsumerclient.eurekaconsumerclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * </p>
 *
 * @author ll Create on 20/8/27 17:10
 * @version 1.0
 */
@FeignClient(value = "provider")
public interface InfoService {

    @RequestMapping(value = "/second/test", method = RequestMethod.GET)
    public String test();
}
