package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        try {
            Class<?> aClass = Class.forName("com.itheima.bean.Wolf");
            if(aClass != null){
                return new String[]{"com.itheima.bean.Cat"};
            }
        } catch (ClassNotFoundException e) {
            return new String[0];
        }
        return null;
    }
}
