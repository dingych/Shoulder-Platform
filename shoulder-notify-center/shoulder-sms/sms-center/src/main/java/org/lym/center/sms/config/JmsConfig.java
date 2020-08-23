package org.lym.center.sms.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author lym
 * @since 1.0
 */
//@Configuration
public class JmsConfig {

    @Bean
    @ConditionalOnMissingBean
    public JmsTemplate jmsTemplate() {
        return new JmsTemplate();
    }

}
