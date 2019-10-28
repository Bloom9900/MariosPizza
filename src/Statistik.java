
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Statistik {
    
    public void filen() throws IOException {
        int myArr[] = new int[15];
        
        try (FileWriter csvWriter = new Filewriter("MariosStatistik.csv")) {
            csvWriter.append("Pizza");
            csvWriter.append(",");
            csvWriter.append("Topping");
            csvWriter.append(",");
            csvWriter.append("pris");
            csvWriter.append("\n");
        
            csvWriter.flush();
            csvWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
}
