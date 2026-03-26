package com.jupitters.voting_app.service.impl;

import com.jupitters.voting_app.model.Poll;
import com.jupitters.voting_app.repository.PollRepository;
import com.jupitters.voting_app.service.PollService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PollServiceImpl implements PollService {
    private final PollRepository pollRepository;

    @Override
    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    @Override
    public List<Poll> getAllPolls(){
        return null;
    }

}
