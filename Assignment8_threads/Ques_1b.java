package Assignment8_threads;

public class Ques_1b implements Runnable {
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1050);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
class SingleThread{
    public static void main(String[]args){
        Ques_1b obj = new Ques_1b();
        Ques_1b obj2 = new Ques_1b();
        Thread t = new Thread(obj);
        Thread t2 = new Thread(obj2);
        System.out.println("Using Runnable Interface");
        System.out.println("Thread1 Start");
        t.start();
        try {
            t.join();
        }
        catch (Exception e){

        }
        System.out.println("Thread 2 Start");
        t2.start();

    }
}
