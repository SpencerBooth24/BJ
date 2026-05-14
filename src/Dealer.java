public class Dealer {
    public Boolean isover15;
    public int cardTotal;
    public Boolean isBust;

    public Dealer(){
        isover15=true;
        cardTotal=2;
        isBust=true;

    }

    Card [] hand;

    public void printInfo(){
        System.out.println("Card Total: "+cardTotal);
        System.out.println("isBust: "+isBust);
        System.out.println("isOver15: "+ isover15);
        for (int s = 0;s< hand.length;s++){
            hand[s].printInfo();
        }
    }

    public void hit(){

    }
    public void stand(){

    }

}
