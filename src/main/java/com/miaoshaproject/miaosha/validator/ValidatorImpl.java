package com.miaoshaproject.miaosha.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.xml.validation.Validator;

@Component
public class ValidatorImpl implements InitializingBean {
    private Validator validator;

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
