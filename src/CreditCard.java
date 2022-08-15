public class CreditCard {
     int bankNumber;
     int money;
     int moneyFromScanner;
     int MoneyCards;
     int MoneyCard3;
     CreditCard(){};
    void creditCard(int numbercard, int moneyoncards){
        bankNumber=numbercard;
        moneyFromScanner=moneyoncards;
        System.out.print(numbercard+" ");
        System.out.print(moneyoncards+ " ");
    }void  getCreditCard2( int moneyForCard2FromScanner){
        money = moneyForCard2FromScanner;
        MoneyCards =moneyFromScanner+moneyForCard2FromScanner;
        System.out.print( MoneyCards+ " 2 card");
        }
    void gerCreditCard1 ( int moneyForCard1FromScanner){
        money = moneyForCard1FromScanner;
        MoneyCards =moneyFromScanner+moneyForCard1FromScanner;
        System.out.print( MoneyCards+ " 1 card");
    }
    void getCreditCard3 ( int moneyForCard3FromScanner){
        money = moneyForCard3FromScanner;
        MoneyCards = moneyFromScanner- money;
        System.out.println( MoneyCard3+ " 3 card");
        }
    }





