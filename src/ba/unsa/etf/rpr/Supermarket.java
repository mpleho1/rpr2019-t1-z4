package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] niz = new Artikl[1000];
    private int brojac=0;
    public void dodajArtikl( Artikl artikal){
        niz[brojac] = artikal;
        brojac++;
    }



    public Artikl[] getArtikli(){
        return niz;
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
         //int pom = Integer.parseInt(artikli[i].getKod());
         if(kod.equals(niz[i].getKod())){
             Artikl vrati = niz[i];
             niz[i] = null;
             System.arraycopy(niz, i+1, niz , i, brojac-i);
             brojac = brojac - 1;
             return vrati;
         }
     }
     return null;
 }
}
