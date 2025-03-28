package com.bhagya.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Passenger {

    private String fullName;
    private long MoNo;
    private long UIDno;

    public long getUIDno() {
        return 0;
    }

    public String getName() {
    }

    public String getMoNo() {
    }
}
