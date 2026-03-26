package com.jupitters.voting_app.service.impl;

import com.jupitters.voting_app.model.OptionVote;
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
        Poll poll = pollRepository.findById(pollId).get();
        List<OptionVote> options = poll.getOptions();
        if(optionIndex < 0 || optionIndex > options.size()){
            throw new IllegalArgumentException("Invalid option index");
        }

        OptionVote selectedOption = options.get(optionIndex);
        selectedOption.setVoteCount(selectedOption.getVoteCount() + 1);
        pollRepository.save(poll);
    }
}
