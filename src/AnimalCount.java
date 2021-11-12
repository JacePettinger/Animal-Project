import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalCount {
    Map<String, Integer> animalCount = new HashMap<>();


    public void processData(List<String> animalTypes){
        // uses the Map object to count the number of each type of animal.
        for(String type: animalTypes) {
            if(!animalCount.containsKey(type)) {
                animalCount.put(type, 1);
            } else {
                int currentVal = animalCount.get(type);
                currentVal++;
                animalCount.put(type, currentVal);
            }
        }
    }

    public void printReport(){
        // prints the count of each animal
        System.out.println("\n\t\t--- Animal Report ---");
        for (String type: animalCount.keySet()) {
            System.out.printf("Type: %s\t\t\tCount: %d%n", type,animalCount.get(type));
        }
    }
}
