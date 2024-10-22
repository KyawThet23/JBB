public class first {

    public static void main(String[] args) {
        int age = 30;
        int age1 = age;        System.out.println("age before changes :"+age);
//        System.out.println("age1 before changes :"+age1);
//        age = 35;
//        System.out.println("age after changes :"+age);
//        System.out.println("age1 after changes :"+age1);
//

        String test = "Hello";
        String test2 = test;
        System.out.println(test+" "+test2);
        test = "Haha";
        System.out.println(test+" "+test2);
    }
}
