package generic;

public class Utils {

    public static <T extends Comparable<T>> T max(T first , T second) {
        return first.compareTo(second) < 0 ? second : first;
    }

    public static void printUser(User user){
        System.out.println(user);
    }

    // class CAP#1 extends User {}
    // method မှာ extends သုံးရင် read ပဲရမယ် ။ super သုံးရင် write ပဲရမယ် ။
    public static void printUers(GenericList<? extends User> users){
        Object x = users.get(0);
    }
}
