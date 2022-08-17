package Week_5.Day18.PRACTICE;

public class TRy {
    int show(){
        try{
            return 1;
        }
        finally{
            return 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TRy().show());
    }
}
