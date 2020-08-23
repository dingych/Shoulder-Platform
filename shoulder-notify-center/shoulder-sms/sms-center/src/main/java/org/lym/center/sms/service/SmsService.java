package org.lym.center.sms.service;

import org.lym.center.sms.param.SmsBatchParam;
import org.lym.center.sms.param.SmsParam;

public interface SmsService {
    /**
     * 发送短信
     *
     * @param smsParam 参数
     * @return 是否成功
     */
    boolean sendSms(SmsParam smsParam);

    /**
     * 批量发送短信
     *
     * @param smsBatchParam 参数
     */
    boolean sendSms(SmsBatchParam smsBatchParam);
}
