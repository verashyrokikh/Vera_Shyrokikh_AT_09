package homework.day7;

import java.io.*;

public class ReadRewriteAddingText {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\ReadAndRewrite.rtf"));

            String line;
            String initialLine="";
            String newLine = "";
            while ((line = read.readLine()) != null) {
                initialLine = line;
                newLine = line.replaceAll("[^aeiouAEIOU]", "");
                System.out.println(initialLine);
            }
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\ReadAndRewrite.rtf"));
            write.write(initialLine);
            //
            write.write(newLine);
            System.out.println("New text is there");
            read.close();
            write.close();
        } catch (NullPointerException e) {
        } catch (IOException e) {
            System.out.println("An error here " + e.getMessage());
        }
    }
}

