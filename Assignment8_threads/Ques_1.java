package Assignment8_threads;

public class Ques_1 extends Thread {
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
class abc{
    public static void main(String[]args){
        Ques_1 obj = new Ques_1();
        Ques_1 obj1 = new Ques_1();
        System.out.println("Using Thread Class");
        System.out.println("Thread2 start ");
        obj1.start();
        try {
            obj1.join();
        }
        catch (Exception e){

        }
        System.out.println("Thread1 start");
        obj.start();
    }
}
