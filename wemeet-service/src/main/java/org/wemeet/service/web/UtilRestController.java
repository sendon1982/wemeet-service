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

    @GetMapping("/1")
    public ResponseEntity<TestInfo> test2332() {
        System.out.println("getting request 1");
        TestInfo testInfo = new TestInfo();
        testInfo.setId(1);
        testInfo.setName("test2332");
        return new ResponseEntity<>(testInfo, HttpStatus.ACCEPTED);
    }

    @Data
    class TestInfo {
        private int id;
        private String name;
    }
}
