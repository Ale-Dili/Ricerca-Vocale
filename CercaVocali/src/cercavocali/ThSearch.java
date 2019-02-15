/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cercavocali;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Di Liberti Alessandro
 *
 * @brief Classe per gestire la ricerca delle vocali con l'uso dei thread
 *
 */
public class ThSearch extends Thread {

    private String frase;
    private char voc;

    private boolean usaSleep;
    private boolean usaYeld;
    
    /**
     * @author Di Liberti Alessandro
     *
     * @brief Metodo costruttore
     *
     * In questo metodo vengono inizializzati gli attributi: frase contiene la 
     * frase inserita dall'utente; voc contiene la vocale; usaSleep o usaYeld 
     * assumo valori booleani in caso dovessero usati lo Sleep e lo Yeld
     * 
     *
     * @param1 frase = questa stringa contiene la frase presente nel main
     * @param2 voc = questo char contiene la vocale che deve essere ricercata
     * @param3 usaSleep = parametro che se true permette l'uso dello sleep
     * @param4 usaYeld = parametro che se true permette l'uso dello Yeld
     */
    public ThSearch(String frase, char voc, boolean usaS, boolean usaY) {
        this.frase = frase;
        this.voc = voc;
        usaSleep = usaS;
        usaYeld = usaY;
    }

    /**
     * @author Di Liberti Alessandro
     *
     * @brief Metodo che permette la ricerca delle vocali
     *
     * In questo metodo attraverso i parametri frase e voc, viene ricercata la
     * vocale presente nella frase e se presente, viene stmapata a schermo.
     *
     * @param args the command line arguments
     */
    public void run() {
        try {
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == voc) {
                    System.out.println(voc);
                }

                if (usaSleep) {
                    Thread.sleep(1000);
                }
                if (usaYeld) {
                    Thread.yield();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Gruppo2_Es1_a.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
