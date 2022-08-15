import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CreditCard MTB=new CreditCard();
        CreditCard BTB=new CreditCard();
        CreditCard BSB=new CreditCard();
        MTB.GetCreditCard(464664646, scanner.nextInt());
        BTB.GetCreditCard(544667455, scanner.nextInt());
        BSB.GetCreditCard(464564654, scanner.nextInt());
        MTB.GerCreditCard1(scanner.nextInt());
        BTB.GetCreditCard2(scanner.nextInt());
        BSB.GetCreditCard3(scanner.nextInt());









    }

}
