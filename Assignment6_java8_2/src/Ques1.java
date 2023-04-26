public class Ques1 {
        public static void main(String[] args) {
            System.out.print("Consumer Interface ");
            Consumer con = ((x) -> {System.out.println("No return type");});
            con.show(3);

            System.out.print("Function Interface");
            Function func = ((m) -> {if (m != " ") return 1;else return 0;});
            int res = func.prints(" ");
            System.out.println(" " + res);

            System.out.print("Supplier Interface");Supplier sup = (() -> {return 1;});
            int res1 = sup.display();
            System.out.println(" " + res1);

            System.out.print("Predicate Interface");
            predicate pred = ((x, y) -> {if (x > y) return true;else return false;});
            boolean v = pred.number(5, 3);
            System.out.println(" " + v);
        }
    }
