package com.sober.demo.controller;

import com.sober.demo.entity.ApiResponse;
import com.sober.demo.exception.DemoReturnCode;
import com.sober.demo.exception.ServiceRuntimeException;
import com.sober.demo.pojo.Data;
import com.sober.demo.pojo.Person;
import com.sober.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Sober
 * @date: 2018/10/29
 */
//@Api(value = "demoService", description = "demo项目")
@RestController
@RequestMapping("api")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    DemoService demoService;

    //@ApiOperation(value = "测试Get请求")
    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    public ApiResponse testGet() {
        Data info = demoService.getInfo();
        LOGGER.info("LOGGER IS PRINT！");
        return ApiResponse.newSuccessInstance(info);
    }

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    public ApiResponse testPost() {
        Data info = demoService.getInfo();
        return ApiResponse.newSuccessInstance(info);
    }

    @RequestMapping(value = "/testPost2", method = RequestMethod.POST)
    public ApiResponse testPost2(@RequestBody Person person) {
        LOGGER.info(person.name +"   " + person.age);
        if (true) {
            throw new NumberFormatException("test unknownerror");
        }
        Data info = demoService.getInfo();
        return ApiResponse.newSuccessInstance(info);
    }

    @RequestMapping(value = "/testError", method = RequestMethod.GET)
    public ApiResponse testError() {
        if (true) {
            throw new ServiceRuntimeException(DemoReturnCode._SERVER_ERROR);
        }

        return ApiResponse.newSuccessInstance();
    }

    @RequestMapping(value = "/testError2", method = RequestMethod.GET)
    public ApiResponse testError2() {
        if (true) {
            throw new NumberFormatException("test unknownerror");
        }
        return ApiResponse.newSuccessInstance();
    }
}
