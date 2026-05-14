public class Player {
    public int cardTotal;
    public Boolean isBust;
    public Boolean isHit;
    public String name;

    Card [] hand;

    Player(){
        hand= new Card[2];
        cardTotal=0;
        isHit=false;
        isBust=false;
        name="me";
        //int pCardTotal,Boolean pIsBust,Boolean pIsHit, String pName
        //pCardTotal=cardTotal;
        //pIsBust=isBust;
        //pName=name;
        //pIsHit=isHit;
    }

    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Card Total: "+cardTotal);
        System.out.println("isBust: "+isBust);
        System.out.println("isHit: "+ isHit);
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
