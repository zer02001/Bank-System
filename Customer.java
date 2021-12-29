public class Customer {

    private String name;
    private String dateofbirth;

    private int ID;
    public int numberaccounts;
public Account accounts[]   ;


public Customer (String name, String dateofbirth , int ID , int numberaccounts ){

    this.name = name;
    this.dateofbirth = dateofbirth;
    this.ID = ID;
    this.numberaccounts = numberaccounts;
    accounts = new Account[3];
   accounts[0] = new Account();
    accounts[1] = new Account();
    accounts[2] = new Account();
}


    public String getname() {


        return name;
    }

    public String getDateofbirth() {

        return dateofbirth;


    }

    public int getID() {


        return ID;
    }


    public int getnumberofaccounts() {

        return numberaccounts;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setDateofbirth(String Dateofbirth) {

        this.dateofbirth = Dateofbirth;
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public void setNumber_Created_accounts(int amount) {
        numberaccounts = amount;

    }
public void addaccount(){


    numberaccounts +=1;
}


public void printinfo(){

    System.out.println("The date of birth of the customer is: "+ getDateofbirth());
    System.out.println("The Number of accounts the customer has: " +getnumberofaccounts());
    System.out.println();

    for (int k = 0; k <getnumberofaccounts() ; k++){

        System.out.println("Account number " + (k+1) +" information:");
        System.out.println("The account owner name is : "+ accounts[k].getOwner_name());
        System.out.println("The account balance is :  "+ accounts[k].getBalance() );
        System.out.println("The account ID  is :  "+ accounts[k].getAccountID() );
        System.out.println();


    }
}

    public int getNumberaccounts() {
        return numberaccounts;
    }

    public String getName() {
        return name;
    }

    public void setNumberaccounts(int numberaccounts) {
        this.numberaccounts = numberaccounts;
    }


}