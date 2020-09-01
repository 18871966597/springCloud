package com.springcloud.eurekaclient.eurekaclient.controller;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 *
 * @author ll Create on 20/8/27 18:40
 * @version 1.0
 */
@RestController
public class Controller {

    @RequestMapping(value = "/second/test", method = RequestMethod.GET)
    public String test() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("test", "测试服务接口1");
        return jsonObject.toString();
    }
}
