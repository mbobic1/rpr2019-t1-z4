package ba.unsa.etf.rpr;
import java.lang.String;

public class Korpa {
    Artikl[] artikli=new Artikl[50];
    static int i=0;
    public boolean dodajArtikl(Artikl k){
        if(i>50) return false;
        else{
            artikli[i]=k;
            i++;
            return  true;
        }
    }
    public Artikl izbaciArtiklSaKodom(String k){
        for(int j=0; j<i; j++){
            if(artikli[j].kod.equals(k)){
                Artikl t=artikli[j];
                artikli[j]=artikli[i-1];
                artikli[i-1]=null;
                i--;
                return t;
            }
        }
        return null;
    }
    public Artikl[] getArtikli(){
        return artikli;
    }

    public int dajUkupnuCijenuArtikala(){
        int ukupna=0;
        for(int j=0; j<i; j++){
            ukupna=ukupna+artikli[j].cijena;
        }
        return ukupna;

    }
}
