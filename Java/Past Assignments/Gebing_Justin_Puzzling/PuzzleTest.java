import java.security.PublicKey;

public class PuzzleTest {
    public static void main(String[] args){
        Puzzle puzzle = new Puzzle();

        System.out.println(puzzle.getTenRolls());
        // System.out.println(puzzle.alphabetSoup());
        System.out.println(puzzle.randomLetter());
        System.out.println(puzzle.genPass(10));
        System.out.println(puzzle.getNewPasswordSet(5, 12));
        }
    }

