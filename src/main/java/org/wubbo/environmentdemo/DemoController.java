package org.wubbo.environmentdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping
    public String get() {
        return "Hello environment-demo 14:20!";
    }
}
