// Class Object : ReservasiHotel
/**
 *
 * @author David058
 */
public class ReservasiHotel {
    // Atribut
    private String namaTamu;
    private String tipeKamar;
    private int lamaMenginap;
    private double tarifKamar;

    // Konstruktor
    public ReservasiHotel(String namaTamu, String tipeKamar, int lamaMenginap, double tarifKamar) {
        this.namaTamu = namaTamu;
        this.tipeKamar = tipeKamar;
        this.lamaMenginap = lamaMenginap;
        this.tarifKamar = tarifKamar;
    }

    // Metode untuk menghitung total biaya
    public double hitungTotalBiaya() {
        return lamaMenginap * tarifKamar;
    }

    // Metode untuk menampilkan detail reservasi
    public void tampilkanReservasi() {
        System.out.println("Nama Tamu: " + namaTamu);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Lama Menginap: " + lamaMenginap + " malam");
        System.out.println("Total Biaya: Rp " + hitungTotalBiaya());
    }
}
