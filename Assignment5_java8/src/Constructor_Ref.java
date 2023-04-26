
class Mains implements DemoInterface{
    public static void main(String[] args) {
        DemoInterface demoInterface = String::new;
        String str = demoInterface.myMethod(new char[]{'b', 'o', 'a', 't'});
        System.out.println(str);
    }

    @Override
    public String myMethod(char[] chars) {
        return null;
    }
}
