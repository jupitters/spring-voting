package com.jupitters.voting_app.controller;

import com.jupitters.voting_app.model.Poll;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {
    public Poll createPoll(@RequestBody Poll poll){

    }
}
