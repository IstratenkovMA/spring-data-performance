package com.example.springdataperformance.type;

import lombok.Getter;
import lombok.Setter;

//will be serialised as an Id of entity value
@Getter
public enum PhoneType {
    MOBILE(0),
    STATIONARY(1),
    WORK(2),
    FRIEND(3);
    private final Integer id;

    PhoneType(int id) {
        this.id = id;
    }
}
