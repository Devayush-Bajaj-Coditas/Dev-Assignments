package Week_5.Day18;


public class ThreadDemo extends Thread {
    public void run(){
        for(int i = 0; i<5; i++){
            try {
                Thread.sleep(500);
                System.out.println("current Thread "+ Thread.currentThread());      //tells which thread is executed
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Mymain{
    public static void main(String[] args) throws InterruptedException {


        ThreadDemo threadDemo = new ThreadDemo();
        //threadDemo.dislay();
        threadDemo.start();
        threadDemo.setName("A");
        threadDemo.setPriority(1);


        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo1.start();
        threadDemo1.setName("B");
        threadDemo.setPriority(5);

        ThreadDemo threadDemo3 = new ThreadDemo();
        System.out.println("CHECK C IS ALIVE (BEFORE) : " + threadDemo3.getState());
        threadDemo3.setDaemon(true);
        threadDemo3.start();
        //threadDemo3.start();  --> We cannot start twice. It will give Illegal thread state
        //threadDemo3.setDaemon(true);  --> illegal thread state exception after written before start
        threadDemo3.setName("C");
        threadDemo3.join();     //Waits for this thread to die
        threadDemo3.setPriority(10);
        //setting priority
        System.out.println("CHECK C IS ALIVE : " + threadDemo3.getState());
        System.out.println("CHECK C IS ALIVE : " + threadDemo3.isAlive());
        System.out.println("CHECK C IS Demon : " + threadDemo3.isDaemon());
    }
}
