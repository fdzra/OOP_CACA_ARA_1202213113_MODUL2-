public class TransportasiAir {
    protected int jumlahKursi, biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.println("Transporrasi air jenis tidak diketahui dengan jumlah kursi berjumlah"
        + kursi + "ditetapkan dengan biaya sebesar Rp."+ biaya);
     
    }
}