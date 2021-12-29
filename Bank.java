import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Bank {

    private int ID;
    private String address;


    public ArrayList<Customer> customers;

    Bank(int ID, String address) {
        this.ID = ID;
        this.address = address;
        customers = new ArrayList<Customer>();
    }

    public int getID() {
        return ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void add_costumer(String name, String dateofbirth, int ID, int numberaccounts) {
    if (numberaccounts > 3 ) {

        System.out.println("Error : A customer can't have more than 3 account please try again later");
        System.out.println();
        return;
    }
        if (customers.size() == 0) {
            customers.add(new Customer(name, dateofbirth, ID, numberaccounts));
            for (int i = 0; i < numberaccounts; i++) {

                Scanner in = new Scanner(System.in);
                Scanner in2 = new Scanner(System.in);
                System.out.print("Please provide an ID for the account number " + (i + 1) + " :");
                int input = in.nextInt();
                customers.get(0).accounts[i].setAccountID(input);
                System.out.println();
                System.out.print("please provide a password for the account number" + (i + 1) + " :");
                String string_input = in2.nextLine();
                customers.get(0).accounts[i].setPassowrd(string_input);
                customers.get(0).accounts[i].setOwner_name(name);
                System.out.println();

            }


            return;
        } else {
            boolean id_check = true;

            for (int i = 0; i < customers.size(); i++) {

                if (customers.get(i).getID() == ID) id_check = false;

            }
            if (id_check == false) System.out.println("Error: The ID already exists please try again.");
            else if (numberaccounts > 3) System.out.println("Error: Costumer can only have a maximum of 3 accounts");
            else {
                customers.add(new Customer(name, dateofbirth, ID, numberaccounts));
                for (int k = 0; k < customers.size(); k++) {

                    if (customers.get(k).getID() == ID) {
                        for (int i = 0; i < numberaccounts; i++) {

                            Scanner in = new Scanner(System.in);
                            Scanner in2 = new Scanner(System.in);
                            System.out.print("Please provide an ID for the account number " + (i + 1) + " :");
                            int input = in.nextInt();
                            customers.get(k).accounts[i].setAccountID(input);
                            System.out.println();
                            System.out.print("please provide a password for the account number" + (i + 1) + " :");
                            String string_input = in2.nextLine();
                            customers.get(k).accounts[i].setPassowrd(string_input);
                            customers.get(k).accounts[i].setPassowrd(name);
                        }
                    }

                }
            }
        }
    }

    public boolean customerexist(int costumerid, String name) {

        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getID() == costumerid && customers.get(i).getname().equals(name)) return true;

        }


        return false;
    }

    public boolean accountnumbercheck(int costumerid, String name) {

        for (int i = 0; i < customers.size(); i++) {

            if (customers.get(i).getID() == costumerid && customers.get(i).getname().equals(name)) {

                if (customers.get(i).getnumberofaccounts() > 3) return false;


            }


        }
        return true;

    }

    public boolean existingaccountid(int costumerid, String name, int id){

        for (int i = 0 ;i < customers.size(); i ++){

            if (customers.get(i).getID() == costumerid && customers.get(i).getname().equals(name)){

                for ( int f =0 ; f < customers.get(i).getnumberofaccounts()-1; f++){

                    if (customers.get(i).accounts[f].getAccountID() == id) return true;


                }


            }



        }

        return false;

    }


    public void addaccount (int costumerid, String name, int id , String  password){


        for (int i = 0 ; i< customers.size(); i++){

            if (customers.get(i).getID() == costumerid && customers.get(i).getname().equals(name)){

                customers.get(i).addaccount();
                int amount = customers.get(i).numberaccounts;
                customers.get(i).accounts[amount-1].setAccountID(id);
                customers.get(i).accounts[amount-1].setPassowrd(password);
                customers.get(i).accounts[amount-1].setOwner_name(name);

            }



        }



    }

public void LookUpCustomerInformation(int id , String costumername) {


    for (int i = 0 ; i< customers.size(); i++){

        if (customers.get(i).getID() == id && customers.get(i).getname().equals(costumername)){
        customers.get(i).printinfo();



        }
        else System.out.println("Sorry customer not found please try again later.");
    }



}
    public void deposit (Transactions t1){

        if (t1.getAmount() < 0 ) System.out.println("Canot deposit a negative amount to an account");
     else {
            for (int i = 0; i < customers.size(); i++) {

                if (customers.get(i).getID() == t1.getCustomer_id() && customers.get(i).getname().equals(t1.getRecipient())) {


                    for (int f = 0; f < customers.get(i).numberaccounts; f++) {

                        if (customers.get(i).accounts[f].getAccountID() == t1.getAccountID() && customers.get(i).accounts[f].getPassowrd().equals(t1.getPassword())) {
                            customers.get(i).accounts[f].deposit(t1.getAmount());
                            customers.get(i).accounts[f].transactions.add(t1);
                            System.out.println("The balance of the account after the deposit is: " + customers.get(i).accounts[f].getBalance());
                            return;
                        }
                        else {

                            System.out.println("account not found please try again later.");
                            return;
                        }

                    }


                }


            }


            System.out.println("Error: Customer name or ID are invalid please try again later");
            System.out.println();


        }


}

    public void Withdraw (Transactions t1){

        if (t1.getAmount() < 0 ) System.out.println("Canot withdraw a negative amount to an account");
        else {
            for (int i = 0; i < customers.size(); i++) {

                if (customers.get(i).getID() == t1.getCustomer_id() && customers.get(i).getname().equals(t1.getRecipient())) {


                    for (int f = 0; f < customers.get(i).numberaccounts; f++) {

                        if (customers.get(i).accounts[f].getAccountID() == t1.getAccountID() && customers.get(i).accounts[f].getPassowrd().equals(t1.getPassword())) {
                            customers.get(i).accounts[f].withdraw(t1.getAmount());
                            customers.get(i).accounts[f].transactions.add(t1);
                            System.out.println("The balance of the account after the deposit is: " + customers.get(i).accounts[f].getBalance());
                            return;
                        }
                        else {

                            System.out.println("account not found please try again later.");
                            return;
                        }

                    }


                }


            }


            System.out.println("Error: Customer name or ID are invalid please try again later");
            System.out.println();


        }


    }


}



