import java.util.Scanner;

public class MockQ1
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);

        // Create arrays to store customer details
        String names[] = new String[5];
        int accountNumbers[] = new int[5];
        char transactionTypes[] = new char[5];
        double amounts[] = new double[5];

        // Input customer transaction details
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter Customer " + (i + 1) + " Name: ");
            names[i] = k.nextLine();

            System.out.print("Enter Account Number: ");
            accountNumbers[i] = k.nextInt();
            
            k.nextLine(); // Consume newline left-over

            System.out.print("Enter Transaction Type (D/W): ");
            transactionTypes[i] = k.nextLine().charAt(0);

            System.out.print("Enter Amount: ");
            amounts[i] = k.nextDouble();
            
            k.nextLine(); // Consume newline left-over
        }

        // Initialize variables to calculate totals and counts
        double totalDeposit = 0.0;
        double totalWithdrawal = 0.0;
        int depositCount = 0;
        int withdrawalCount = 0;

        double maxDepositAmount = 0;
        double maxWithdrawalAmount = 0;
        String maxDepositCustomer = "";
        String maxWithdrawalCustomer = "";

        for (int i = 0; i < 5; i++) 
        {
            if (transactionTypes[i] == 'D' || transactionTypes[i] == 'd') 
            {
                totalDeposit += amounts[i];
                depositCount++;

                if (amounts[i] > maxDepositAmount) 
                {
                    maxDepositAmount = amounts[i];
                    maxDepositCustomer = names[i];
                }
            } 
            else if (transactionTypes[i] == 'W' || transactionTypes[i] == 'w') 
            {
                totalWithdrawal += amounts[i];
                withdrawalCount++;

                if (amounts[i] > maxWithdrawalAmount) 
                {
                    maxWithdrawalAmount = amounts[i];
                    maxWithdrawalCustomer = names[i];
                }
            }
        }

        // Output results
        System.out.println("Total Deposit Amount is: " + totalDeposit);
        System.out.println("Total Withdrawal Amount is: " + totalWithdrawal);
        System.out.println("Count of All Deposit Transactions is: " + depositCount);
        System.out.println("Count of All Withdrawal Transactions is: " + withdrawalCount);
        System.out.println("Maximum Deposit Amount Customer Name is: " + maxDepositCustomer);
        System.out.println("Maximum Withdrawal Amount Customer Name is: " + maxWithdrawalCustomer);

        k.close();
    }
}
