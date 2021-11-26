package baseline;
import java.util.Random;
public class MagicEightBall {
    Random rand = new Random();
    //No args Constructor which initilized variable
    private int choice;
    private String[] responses ={"Yes","No","Maybe","Ask again later"};
    public MagicEightBall(){
            this.choice = 0;
    }
    //Method that selects a random number and prints out the statement from a list.
    public void shake(){
        choice = rand.nextInt(4);
        String response = this.responses[choice];
        System.out.println(response);
    }

}
