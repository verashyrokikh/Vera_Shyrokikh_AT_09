package homework.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TypeAndWrite {
    public static void main(String[] args) {
        try {
            Scanner typeFrase = new Scanner(System.in);
            String typed = "";
            while (typeFrase.hasNext()) {
                typed = typeFrase.nextLine();
                if (typed.equals("end")) {
                    break;
                }
            }
            BufferedWriter fileFrase = new BufferedWriter(new FileWriter("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\TypeAndWrite.rtf"));
            fileFrase.write("Hello, I just got " + typed + " from you!");
            fileFrase.close();
            System.out.println("All done");
        } catch (IOException e) {
            System.out.println("An error here " + e.getMessage());
        }
    }
}

