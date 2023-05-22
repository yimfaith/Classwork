import java.util.HashMap;
import java.util.Set;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StateCapitals {
    public static void main(String[] args) {
        HashMap<String,String> states = new HashMap<>();
        states.put("Alabama", "Montgomery");
        states.put("Alaska", "Juneau");
        states.put("Arizona", "Phoenix");
        states.put("Arkansas", "Little Rock");
        states.put("California", "Sacramento");
        states.put("Colorado", "Denver");
        states.put("Connecticut", "Hartford");
        states.put("Delaware", "Dover");
        states.put("Florida", "Tallahassee");
        states.put("Georgia", "Atlanta");
        states.put("Hawaii", "Honolulu");
        states.put("Idaho", "Boise");
        states.put("Illinois", "Springfield");
        states.put("Indiana", "Indianapolis");
        states.put("Iowa", "DeMoines");
        states.put("Kansas", "Topeka");
        System.out.println("----STATES----");
        //getting the keys
        Set<String> keys = states.keySet();
        for(String k: keys){
            System.out.println(k);
        }
        System.out.println("----CAPITALS----");
        for (String k: keys) {
            System.out.println(states.get(k));
        }
        System.out.println("----STATE/CAPITAL PAIRS----");
        for ( String k: keys){
            System.out.println((k) + " - " + (states.get(k)));
        }







    }
}