package org.lym.center.sms.notify.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author lym
 * @since 1.0
 */
@Component
public class EmailConsumer {

    private static final String DESTINATION = "sys.mail";

    @JmsListener(destination = DESTINATION)
    public void processMessage(String content) {

    }

}
