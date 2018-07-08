package com.example.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Student;
import com.example.demo.service.MusicService;

@Controller
public class MusicController {
	
	 private static Logger log = LoggerFactory.getLogger(MusicController.class);
	
	@GetMapping("/music")
    @ResponseBody
    public void sayHello() {
        
		
        log.info("************Music Controller****");
        
    }
	
	@GetMapping("/echoStudentName/{name}")
    @ResponseBody
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name)
    {
        return new Student(name, "Pune", "MCA");
    }
 
    
    
    

}
