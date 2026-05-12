public class Card {
    public String suit;
    public int value;
    public String name;

public Card(int pSuit,int pValue,int pName){
    if (pSuit==0){
        suit="Hearts";
    } else if (pSuit==1) {
        suit="Diamonds";
    } else if (pSuit==2) {
        suit="Spades";
    } else if (pSuit==3) {
        suit="Clubs";
    }
    value=pValue;
    //name=pName;
    if(pName==0){
        name="Ace";
        value=11;
    } else if (pName==1) {
        name="Two";
        value=2;
    } else if (pName==2) {
        name="Three";
        value=3;
    }else if (pName==3) {
        name="Four";
        value=4;
    } else if (pName==4) {
        name="Five";
        value=5;
    }else if (pName==5) {
        name="Six";
        value=6;
    } else if (pName==6) {
        name="Seven";
        value=7;
    }else if (pName==7) {
        name="Eight";
        value=8;
    } else if (pName==8) {
        name="Nine";
        value=9;
    }else if (pName==9) {
        name="Ten";
        value=10;
    } else if (pName==10) {
        name="Jack";
        value=10;
    }else if (pName==11) {
        name="Queen";
        value=10;
    } else if (pName==12) {
        name="King";
        value=10;
    }
}

public void printInfo(){
    System.out.println("The "+name+" of "+suit+" ("+value+")");
}



}
