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

}