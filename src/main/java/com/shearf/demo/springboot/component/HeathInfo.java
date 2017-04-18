package com.shearf.demo.springboot.component;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by xiahaihu2009@gmail on 2017/4/8.
 */
@Component
public class HeathInfo implements HealthIndicator {

    @Override
    public Health health() {
        return Health.outOfService().build();
    }
}
