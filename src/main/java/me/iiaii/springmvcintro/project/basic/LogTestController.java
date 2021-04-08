package me.iiaii.springmvcintro.project.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);
        log.trace("log={}", name);      // +를 사용하면 연산이 일어나기 때문에 ,를 사용해야함
        log.debug("log={}", name);
        log.info("log={}", name);
        log.warn("log={}", name);
        log.error("log={}", name);

        return "ok";
    }
}
