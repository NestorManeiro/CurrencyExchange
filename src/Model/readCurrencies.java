package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readCurrencies {

    public static List<String> read(String nameFile, int x) {
        java.util.List<String> list = new ArrayList<>();
        BufferedReader br = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(nameFile)));
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                String[] columns = line.split(",");
                list.add(columns[x]);
                
            }
        } catch(FileNotFoundException exception) {
            System.out.println("Error readCurrencies::read (FileNotFoundException)" + exception);
        } catch(IOException exception) {
            System.out.println("Error readCurrencies::read (IOException)");
        }
        return list;
    }
}
