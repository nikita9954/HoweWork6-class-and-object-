public class CreditCard {
    private int bankbnumber;
    private int money;
    private int money1;
    private int money2;
    private int money3;
void getnumber (int m){
    money=m;
    System.out.println("money on balance "+ money);
    }
void getaccount (int c){
    bankbnumber=c;
    System.out.println("Card number " + bankbnumber);
    }
    void newmoney(int d){
    money1=d;
        System.out.printf("+ Money " + money);
    }
    void plusmoney(int q) {
        money2 = q;
        money2 =money + money1;
        System.out.println(" all  cash " + money2);
    }
    void minusmoney(int w){
    money3=w;
    money3=money-money1;
        System.out.println("all cash " + money3);
    }


}

