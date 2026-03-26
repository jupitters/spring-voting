package com.jupitters.voting_app.service;

import com.jupitters.voting_app.model.Poll;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PollService {
    Poll createPoll(Poll poll);
    List<Poll> getAllPolls();
    Poll getPollById(Long id);
}
