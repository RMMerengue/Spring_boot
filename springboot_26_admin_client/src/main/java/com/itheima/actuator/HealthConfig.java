package com.itheima.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;

import java.util.HashMap;
import java.util.Map;

public class HealthConfig extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        boolean condition = true;
        if(condition){
            builder.status(Status.UP);
            builder.withDetail("runTime",System.currentTimeMillis());
            Map infoMap = new HashMap();
            infoMap.put("buildTime","2006");
            builder.withDetails(infoMap);
        }else{
            builder.status(Status.OUT_OF_SERVICE);
            builder.withDetail("上线了吗？","没有");
//            builder.down();
        }
    }

}
