package org.lym.center.sms.controller;

import org.lym.center.sms.dto.EmailDTO;
import org.lym.center.sms.dto.UiResult;
import org.lym.center.sms.service.EmailSender;
import org.lym.center.sms.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Value("${test.email.receiver-address}")
    public String receiverAddress;
    //@Autowired
    private EmailService emailService;
    @Autowired
    private EmailSender emailSender;

    @GetMapping("testSend")
    public UiResult send() {
        EmailDTO emailDTO = new EmailDTO();

        emailDTO.setReceiver_emails(new String[]{receiverAddress});
        emailDTO.setContent("test");
        emailDTO.setContent("test");

        try {
            emailSender.send(emailDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return UiResult.error();
        }
        return UiResult.ok();
    }

    @PostMapping("list")
    public UiResult list(EmailDTO mail) {
        return emailService.listMail(mail);
    }
}
