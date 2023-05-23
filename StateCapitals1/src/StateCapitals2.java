import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StateCapitals2 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,String> states = new HashMap<>();
        Scanner sc = new Scanner(new BufferedReader(new FileReader("/Users/phehp/Desktop/WileyEdge/DI003/Week3/May22/Classwork/StateCapitals1/src/StateCapitals.txt")));
        int count = 0;
        String[] place = new String[2];
        String currentLine;
        while (sc.hasNextLine()){
            currentLine = sc.nextLine();
            place = currentLine.split("::");
            states.put(place[0], place[1]);
            count++;
        }
        System.out.println(count + " STATES AND CAPITALS ARE LOADED.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES : ");
        for (String i : states.keySet()) {
            System.out.print(i + "\n");
        }
        System.out.println();

        System.out.println("CAPITALS");
        System.out.println("=======");
        System.out.println("HERE ARE THE CAPITALS : ");
        for (String i : states.values()) {
            System.out.print(i + "\n");
        }
        System.out.println();

        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("====================");
        for (String i : states.keySet()) {
            System.out.println(i + " - " + states.get(i));
        }



    }
}

