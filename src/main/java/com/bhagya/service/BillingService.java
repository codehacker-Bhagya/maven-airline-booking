package com.bhagya.service;

import com.bhagya.model.Billing;
import com.bhagya.model.Passenger;
import com.bhagya.repository.BillingRepository;
import com.bhagya.repository.PassengerRepository;

import java.util.*;

public class BillingService {

    private final BillingRepository billingRepository = new BillingRepository();

    private static final Scanner scanner = new Scanner(System.in);


    List<Billing> billingList = new ArrayList<>();


    public void billingData(Billing billing) {
        System.out.println(billing);
    }


    public boolean acceptBill() throws NumberFormatException {

        Billing billingAndCancellation = new Billing();


        System.out.println("Please Enter Your Payment Method");
        String MethodOfPayment = "online";
        try {
            String PaymentMethod = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Pls Enter valid input");
        }
        if (MethodOfPayment != "online") {
            System.out.println("Pls Fill the amount at next counter");
        } else {
            System.out.println("payment Successfull");
        }


        System.out.println("Enter Your upi id");
        int upiid = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();

        System.out.println("Thank You!!!");

        return billingRepository.acceptBill(billing);
    }

    public List<Billing>  displayBilling() {
        Billing billing = new Billing();
        List<Billing> billingList1 = billingRepository.displayBilling(billing);

        System.out.println("billing : " + billingList1);

        return billingList1;


    }
}
