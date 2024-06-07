package com.github.moinmarcell.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public String getStatus() {
        return "I am running v2";
    }
}
