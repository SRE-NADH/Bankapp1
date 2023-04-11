public class Main {
    public static void main(String[] args) {

        Sbibankaccount account1 = new Sbibankaccount(20,"sreenadh","sree");
        account1.addMoney(5000);
       System.out.println(account1.checkBalance());
        System.out.println(account1.getBalance());
    }
}