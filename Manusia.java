public class Manusia {
    private String Nama;
    private boolean JenisKelamin; // true untuk laki-laki, false untuk perempuan
    private String Nik;
    private boolean Menikah;
    
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.Nama = nama;
        this.JenisKelamin = jenisKelamin;
        this.Nik = nik;
        this.Menikah = menikah;
    }

    //setter
    public void setNama(String nama){
        this.Nama = nama;
    }
    public void setJenisKelamin(boolean jenisKelamin){
        this.JenisKelamin = jenisKelamin;
    }
    public void setNik(String nik){
        this.Nik = nik; 
    }
    public void setMenikah(boolean menikah){
        this.Menikah = menikah;
    }
    
    //getter
    public String getNama(){
        return Nama;
    }
    public boolean getJenisKelamin(){
        return JenisKelamin;
    }
    public String getNik(){
        return Nik;
    }
    public boolean getMenikah(){
        return Menikah;
    }

    public double getTunjangan(){
        if(Menikah){
            if(JenisKelamin){
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        String gender = JenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + Nama + "\nNIK: " + Nik + "\nJenis Kelamin: " + gender +  "\nPendapatan: " + getPendapatan();

    }

}
