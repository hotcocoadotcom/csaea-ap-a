import java.util.ArrayList;

public class ArrayListsTester {
    public static void main(String[] args) {
        ArrayList<String> animals = ArrayLists.createList();
        System.out.println(animals);
        ArrayLists.showIndex(animals);
        System.out.println(ArrayLists.findIndex(animals, "blobfish"));
    }
} 