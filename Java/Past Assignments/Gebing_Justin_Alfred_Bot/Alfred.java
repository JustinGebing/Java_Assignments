
import java.util.Date;

public class Alfred {
    public String basicGreeting() {
        return "Hello, welcome to Wayne Manor.";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. lovely to see you. How are you?", name);
    }

    public String dateAnnouncement() {
        Date date= new Date();
        return ("Today's date is " + date);
    }

    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        if(a >= 0){
            return("Haha, to slow. I got this.");
        }
        else if(b >= 0){
            return("Right away, your wish is my command!");
        }
        else{
            return("Alrighty then, I'm off for now.");
        }
    }
}