package com.sai.abstraction;

interface Bank{
    public void rateOfInterest();
}

class HDFC implements Bank{

    @Override
    public void rateOfInterest() {
    System.out.println("The Rate of Interest Of HDFC is " + 8);
    }
}

class HSBC implements Bank{

    @Override
    public void rateOfInterest() {
    System.out.println("The Rate of Interest of HSBC is " + 7);
    }
}

public class TestInterface2 {

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.rateOfInterest();
        HSBC hsbc = new HSBC();
        hsbc.rateOfInterest();
    }

}
