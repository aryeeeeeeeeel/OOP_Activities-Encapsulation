class BankAccount {

    private String name;
    private int age;
    private int accountNumber;
    private double balance;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAccountnumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        this.balance = 0.0;
    }
    public void  deposit(double amount){
        if(amount > 0){
            balance += amount;
        System.out.println("Deposited P" + amount);
    }else{
    System.out.println("Invalid deposit amount");
    }
}
    public void displaySummary(){
     System.out.println("\nAccount Summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("Balance: P" + balance);

    }
}