import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);

        Maths maths = new Maths();
        System.out.println("Maths: " + maths.add(numbers));

        Animal horse = new Animal();
        Animal snake = new Animal();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(horse);
        animals.add(snake);
        System.out.println(animals);

        // Array
        String[] names = {"Lena", "Jyri", "Ella", "Alva", "Nova", "Theo"};
        //System.out.println(Arrays.toString(names));

        names[1] = "Jori";
        //System.out.println(Arrays.toString(names));

        int lengthOfNames = names.length;
        int indexOfLastName = lengthOfNames - 1;

        //System.out.println(names[indexOfLastName]);

        String[] example = new String[2];
        //System.out.println("Example: " + example[0]);

        //int[] numbers = new int[3];
        /*numbers[0] = 1;
        numbers[1] = 2;*/

        /*System.out.println("Plats 1: " + numbers[0]);
        System.out.println("Plats 2: " + numbers[1]);*/

        // Kommer vara 0 innan vi satt ett värde:
        //System.out.println("Plats 3: " + numbers[2]);

        //numbers[2] = 3;

        // Kommer vara 3 efter att jag har satt ett värde:
        //System.out.println("Plats 3: " + numbers[2]);

        // Vi kan förändra alla värden - både de som är satta
        // och de som inte är satta ännu
        //numbers[0] = 56;
        //System.out.println("Plats 1: " + numbers[0]);


        String alva = names[5];
        //System.out.println(alva);

        /*int[] numbers = {1, 2, 3};
        System.out.println(Arrays.toString(numbers));*/

        String name = "Lena";
        //System.out.println(name);

        // Deklarera en ArrayList som kommer innehålla typen String
        /*ArrayList<String> familyNames1;
        familyNames1 = new ArrayList<>();*/

        // Initiera ArrayListan
        ArrayList<String> familyNames = new ArrayList<>();
        familyNames.add("Lena"); // Index 0
        familyNames.add("Jyri"); // Index 1
        familyNames.add("Ella"); // Index 2
        familyNames.add("Alva"); // Index 3
        familyNames.add("Nova "); // Index 4
        familyNames.add("Theo"); // Index 5
        familyNames.add("Nova"); // Index 6
        familyNames.add("Tod"); // Index 7

        int alva1 = familyNames.indexOf("Alva");
        System.out.println(alva1);

        /*System.out.println(familyNames);
        familyNames.set(1, "Jori");*/

        /*System.out.println("Efter ändring: " + familyNames);*/

        /*int size = familyNames.size();
        System.out.println("Storlek: " + size);
        int indexOfLastElementInFamilyNames = size - 1;*/

        // Ta bort sista index i Arraylisten
        /*familyNames.remove(indexOfLastElementInFamilyNames);
        System.out.println("Storlek efter remove: " + familyNames.size());
        System.out.println("Efter remove: " + familyNames);*/


        /*familyNames.remove("Nova");
        System.out.println("Ta bort Nova: " + familyNames);*/

        //String lastNameInList = familyNames.get(indexOfLastElementInFamilyNames);
        //System.out.println(lastNameInList);

        // Rekommenderas INTE
        /*ArrayList mixed = new ArrayList();
        mixed.add("Lena");
        mixed.add(2);
        mixed.add(true);
        System.out.println(mixed);*/
    }
}
