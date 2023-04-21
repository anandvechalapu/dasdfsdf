package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.SuperPrompt;
import com.test.demo.service.SuperPromptService;

@RestController
@RequestMapping(value = "/superprompt")
public class SuperPromptController {

    @Autowired
    private SuperPromptService superPromptService;

    @GetMapping(value = "/findByApplication")
    public ResponseEntity<List<SuperPrompt>> findByApplication(@RequestParam(name = "application") String application) {
        return ResponseEntity.ok(superPromptService.findByApplication(application));
    }

    @GetMapping(value = "/findByUserExperience")
    public ResponseEntity<List<SuperPrompt>> findByUserExperience(@RequestParam(name = "userExperience") String userExperience) {
        return ResponseEntity.ok(superPromptService.findByUserExperience(userExperience));
    }

    @GetMapping(value = "/findByUserInteraction")
    public ResponseEntity<List<SuperPrompt>> findByUserInteraction(@RequestParam(name = "userInteraction") String userInteraction) {
        return ResponseEntity.ok(superPromptService.findByUserInteraction(userInteraction));
    }

    @GetMapping(value = "/findByApplicationAndUserExperienceAndUserInteraction")
    public ResponseEntity<SuperPrompt> findByApplicationAndUserExperienceAndUserInteraction(
            @RequestParam(name = "application") String application,
            @RequestParam(name = "userExperience") String userExperience,
            @RequestParam(name = "userInteraction") String userInteraction) {
        return ResponseEntity.ok(superPromptService.findByApplicationAndUserExperienceAndUserInteraction(application, userExperience,
                userInteraction));
    }

}