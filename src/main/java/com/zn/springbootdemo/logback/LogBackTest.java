package com.zn.springbootdemo.logback;

import com.zn.springbootdemo.domain.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ning on 22/8/18.
 */

@RestController
public class LogBackTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("log")
    public Object testLog() {

        logger.debug("this is debug level");
        logger.info("this is info level ");
        logger.warn("this is warn level ");
        logger.error("this is error level");
        return JsonData.buildSuccess();

    }
}