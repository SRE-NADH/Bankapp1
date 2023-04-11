public interface Bank {

    int checkBalance();

    boolean addMoney(int money);

    boolean withDraw(int money);

    int getROI();

    int totalIntrest(int loanAmount, int timeinYear);
}
