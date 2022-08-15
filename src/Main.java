import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CreditCard MTB=new CreditCard();
        CreditCard BTB=new CreditCard();
        CreditCard BSB=new CreditCard();
        MTB.creditCard(464664646, scanner.nextInt());
        BTB.creditCard(544667455, scanner.nextInt());
        BSB.creditCard(464564654, scanner.nextInt());
        MTB.gerCreditCard1(scanner.nextInt());
        BTB.getCreditCard2(scanner.nextInt());
        BSB.getCreditCard3(scanner.nextInt());







    }

}
