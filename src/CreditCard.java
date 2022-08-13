public class CreditCard {
    private int bankbnumber;
    private int money1;
    private int money;
    private int money2;
    private int money3;
    private int money4;



    CreditCard(){};
    void getcreditcard(int d,int c){
        bankbnumber=d;
        money=c;
        System.out.print(d+" ");
        System.out.print(c+ " ");

    }
        void newmoney ( int d){
            money1 = d;
            money2 =money+d;
            System.out.print( money2+ " 2 card");
        }
    void newmoney1 ( int d){
        money1 = d;
        money2 =money+d;
        System.out.print( money2+ " 1 card");
    }

        void minusmoney ( int w){
            money3 = w;
            money4 = money - money3;
            System.out.println( money4+ " 3 card");
        }

    }





