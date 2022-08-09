package Week_2.Day7;
/*
2)Create an abstract class Instrument which has the abstract function play.
Create three more subclasses irom Instrument which are Pian0, Flute, Guitar.
Override the play method inside all three classes printing a message. "Piano is playing
tan tan tan tan tor Piano class "Flute is playing toot toot toot toot" tor Flute class
"Guitar is playing tin tin tin tor Guitar class
You must not allow the user to declare an object of Instrument class. Create an arrayof
10 Instruments. Assign different types of instrument to Instrument reference. Check for
the polymorphic behavior of the play method. Use the instanceof operator to print
which object stored at which index of instrument array.
 */

import java.util.Random;

abstract class Instrument{

}


class Piano extends Instrument{
    void play(){
        System.out.println("piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument{
    void play(){
        System.out.println("Flute is playing toot toot toot toot");
    }

}

class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin tin");
    }
}


public class Music {

    public static void main(String[] args) {

            Instrument[] instruments = new Instrument[10];
            Random random = new Random();

            for (int i =0; i<10; i++){
                int randomNumber = random.nextInt(3);
                if (randomNumber == 0){
                    instruments[i]= new Piano();
                }
                else if (randomNumber == 1) {
                    instruments[i] = new Flute();
                } else if (randomNumber == 2) {
                    instruments[i] = new Guitar();
                }
            }
            for (int i = 0; i<10;i++) {
                if (instruments[i] instanceof Piano) {
                    System.out.println("Piano is stored at the index" + i);
                    ((Piano) instruments[i]).play();
                } else if (instruments[i] instanceof Flute) {
                    System.out.println("Flute is stored at index " + i);
                    ((Flute) instruments[i]).play();
                } else if (instruments[i] instanceof Guitar) {
                    System.out.println("Guitar is stored at he index " + i);
                    ((Guitar) instruments[i]).play();
                }
            }
    }
}

/*
OUTPUT
Flute is stored at index 0
Flute is playing toot toot toot toot
Flute is stored at index 1
Flute is playing toot toot toot toot
Piano is stored at the index2
piano is playing tan tan tan tan
Guitar is stored at he index 3
Guitar is playing tin tin tin tin
Guitar is stored at he index 4
Guitar is playing tin tin tin tin
Guitar is stored at he index 5
Guitar is playing tin tin tin tin
Flute is stored at index 6
Flute is playing toot toot toot toot
Guitar is stored at he index 7
Guitar is playing tin tin tin tin
Guitar is stored at he index 8
Guitar is playing tin tin tin tin
Piano is stored at the index9
piano is playing tan tan tan tan

Process finished with exit code 0

 */