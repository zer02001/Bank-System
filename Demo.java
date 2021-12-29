import java.util.Scanner;

public class Demo {


    public static void main(String [] args ){

        Bank bank1 = new Bank(01 , "2345");
        Scanner in  = new Scanner(System.in);
        int input = 0;
        String custumer_name;
        String dateofbirth;
        int Customer_id;
        int numberofaccounts;
        int account1_id, account2_id , account3_id;
        while(input != -1){
         System.out.println("Please choose one of the four options :  ");
         System.out.println("1. add a new customer to the bank");
         System.out.println("2. open a new account for an existing costumer");
         System.out.println("3. look up an existing customer information");
         System.out.println("4. new transaction for customer");
         System.out.print("choice: ");
         input =  in.nextInt();
        Scanner instring = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);
         if (input  == 1){

             System.out.print("Please enter the new costumer name: ");
             custumer_name  = instring.nextLine();
             System.out.println();
            System.out.print("Please enter The date of birth as (mm/dd/yyyy):");
            dateofbirth = in2.nextLine();
            System.out.println();
            System.out.print("Please enter the ID you want for the customer:");
            Customer_id = in3.nextInt();
            System.out.println();
            System.out.print("Please enter the number of accounts you would like(No more than 3 accounts): ");
            numberofaccounts = in4.nextInt();

            bank1.add_costumer(custumer_name, dateofbirth , Customer_id , numberofaccounts);



            }
            else if (input == 2){

                Scanner in7 = new Scanner(System.in);
                Scanner in8 = new Scanner(System.in);

                System.out.print(" Please enter the name of the costumer that you want to add an account to: ");
                String s1 = in7.nextLine();
                System.out.println();
                System.out.println("Please enter the ID of the costumer that you want to add the account to: ");
                 int  id1 = in8.nextInt();
                System.out.println();
              if (!bank1.customerexist(id1 , s1)){
                  System.out.println("costumer doesnot exist");

              }
              else if (!bank1.accountnumbercheck(id1 , s1)){

                  System.out.println("The costumer already has 3 which is the maximum amount for costumers");


              }

              else {
                Scanner in9 = new Scanner(System.in);
                  System.out.println ("costumer Found!!");
                  System.out.println("please enter the Account information.");
                  System.out.println();

                  System.out.print("Please enter the ID you would like for the account: ");
                  int idinput = in9.nextInt();
                 boolean check =   bank1.existingaccountid(id1 , s1 , idinput);
                if (check == false ){

                    System.out.println("Error: ID already exists for this costumer try again later");


                }

               else {
                   Scanner in10 = new Scanner(System.in);
                    System.out.println("Please provide the password you want for the account: ");
                    String password = in10.nextLine();

                    bank1.addaccount(id1, s1, idinput, password);
                    System.out.println("account added successfully thank you !!!");

                }



              }









         }


   else if (input == 3){

       Scanner in13 = new Scanner(System.in);
       Scanner in14 = new Scanner(System.in);
             System.out.print(" Please enter the name of the costumer that you want to look up : ");
             String s4 = in13.nextLine();
             System.out.println();
             System.out.println("Please enter the ID of the costumer that you want to look up:  ");
             int  id2 = in14.nextInt();
             System.out.println();

             bank1.LookUpCustomerInformation(id2 , s4);







         }


   else if (input == 4){
             int type1;


       do{
        Scanner type = new Scanner(System.in);
       System.out.println("Please choose the type of transaction your would like to make: ");
       System.out.println("1. deposit money into account");
       System.out.println("2.withdraw money from an account");
       System.out.print("choice: ");
       type1 = type.nextInt();} while (type1 != 1 && type1!= 2);


    Scanner tin1 = new Scanner(System.in);
    Scanner tin2 = new Scanner(System.in);
    Scanner tin3 = new Scanner(System.in);
    Scanner tin4 = new Scanner(System.in);
    Scanner tin5 = new Scanner(System.in);
    System.out.print(" Please enter the name of the costumer that you want to process the transaction: ");
    String s4 = tin1.nextLine();
    System.out.println();
    System.out.print("Please enter the ID of the costumer that you want to process the transaction : ");
    int id4 = tin2.nextInt();
    System.out.println();

    System.out.print("Please Enter the ID of the account you would like to: ");
    int aid6 = tin3.nextInt();

    System.out.print("PLease enter the password for the account: ");
    String password1 = tin4.nextLine();

    System.out.print("The amount you would like to withdraw or deposit: ");
    double amount = tin5.nextDouble();

   if (type1  == 1 ) {

       Transactions t1 = new Transactions("deposit" , s4 , amount , aid6 , password1 , id4);
       bank1.deposit(t1);

   }
   else if (type1 == 2 ) {

       Transactions t1 = new Transactions("Withdraw" , s4 , amount , aid6 , password1 , id4);
       bank1.Withdraw(t1);

   }





}






         }





         }
















        }





