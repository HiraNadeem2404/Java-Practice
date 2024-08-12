package Java;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;

        dateCreated= new Date();
    }
    public void displayInfo(){
        System.out.println("Id= " + this.id);
        System.out.println("Balance= " + this.balance);
        System.out.println("Anuual Interest Rate= " + this.annualInterestRate);
        System.out.println("Date= " + this.dateCreated);
    }
    public boolean withdraw(double amount){

        if(balance>=amount) {
            balance = balance - amount;
            return true;
        }
        else {
            System.out.println("Insufficient Balance.");
            return false;
        }
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated + "\n";
    }
}
