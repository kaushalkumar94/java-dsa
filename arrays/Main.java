import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();  // Fixed: String with capital S, nextLine() instead of nextine()
        if(input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
            System.out.println("vowel");  // Fixed: Removed duplicate System.out
        }
        else {
            System.out.print("consonant");
        }
    }
}