package com.simple.nativeimage.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student")
public interface StudentAPI {

    @GetMapping("/sample")
    String getSample();

}
