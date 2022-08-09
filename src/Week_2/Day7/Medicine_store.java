package Week_2.Day7;

import java.util.Random;

class Medicine{
    void displayLabel(){
        System.out.println("Company name :\t Cipla pvt ltd \nAddress : \t Pune,India ");
    }
}

class Tablet extends Medicine{
    void displayLabel(){
        System.out.println("Store in cool and dry place");
    }
}
class Syrup extends  Medicine{
    void displayLabel(){
        System.out.println("Shake well before use");
    }
}
class Ointment extends Medicine{
    void displayLabel(){
        System.out.println("for external use only");
    }
}
public class Medicine_store {

    public static void main(String[] args) {
        Medicine medicines [] = new Medicine[9];
        Random random = new Random();
        for (int i = 1; i<medicines.length; i++){
            int randomise = random.nextInt(3);
            switch (randomise){
                case 0 :
                    medicines [i] = new Tablet();
                case 1:
                    medicines[i] = new Ointment();
                case 3:
                    medicines[i] = new Syrup();
            }
            for (int j = 0; j<medicines.length; j++){
                System.out.println(medicines[j]);
            }
        }

    }
}
