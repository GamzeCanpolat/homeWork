package ogrenci.oop;

public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private int girisyili;
    private int bolumKodu;
    private String ogrenciNo;
    private String girisSırası;
    private int uzatmayili;
    private int dersSayisi;


    public Ogrenci(String ad, String bolum, double gano, int girisyili, int bolumKodu, String girisSırası,int uzatmayili,int dersSayisi) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisyili = girisyili;
        this.bolumKodu = bolumKodu;
        this.ogrenciNo = hesaplaOgrenciNo(girisyili, bolumKodu, girisSırası);
        this.girisSırası = girisSırası;
        this.uzatmayili=uzatmayili;
        this.dersSayisi=dersSayisi;

    }

    public Ogrenci(String ad, String bolum, String girisSırası) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = 0.0;
        this.girisyili = 0;
        this.bolumKodu = 0;
        this.ogrenciNo = hesaplaOgrenciNo(girisyili, bolumKodu, girisSırası);
        this.girisSırası = girisSırası;
        this.uzatmayili=0;

    }



    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public int getUzatmayili() {
        return uzatmayili;
    }

    public void setUzatmayili(int uzatmayili) {
        this.uzatmayili = uzatmayili;
    }

    public String getGirisSırası() {
        return girisSırası;
    }

    public void setGirisSırası(String girisSırası) {
        this.girisSırası = girisSırası;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }



    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisyili() {
        return girisyili;
    }

    public void setGirisyili(int girisyili) {
        this.girisyili = girisyili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public void ganoAraliği(double gano) {
        if (0 > gano || 4 < gano)
            throw new IllegalArgumentException("Gano 0 ve 4 araliginda degil");

    }

    public String hesaplaOgrenciNo(int girisyili, int bolumKodu, String girisSırası) {
        return "" + girisyili + bolumKodu + girisSırası;
    }

    public double harcHesapla(int dersSayisi, double uzatmaYili) {

        double harc = (dersSayisi*100)+(uzatmayili*80);
        return harc ;
    }

    public double harcHesapla(int dersSayisi) {
        double harcson=dersSayisi*100;

        return harcson;


    }
}