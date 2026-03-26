package com.jupitters.voting_app.request;

import lombok.Data;

@Data
public class Vote {
    private Long pollId;
    private int optionIndex;
}
