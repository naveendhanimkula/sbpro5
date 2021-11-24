package com.dxc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo 
{
  @RequestMapping("/")
  public String view() {
	  return "hi naveen posted to github sucess";
  }
}
