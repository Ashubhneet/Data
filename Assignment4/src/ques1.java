import java.util.*;
import java.io.*;

class ques1{
    public static void main(String[] args)
    {
        float a =0;
        List<Float> list = new ArrayList<>();
        list.add(5F);
        list.add(6.4F);
        list.add(7.9F);
        list.add(10.7F);
        list.add(2.2F);
        Iterator<Float> sum=list.iterator();
        while(sum.hasNext()) {
            Float i = sum.next();

            a+=i;
        }
        System.out.println(a);

        System.out.println("sum-> " + sum);
    }
}
