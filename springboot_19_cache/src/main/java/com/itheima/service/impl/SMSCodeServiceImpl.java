package com.itheima.service.impl;

import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    @Override
//    @Cacheable(value = "smsCode", key = "#tel")
    @CachePut(value = "smsCode", key = "#tel")
    public String sendCodeToSMS(String tel) {
        String code = codeUtils.generator(tel);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = smsCode.getCode();
        String cacheCode = codeUtils.get(smsCode.getTel());
        return code.equals(cacheCode);
    }


}
