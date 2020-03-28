package _10_Bank;

public class Account {

    public Account(String id){
        this.id = id;
        balance = 0;
    }

    private final String id;
    private Integer balance;
    public Integer getBalance(){ return this.balance;}
    public String getId(){ return this.id; }
    public void decrement(int sum){ this.balance -= sum;}
    public void increment(int sum){ this.balance += sum;}
}


