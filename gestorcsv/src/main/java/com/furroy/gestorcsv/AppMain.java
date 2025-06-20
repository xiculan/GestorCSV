package com.furroy.gestorcsv;

import com.furroy.gestorcsv.clases.CercaCSV;

/**
 *
 * @author ELOY
 * @version 10.0
 * // !! CANVIAR LA VERSIÓ DE @version I DE LA CLASE utils.Constants.java SI ES MODIFICA EL PROGRAMA !!
 */
public class AppMain {
    public static void main (String[] args){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CercaCSV().setVisible(true);
            }
        });
    }
}
