package com.bhagya.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Flight {

    private String FlightName;
    private int FlightNo;
    private int FlightTime;
    private String Destination;
    private String Status;

    public String getName() {
    }

    public String getflightNo() {
    }

    public String getdestination() {
    }
}
