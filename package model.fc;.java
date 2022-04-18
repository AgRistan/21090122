package model;

public class fcb {
    public String  namaAkun;
    public int  Jumlahlike;
    public String Komentar ;

    public fcb(){
    
    }

    public fcb(String nAkun, int Jlike, String Kmt){
        this.namaAkun = nAkun;
        this.Jumlahlike = Jlike;
        this.Komentar = Kmt;
    }
    public String getnamaAkun(){
       return this.namaAkun;
    }
    public void setnamaAkun(String namaAkun){
         this.namaAkun = namaAkun;
    }
    public int getJumlahlike(){
       return this.Jumlahlike;
    }
    public void setJumlahlike(int Jumlahlike){
         this.Jumlahlike = Jumlahlike;
    }
    public String getKomentar(){
       return this.Katagori;
    }
    public void setKomentar(String Komentar){
         this.Komentar = Komentar;
    }
}
