package org.lym.center.sms.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lym.center.sms.enums.MyEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping("ein")
    public Object ein(MyEnum v) {
        System.out.println(v);
        return v;
    }

    @RequestMapping("eout")
    public MyEnum eout() {
        return MyEnum.V1;
    }

    @RequestMapping("de")
    public MyEnum de() throws JsonProcessingException {
        return objectMapper.readValue("{\"name\":\"1\"}", MyEnum.class);
    }
}
