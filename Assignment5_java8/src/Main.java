public class Main {
    public static void main(String[] args) {
       greater gr=((x,y) -> {if(x>y) return true; else return false;});
        boolean v=gr.number(2,3);
        System.out.println(v);

        Increment inc = ((i) -> {
            return i+=1;
        });
        int val = inc.increment(5);
        System.out.println("Increment=" + val);

      Concate con=((a,b) ->{ return a+b;});
      String concates=con.concatenate("hello","world");
      System.out.println("Concatenation= "+concates);

      Uppercase upcase=((str) -> {return str.toUpperCase();});
      String res=upcase.upper("welcome");
      System.out.println("Uppercase= "+res);
    }
}
