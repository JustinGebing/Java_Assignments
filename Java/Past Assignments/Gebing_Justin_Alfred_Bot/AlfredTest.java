
public class AlfredTest {
    public static void main(String[] args) {
        Alfred alfredQuotes = new Alfred();

        String testGreeting = alfredQuotes.basicGreeting();
        String testGuestGreeting = alfredQuotes.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredQuotes.dateAnnouncement();
        String alexisTest = alfredQuotes.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredQuotes.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredQuotes.respondBeforeAlexis("Maybe that's what Batman is about. Not winning, But Failing..");
        // System.out.println(testGreeting);
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}