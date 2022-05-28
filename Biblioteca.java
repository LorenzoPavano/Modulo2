public class Biblioteca {

   /* Esercizio Biblioteca 🛴

    Scrivere un programma che permetta di gestire una Biblioteca semplificata, in grado di gestire un array di indici (interi) dei libri che contiene. La Biblioteca viene costruita a partire da un array di indici di libri.
    In particolare, implementare i seguenti metodi:
            - esisteLibro: prende un indice e restituisce true se esiste il libro con questo indice, false altrimenti
- getIndiciLibriOrdinati: ritorna la lista degli indici di libri presenti nella library, in ordine ascendente

    Potete utilizzare il codice a questo indirizzo come test:*/

    private int[] indiciLibri;

    public Biblioteca(int[] indiciLibri) {
        this.indiciLibri = indiciLibri;
    }

    public int[] getIndiciLibri() {
        return indiciLibri;
    }

    public void setIndiciLibri(int[] indiciLibri) {
        this.indiciLibri = indiciLibri;
    }

    boolean esisteLibro(int indice){
        for (int j : indiciLibri) {
            if (j == indice)
                return true;
        }
        return false;
    }

    int[] getIndiciLibriOrdinati(){
        int num=1;
        int indiceProvvisorio=0;
        for (int i = 0; i < indiciLibri.length - 1; i++) {
            for (int j = num; j < indiciLibri.length; j++) {
                if(indiciLibri[i]>indiciLibri[j]){
                    indiceProvvisorio=indiciLibri[j];
                    indiciLibri[j]=indiciLibri[i];
                    indiciLibri[i]=indiceProvvisorio;
                }
            }
            num++;
        }
        return indiciLibri;
    }

}

