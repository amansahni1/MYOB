package com.appsdeveloperblog.ws.api.mobileappws;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("myapp")
public class GetInfoController {
 

 @Autowired
 GetInfo myAppProperties;
 
 
 @GetMapping("/name")
 public String getAppTitle()
 {
  return myAppProperties.getName();
 }
 
 @GetMapping("/description")
 public String getAppDescription()
 {
  return myAppProperties.getDescription();
 }
 
 @GetMapping("/version")
 public String getAppVersion()
 {
  return myAppProperties.getVersion();
 }
 

}

