package com.dms.bees.core.util;

import com.dms.bees.config.properties.beesProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(beesProperties.class).getKaptchaOpen();
    }
}