public class BankAccount {
    private int accountId;
    private String ownerName;
    private double balance;
    boolean isActive;
    static int nextId = 1000;
    private static int totalAccounts;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        accountId = nextId;
        nextId++;
        totalAccounts++;
        isActive = true;
        balance = 0.0;
    }
    public BankAccount(String ownerName, double initialBalance){
        this.ownerName = ownerName;
        accountId = nextId;
        nextId++;
        totalAccounts++;
        isActive = true;

        if(initialBalance<0){
            balance = 0.0;
        }
        else{
            balance = initialBalance;
        }
    }


    public boolean deposit(double amount)
    {
        if(isActive && isValidAmount(amount)){
            balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amount){

        if(isActive && isValidAmount(amount) && amount <= balance){
           balance -= amount;
           return true;
        }
        else{
            return false;
        }
    }

    public boolean transferTo(BankAccount destination, double amount){
        if(destination != null && destination.isActive && isActive && destination.accountId != accountId
                && balance >= amount && isValidAmount(amount)){
            balance -= amount;
            destination.balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean closeAccount(){
        if(isActive && balance == 0){
            isActive = false;
            return true;
        }
        else{
            return false;
        }
    }

    public String getAccountInfo(){
        return("Account Id: " + accountId + ", Owner Name: " + ownerName + ", Balance: " +
                balance + ", Account Status: " + isActive);
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance(){
        return balance;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        }
    }

    public static boolean isValidAmount(double amount){
        return amount > 0.0;
        }

    public static int getTotalAccounts(){
       return totalAccounts;
    }

    public static int getNextAccountId(){
        return nextId;
    }




}


