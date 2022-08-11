package com.itheima.service;

import com.itheima.domain.SMSCode;

public interface SMSCodeService {
    public String sendCodeToSMS(String tel);
    public boolean checkCode(SMSCode smsCode);
}
