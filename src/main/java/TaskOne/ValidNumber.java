package TaskOne;

import java.io.*;

public class ValidNumber {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\AnnaHuzii\\обучение java\\DZ\\hw_9\\src\\main\\java\\TaskOne\\file.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        String х1 = "\\(?[0-9]{3}\\)?[0-9]{3}-?[0-9]{2}-?[0-9]{2}";
        String х2 = "[0-9]{3}-?[0-9]{3}-?[0-9]{4}";
        while ((line = fin.readLine()) != null)
            if (!line.contains(" ") && (line.matches(х1) || line.matches(х2)))
            System.out.println(line);
    }
}