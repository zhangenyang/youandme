package com.bootdo.project.controller;

import com.bootdo.project.model.Contactor;
import com.bootdo.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/getContactorByIds")
    public List<Contactor> getContactorByIds(){
        return testService.getContactorByIds();
    }
}
