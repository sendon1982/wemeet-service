package org.wemeet.service.web;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class UtilRestController {

    private final

    @GetMapping("/1")
    void test2332() {
        System.out.println("getting request 1");
    }
}
