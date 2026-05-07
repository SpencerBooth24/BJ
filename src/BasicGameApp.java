public class BasicGameApp {

    Card[] deck;
    public Player me;
    public Dealer D;

    public static void main(String[] args) {
        new BasicGameApp();
    }


    public BasicGameApp(){
        System.out.println("Welcome to the BlackJack table");
        deck=new Card[52];
        for (int x=0;x<13;x++){
            deck[x]= new Card("Hearts",10,x);
           // deck[x].printInfo();
        }

    }


    public void compare(){

    }
    public void round(){

    }
    public void shuffle(){

    }

}
