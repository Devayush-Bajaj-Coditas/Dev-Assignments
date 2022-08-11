package Week_4.Day15.Practice;

import java.util.Scanner;

class Restaurant_Operations {
    int dosa = 5;
    int pasta = 10;
    int pizza = 15;
    int User_choice;

    void input(){
        System.out.println("Press 1 for Dosa\nPress 2 for pasta\nPress 3 for pizza");
        Scanner s = new Scanner(System.in);
        int User_choice = s.nextInt();
    }

    void dosa(int quantity){
        try {
        if (quantity > dosa){
            throw new InsufficientQuantity();
        }
        else
            System.out.println("your order has been placed");
        }
        catch (InsufficientQuantity IQ){
                IQ.printStackTrace();
         }
        }
        void pasta (int quantity){
        if (quantity <= pasta){
            System.out.println("Your pasta is being preparing");
        }



        }



    void order(){
        if(User_choice == 1){

        }
    }


}

public class Restaurant {
    public static void main(String[] args) {

            }
}
