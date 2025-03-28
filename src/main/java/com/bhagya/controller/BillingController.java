package com.bhagya.controller;

import com.bhagya.Exception.InvalidUidException;
import com.bhagya.service.BillingService;
import com.bhagya.service.PassengerService;

import java.sql.SQLException;
import java.util.Scanner;

import static com.bhagya.service.PassengerService.scanner;

public class BillingController {

    private final Scanner sc = new Scanner(System.in);

    public void run() throws NumberFormatException, SQLException {

        int option = 0;

        BillingService billingService = new BillingService();

        do {
            System.out.println("enter Your Option");
            System.out.println("1. Make Payement");
            System.out.println("2. Display Billing");
            System.out.println("0. Back to main menu");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {

                case 1:
                    billingService.acceptBill();
                    break;


                case 2:
                    billingService.displayBilling();


            }

        } while (option != 0);
    }
}