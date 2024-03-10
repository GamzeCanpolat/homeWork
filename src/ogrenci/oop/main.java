package ogrenci.oop;

public class main {
    public static void main(String[] args) {


        Ogrenci[] ogrencis = new Ogrenci[]{
                new Ogrenci(null, null, 0.0, 1973, 104,"001",0,4),
                new Ogrenci("Gokan", "Bilgisayar Muhendislgi", 0.0, 1985, 104,"001",0,4),
                new Ogrenci("Ayse", "Makine Muhendisligi", 0.0, 1985, 104,"001",1,4),
                new Ogrenci("Elif", "Elektirik-Elektronik Muhendisligi", 1.98, 2020, 104,"001",2,8)


        };


        for (int i = 0; i <ogrencis.length ; i++) {
            System.out.println("OGR-"+" "+(i+1)+" "+ogrencis[i].getAd()+" "+ogrencis[i].getBolum()+" "+ogrencis[i].getOgrenciNo()+" "+ogrencis[i].getGano());

        }
        for (int i = 2; i < ogrencis.length ; i++) {
            System.out.println((i+1)+".ogrencinin odeyecegi harc:"+ogrencis[i].harcHesapla(ogrencis[i].getDersSayisi(),ogrencis[i].getUzatmayili()));
        }

        for (int i = 0; i < ogrencis.length; i++) {
        try {

            ogrencis[i].ganoAraliği(ogrencis[i].getGano());

            }catch (IllegalArgumentException e){
            System.out.println("Hata "+(i+1)+".ogrencinin "+e.getMessage());
        }



        }

    }
}