package Assignment7_9_17;

public class Ques10 {
    public static void main(String[] args) {
        String str = " Hello ";
        System.out.println(str.repeat(3));
        System.out.println(str.strip());
        System.out.println(str.isBlank());


        String str1 = "hello\nworld\n";
        System.out.println(str1.indent(1));
        System.out.println(str1.stripIndent());


        String tran = str.transform(ch -> new StringBuffer(ch).reverse().toString());
        System.out.println(tran);

        String str2 = "hello\\nworld";
        System.out.println(str2);
        System.out.println(str2.translateEscapes());


        String name = "Alice";
        int age = 25;
        String message = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(message);

    }
}
