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
 * @brief Classe per gestire il main che cerca le vocali in una frase
 *
 */
public class Gruppo2_Es1_a {

    /**
     * @author Di Liberti Alessandro
     *
     * @brief Metodo main che genera 5 Thread per cercare le vocali
     *
     * In questo metodo vengono creati 5 oggetti di Tipo ThSearch(classe che
     * implementa Thread()); ognuno di essi permette la ricerca di una singola
     * vocale. Successivamente attraverso l'istanza .start(); ogni oggetto viene
     * avviato.Infine ogni thread aspetta che gli altri finiscano e poi viene 
     * stampato un messaggio di fine esecuzione
     * 
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try {
            String frase = "la mammma acquista le tortine di mela";
            ThSearch tha = new ThSearch(frase, 'a', false, true);
            ThSearch the = new ThSearch(frase, 'e', false, true);
            ThSearch thi = new ThSearch(frase, 'i', false, true);
            ThSearch tho = new ThSearch(frase, 'o', false, true);
            ThSearch thu = new ThSearch(frase, 'u', false, true);
            
            tha.start();
            the.start();
            thi.start();
            tho.start();
            thu.start();
            
            tha.join();
            the.join();
            thi.join();
            tho.join();
            thu.join();
            
            System.out.println("grazie, ci vediamo alla prossima :)");
        } catch (InterruptedException ex) {
            Logger.getLogger(Gruppo2_Es1_a.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
