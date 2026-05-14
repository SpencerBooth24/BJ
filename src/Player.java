public class Player {
    public int cardTotal;
    public Boolean isBust;
    public Boolean isHit;
    public String name;

    Card [] hand;//object

    Player(int pCardTotal,Boolean pIsBust,Boolean pIsHit, String pName){
        pCardTotal=cardTotal;
        pIsBust=isBust;
        pName=name;
        pIsHit=isHit;
    }

    public void hit(){

    }
    public void stand(){

    }

}
