


//task-3 ATM interface
import java.util.Scanner;

class ATM{
    //balance 
    private double balance;
    //parameterized constructor
    public ATM(double initialbalance){
        this.balance = initialbalance;
    }
    //to check balance in account 
    public double getBalance(){
        return balance;
    }
    //to deposit amount
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit Successfull !!! \n << Deposited an amount of "+amount+" >>");
        }
        else{
            System.out.println("<<  Deposit a proper amount!!..  >>");
        }
    }
    public void withdraw(double amount){
        if(amount >0 && amount <= balance){
            if(amount == balance){
                System.out.println("Dear Customer!! \n Please maintain minimum fund of Rs.1000");
            }
             balance -= amount;
            System.out.println("Withdrawal Successful !!! \n <<Withdrawal of amount "+amount+" >>");
        }
        else{
            System.out.println("Insufficient funds!!! << withdrawal failed >>");
        }
    }
}
class bank
{   private ATM account;
    private Scanner sc;
    public bank(ATM account){
    this.account = account;
    this.sc = new Scanner(System.in);
    }
    public void display(){
        
        while(true){
            System.out.println("****    ATM Menu    ****");
            System.out.println("    1. Check Balance");
            System.out.println("    2. Deposit");
            System.out.println("    3. Withdraw");
            System.out.println("    4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting from main menu!!!");
                    System.out.println("**** Thanks for visting MY ATM ****");
                    System.out.println("### click run to continue the services again !!");
                    return;
                default:
                System.out.println("Dear Customer!!, \n Invalid option clicked!!!, Please try again with a vaild option");
            }
        }
    }
    private void checkBalance(){
            System.out.println("Current Balance: Rs."+account.getBalance());
        }
    private void deposit(){
            System.out.print("Enter the deposit amount: Rs.");
            double damount = sc.nextDouble();
            account.deposit(damount);
        }
    private void withdraw(){
            System.out.print("Enter the withdraw amount: Rs.");
            double wamount = sc.nextDouble();
            account.withdraw(wamount);
        }
}
public class Main{ 
	public static void main(String[] args) {
		System.out.println("     ***WELCOME TO MY ATM ! ****");
		System.out.println("Options available in our ATM, for your ease of your convenience");
		ATM userAccount = new ATM(5000);
		bank user = new bank(userAccount);
		user.display();
	}
}

