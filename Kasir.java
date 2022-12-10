import java.util.Scanner;

public class Kasir {
    Scanner in = new Scanner(System.in);
    public int id, no_hp, bayar;
    public String nama, alamat;
    public String kamar, bookTiket;

    public static void setInformasi(String informasi) {
    }

    public static void cekInformasi(){

    }

    public static void prosesPembayaran(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public void getBayar() {
        int bayark = in.nextInt();
        System.out.println("1. CASHLESS");
        System.out.println("2. CASH");

        if (bayark == 1) {
            System.out.println("Anda memilih Metode Pembayaran CASHLESS");
            System.out.println("Silahkan bayar sesuai tagihan ke no rek 123883677");
            System.out.println("===================================================");
        } else if (bayark == 2) {
            System.out.println("2. TUNAI");
            System.out.println("Anda Memilih Pembayaran CASH");
            System.out.println("Kami akan memproses Pembayaran anda");
            System.out.println("=====================================");
        } else {
            System.out.println("Pembayaran dengan metode lain tidak tersedia");
        }
    }
}

