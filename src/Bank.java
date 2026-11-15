public class Bank {
    private String bankName;
    private int bankCode;
    BankAccount account1;
    BankAccount account2;

    public Bank(String bankName, int bankCode){
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    public void setAccounts(BankAccount a, BankAccount b){
        this.account1 = a;
        this.account2 = b;
    }

    public double getTotalBalance() {
        return this.account1.getBalance() + this.account2.getBalance();
    }

    public String getBankInfo(){
        String info = "Bank name: " + bankName + "Bank Code: " + bankCode + "\n";

        if(account1 != null){
            info += "Account 1: " + account1.getAccountInfo();
        }
        else{
            info += "Account 1: none";
        }

        if(account2 != null){
            info += "Account 2: " + account2.getAccountInfo();
        }
        else{
            info += "Account 2: none";
        }
        return info;
    }

    public String getBankName(){
        return bankName;
    }

}
