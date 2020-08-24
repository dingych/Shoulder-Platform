package org.lym.center.sms.notify.producer;

import org.lym.center.sms.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author lym
 */
//@Component
public class EmailProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void produce(EmailDTO email) {

    }
}
