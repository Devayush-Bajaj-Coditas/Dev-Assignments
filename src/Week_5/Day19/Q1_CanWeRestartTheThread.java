package Week_5.Day19;
/*                1)WHAT IF WE RESTART ANY THREAD?
                        t1.stat();
                        t1.start();         */


class MyThread extends Thread{

    @Override
    public void run() {
      show();
    }

    void show(){
        System.out.println("Under thread");
    }
//    MyThread myThread = new MyThread();
}
public class Q1_CanWeRestartTheThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.start();
    }
}
