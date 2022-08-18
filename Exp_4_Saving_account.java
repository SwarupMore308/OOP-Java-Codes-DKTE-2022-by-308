

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
        //double totalInterest = (this.savingBalance * SavingAccount.annualInterestRate) / 12; 
        //this.savingBalance = this.savingBalance + totalInterest;
        //System.out.println(SavingAccount.annualInterestRate+" "+this.savingBalance);
        //double yearlyInterest = SavingAccount.annualInterestRate / 100;
        //double monthlyInterest = yearlyInterest/12;
        double interestAmmount =   ((SavingAccount.annualInterestRate / 100)/12) * this.savingBalance;
        //System.out.println(interestAmmount);
        this.savingBalance = this.savingBalance + interestAmmount;
    }

    static void modifyInterestRate(double annualInterestRate){
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    double getSavingBalance(){
        return savingBalance;
    }
}



class Exp_4_Saving_account{

    void startCalculating(SavingAccount saver1, SavingAccount saver2){
        saver1.calculateMonthlySalary();
        saver2.calculateMonthlySalary();
    }

    void displayBalance(SavingAccount saver1,SavingAccount saver2){
        System.out.println("Saver 1: "+saver1.getSavingBalance());
        System.out.println("Sarver 2: "+saver2.getSavingBalance());
    }

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        Exp_4_Saving_account ex = new Exp_4_Saving_account();

        System.out.println("------:Bank Details:------");
        System.out.println("Account Balance: ");
        ex.displayBalance(saver1, saver2);

        saver1.setAnnualInterestRate(4.0);
        saver2.setAnnualInterestRate(4.0);

        ex.startCalculating(saver1,saver2);

        System.out.println("------:After 4% Interest:------");
        ex.displayBalance(saver1, saver2);

        SavingAccount.modifyInterestRate(5.0);

        ex.startCalculating(saver1, saver2);

        System.out.println("------:After 5% Interest:------");
        ex.displayBalance(saver1, saver2);
    }
}