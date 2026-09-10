import java.util.*;
class atm
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in);
    int correctpin = 9451;
    double balance = 5000000;
    int choice;
    System.out.print("Enter Pin :");
    int pin = sc.nextInt();
    if(pin != correctpin)
    {
        System.out.print("Acces denied! Wrong pin");
        return ;
    }
        System.out.print("Welcome to ATM");
        do{
            System.out.println("ATM menu");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: System.out.println("\nYour balance is: ₹" + balance);
                break;
                case 2: System.out.print("Enter deposit amt: ");
                double amt = sc.nextDouble();
                if(amt > 0)
                {
                    balance = balance + amt;
                    System.out.println("Money deposit succesfully");
                    System.out.println("Updated balance is: " + balance);
                }
                else 
                {
                    System.out.println("Invalid amount");
                }
                break;
                case 3: System.out.print("Enter money to withdraw:");
                double withdraw = sc.nextDouble();
                if(withdraw > balance){
                    System.out.println("Insufficent balance!!");
                }
                else if(withdraw <=0){
                    System.out.println("invalid amount!");
                }
                else
                {
                    balance = balance - withdraw;
                    System.out.println("Updated balance is: " + balance);
                    System.out.println("Please collect your cash");
                }
                break;
                case 4: System.out.println("Thanks for using SBI ATM");
                break;
                default:
                    System.out.print("Invalid choice! Please try Again");
            }
             while (true);
        } while(choice != 4);
    }
}

