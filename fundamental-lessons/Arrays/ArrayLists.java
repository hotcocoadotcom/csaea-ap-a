import java.util.ArrayList;

public class ArrayLists {
    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("donkey");
        animals.add("pangolin");
        animals.add("blobfish");

        return animals;
    }

    public static void showIndex(ArrayList<String> list) {
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));
        System.out.println("Last element: " + list.get(list.size() - 1));
    }

    public static int findIndex(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void modifyAnimals(ArrayList<String> animals) {
        animals.set(0, "babirusa");
        animals.add("glass frog");
        animals.add(3, "aye-aye");
        animals.add(1, "camel");
    }

    public static void replaceAll(ArrayList<String> list, String oldVal, String newVal) {
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals(oldVal)) {
                list.set(i, newVal);
            }
        }
    }

    public static void numberUtilities() {
        int[] values = {1, 7, 1, 9, 4, 2, 5, 8, 6, 0};
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int v : values) {
            nums.add(v);
        }
    }

    public static int findMaxIndex(ArrayList<Integer> list) {
        int max = 0;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) > list.get(max)) max = i;
        }
        return max;
    }

    public static void copyList() {
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(1);
    }

    public static void removeAll(ArrayList<String> animals, String target) {
        for (int i = animals.size() - 1; i >= 0; i--) {
            if (animals.get(i).equals(target)) animals.remove(i);
        }
    }

    public static ArrayList<String> longNames(ArrayList<String> animals) {
        int total = 0;
        String longest = animals.get(0);
        boolean froggy = false;
        for (String a : animals) {
            total += a.length();
            if (a.length() > longest.length()) longest = a;
            if (a.equals("glass frog")) froggy = true;
        }

        System.out.println("Longest: " + longest);
        System.out.println("Froggy? " + froggy);

        int avg = total / animals.size();

        ArrayList<String> newList = new ArrayList<String>();

        for (String a: animals) {
            if (a.length() > avg) newList.add(a);
        }

        return newList;
    }
}