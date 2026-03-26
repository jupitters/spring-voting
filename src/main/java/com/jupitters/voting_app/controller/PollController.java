package com.jupitters.voting_app.controller;

import com.jupitters.voting_app.model.Poll;
import com.jupitters.voting_app.service.PollService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/polls")
public class PollController {
    private final PollService pollService;

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll){
        return pollService.createPoll(poll);
    }

    public List<Poll> getAllPolls(){
        return pollService.getAllPolls();
    }
}
