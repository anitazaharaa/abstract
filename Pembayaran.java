public class Pembayaran extends Informasi{
    public int id_pengunjung;
    public String nama;

    public String harga(){
        return"85.000";
    }

    @Override
    public void pembayaran() {
        System.out.println("Anda sudah membayar Lunas");
    }

    public void DataPengunjung(){
        System.out.println("Nama       : Anita");
        System.out.println("Alamat     : Bandung");
        System.out.println("No Hp      : 087897654321");
        System.out.println("\n");
    }
}
