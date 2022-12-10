import java.util.Scanner;
public class Pengunjung {
    Scanner in = new Scanner(System.in);
    public int id_pengunjung, no_hp;
    public String nama, alamat;

    public int getId_tamu() {
        return id_pengunjung;
    }

    public void setId_tamu(int id_pengunjung) {
        this.id_pengunjung = id_pengunjung;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void masuk(){
        System.out.println("nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Anda sudah membeli tiket !");
    }

    public void keluar(){
        System.out.println("Maaf waktu regist anda sudah habis ");
        System.out.println("Terima kasidh sudah mengunjungi kebun binatang kami");
    }

    public void order(){
        int pesan;
        System.out.println("ingin pesan apa ? ");
        pesan = in.nextInt();
        if(pesan==1){
            System.out.println("Anda memesan 1 tiket untuk orang dewasa pada weekend ");
            System.out.println("Tiket akan segera tercetak dan mohon ambil di loket");
        }else if(pesan==2){
            System.out.println("Anda memesan 2 tiket untuk orang dewasa pada weekdays");
            System.out.println("Tiket akan segera tercetak dan mohon ambil di loket");
        }else if(pesan==3){
            System.out.println("Anda memesan 1 tiket untuk anak-anak pada saat weekend ");
            System.out.println("Tiket akan segera tercetak dan mohon ambil di loket");
        }

    }
}
