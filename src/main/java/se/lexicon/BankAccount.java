package se.lexicon;



public class BankAccount {
    // Fields
    public int counter;
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;



    /*  Constructor
    public BankAccount (int accountNumber,double balance, String customerName, String email, String phoneNumber){
        //Constructor
        this.accountNumber=accountNumber;
        this.balance = balance;
        this.customerName= customerName;
        this.email =email;
        this.phoneNumber=phoneNumber;
    }
    */
    // Getters && Setters

    public void setAccountNumber(int accountNumber) {
        if (accountNumber == 0) throw new IllegalArgumentException("AccountNumber is 0");
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public void setCustomerName(String customerName) {
        if (customerName == null) throw new IllegalArgumentException("customerName is null");
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email is null");
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) throw new IllegalArgumentException("PhoneNumber is null");
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String BankAccInformation() {
        return " BankAccount : " + accountNumber + "\n Balance\t : " + balance + "\n CustomerName: " + customerName + "\n Email\t\t : " + email + "\n PhoneNumber : " + phoneNumber;
    }
//Methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Value to deposit is less or equals with 0");
        } else {
            this.balance += amount;
        }
        System.out.println();
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Value to withdraw is less or equals with 0");
        } else if ((this.balance - amount) < 0) {
            System.out.println("Value to withdraw is greater than balance. Balance is insufficient!");
        } else {
            this.balance -= amount;
        }
    }


}
