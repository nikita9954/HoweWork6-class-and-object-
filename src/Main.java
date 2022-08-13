import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CreditCard MTB=new CreditCard();
        CreditCard BTB=new CreditCard();
        CreditCard BSB=new CreditCard();
        MTB.getcreditcard(464664646, scanner.nextInt());
        BTB.getcreditcard(544667455, scanner.nextInt());
        BSB.getcreditcard(464564654, scanner.nextInt());
        MTB.newmoney1(scanner.nextInt());
        BTB.newmoney(scanner.nextInt());
        BSB.minusmoney(scanner.nextInt());









    }

}
