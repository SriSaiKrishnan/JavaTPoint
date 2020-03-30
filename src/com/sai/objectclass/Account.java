package com.sai.objectclass;

//Java Program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods

public class Account {

    int acc_num;
    String name;
    float amount;

    void insert(int a, String s, float amt){
        acc_num=a;
        name=s;
        amount=amt;
    }
    void display(){
        System.out.println(acc_num + " " + name + " " + amount);
    }
    void deposit(int a){
        amount=amount+a;
    }
    void withdraw(int a){
        if(a>amount){
            System.out.println("Insufficient balance");
        }else {
            amount=amount-a;
        }
    }
    void checkBalance(){
        System.out.println(amount);
    }
}

class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.insert(1,"abc",2000);
        account.checkBalance();
        account.deposit(200);
        account.checkBalance();
        account.withdraw(5000);
        account.withdraw(300);
        account.checkBalance();
        account.display();
    }
}