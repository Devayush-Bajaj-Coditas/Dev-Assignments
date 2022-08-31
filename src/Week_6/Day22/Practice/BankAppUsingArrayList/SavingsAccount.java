package Week_6.Day22.Practice.BankAppUsingArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

public class SavingsAccount extends Bank{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList newUserData = new ArrayList();

    void createSavingsAccount() throws IOException {
        System.out.println("Please fill up the below details \n" +
                "Full Name ---> ");
        String name = bufferedReader.readLine();
        System.out.println("Address ---> ");
        String address = bufferedReader.readLine();
        System.out.println("Job designation ---> ");
        String job = bufferedReader.readLine();
        System.out.println("Phone no ---> ");
        long phoneNo = Long.parseLong(bufferedReader.readLine());
        System.out.println("Pan no ---> ");
        long panNumber = Long.parseLong(bufferedReader.readLine());
        //Generating a random account number for the user
        Random random = new Random(99999999);
        long accountNumber = random.nextInt(1000000000) +123123;

        //Adding the user details into arraylist
        newUserData.add(name);
        newUserData.add(address);
        newUserData.add(accountNumber);
        newUserData.add(phoneNo);
        newUserData.add(panNumber);
        newUserData.add(job);
        System.out.println("Thank you!! your registration has been successfully done");
    }



    }
