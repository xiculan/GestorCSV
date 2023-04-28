/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.furroy.gestorcsv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author ELOY
 * @version 3.5
 */
public class GestorCSV extends javax.swing.JFrame {

    /**
     * Creates new form Productes
     */
    static Properties prop = new Properties();
    String rutaIni = "C:"+File.separator+"soft"+File.separator+"GestorCSV"+File.separator+"config"+File.separator+"RutesArxius.ini";
    public GestorCSV() {
        initComponents();
        String ruta1 = obtenirArxiuConfig(rutaIni,"ruta_arxiu1", "nom_arxiu1");
        String ruta2 = obtenirArxiuConfig(rutaIni,"ruta_arxiu2", "nom_arxiu2");
        String ruta3 = obtenirArxiuConfig(rutaIni,"ruta_arxiu3", "nom_arxiu3");
        String ruta4 = obtenirArxiuConfig(rutaIni,"ruta_arxiu4", "nom_arxiu4");
        String ruta5 = obtenirArxiuConfig(rutaIni,"ruta_arxiu5", "nom_arxiu5");
        String ruta6 = obtenirArxiuConfig(rutaIni,"ruta_arxiu6", "nom_arxiu6");
        String ruta7 = obtenirArxiuConfig(rutaIni,"ruta_arxiu7", "nom_arxiu7");
        String ruta8 = obtenirArxiuConfig(rutaIni,"ruta_arxiu8", "nom_arxiu8");
        String ruta9 = obtenirArxiuConfig(rutaIni,"ruta_arxiu9", "nom_arxiu9");
        String ruta10 = obtenirArxiuConfig(rutaIni,"ruta_arxiu10", "nom_arxiu10");

        cargarNomFitxers();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBoxAutoguardar.isSelected()){
                    textArea.setText("");
                }
                if(rButton1.isSelected()){
                    buscarArxiu(ruta1);
                }else if (rButton2.isSelected()){
                    buscarArxiu(ruta2);
                }else if (rButton3.isSelected()){
                    buscarArxiu(ruta3);
                }else if (rButton4.isSelected()){
                    buscarArxiu(ruta4);
                }else if (rButton5.isSelected()){
                    buscarArxiu(ruta5);
                }else if (rButton6.isSelected()){
                    buscarArxiu(ruta6);
                }else if (rButton7.isSelected()){
                    buscarArxiu(ruta7);
                }else if (rButton8.isSelected()){
                    buscarArxiu(ruta8);
                }else if (rButton9.isSelected()){
                    buscarArxiu(ruta9);
                }else if (rButton10.isSelected()){
                    buscarArxiu(ruta10);
                }else{
                    JOptionPane.showMessageDialog(null, "No has seleccionat cap arxiu!");
                }
            }
        });
    }

    public static String obtenirArxiuConfig(String rutaArxiuIni, String rutaArxiuCSV, String nomArxiuCSV) {

        String rutaArxiu = null;
        try {
            prop.load(new FileInputStream(rutaArxiuIni));
            rutaArxiu = prop.getProperty(rutaArxiuCSV) + prop.getProperty(nomArxiuCSV) + ".csv";
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return rutaArxiu;
    }


    private void buscarArxiu(String ruta) {

        String searchTerm = textField.getText().trim().toLowerCase();

        try {
            FileReader fileReader = new FileReader(ruta);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(searchTerm)) {
                    textArea.append(line + "\n");
                }
            }
            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void cargarNomFitxers(){
        String nomArxiu1 = "nom_arxiu1";
        String nomArxiu2 = "nom_arxiu2";
        String nomArxiu3 = "nom_arxiu3";
        String nomArxiu4 = "nom_arxiu4";
        String nomArxiu5 = "nom_arxiu5";
        String nomArxiu6 = "nom_arxiu6";
        String nomArxiu7 = "nom_arxiu7";
        String nomArxiu8 = "nom_arxiu8";
        String nomArxiu9 = "nom_arxiu9";
        String nomArxiu10 = "nom_arxiu10";

        List<String> nomsArxius = new ArrayList<>();
        nomsArxius.add(prop.getProperty(nomArxiu1));
        nomsArxius.add(prop.getProperty(nomArxiu2));
        nomsArxius.add(prop.getProperty(nomArxiu3));
        nomsArxius.add(prop.getProperty(nomArxiu4));
        nomsArxius.add(prop.getProperty(nomArxiu5));
        nomsArxius.add(prop.getProperty(nomArxiu6));
        nomsArxius.add(prop.getProperty(nomArxiu7));
        nomsArxius.add(prop.getProperty(nomArxiu8));
        nomsArxius.add(prop.getProperty(nomArxiu9));
        nomsArxius.add(prop.getProperty(nomArxiu10));

        for (int i = 0; i < nomsArxius.size(); i++) {
            String nomArxiu = nomsArxius.get(i);
            JRadioButton radioButton = null;
            switch(i) {
                case 0:
                    radioButton = rButton1;
                    break;
                case 1:
                    radioButton = rButton2;
                    break;
                case 2:
                    radioButton = rButton3;
                    break;
                case 3:
                    radioButton = rButton4;
                    break;
                case 4:
                    radioButton = rButton5;
                    break;
                case 5:
                    radioButton = rButton6;
                    break;
                case 6:
                    radioButton = rButton7;
                    break;
                case 7:
                    radioButton = rButton8;
                    break;
                case 8:
                    radioButton = rButton9;
                    break;
                case 9:
                    radioButton = rButton10;
                    break;
                default:
                    break;
            }
            if (radioButton != null) {
                radioButton.setText(nomArxiu);
            }
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroup = new javax.swing.ButtonGroup();
        button = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rButton1 = new javax.swing.JRadioButton();
        rButton2 = new javax.swing.JRadioButton();
        checkBoxAutoguardar = new javax.swing.JCheckBox();
        rButton3 = new javax.swing.JRadioButton();
        rButton4 = new javax.swing.JRadioButton();
        rButton5 = new javax.swing.JRadioButton();
        rButton6 = new javax.swing.JRadioButton();
        rButton7 = new javax.swing.JRadioButton();
        rButton8 = new javax.swing.JRadioButton();
        rButton9 = new javax.swing.JRadioButton();
        rButton10 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setText("Buscar");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jButton1.setText("Esborrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel1.setText("GESTOR CSV");
        jLabel1.setToolTipText("");

        bGroup.add(rButton1);
        rButton1.setText("arxiu 1");
        rButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButton1ActionPerformed(evt);
            }
        });

        bGroup.add(rButton2);
        rButton2.setText("arxiu 2");

        checkBoxAutoguardar.setSelected(true);
        checkBoxAutoguardar.setText("Autoborrar");
        checkBoxAutoguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAutoguardarActionPerformed(evt);
            }
        });
        checkBoxAutoguardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkBoxAutoguardarKeyPressed(evt);
            }
        });

        bGroup.add(rButton3);
        rButton3.setText("arxiu 3");

        bGroup.add(rButton4);
        rButton4.setText("arxiu 4");

        bGroup.add(rButton5);
        rButton5.setText("arxiu 8");

        bGroup.add(rButton6);
        rButton6.setText("arxiu 5");

        bGroup.add(rButton7);
        rButton7.setText("arxiu 6");

        bGroup.add(rButton8);
        rButton8.setText("arxiu 7");

        bGroup.add(rButton9);
        rButton9.setText("arxiu 10");

        bGroup.add(rButton10);
        rButton10.setText("arxiu 9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rButton1)
                            .addComponent(rButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rButton4)
                            .addComponent(rButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rButton7)
                                .addGap(18, 18, 18)
                                .addComponent(rButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rButton6)
                                .addGap(18, 18, 18)
                                .addComponent(rButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rButton10)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1)
                            .addComponent(checkBoxAutoguardar))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxAutoguardar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rButton3)
                            .addComponent(rButton6)
                            .addComponent(rButton8)
                            .addComponent(rButton1)
                            .addComponent(rButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rButton4)
                            .addComponent(rButton7)
                            .addComponent(rButton5)
                            .addComponent(rButton2)
                            .addComponent(rButton9))))
                .addGap(49, 49, 49))
        );

        rButton1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        textArea.setText("");
        bGroup.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkBoxAutoguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAutoguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAutoguardarActionPerformed

    private void checkBoxAutoguardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkBoxAutoguardarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAutoguardarKeyPressed

    private void rButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorCSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroup;
    private javax.swing.JButton button;
    private javax.swing.JCheckBox checkBoxAutoguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JRadioButton rButton1;
    private static javax.swing.JRadioButton rButton10;
    private static javax.swing.JRadioButton rButton2;
    private static javax.swing.JRadioButton rButton3;
    private static javax.swing.JRadioButton rButton4;
    private static javax.swing.JRadioButton rButton5;
    private static javax.swing.JRadioButton rButton6;
    private static javax.swing.JRadioButton rButton7;
    private static javax.swing.JRadioButton rButton8;
    private static javax.swing.JRadioButton rButton9;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
