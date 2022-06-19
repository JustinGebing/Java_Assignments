import java.util.ArrayList;

public class Casting{
    public static void main(String[] args){
        // int i = 120;
        // byte b = (byte) i;

        // System.out.println(b);

        String[] nintendo = {"Pokemon", "Zelda", "Mario", "Kirby", "Animal Crossing"};
        String temp1 = nintendo[0];
        String temp2 = nintendo[1];
        nintendo[0] = nintendo[3];
        nintendo[3] = temp1;
        nintendo[1] = nintendo[4];
        nintendo[4] = temp2;
        for (int i=0; i<nintendo.length; i++)
            System.out.println(nintendo[i]);

        ArrayList<Object> things =  new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        // for(j = 0; j < things.size(); j++){
            // System.out.println(things.get(j));
        }
    }
