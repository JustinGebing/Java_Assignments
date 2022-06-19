import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puzzle{
    Random random = new Random();
    public String getTenRolls(){
        int[] output =  new int[10];
        for(int i=0; i < output.length; i++){
            output[i] = random.nextInt(20); 
        }
    // System.out.println(output);
    return Arrays.toString(output);
    }

public ArrayList<Character> alphabetSoup(){
    ArrayList<Character> output = new ArrayList<Character>();
    for(char alph = 'a'; alph <= 'z'; ++alph){
        output.add(alph);
    }
    return output;
    }

public char randomLetter(){
    ArrayList<Character> alphabet = this.alphabetSoup();
    char output = alphabet.get(random.nextInt(25));
    return output;
}

public String genPass(int passLength){
    String output = "";
    for (int i = 0; i < passLength; i++) {
        output += this.randomLetter();
    }
    return output;
}

public ArrayList<String> getNewPasswordSet(int outputLength, int passLength) {
    ArrayList<String> output = new ArrayList<String>();
    for(int i=0; i < outputLength; i++) {
        output.add(this.genPass(passLength));
    }
    return output;
}

}
    
