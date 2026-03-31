import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    //setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    //getter
    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public double getBonus() {
        long lamaBekerja = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        double persentaseBonus = 0;

        if (lamaBekerja <= 10) { 
        persentaseBonus = 0.05;
        } else if (lamaBekerja > 10) {
        persentaseBonus = 0.15;
        }

        return persentaseBonus * gaji;
    }
    public double getTunjanganAnak() {
        return jumlahAnak * 20;
    }
    public double getTotalGaji() {
        return gaji + getBonus() + getTunjanganAnak();
    }
    public double getPendapatan() {
        return super.getPendapatan()+ getGaji() + getBonus() + getTunjanganAnak();
    }

    public String toString() {
        return super.toString() +
                "\nTahun Masuk   : " + tahunMasuk +
                "\nJumlah Anak   : " + jumlahAnak +
                "\nGaji Pokok    : " + gaji;
    }
}


    

