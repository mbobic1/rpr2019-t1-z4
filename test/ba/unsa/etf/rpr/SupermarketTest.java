package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    @Test
    void dodajArtikl(){
        Artikl artikl1=new Artikl("sok",2, "35");
        Supermarket s=new Supermarket();
        assertTrue(s.dodajArtikl(artikl1));
    }

    @Test
    void izbaciArtiklSaKodom(){
        Artikl artikl1=new Artikl("sok",2, "35");
        Supermarket s=new Supermarket();
        s.dodajArtikl(artikl1);
        Artikl pronadjen = s.izbaciArtiklSaKodom("35");
        if(pronadjen.getKod().equals(artikl1.getKod())){
            System.out.println("Uspjesno je odradjeno");
        }
        else System.out.println("Nije uspjesno odradjeno");
    }

    @Test
    void getArtikli(){
        Artikl artikl1=new Artikl("kesa", 2 , "2");
        Artikl artikl2= new Artikl("pasta", 8, "36");
        Artikl artikl3= new Artikl("hemijska", 7, "37");
        Supermarket s= new Supermarket();
        s.dodajArtikl(artikl1);
        s.dodajArtikl(artikl2);
        s.dodajArtikl(artikl3);
        Artikl[] pronadji =s.getArtikli();
        for(int j=0; j<s.i; j++){
            if(pronadji[j].equals(s.getArtikli()[j])){
                System.out.println("Pronadjeni su artikli");
            }
            else System.out.println("Nisu pronadjeni artikli");
        }
    }

}