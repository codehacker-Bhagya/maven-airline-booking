package com.bhagya.service;

import com.bhagya.model.Flight;
import com.bhagya.model.Passenger;
import com.bhagya.repository.FlightRepository;

import java.sql.SQLException;
import java.util.*;

public class FlightService {

   private final FlightRepository flightRepository = new FlightRepository();
    private static final Scanner scanner = new Scanner(System.in);

    List<Flight> flightList = new ArrayList<>();


    public static void flightData(Flight flight){
        System.out.println(flight);
    }

    public boolean  flightInformation() throws NumberFormatException , SQLException {

        Flight flight = new Flight();

        System.out.println("Enter Flight Name ");
        try {
            String flightName = scanner.nextLine();
        } catch (NumberFormatException e){
            throw new NumberFormatException("Digits Not allowed enter correct flight Name");
        }

        System.out.println("Enter Flight No");
        int flightNo = Integer.parseInt(scanner.nextLine());

        System.out.println("Your Flight Time is 9 am. on 08/02/2025");
        System.out.println("Flight Status : Your reporting time is 7 am. ");

        return flightRepository.flightData(flight);
    }
    public List<Flight> displayFlight(){

        Flight flight = new Flight();
        List<Flight> flightList1 = flightRepository.flightInformation(flight);
       return flightList1;

    }

    public void deleteFlight() throws SQLException{
        Flight flight = new Flight();
        try{
            if(flightRepository.deleteflight(flight.getflightNo())){
                System.out.println("flight deleted successfully");
            }else {
                System.out.println("flight not deleted");
            }
        }catch (SQLException e){
            throw new SQLException(e);
        }
    }


}
