package homework.day7;

import java.io.*;


public class ReadAndRewrite {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\ReadRewrite.rtf"));

            String line;
            String newLine = "";
            while ((line = read.readLine()) != null) {
                newLine = line.replaceAll("[aeiouAEIOU]", "");
                System.out.println(line);
            }
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\ReadRewrite.rtf"));
            write.write(newLine);
            System.out.println("New text is there");
            read.close();
            write.close();
        } catch (IOException e) {
            System.out.println("An error here " + e.getMessage());
        }
    }
}
