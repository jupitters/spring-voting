package com.jupitters.voting_app.repository;

import com.jupitters.voting_app.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
