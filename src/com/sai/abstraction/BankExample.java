package com.sai.abstraction;

abstract class BankExample {

    abstract int rateOfInterest();
}

class SBI extends BankExample{

    @Override
    int rateOfInterest() {
        return 7;
    }
}

class ICICI extends BankExample{

    @Override
    int rateOfInterest() {
        return 8;
    }
}

class TestBank{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("Rate of Interest of SBI is " + sbi.rateOfInterest());
        ICICI icici = new ICICI();
        System.out.println("Rate of Interest of ICICI is " + icici.rateOfInterest());
    }
}