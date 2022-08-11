package Week_4.Day17;

public class CLADemo {
    public static void main(String[] args) {
        System.out.println("CLI");
        for (String s : args){
            System.out.println("Content is ::" + s);

        }
        int a = Integer.parseInt(args[4]);
        int b = Integer.parseInt(args[1]);
        int sum = a+b;
        System.out.println("Addition using CLA " + sum);
    }
}
