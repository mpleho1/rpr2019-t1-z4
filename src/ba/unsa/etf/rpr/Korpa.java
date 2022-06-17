package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brojac=0;

    public Artikl[] getArtikli(){
        return this.artikli;
    }
   /* public Artikl[] izbaciArtiklSaKodom ( String koda){
        for ( int i =0; i < brojac ; i ++) {
            if ( artikli[i].getKod()==koda) {
                for ( int j = i ; j <brojac -1; j ++) {
                    artikli [ j ] = artikli [ j +1];
                }
                brojac--;
                i--;
            }
        }
        return this.artikli;
    }*/
   public Artikl izbaciArtiklSaKodom(String kod){
       for(int i = 0; i < brojac; i++){
           //int pom = Integer.parseInt(artikli[i].getKod());
           if(kod.equals(artikli[i].getKod())){
               Artikl vrati = artikli[i];
               artikli[i] = null;
               System.arraycopy(artikli, i+1, artikli , i, brojac-i);
               brojac = brojac - 1;
               return vrati;
           }
       }
       return null;
   }
    public int dajUkupnuCijenuArtikala(){
        int suma =0 ;
        for ( int i=0; i<brojac; i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }
    public boolean dodajArtikl( Artikl artikl){
       if(brojac>=50) return false;
        artikli[brojac] = artikl;
            brojac++;
            return true;
    }
}
