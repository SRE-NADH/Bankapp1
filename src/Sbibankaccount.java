import java.util.UUID;

public class Sbibankaccount implements Bank{

    private int balance;

    private String name;

    private String password;
    private  int roi; // let's assume it's fixed now in percent
    private String Accountno;

    public Sbibankaccount(int balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.Accountno = String.valueOf(UUID.randomUUID());
        this.roi=5;
    }

    public Sbibankaccount(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance=0;
        this.Accountno = String.valueOf(UUID.randomUUID());
        this.roi=5;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public String getAccountno() {
        return Accountno;
    }

    public void setAccountno(String accountno) {
        Accountno = accountno;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance+=money;
        return true;
    }

    @Override
    public boolean withDraw(int money) {
        return false;
    }

    @Override
    public int getROI() {
        return 0;
    }

    @Override
    public int totalIntrest(int loanAmount, int timeinYear) {
        return loanAmount*timeinYear*roi/100;
    }
}
