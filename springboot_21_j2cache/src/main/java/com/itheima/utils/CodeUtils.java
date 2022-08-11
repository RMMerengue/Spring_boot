package com.itheima.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CodeUtils {

    private String [] patch = {"00000", "0000", "000", "00", "0", ""};

    public String generator(String tel){
        int hash = tel.hashCode();
        int encryption = 20206666;
        long result = hash ^ encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();
        return patch[len-1] +codeStr;
    }

//    public static void main(String[] args) {
//        System.out.println(new CodeUtils().generator("18866668888"));
//    }
    @Cacheable(value = "smsCode", key = "#tel")
    public String get(String tel){
        return null;
    }
}
