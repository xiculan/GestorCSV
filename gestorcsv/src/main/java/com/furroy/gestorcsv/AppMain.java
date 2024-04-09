package com.furroy.gestorcsv;

import com.furroy.gestorcsv.clases.CercaCSV;

/**
 *
 * @author ELOY
 * @version 9.4
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
