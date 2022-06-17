package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojac=0;
    public void dodajArtikl( Artikl artikal){
        artikli[brojac] = artikal;
        brojac++;
    }



    public Artikl[] getArtikli(){
        return artikli;
    }

 /*   public Artikl[] izbaciArtiklSaKodom (String koda){
        for ( int i =0; i < brojac ; i ++) {
             if ( niz[i].getKod()==koda) {
                 for ( int j = i ; j <brojac -1; j ++) {
                    niz [ j ] = niz [ j +1];
                     }
                 brojac--;
                 i--;
                 }
             }
        return niz;
    }*/
 public Artikl izbaciArtiklSaKodom(String kod){
     for(int i = 0; i < brojac; i++){
         int pom = Integer.parseInt(artikli[i].getKod());
         if(pom == Integer.parseInt(kod)){
             Artikl vrati = artikli[i];
             System.arraycopy(artikli, i+1, artikli , i, brojac-i);
             brojac = brojac - 1;
             return vrati;
         }
     }
     return null;
 }
}
