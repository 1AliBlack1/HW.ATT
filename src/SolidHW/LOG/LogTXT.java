package SolidHW.LOG;

import SolidHW.LOG.Log;

import java.io.FileWriter;
import java.io.IOException;
public class LogTXT implements Log {
    @Override
    public void writeFile(String message, String filename) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(message + "\n");
        } catch (IOException ex) {
            System.out.println("Error writing to log file: " + ex.getMessage());
        }
    }

}
