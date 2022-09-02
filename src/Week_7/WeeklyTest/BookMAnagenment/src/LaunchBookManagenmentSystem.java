package Week_7.WeeklyTest.BookMAnagenment.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaunchBookManagenmentSystem {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BookMangenemntImplementation bookMangenemntImplementation = new BookMangenemntImplementation();
        int choice;
        try {
            do {
                System.out.println("What do you like to do? \n1 -> Create record\n 2 -- > Read record\n " +
                        "3 --> Update record\n 4 --> Delete record\n 5 --> sort by id \n6 --> sort by publisher\n7 --> sort author and publisher \n0 --> Exit Application\nEnter:  ");

                choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 1:
                        bookMangenemntImplementation.createRecord();
                        break;
                    case 2:
                        bookMangenemntImplementation.retrieveRecords();
                        break;
                    case 3:
                        bookMangenemntImplementation.updateRecords();
                        break;
                    case 4:
                        bookMangenemntImplementation.deleteRecords();
                        break;

                    case 5:
                        bookMangenemntImplementation.sortByID();
                        break;

                    case 6:
                        bookMangenemntImplementation.sortByPublisher();
                        break;

                    case 7 :
                        bookMangenemntImplementation.sortByPublisherWiseAuthorBook();
                        break;


                }
            }while(choice != 0);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            bufferedReader.close();
        }
    }
}