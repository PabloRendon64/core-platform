package com.inditex.core.platform.domain.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Price {

    private String name;
    private Double positionX;
    private Double positionY;
    private Double distance;
    private String[] message;

}
