package generic;

public class Main {

    public static void main(String[] args) {
        var list1 = new GenericList<Integer>();
        list1.add(1);
        int number = list1.get(0);
        var list2 = new GenericList<User>();
        list2.add(new User());
        User user = list2.get(0);

    }
}
