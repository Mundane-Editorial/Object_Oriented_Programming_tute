//ATM machine using objects and classes

package ATM_using_objects_n_Classes;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 7758;

    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pin");
        int enteredPin = sc.nextInt();
        if(enteredPin == PIN){
            menu();
        }else{
            System.out.println("Wrong PIN Entered");
            checkPin();
        }
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        int opt = sc.nextInt();

        switch(opt){
            case 1 :
                checkBalance();
                break;
            case 2 :
                withdrawMoney();
                break;
            case 3 :
                depositMoney();
                break;
            case 4 :
                return;
            default:
                System.out.println("Enter Valid option");
        }
    }

    private void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit : ");
        float amt = sc.nextFloat();
        Balance += amt;
        System.out.println("Amount Deposited successfully ");
        menu();
    }

    private void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amt = sc.nextInt();
        if(amt > Balance){
            System.out.println("Insufficient Funds");
        }else{
            System.out.println("Amount Withdrawn successfully ");
            Balance = Balance - amt;
            System.out.println("Available Balance : " + Balance);
        }
        menu();
    }

    private void checkBalance() {
        System.out.println("Balance: "+ Balance);
        menu();
    }
}
public class ATM_Machine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkPin();
    }
}
