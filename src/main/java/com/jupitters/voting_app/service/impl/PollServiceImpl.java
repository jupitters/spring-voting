package com.jupitters.voting_app.service.impl;

import com.jupitters.voting_app.model.Poll;
import com.jupitters.voting_app.repository.PollRepository;
import com.jupitters.voting_app.service.PollService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return pollRepository.findAll();
    }

    @Override
    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

    @Override
    public void vote(Long pollId, int optionIndex) {

    }
}
