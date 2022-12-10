public abstract class Voucher {
    private int kd_voucher, jml_pembelian;
    String nama_voucher;

    public Voucher(int kd_voucher, int jml_pembelian, String nama_voucher){
        this.kd_voucher = kd_voucher;
        this.jml_pembelian = jml_pembelian;
        this.nama_voucher = nama_voucher;
    }
    abstract void updateVoucher();
}
