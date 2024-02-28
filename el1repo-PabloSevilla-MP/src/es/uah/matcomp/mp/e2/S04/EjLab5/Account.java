package es.uah.matcomp.mp.e2.S04.EjLab5;
import java.text.DecimalFormat;
public class Account {
    int id;
    Customer customer;
    double balance= 0.0;
    DecimalFormat formato= new DecimalFormat(".##");

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customer+"   balance= $"+formato.format(balance);
    }

    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        balance=balance+amount;
        return new Account(id,customer,balance);
    }
    public Account withdraw(double amount){
        if (balance>=amount){
            balance=balance-amount;
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return new Account(id,customer,balance);
    }

}
