public class CreditCard {
     int BankNumber;
     int Money;
     int MoneyFromScanner;
     int MoneyCards;
     int MoneyCard3;
     CreditCard(){};
    void GetCreditCard(int d,int c){
        BankNumber=d;
        MoneyFromScanner=c;
        System.out.print(d+" ");
        System.out.print(c+ " ");
    }void  GetCreditCard2( int d){
        Money = d;
        MoneyCards =MoneyFromScanner+d;
        System.out.print( MoneyCards+ " 2 card");
        }
    void GerCreditCard1 ( int d){
        Money = d;
        MoneyCards =MoneyFromScanner+d;
        System.out.print( MoneyCards+ " 1 card");
    }
    void GetCreditCard3 ( int w){
        Money = w;
        MoneyCards = MoneyFromScanner- Money;
        System.out.println( MoneyCard3+ " 3 card");
        }
    }





