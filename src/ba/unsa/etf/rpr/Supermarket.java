package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli=new Artikl[1000];
    static  int i=0;
    public boolean dodajArtikl(Artikl k){
        if(i>1000) return false;
        else{
            artikli[i]=k;
            i++;
            return true;
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
}
