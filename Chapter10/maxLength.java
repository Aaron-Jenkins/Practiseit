import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        System.out.println(maxLength(list));
    }

    public static int maxLength(ArrayList<String> list) {
        int longest = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > longest) {
                longest = list.get(i).length();
            }
        }
        return longest;
    }
}