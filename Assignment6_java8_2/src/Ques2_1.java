package Assignment6_java8_2.src;

public interface Ques2_1 {
    default void myDefaultMethod() {
        System.out.println("This is a default method.");
    }
    static void myStaticMethod() {
        System.out.println("This is a static method.");
    }
}