import java.util.Scanner;

/**
 *
 * @author Muhammad Ihsan
 * Nama : Muhammad Ihsan
 * Nim   : 10118037
 * Kelas : IF-1 2018
 * Deskripsi program : Program ini menampilkan nim dan nama mahasiswa
 */



public class NilaiMaxMin {

	public static String petugas;
	public static int[] nilaiMhs = new int[10];
	public static int nilaiMax = 0;
	public static int nilaiMin = 100;
	public static int banyakMhs;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
                           System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
                           Scanner scanner = new Scanner(System.in);
                           
                           //input
                           System.out.print("Masukkan nama petugas : ");
                           petugas = scanner.nextLine();
                           System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
                           banyakMhs = scanner.nextInt();
                          
                           while(banyakMhs > 10){
                                System.out.println("Maaf banyak nilai mahasiswa maksimal 10 ");
                                System.out.print("Masukkan angka kembali : ");
                                banyakMhs = scanner.nextInt();
                           }
                           
                           for (int i = 1; i <= banyakMhs; i++){
                               System.out.print("Masukkan Nilai Mahasiswa Ke - " + i + " : ");
                               nilaiMhs[i] = scanner.nextInt();
                               
                               if(nilaiMhs[i] > nilaiMax ){
                                     nilaiMax  = nilaiMhs[i];
                                } 
                               else if(nilaiMhs[i] < nilaiMin){
                                    nilaiMin = nilaiMhs[i];
                                 }

                           }
                           
                           System.out.println("\n=====Hasil Nilai Mahasiswa=====");
                           for(int i = 1; i<=banyakMhs; i++){
                                //output
                               System.out.println("Nilai Mahasiswa Ke - " + i + " = " + nilaiMhs[i]);
                           }
                            System.out.println("\nNilai Terbesar adalah\t: " + nilaiMax);
                            System.out.println("Nilai Terkecil adalah   : "  + nilaiMin);
                            System.out.println();
                            System.out.println("Petugas : " + petugas);
                           
                           
		
	}

}