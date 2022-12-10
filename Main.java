import java.util.Scanner;

public class Main {
    private static Pembayaran kebun_binatang;

    public static void main(String[] args) {

        //Deklarasi Objek
        Kasir kasir = new Kasir();
        Pengunjung pengunjung = new Pengunjung();
        Zookeeper zookeeper = new Zookeeper();
        Informasi informasi = new Informasi();
        Manajer manajer = new Manajer();
        Destinasi destinasi = new Destinasi();
        Pembayaran kebun_binatang = new Pembayaran();
        Scanner input = new Scanner(System.in);


        //Menu Kasir
        System.out.println();
        System.out.println("=====MENU KASIR====");
        System.out.println("Masukkan Password : ");
        String Informasi = input.nextLine();
        Kasir.setInformasi(Informasi);
        kasir.cekInformasi();
        System.out.println("Cek Data : 1. Yes/9. Lanjut");
        int pil2 = input.nextInt();
        if (pil2 == 1) {
            System.out.println("FITUR KASIR");
            System.out.println("Lihat data 1.ZooKeeping/2.Informasi/3.Destinasi/4.Pembayaran");
            int pil3 = input.nextInt();
            if (pil3 == 1) {
                Zookeeper.dataZookeeper();
            } else if (pil3 == 2) {
                manajer.dataManajer();
            } else if (pil3 == 3){
                informasi.DataInformasi();
            }else if (pil3 == 4){
                kebun_binatang.DataPengunjung();
            }else{
                System.out.println("Data tidak ditemukan");
            }

        }
        System.out.println("===============================================");
        System.out.println("Halo Selamat Datang Di KEBUN BINATANG BANDUNG");
        System.out.println("===============================================");
        String trik = input.nextLine();
        pengunjung.setNama(trik);
        System.out.print("Masukkan Nama anda : ");
        String namat = input.nextLine();
        pengunjung.setNama(namat);
        System.out.print("Masukkan Alamat anda : ");
        String alamat = input.nextLine();
        pengunjung.setAlamat(alamat);
        System.out.println("==============================");
        System.out.println("Halo Mr/Mrs. " + namat);
        System.out.println("MENU PENGUNJUNG");
        System.out.println("==============================");
        int jawab;
        do {
            System.out.println("1. Informasi ");
            System.out.println("2. Pesen Tiket");
            System.out.println("Masukkan Pilihan yang anda inginkan");
            int pili = input.nextInt();
            if (pili == 1) {
                kasir.prosesPembayaran();
                kasir.prosesPembayaran();
                kebun_binatang.pembayaran();
            } else if (pili == 2) {
                informasi.DataInformasi();
                pengunjung.order();
            }
            System.out.println("Apakah ada ingin yang ditambahkan lagi ? 1.yes/2.No");
            jawab = input.nextInt();
        } while (jawab == 1);

        System.out.println("=========================================");
        pengunjung.masuk();
    }
}