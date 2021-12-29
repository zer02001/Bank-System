import java.util.ArrayList;

public class Account {

    private int AccountID;
    private String owner_name;
    private int creation_time;
    private double balance;
   public ArrayList<Transactions> transactions;
    private String passowrd;

    public Account(){

        this.creation_time = 0;
        this.AccountID = 0;
        this.balance = 0;
        this.passowrd = "000";
        transactions  = new ArrayList<>();



    }
    public Account(int AccountID , String owner_name , int creation_time, double balance , String passowrd){

        this.creation_time =creation_time;
        this.AccountID = AccountID;
        this.balance = balance;
        this.passowrd = passowrd;
        transactions  = new ArrayList<>();



    }

    public double getBalance() {
        return balance;
    }

    public int getCreation_time(){


        return creation_time;
    }

    public void setCreation_time(int creation_time) {
        this.creation_time = creation_time;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }



    public String getPassowrd() {
        return passowrd;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

public void deposit (double amount ){

        this.balance += amount;
}

public void withdraw (double amount) {

    this.balance -= amount;

}


}
