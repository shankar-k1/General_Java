package General_Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Duplicatesearch {
    public static void main(String[] args) {
        int count=0;
        String csvFile = "C:\\Users\\ks442\\Downloads\\bdsv.csv";
        String line;
        Set<String> uniqueLines = new HashSet<>();
        Set<String> duplicateLines = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                if (!uniqueLines.add(line)) {
                    duplicateLines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print duplicate lines
        System.out.println("Duplicate lines:");
        for (@SuppressWarnings("unused") String duplicate : duplicateLines) {
            //System.out.println(duplicate);
            count++;
        }
        System.out.println(count);
    }
}