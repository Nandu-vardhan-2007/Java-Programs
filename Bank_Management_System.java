import java.util.Scanner;
public class Bank_Management_System {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        
        while(isRunning){
        System.out.println("***************");
        System.out.println("Banking Program");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");
        System.out.print("Enter Your Choice (1-4): ");

        int choice = sc.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
        }

    }

    static void showBalance(double balance){
        System.out.printf("₹%.2f\n",balance);
    }

    static double deposit(){
        double amount;
        System.out.println("Enter The Amount To Be Deposited: ");
        amount = sc.nextInt();
        if(amount<0){
            System.out.println("Amount Can't Be In Negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter Amount To Be Withdrawn: ");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount Can't Be In Negative");
            return 0;
        }
        else{
            return amount;
        }

    }
}
