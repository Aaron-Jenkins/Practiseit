import java.util.ArrayList;
/* Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes
 all of the strings of even length from the list.
  */

public class removeEvenLength {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("test");
        System.out.println(list);
        removeEvenLength(list);
        System.out.println(list);

    }

    public static void  removeEvenLength(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
}