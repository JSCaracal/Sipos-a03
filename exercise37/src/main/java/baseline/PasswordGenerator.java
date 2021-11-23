package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    public List<Character> getGeneratedPass() {
        return generatedPass;
    }

    private List<Character> generatedPass;
    Random rand = new Random();

    PasswordGenerator(){
        generatedPass = new ArrayList<Character>();
    }

    //Have a method that fills the charList with random characters
   public void initLength(int length){
        for(int i = 0; i < length; i++){
            char conversion = (char)(rand.nextInt(122-97)+97);
            generatedPass.add(conversion);
        }
    }

    //Have a method that fills the charList Randomly
    public void fillWithRandomSpecials(int numOfSpecial){
            if(numOfSpecial > generatedPass.size()){
                System.out.println("The Special Character count is bigger than the size");

            }else {
                for(int i = 0; i < numOfSpecial; i++){
                    char special = (char)(rand.nextInt(38-33)+33);
                    int randomIndex = rand.nextInt(generatedPass.size());
                    if(Character.isLetter(generatedPass.get(randomIndex))){
                        generatedPass.set(randomIndex,special);
                    }else {
                        //Decrement since number was never added.
                        if(i == 0){
                            i = 0;
                        }else {
                            i--;
                        }
                    }
                }
            }

    }
    //Method that fills the password with nums
    public void fillWithNums(int nums){
            int numOfSpecial = 0;
            for(Character c: generatedPass){
                if(!Character.isLetter(c)){
                    numOfSpecial++;
                }
            }
            //Satifies requirement
            if((generatedPass.size() - numOfSpecial) <= nums+numOfSpecial){
                while ((generatedPass.size() - numOfSpecial) <= nums+numOfSpecial){
                    char conversion = (char)(rand.nextInt(122-97)+97);
                    generatedPass.add(conversion);
                }

            }for(int i = 1; i <= nums; i++){
                    //Assign random numbers and indexs
                    int randIndex = rand.nextInt(generatedPass.size());
                    char randDigit = (char)(rand.nextInt(57-48)+48);
                    //Make sure there is a letter
                    if(Character.isLetter(generatedPass.get(randIndex))){
                        generatedPass.set(randIndex,randDigit);
                        //If nothing was added, decrement
                    }else {
                        i--;
                    }
                }
            }

    public void generatePass(int size, int numOfSpecial, int numOfNums){
        initLength(size);
        fillWithRandomSpecials(numOfSpecial);
        fillWithNums(numOfNums);
        System.out.print("Your password is: ");
        for(Character c:generatedPass){
            System.out.print(c);
        }
    }

}
