package org.lym.center.sms.service;


import org.lym.center.sms.dto.EmailDTO;

public interface EmailSender {

    void send(EmailDTO mail) throws Exception;

}
