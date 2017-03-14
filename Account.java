
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
   private int accNumber;
   private String accountType;
   private double accountBalance;
   
   public Account()
   {
   }
   
   public Account(int num, String type, double bal)
   {
       accNumber = num;
       accountType = type;
       accountBalance = bal;
   }
   
   public void setAccountNumber(int num)
   {
        accNumber = num;
   }
   
   public void setAccountType(String type)
   {
        accountType = type;
   }
   
   public void setAccountBalance(double bal)
   {
       accountBalance = bal;
   }
   
   public int getAccountNumber()
   {
       return accNumber;
   }
   
   public String getAccountType()
   {
       return accountType;
   }
   
   public double getAccountBalance()
   {
       return accountBalance;
   }
   
   public void withdraw(double amt)
   {
       accountBalance -= amt;
   }
   
   public void deposit(double amt)
   {
       accountBalance += amt;
   }
   
   public String toString()
   {
       String result = "\nAccount Number: " + accNumber + "\nAccount Type: " +  accountType + "\nAccount Balance: R " + accountBalance;
       return result;
   }
}
