import java.util.Arrays;

class Execution {
    int[][] array1 = new int[][]{{1, 2, 3}, {4, 5}, {7}};
    int[][] array2 = new int [][] {{2, 3,4}, {1, 4}, {7}};
    void JaggedArraySum() {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array1[i][j] + array2[i][j];

            }
        }
    }
    void display(){
        for (int i = 0; i < array1.length; i++){
            System.out.print(Arrays.toString(array1[i]) + " \n");
        }
    }
}

public class JaggedArrayAddition {
    public static void main(String[] args) {
        Execution execution = new Execution();
        execution.JaggedArraySum();
        execution.display();

    }
}

/*
OUTPUT

[3, 5, 7]
[5, 9]
[14]

 */