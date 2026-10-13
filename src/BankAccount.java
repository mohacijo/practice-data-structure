void main() {
    savingAccount s=new savingAccount("SAV-1",200);
    CurrentAccount c=new CurrentAccount("CUR-1",200);
    StudentAccount studAccount=new StudentAccount("STU-1",200);

    System.out.println("Each account has 200. Each run runs withdraw 300");
    s.withdraw(300);s.show();
    c.withdraw(300);c.show();
    studAccount.withdraw(300);studAccount.show();

    System.out.println("student tyies to withdraw 80");
    studAccount.withdraw(80);
    studAccount.show();

}
public class BankAccount {
    private String accountNumber;
    protected double balance;

    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void withdraw(double amount){
        if(amount>balance) refuse("Not enough money");
        else balance-=amount;
    }
    public void refuse(String why){
        System.out.println(" "+accountNumber+"Refused"+why);
    }
    public void show(){
        System.out.println(" "+accountNumber+" Balance: "+balance);
    }
}
public class savingAccount extends BankAccount{
    savingAccount(String name,double balance){super(name,balance);}
    @Override
    public void withdraw(double amount){
        if(balance-amount<50) refuse("must keep atleast 50");
        else balance-=amount;
    }
}
public class CurrentAccount extends BankAccount{
    CurrentAccount(String name,double balance){super(name,balance);}
    @Override
    public void withdraw(double amount){
        if(balance-amount<-200) refuse("must keep atleast 50");
        else balance-=amount;
    }
}
public class StudentAccount  extends BankAccount{
    StudentAccount(String name,double balance){super(name,balance);}
    @Override
    public void withdraw(double amount){
        if(amount>100) refuse("Max 100 per withdrawal");
        else super.withdraw(amount);
    }
}