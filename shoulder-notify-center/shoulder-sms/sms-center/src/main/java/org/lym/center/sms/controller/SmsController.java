package org.lym.center.sms.controller;

import org.lym.center.sms.param.SmsParam;
import org.lym.center.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lym
 * @since 1.0
 */
@RestController
@RequestMapping("sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @Value("${test.sms.phoneNumber}")
    private String phoneNumber;

    @Value("${test.sms.template-code}")
    private String templateCode;

    @PostMapping("send")
    public boolean send(SmsParam param) {
        return smsService.sendSms(param);
    }

    @RequestMapping("test")
    public String test() {
        if (!"true".equals(System.getProperty("ebug"))) {
            throw new IllegalStateException("please add jvm launch param(-Debug=true)");
        }
        SmsParam param = SmsParam.newBuilder()
                .phoneNumber(phoneNumber)
                .templateCode(templateCode)
                .addTemplateParam("code", "test")
                .build();

        boolean result = smsService.sendSms(param);
        return "your are testing now, and result=" + result;
    }


}
