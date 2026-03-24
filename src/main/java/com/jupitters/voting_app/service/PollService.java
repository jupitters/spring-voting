package com.jupitters.voting_app.service;

import com.jupitters.voting_app.model.Poll;
import org.springframework.web.bind.annotation.RequestBody;

public interface PollService {
    Poll createPoll(Poll poll);
}
