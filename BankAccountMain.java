class BankAccountMain {
    public static void main(String[] args){

        BankAccount account = new BankAccount();

        account.setName("Ariel Sumantin");
        account.setAge(21);
        account.setAccountNumber(20211276);
        account.deposit(61000.0);
        account.deposit(8000.0);
        account.displaySummary();
    }
}