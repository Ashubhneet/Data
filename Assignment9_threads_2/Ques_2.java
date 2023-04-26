package Assignment9_threads_2;

import java.util.concurrent.locks.ReentrantLock;

public class Ques_2 {
    public static void main(String[]args){
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();
        MyThread_1 t1 = new MyThread_1(lock1,lock2);
        MyThread_2 t2 = new MyThread_2(lock1,lock2);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        try {
            th1.join();
        }catch (Exception e){

        }
        th2.start();
    }
}
