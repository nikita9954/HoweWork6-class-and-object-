import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    CreditCard creditCard=new CreditCard();
        creditCard.getnumber(scanner.nextInt());
        creditCard.getaccount(45255);
        creditCard.newmoney((scanner.nextInt()));
        creditCard.plusmoney(0);
        creditCard.minusmoney(0);

    }

}
