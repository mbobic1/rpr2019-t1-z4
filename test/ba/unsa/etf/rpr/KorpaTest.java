package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl artikl12=new Artikl("kesa", 2, "2");
        Korpa k= new Korpa();
        assertTrue(k.dodajArtikl(artikl12));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl artikl1=new Artikl("kesa", 2, "2");
        Korpa k= new Korpa();
        k.dodajArtikl(artikl1);
        Artikl pronadji=k.izbaciArtiklSaKodom("2");
        if(pronadji.getKod().equals(artikl1.getKod())){
            System.out.println("Uspjesno odradjeno");
        }
        else System.out.println("Nije uspjesno odradjeno");
    }

    @Test
    void getArtikli() {
        Artikl artikl1=new Artikl("kesa", 2 , "2");
        Artikl artikl2= new Artikl("pasta", 8, "36");
        Artikl artikl3= new Artikl("hemijska", 7, "37");
        Korpa k= new Korpa();
        k.dodajArtikl(artikl1);
        k.dodajArtikl(artikl2);
        k.dodajArtikl(artikl3);
        Artikl[] pronadji=k.getArtikli();
        for(int j=0; j<k.i; j++) {
            if (pronadji[j].equals(k.getArtikli()[j])){
                System.out.println("Pronadjen je");
            }
            else System.out.println("NIje pronadjen");
        }
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl artikl1= new Artikl("jabuka", 4, "35");
        Artikl artikl2= new Artikl("pasta", 8, "36");
        Artikl artikl3= new Artikl("hemijska", 7, "37");
        Artikl artikl4= new Artikl("papir", 2, "38");
        Artikl artikl5= new Artikl("zvake", 1, "39");
        Korpa k = new Korpa();
        k.dodajArtikl(artikl1);
        k.dodajArtikl(artikl2);
        k.dodajArtikl(artikl3);
        k.dodajArtikl(artikl4);
        k.dodajArtikl(artikl5);
        assertEquals(22,k.dajUkupnuCijenuArtikala());
    }
}