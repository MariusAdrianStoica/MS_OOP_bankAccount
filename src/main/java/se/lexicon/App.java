package se.lexicon;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "BankAccount Exercise!" );
        System.out.println("***************************************************");

        BankAccount A = new BankAccount();


        A.setAccountNumber(12345);
        A.setBalance(1000);
        A.setCustomerName("Test Testsson");
        A.setEmail("ttestsson@yahoo.com");
        A.setPhoneNumber("0767123456");


        System.out.println("BankAccount info is: \n" + A.BankAccInformation());
        A.deposit(500);
        System.out.println("BankAccount info after deposit is: \n" + A.BankAccInformation());


        System.out.println();
        BankAccount B = new BankAccount();

        B.setAccountNumber(123456789);
        B.setCustomerName("Tester2");
        System.out.println("BankAccount info is: \n" + B.BankAccInformation());
        System.out.println("________________________________");
        B.withdraw(500);
        System.out.println("BankAccount info after withdraw is: \n" + B.BankAccInformation());


        System.out.println("________________________________");
        B.deposit(1000);
        System.out.println("BankAccount info after deposit is: \n" + B.BankAccInformation());
        System.out.println("________________________________");
        B.withdraw(500);
        System.out.println("BankAccount info after withdraw is: \n" + B.BankAccInformation());
        System.out.println("________________________________");

        System.out.println("Codeby : Marius Stoica");
        System.out.println("Have a good day!");
    }
}
