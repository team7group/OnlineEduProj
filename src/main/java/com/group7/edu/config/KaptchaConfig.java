package com.group7.edu.config;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration //配置验证码
public class KaptchaConfig {

    @Bean
    public Producer producer(){
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();

        Properties properties = new Properties();
        properties.setProperty(Constants.KAPTCHA_BORDER_COLOR,"black");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH,"4");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR,"pink");
        Config config = new Config(properties);

        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }





















}
