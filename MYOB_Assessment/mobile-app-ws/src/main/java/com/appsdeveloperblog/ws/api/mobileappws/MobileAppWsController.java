package com.appsdeveloperblog.ws.api.mobileappws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus; 
//import io.swagger.annotations.Api;


@RestController
@RequestMapping("myapp")
@ResponseStatus(HttpStatus.OK)
public class MobileAppWsController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World";
    }
    

}
