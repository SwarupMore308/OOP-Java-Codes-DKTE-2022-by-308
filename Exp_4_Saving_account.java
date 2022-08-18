

class SavingAccount{
    static double annualInterestRate;
    private double savingBalance;

    SavingAccount(){
        savingBalance = 0.0;
    }
    SavingAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }

    void setAnnualInterestRate(double annualInterestRate){
       SavingAccount.annualInterestRate = annualInterestRate;
    }

    void calculateMonthlySalary(){
        double totalInterest = (this.savingBalance * SavingAccount.annualInterestRate) / 12; 
        this.savingBalance = this.savingBalance + totalInterest;
    }

    static void modifyInterestRate(double annualInterestRate){
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    double getSavingBalance(){
        return savingBalance;
    }
}



class Exp_4_Saving_account{

    void startCalculating(SavingAccount server1, SavingAccount server2){
        server1.calculateMonthlySalary();
        server2.calculateMonthlySalary();
    }

    void displayBalance(SavingAccount server1,SavingAccount server2){
        System.out.println("Server 1: "+server1.getSavingBalance());
        System.out.println("Server 2: "+server2.getSavingBalance());
    }

    public static void main(String[] args) {
        SavingAccount server1 = new SavingAccount(2000);
        SavingAccount server2 = new SavingAccount(3000);
        Exp_4_Saving_account ex = new Exp_4_Saving_account();

        System.out.println("---:Bank Details:---");
        System.out.println("Account Balance: ");
        ex.displayBalance(server1, server2);

        server1.setAnnualInterestRate(4.0);
        server2.setAnnualInterestRate(4.0);

        ex.startCalculating(server1,server2);

        System.out.println("---:After 4% Interest:---");
        ex.displayBalance(server1, server2);

        SavingAccount.modifyInterestRate(5.0);

        ex.startCalculating(server1, server2);

        System.out.println("---:After 5% Interest:---");
        ex.displayBalance(server1, server2);
    }
}