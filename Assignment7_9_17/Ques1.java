package Assignment7_9_17;

public interface Ques1 {
    default void publicMethod(){
        privateMethod();
        System.out.println("This is public method");
    }
    private void privateMethod(){
        System.out.println("This is a private method");
    }
}
