package com.hrc.hbs.hbskafkaservice.controller;

import com.hrc.hbs.hbskafkaservice.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        producerService.sendMessage("my-topic", message);
    }
}
