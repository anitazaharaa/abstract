public class Manajer {
    public String nama, alamat;
    public int no_hp;

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

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public void dataManajer() {
        System.out.println("Nama Manajer : Anita Zahara");
        System.out.println("Alamat    : Yogyakarta");
        System.out.println("No Hp     : 089877673456"   );
        System.out.println("\n");
    }
}
