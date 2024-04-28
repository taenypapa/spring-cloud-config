package com.taeny.papa.scc.client.controller;

import com.taeny.papa.scc.client.properties.DemoProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DemoController {
    private final DemoProperties demoProperties;

    @GetMapping("/demo")
    public ResponseEntity<DemoProperties> getDemoProperties() {
        return ResponseEntity.ok(demoProperties);
    }
}
