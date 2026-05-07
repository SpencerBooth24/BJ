public class Card {
    public String suit;
    public int value;
    public String name;

public Card(String pSuit,int pValue,int pName){
    suit=pSuit;
    value=pValue;
    //name=pName;
    if(pName==0){
        name="Ace";
        value=11;
    } else if (pName==1) {
        name="Two";
        value=2;
    }
    printInfo();
}

public void printInfo(){
    System.out.println("The "+name+" of "+suit+" ("+value+")");
}



}
