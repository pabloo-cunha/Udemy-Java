package Aula5_FileWriterBufferedWrites;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App4 {

    public static void main(String[] args) {
        String[] lines = new String[]{
                "Good Morning",
                "Good Afternoon",
                "Good Evening",
                "Good Night"
        };

        String path = "C:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
