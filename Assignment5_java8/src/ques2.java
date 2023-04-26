class Ques2 {

      public static void main(String[] args) {

          MethodRefernceInterface instanceMethod;
          instanceMethod = new Maths()::add;
          Subtraction subt = new Maths()::sub;
          Multiplication mul= Maths::prod;
          int res = instanceMethod.display(3, 4);
          int res1 = subt.display(4, 5);
          int res2=mul.display(5,6);
          System.out.println("Addition=3+4="+res);
          System.out.println("subtraction=4-5="+res1);
          System.out.println("Multiplication=6*5="+res2);
      }

  }
