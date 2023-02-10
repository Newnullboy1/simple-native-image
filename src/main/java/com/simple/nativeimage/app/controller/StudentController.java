package com.simple.nativeimage.app.controller;

import com.simple.nativeimage.app.api.StudentAPI;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController implements StudentAPI {


    @Override
    public String getSample() {
        return "Newnullboy";
    }
}
