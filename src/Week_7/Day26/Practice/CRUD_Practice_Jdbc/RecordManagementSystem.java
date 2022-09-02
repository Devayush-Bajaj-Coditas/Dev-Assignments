package Week_7.Day26.Practice.CRUD_Practice_Jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

public class RecordManagementSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CRUD_Operations crud_operations = new CRUD_Implementation();
        int choice;
        try {
            do {
                System.out.println("What do you like to do? \n1 -> Create record\n 2 -- > Read record\n " +
                        "3 --> Update record\n 4 --> Delete record\n 5 --> Exit Application ");

                choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 1:
                        crud_operations.createRecord();
                        break;
                    case 2:
                        crud_operations.readRecords();
                        break;
                    case 3:
                        crud_operations.updateRecord();
                        break;
                    case 4:
                        crud_operations.delete();
                        break;


                }
            }while(choice != 5);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            bufferedReader.close();
        }
    }
}
