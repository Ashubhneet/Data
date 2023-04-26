package Assignment7_9_17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}