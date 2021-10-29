package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {



    @Test
    void getCijena(){
        Artikl artikl1=new Artikl("pica", 8, "14");
        int cijena1=artikl1.cijena;
        if(cijena1==artikl1.cijena){
            System.out.println("Tacna je cijena");
        }
        else System.out.println("Nije tacna");
    }
}