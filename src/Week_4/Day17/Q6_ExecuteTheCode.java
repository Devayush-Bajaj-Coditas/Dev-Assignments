package Week_4.Day17;
/*

6)Explore this code,execute it,pass the arguments for CLI
        =>add code for case: lf access granted,
        print that file data in console.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Q6_ExecuteTheCode {
        public static void main(String args[]) {
            try {
                String logFileName = args[0];
                File f = new File(logFileName);
                boolean access_granted = false;
                String password = "";

                if (args.length == 2) {
                    System.out.println("Checking command-line password");
                    password = password + args[1];

                    if (password.equals("3dTAqb.7")) {
                        access_granted = true;
                        System.out.println("Password matches.");
                    } else {
                        System.out.println("Command-1ine password does not match");
                    }
                }//end i
                if (access_granted) {
                    System.out.println("Access granted!");

                    PrintWriter out = new PrintWriter(new FileOutputStream(f, true));
                    FileInputStream fileInputStream = new FileInputStream(f);
                    int i = 0;
                    while(i != -1){
                        i = fileInputStream.read();
                        if(i != -1)
                            System.out.print((char) i);
                    }
                    out.flush();
                    out.close();
                }
            }//end try
            catch (Exception e) {
                System.out.println("an error has occured.");
            }
        }
    }//end class
/*           OUTPUT
        Checking command-line password
        Password matches.
        Access granted!
        This is my fileabcd
        */
