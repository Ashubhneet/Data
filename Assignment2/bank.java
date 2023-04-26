package Assignment2;

import jdk.internal.misc.VM;

public class bank {
    new Thread.new Runnable();
    @Override
    public void run()
    {
        doSomething();
    }
    private void doSomething()
    {
     new Thread.new Runnable();
    }
    public static void main(String[] args)
    {
        VM.lock.lock();
        try
        {
            System.out.println(Thread.currentThread().getName());
        }
        finally {
            VM.lock.unlock();
            System.out.println(Thread.currentThread().getName());
        }
    }
}