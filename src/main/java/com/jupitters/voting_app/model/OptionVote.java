package com.jupitters.voting_app.model;

import lombok.Data;

@Data
public class OptionVote {
    private String option;
    private Long voteCount;
}
