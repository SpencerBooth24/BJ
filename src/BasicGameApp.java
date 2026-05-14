import java.util.Scanner;

public class BasicGameApp {

    Card[] deck;
    public Player me;
    public Dealer d;

    public static void main(String[] args) {
        new BasicGameApp();
    }


    public BasicGameApp(){
        System.out.println("Welcome to the BlackJack table");
        deck=new Card[52];

        int counter = 0;
        for (int y=0;y<4;y++) {
            for (int x = 0; x < 13; x++) {
                deck[counter] = new Card(y, 10, x);
                //deck[x].printInfo();
                counter++;
            }
        }
        shuffle();
        printDeck();
        me=new Player();
        d=new Dealer();
        //give the cards to the dealer and player
        me.hand[0]=deck[0];
        me.hand[1]=deck[1];
        me.calculateTotal();

        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        System.out.println(name);
        me.name=name;
        me.printInfo();
    }

    public void printDeck(){
        for (int x = 0; x < deck.length; x++) {
            deck[x].printInfo();
        }
    }
    public void shuffle(){
        for (int x = 0; x < deck.length; x++) {
            int randomIndex = (int)(Math.random()*52);
            Card spencer=deck[randomIndex];
            deck[randomIndex] = deck[x];
            deck[x]=spencer;
        }
    }


    public void compare(){

    }
    public void round(){

    }

}
