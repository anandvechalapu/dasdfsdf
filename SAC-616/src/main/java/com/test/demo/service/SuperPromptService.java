package com.test.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.demo.model.SuperPrompt;
import com.test.demo.repository.SuperPromptRepository;

@Service
public class SuperPromptService {

    @Autowired
    private SuperPromptRepository superPromptRepository;

    public List<SuperPrompt> findByApplication(String application) {
        return superPromptRepository.findByApplication(application);
    }

    public List<SuperPrompt> findByUserExperience(String userExperience) {
        return superPromptRepository.findByUserExperience(userExperience);
    }

    public List<SuperPrompt> findByUserInteraction(String userInteraction) {
        return superPromptRepository.findByUserInteraction(userInteraction);
    }

    public SuperPrompt findByApplicationAndUserExperienceAndUserInteraction(String application, String userExperience, String userInteraction) {
        return superPromptRepository.findByApplicationAndUserExperienceAndUserInteraction(application, userExperience,
                userInteraction);
    }

}