public class Informasi {
    String Informasi, Pembayaran, Pengunjung;

    public Informasi(){
        this.Informasi = Informasi;
        this.Pembayaran = Pembayaran;
        this.Pengunjung = Pengunjung;

    }

    public void DataInformasi(){
        System.out.println("Rp. 85.000/orang dewasa untuk weekend");
        System.out.println("Rp. 70.000/orang dewasa untuk weekdays");
        System.out.println("Rp. 65.000/orang anak kecil untuk weekend");
        System.out.println("Rp. 60.000/orang anak kecil untuk weekdays");
    }

    public String Informasi() {return "Jadwal";}
    public void pembayaran(){
        System.out.println("TEST FUNGSI");
    }
    public String Pengunjung(){return "Membeli tiket";}
}