package abdulrahmansaleh_filterstreamdemo;

import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author Abdul Rahman Saleh
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            String namaFile = "abdulrahmansaleh-write.txt";

            // silahkan mengganti path direktori sesuai perangkat masing-masing
            String destinationFile = "C:\\Java Projects\\AbdulRahmanSaleh_FilterStreamDemo\\file-txt\\" + namaFile;
            
            //menambahkan true supaya jika program dijalankan ulang, maka konteks akan bertambah (tidak menimpa)
            FileWriter fw = new FileWriter(destinationFile, true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("--------------------------------------\nINI ADALAH HASIL BUFFERED WRITER\n--------------------------------------\nNama : Abdul Rahman Saleh\nNIM  : 1931710038\nAbsen: 01\nKelas: MI3F\n");
            System.out.println("Proses Buffered writer berhasil. Silahkan cek file.\nJika ingin menambah isi file, Silahkan jalankan ulang program tanpa mengubah destinasi direktori.");
            bw.flush();
            bw.close();
        } catch (Exception e) {
            
            
        }
    }
}
