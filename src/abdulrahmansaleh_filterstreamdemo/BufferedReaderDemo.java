package abdulrahmansaleh_filterstreamdemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Abdul Rahman Saleh
 */
public class BufferedReaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // System.out.println("Masukkan kalimat : ");
            // System.out.println("Output: " + br.readLine());
            String data = "";
            String namaFile = "abdulrahmansaleh-read.txt";
            // silahkan mengganti path direktori sesuai perangkat masing-masing
            String destinationFile = "C:\\Java Projects\\AbdulRahmanSaleh_FilterStreamDemo\\file-txt\\" + namaFile;
            FileReader fr = new FileReader(destinationFile);

            BufferedReader br = new BufferedReader(fr);

            do {                
                data = br.readLine();
                System.out.println(data);
            } while (!data.equals(null));
            
            
        } catch (Exception e) {
        }
    }
    
}
