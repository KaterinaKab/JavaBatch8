package javaclass13;

public class BankApplication {
    public static void main(String[] args) {
        Account BurjusAccount=new Account();

        BurjusAccount.accountId="123";
        BurjusAccount.userName="Borju";
        BurjusAccount.password="pass123";
        BurjusAccount.balance=1000000;
        BurjusAccount.typeOfAccount="ckecking";
        BurjusAccount.limit=125;
        
        boolean isLoggedIn=BurjusAccount.login(
        "Burju","pass123");
        if (isLoggedIn) {
            System.out.println("Welcome");
        }else {
            System.out.println("Invalid user name or password");
        }

        double amountToTransfer=BurjusAccount.amountTransfer(100);
        if (amountToTransfer==0) {
            System.out.println("Insufficient");
        }else {
            System.out.println(amountToTransfer+" Transfered");
        }


    }
}
