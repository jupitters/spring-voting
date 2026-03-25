package com.jupitters.voting_app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OptionVote {
    private String option;
    private Long voteCount;
}
