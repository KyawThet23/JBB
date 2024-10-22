package generic;

public class Main {

    public static void main(String[] args) {
//        var list1 = new GenericList<Integer>();
//        list1.add(1);
//        int number = list1.get(0);

        // Not going well with generic extends to Number
//        var list2 = new GenericList<User>();
//        list2.add(new User());
//        User user = list2.get(0);

        var User = new User(10);
        var User2 = new User(20);

        var max = Utils.max(1,3);
        System.out.println(max);

        User user = new Instructor(10);
        Utils.printUser(user);

        // Generic က subtype တွေကို မသိဘူး အဲ့တော့ wildcard သုံး
//        var users = new GenericList<Instructor>();
//        Utils.printUers(users);

        var users = new GenericList<Instructor>();
        Utils.printUers(users);

        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item : list)
            System.out.println(item);
    }
}
