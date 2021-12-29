public class Transactions {


    private String transaction_type;
private String recipient;
private double amount;
private int AccountID;
private int creationtime;
private String password;
private int customer_id;

Transactions(String transaction_type , String recipient, double amount , int AccountID ,String  password , int customer_id  ){

    this.password = password;
    this.AccountID = AccountID;
    this.transaction_type = transaction_type;
    this.recipient = recipient;
    this.amount = amount;
    this.customer_id = customer_id;



}
public void setamount (double amount){

    this.amount = amount;
}


public void setRecipient(String input){
    this.recipient = input;
}

public void setTransaction_type(String type){

    this.transaction_type = type;
}
public double getAmount(){

    return amount;
}
public String getRecipient(){

    return recipient;
}
public String getTransaction_type(){
    return transaction_type;
    }


    public int getAccountID() {
        return AccountID;
    }

    public int getCreationtime() {
        return creationtime;
    }

    public String getPassword() {
        return password;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCreationtime(int creationtime) {
        this.creationtime = creationtime;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
