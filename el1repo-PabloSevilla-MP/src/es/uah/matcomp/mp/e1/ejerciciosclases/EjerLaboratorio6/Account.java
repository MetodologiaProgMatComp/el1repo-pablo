package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio6;

public class Account {
    String id;
    String name;
    int balance=0;
    public Account(String id, String name) {
        this.id=id;
        this.name=name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance= amount+balance;
        return balance;
    }
    public int debit(int amount){
        if (amount>balance){
            System.out.println("Amount exceeded balance");
        }
        else{
            balance= balance-amount;
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (amount<=balance){
            balance=balance-amount;
            another.balance=another.balance+amount;
            return balance;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id= "+id+", name= "+name+", balance= "+balance+"]";
    }
}
