package org.lym.center.sms.constant;

/**
 * @author lym
 * @since 1.0
 */
public enum EmailTemplateTypeEnum {

    /**
     * 纯文本
     */
    TEXT(1),

    /**
     * 网页
     */
    HTML(2),

    /**
     * themeleaf
     */
    THYMELEAF(3),

    /**
     * freeMarker
     */
    FREEMARKER(4),

    ;

    private int value;

    EmailTemplateTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
