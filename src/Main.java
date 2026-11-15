public class Main{
    public static void main(String[] args){

      BankAccount account1 , account2 ;
      account1 = new BankAccount("or" , 1500);
      account2 = new BankAccount("alon" , 100);

        System.out.println("Account 1 ID: " + account1.getAccountId());
        System.out.println("Account 2 ID: " + account2.getAccountId());

        account1.deposit(500);
        account2.withdraw(200);

        account1.transferTo(account2 , 300);
        account1.withdraw(3000);
        System.out.println(account1.getBalance());

        System.out.println("Account 1 info: " + account1.getAccountInfo());
        System.out.println("Account 2 info: " + account2.getAccountInfo());

        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());

        System.out.println("Next account ID: " + BankAccount.getNextAccountId());
        BankAccount account3;
        account3 = new BankAccount("eyal" , 50);
        System.out.println("Account 3 ID: " + account3.getAccountId());

        account3.deposit(-1000);
        System.out.println("Account 3 balance: " + account3.getBalance());

        System.out.println(account3.transferTo(account3 , 1000000));

        Bank bank1;
        bank1 = new Bank ("discount" , 2210);

        bank1.setAccounts(account1 , account2);

        System.out.println("Bank info: " + bank1.getBankInfo());
        System.out.println("Bank total balance: " + bank1.getTotalBalance());

    }

}
