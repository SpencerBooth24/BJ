public class Dealer {
    public Boolean isover15;
    public int cardTotal;
    public Boolean isBust;

    Card[] hand;


    public Dealer(){
        hand= new Card[2];
        cardTotal=0;
        isover15=false;

        isBust=false;

    }


    public void printInfo(){
        System.out.println("Dealer");
        System.out.println("Card Total: "+cardTotal);
        System.out.println("isBust: "+isBust);
        System.out.println("isOver15: "+ isover15);
        for (int s = 0;s< hand.length;s++){
            hand[s].printInfo();
        }
    }

    public void calculateTotal(){
        cardTotal=0;
        for(int x=0;x<hand.length;x++){
            cardTotal+=hand[x].value;
        }
    }

    public void hit(){

    }
    public void stand(){

    }

}
