
   interface inter1 {
        default void show(){
            System.out.println("inter1");
        }
    }
    interface child1 extends inter1{
        default void show(){
            System.out.println("child1");
        }
    }
    interface child2 extends inter1{
        default void show(){
            System.out.println("child2");
        }
    }
    public class Multiple_Inheritance implements child1,child2 {
        public void show(){
            System.out.println("DefaultMethods in Multiple_inheritance class");
        }

        public static void main(String[] args) {
            Multiple_Inheritance defaultMethods=new Multiple_Inheritance();
            defaultMethods.show();
        }
    }
