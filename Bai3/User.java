package Bai2.Bai3;

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private double balance;
    public User()
    {

    }
    public User( double balance, String name) {
        this.id = UUID.randomUUID().toString();
        this.balance = balance;
        this.name = name;
    }

    public String getId() {
        return id;
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double amount){
        if(amount < 0 ){
            System.out.println("Linh tinh!");
            return;
        }
        this.balance += amount;
    }
    public void withDraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
