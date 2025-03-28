package com.bhagya.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Ticket {


    private String seatPreference;
    private int ticketNo;
    private String AddMeal;
    private String Destination;
    private double TicketAmount;
    private String Status;

    public void setSeatPreference(String preference) {
    }

    public void setDestination(String destination) {
    }

    public void setAddMeal(String meal) {

    }

    public String getseatPreference() {
    }

    public String getAddMeal() {
    }

    public String getTicketAmount() {
    }

    public String getDestination() {
    }

    public int getticketNo() {
        return 0;
    }
}
