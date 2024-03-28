package homework.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCount {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\ReadText.rtf"));
            String line;
            int finalLine;
            while ((line = reader.readLine()) != null) {
                finalLine = line.length();
                System.out.printf("Text consists of this number of symbols: \n" + finalLine);
            }
            reader.close();
        } catch (IOException exception) {
            System.out.print(exception.getMessage());
        }
    }
}