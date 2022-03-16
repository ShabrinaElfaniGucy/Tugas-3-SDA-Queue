import java.util.LinkedList;
import java.util.Queue;


public class Tugas_Queue {
    public static void main(String[] args) throws Exception {
        Queue<String> nomor_antrian = new LinkedList<String>();

        nomor_antrian.add("021");
        nomor_antrian.add("022");

        System.out.println("Pukul : 08.00 WIB");
        System.out.println("Antrian Nasabah : " +nomor_antrian);
        System.out.println("");

        //printah enqueue (menggunakan fungsi add)
        nomor_antrian.add("023");
        System.out.println("Pukul : 08.30 WIB");
        System.out.println("Antrian Nasabah : " +nomor_antrian);
        System.out.println("");

        //perintah dequeue (menggunakan fungsi poll)
        System.out.println("Selanjutnya Nasabah dengan Antrian : " +nomor_antrian.poll());
        System.out.println("");

        //perintah pengecekan elemen teratas (menggunakan fungsi peek)
        System.out.println("Bersiap-siap Nomor Antrian : " +nomor_antrian.peek());
        System.out.println("");

        //pengecekan ukuran Queue
        System.out.println("Jumlah Antrian :" +nomor_antrian.size());
        System.out.println("");

        //perintah dequeue (menggunakan fungsi poll)
        System.out.println("Selanjutnya Antrian Nomor: " + nomor_antrian.poll());
        System.out.println("Antrian Nasabah : " +nomor_antrian);
        System.out.println("");

        //perintah pngecekan elemen teratas (menggunakan fungsi peek)
        System.out.println("Bersiap-siap Nomor Antrian: " + nomor_antrian.peek());
        System.out.println("Antrian Nasabah : " +nomor_antrian);
        System.out.println("");

        //pengecekan apakah antrian kosong (menggunakan fungsi isEmpty())
        System.out.println("Apakah ada nasabah yang belum terpanggil?");
        if (nomor_antrian.isEmpty()){
            System.out.println("Tidak ada Nasabah yang belum Terpanggil");
        } else {
            System.out.println("Tersisa "+ nomor_antrian.size() +" nasabah lagi");
        }
        System.out.println("");

        //perintah Dequeue (menggunakan fungsi poll)
        System.out.println("Selanjutnya Nasabah dengan Antrian: " + nomor_antrian.poll());
        System.out.println("Antrian Nasabah : " +nomor_antrian);
        System.out.println("");

        //pengecekan apakah antrian kosong (menggunakan fungsi isEmpty())
        System.out.println("Apakah ada nasabah yang belum terpanggil?");
        if (nomor_antrian.isEmpty()){
            System.out.println("Tidak ada Nasabah yang belum Terpanggil");
        } else {
            System.out.println("Tersisa "+ nomor_antrian.size() +" nasabah lagi");
        }
        
     }

}
