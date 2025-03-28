package com.bhagya.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Billing {

    private String PaymentMethod;
    private int Upiid;

    public String getUPIid() {
    }

    public String getpaymentMethod() {
    }
}
