public class MainApp {

    public static void main(String[] args) {
        TransportasiAir TransportasiAir = new TransportasiAir(kursi:"Jumlah Kursi", biaya:20.000);
        Kapal kapal = new Kapal(kursi:50, biaya:100.000);
        Sampan sampan = new Sampan(kursi:20, biaya:50.000);

        TransportasiAir.informasi();
        System.out.println("");

        kapal.informasi();
        kapal.berlayar();
        kapal.berlabuh();
        System.out.println("");

        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
    }

}
