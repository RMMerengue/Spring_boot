package com.itheima.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    //remote
//    @CreateCache(area = "sms",name="jetCache", expire = 3600, timeUnit = TimeUnit.SECONDS)
    @CreateCache(name="jetCache", expire = 3600, timeUnit = TimeUnit.SECONDS,cacheType = CacheType.LOCAL)
    private Cache<String, String> jetCache;

    @Override
    public String sendCodeToSMS(String tel) {
        String code = codeUtils.generator(tel);
        jetCache.put("tel",code);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = jetCache.get(smsCode.getTel());
        return smsCode.getCode().equals(code);
    }


}
