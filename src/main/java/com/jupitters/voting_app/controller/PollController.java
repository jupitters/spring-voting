package com.jupitters.voting_app.controller;

import com.jupitters.voting_app.model.Poll;
import com.jupitters.voting_app.service.PollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public List<Poll> getAllPolls(){
        return pollService.getAllPolls();
    }

    public ResponseEntity<Poll> getPoll(Long id){
        Poll poll = pollService.getPoll(id);
        return ResponseEntity.ok(poll);
    }
}
