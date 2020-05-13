package com.testgit.gittest.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 吴凡
 * @date 2020/5/12 21:20
 */
@RestController
public class BaseController {

    @GetMapping("/index")
    public ResponseEntity<String> getService() {
        return new ResponseEntity("<h1>123</h1>", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> testService() {
        return new ResponseEntity("<h1>hello</h1>", HttpStatus.OK);
    }
}
