package baseline;

import java.util.Scanner;

public class Solution25 {
    //Create a password via a string
    String passInput(){
        final Scanner input = new Scanner(System.in);
        System.out.print("Please enter a password: ");
        return input.next();
    }
    //checks to see if its just numbers
    boolean hasNumbers(String pass){
        for (int i =0; i < pass.length();i++){
            if(Character.isDigit(pass.charAt(i))){
                return true;
            }
        }
        return false;
    }
    //checks to see if its just letters
    boolean hasLetters(String pass){
        if(hasNumbers(pass)){
            return false;
        }
        return true;
    }
    //checks to see if it incoprperates numbers and letters
    boolean hasNumsAndLetters(String pass){
        if(!hasLetters(pass) && hasNumbers(pass)){
            return true;
        }
        return false;
    }
    //checks to see if it incrops speccial characters
    boolean specialCharacters(String pass){
        for(int i = 0;i<pass.length();i++){
            if(pass.charAt(i) >= 21 && pass.charAt(i)<= 47 || pass.charAt(i) >= 58 && pass.charAt(i) <= 64){
                return true;
            }
        }
        return false;
    }
    boolean lessThanEight(String pass){
        if(pass.length() < 8){
            return true;
        }
        return false;
    }

    //return a statement that informs the user of said password
    int passwordValidator(String pass){
        if(lessThanEight(pass) && hasNumbers(pass)){
            return 1;
        }
        else if(lessThanEight(pass)&&hasLetters(pass)){
            return 2;
        }
        else if(!lessThanEight(pass) && hasNumsAndLetters(pass) && !specialCharacters(pass)){
            return 3;
        }
        else if(hasNumsAndLetters(pass)&& !lessThanEight(pass)&& specialCharacters(pass)){
            return 4;
        }
        return 0;
    }
    //Convert the number into a string
    String strengthOutput(int num){
        String out;
        switch (num){
            case 1:
                    out = "Very Weak";
                    break;
            case 2: out = "Weak";
                    break;
            case 3: out = "Strong";
                    break;
            case 4: out = " Very Strong";
                    break;
            default: out = "Invalid";
                    break;

        }
        return out;
    }
    public static void main(String[] args) {
        Solution25 s25 = new Solution25();
        String password;
        //Retieve Password
        password = s25.passInput();
        //call the password validator function
        int valid = s25.passwordValidator(password);
        //print results
        System.out.printf("Your password is %s",s25.strengthOutput(valid));
    }
}
