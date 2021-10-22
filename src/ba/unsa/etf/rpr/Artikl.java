package ba.unsa.etf.rpr;

public class Artikl {
    String naziv;
    int cijena;
    String kod;
    public Artikl(String s, int cijena1, String kod1){
        cijena=cijena1;
        naziv=s;
        kod=kod1;
    }
    public String getNaziv(){
        return naziv;
    }
    public String getKod(){
        return kod;
    }
    public int getCijena(){
        return cijena;
    }

}
