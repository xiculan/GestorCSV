/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.furroy.gestorcsv.clases;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ELOY
 *
 */
public class FiltreCSV extends javax.swing.JFrame {
    // Trobar automàticament la ruta del projecte 
    static String rutaProjecte = System.getProperty("user.dir");
    static String sep = File.separator;
    // Ruta aurxiu de configuració
    static String rutaConf = new File(rutaProjecte).getParent() + sep + "config" + sep;
    static String carpetaProveïdor = "proveïdor1";
    static String rutaArxius = rutaConf + sep + carpetaProveïdor;

    public FiltreCSV() {
        initComponents();
        actualizarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CasosGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        checkboxDuplicate = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        textColumnaFiltre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        carpetaComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Filtrar 'base.csv'");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel1.setText("Al fer clic al botó, l'arxiu 'Filtre.csv' cercarà les files coincidents amb l'arxiu 'Base.csv' depenent del cas seleccionat.");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("FILTRAR CSV");
        jLabel2.setToolTipText("");

        jLabel3.setText("Es generarà un arxiu de sortida 'out.csv' i un altre arxiu 'info.txt' amb els codis no trobats.");

        jButton2.setText("Obrir Directori");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Directori de configuració.");

        infoTextArea.setEditable(false);
        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        jScrollPane1.setViewportView(infoTextArea);

        checkboxDuplicate.setText("Línies repetides");
        checkboxDuplicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxDuplicateActionPerformed(evt);
            }
        });

        CasosGroup.add(jRadioButton1);
        jRadioButton1.setText("Cadena continguda");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        CasosGroup.add(jRadioButton2);
        jRadioButton2.setText("Cadena continguda 1ª columna");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        CasosGroup.add(jRadioButton3);
        jRadioButton3.setText("Cadena igual 1ª columna");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("OPCIONS CERCA");

        textColumnaFiltre.setText("1");
        textColumnaFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColumnaFiltreActionPerformed(evt);
            }
        });

        jLabel6.setText("Columna filtre CSV");

        CasosGroup.add(jRadioButton4);
        jRadioButton4.setText("Merge filtre i base ");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        carpetaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpetaComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Carpeta Seleccionada");

        jButton3.setText("Reload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Arxiu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Cercar tot On/Off");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Programa");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Buscar cadena CSV");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Filtre CSV");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Separar CSV");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Sortir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(carpetaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3)
                            .addComponent(checkboxDuplicate)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textColumnaFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jRadioButton4))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(carpetaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textColumnaFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(checkboxDuplicate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Obrir la carpeta de configuració del programa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
                // Obtener el objeto File de la carpeta
                File carpeta = new File(rutaConf);

                // Verificar si la carpeta existe y es un directorio
                if (carpeta.exists() && carpeta.isDirectory()) {
                    // Abrir la carpeta con el explorador de archivos predeterminado del sistema
                    Desktop.getDesktop().open(carpeta);
                } else {
                    System.out.println("La carpeta especificada no existeix");
                    infoTextArea.append("La carpeta especificada no existeix: " + carpeta +"\n");
                }
            } catch (IOException ex) {
                System.out.println("Error al obrir la carpeta: " + ex.getMessage());
                infoTextArea.append("Error al obrir la carpeta: " + ex.getMessage());
            }
    }//GEN-LAST:event_jButton2ActionPerformed
    // Canviar de pestanya menu
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CercaCSV g2 = new CercaCSV();
        g2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FiltreCSV f2 = new FiltreCSV();
        f2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    // Sortir del programa
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (checkboxDuplicate.isSelected()){
            checkboxDuplicate.setSelected(false);
        } else {
          checkboxDuplicate.setSelected(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void textColumnaFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColumnaFiltreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColumnaFiltreActionPerformed

    private void checkboxDuplicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxDuplicateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxDuplicateActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        SepararCSV s2 = new SepararCSV();
        s2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actualizarComboBox();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void carpetaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        int indiceSeleccionado = carpetaComboBox.getSelectedIndex();
        if (indiceSeleccionado != -1) { // Verifica si se ha seleccionado algo
            // Obtener el nombre de la carpeta seleccionada y asignarlo a carpetaProveïdor
            carpetaProveïdor = (String) carpetaComboBox.getSelectedItem();
        }
    }
    // Filtrar l'arxiu base al fer clic al botó
    // Método para actualizar el JComboBox con las carpetas actuales
    private void actualizarComboBox() {
        File directorio = new File(rutaConf);
        File[] carpetas = directorio.listFiles(File::isDirectory);
        carpetaComboBox.removeAllItems();
        for (File carpeta : carpetas) {
            String nombreCarpeta = carpeta.getName();
            // Verificar si el nombre de la carpeta comienza con "pro" seguido de cualquier número o palabra
            if (nombreCarpeta.matches("pro\\w+")) {
                carpetaComboBox.addItem(nombreCarpeta);
            }
        }
    }

    static File tempFile = new File(rutaConf + "tempFiltre.csv");
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {

        rutaArxius = rutaConf + sep + carpetaProveïdor;
        String baseFile = rutaArxius + sep + "Base.csv";
        baseFile = baseFile.toLowerCase();
        String tempFiltreFile = rutaConf + "tempFiltre.csv";
        tempFiltreFile = tempFiltreFile.toLowerCase();

        // Crea los archivos de salida dentro de la carpeta "output"
        File outFile = new File(rutaArxius + sep + "out.csv");
        File infoFile = new File(rutaArxius + sep + "info.txt");
        String outMergeFile = rutaArxius + sep + "out_merge.csv";
        String outFiltresNotFoundFile = rutaArxius + sep + "out_filtres_notrobat.csv";
        String outBaseNotFoundFile = rutaArxius + sep + "out_base_notrobat.csv";

        crearTempFiltre();

        Thread.sleep(1000);
        infoTextArea.append("GENERANT ARXIUS DE SORTIDA\n");

        Timer timer = new Timer(500, new ActionListener() {
            int counter = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (counter) {
                    case 0:
                        infoTextArea.append("- -Creant out.csv\n");
                        infoTextArea.append("- -Creant info.txt\n");
                        break;
                    case 1:
                        infoTextArea.append("\n");
                        infoTextArea.append("Procés finalitzat\n");
                        infoTextArea.append("\n");
                        break;

                    default:
                        // Terminar el temporizador después de que todas las acciones se hayan ejecutado
                        ((Timer) e.getSource()).stop();
                        break;
                }
                counter++;
            }
        });

        timer.start();


      try (BufferedReader baseReader = new BufferedReader(new FileReader(baseFile));
         BufferedReader filterReader = new BufferedReader(new FileReader(tempFiltreFile));
         BufferedWriter outWriter = new BufferedWriter(new FileWriter(outFile));
         BufferedWriter infoWriter = new BufferedWriter(new FileWriter(infoFile))) {

         if(jRadioButton1.isSelected()){
            if (checkboxDuplicate.isSelected()) {
                Set<String> notFoundCodes = new HashSet<>();
                Set<String> writtenLines = new HashSet<>();
                String filterLine;
                boolean trobat;
                boolean canvi = false;

                while ((filterLine = filterReader.readLine()) != null) {
                    String filterCode = filterLine.split(";")[0].trim();
                    boolean codeFound = false;
                    String baseLine;

                    BufferedReader baseReaderCopy = new BufferedReader(new FileReader(baseFile));
                    trobat = false;

                    Set<String> productsFound = new HashSet<>();

                    while ((baseLine = baseReaderCopy.readLine()) != null) {
                        if (baseLine.toLowerCase().contains(filterCode.toLowerCase())) {
                            if (productsFound.add(baseLine) && writtenLines.add(baseLine)) {
                                outWriter.write(baseLine);
                                outWriter.newLine();
                            }
                            codeFound = true;
                            trobat = true;
                            canvi = true;
                        }
                    }

                    baseReaderCopy.close();

                    if (!codeFound) {
                        notFoundCodes.add(filterCode);
                    }

                    if (trobat && canvi) {
                        canvi = false;
                    }
                }


                if (!notFoundCodes.isEmpty()) {
                    infoWriter.write("Els següents codis d'article no s'han trobat a l'arxiu base.csv:");
                    infoWriter.newLine();
                    for (String code : notFoundCodes) {
                        infoWriter.write(code);
                        infoWriter.newLine();
                    }
                } else {
                    infoWriter.write("Tots els codis d'article a l'arxiu filtre.csv coincideixen amb l'arxiu base.csv");
                    infoWriter.newLine();
                }

                System.out.println("Els arxius s'han generat correctament a la carpeta \"config\"");
            } else {
                Set<String> notFoundCodes = new HashSet<>();
            String filterLine;
            while ((filterLine = filterReader.readLine()) != null) {
                String filterCode = filterLine.split(";")[0].trim();
                boolean codeFound = false;
                String baseLine;
                // int contador = 0;

                    while ((baseLine = baseReader.readLine()) != null) {
                        if (baseLine.toLowerCase().contains(filterCode.toLowerCase())) {
                            outWriter.write(baseLine);
                            outWriter.newLine();
                            codeFound = true;
                            break;

                        }

                    }


                if (!codeFound) {
                    notFoundCodes.add(filterCode);
                }

            }

            if (!notFoundCodes.isEmpty()) {
                infoWriter.write("Els següents codis d'article no s'han trobat a l'arxiu base.csv:");
                infoWriter.newLine();
                for (String code : notFoundCodes) {
                    infoWriter.write(code);
                    infoWriter.newLine();
                }
            } else {
                infoWriter.write("Tots els codis d'article a l'arxiu filtre.csv coincideixen amb l'arxiu base.csv");
                infoWriter.newLine();
            }

            System.out.println("Els arxius s'han generat correctament a la carpeta \"config\"" + carpetaProveïdor);
            infoTextArea.append("Els arxius s'han generat correctament en la carpeta \"config\"" + carpetaProveïdor + "\n");
            }
         }


        else if(jRadioButton2.isSelected()){
            Set<String> baseCodes = new HashSet<>();
            String baseLine;
            while ((baseLine = baseReader.readLine()) != null) {
                String baseCode = baseLine.split(";")[0].trim();
                baseCodes.add(baseCode);
            }

            Set<String> notFoundCodes = new HashSet<>();
            String filterLine;
            while ((filterLine = filterReader.readLine()) != null) {
                String filterCode = filterLine.split(";")[0].trim();
                boolean codeFound = false;

                if (checkboxDuplicate.isSelected()) {
                    // Cercar tots els duplicats
                    for (String baseCode : baseCodes) {
                        if (baseCode.startsWith(filterCode)) {
                            outWriter.write(getDescriptionByCode(baseFile, baseCode));
                            outWriter.newLine();
                            codeFound = true;
                        }
                    }
                } else {
                    // Cercar només la primera coincidència
                    for (String baseCode : baseCodes) {
                        if (baseCode.startsWith(filterCode)) {
                            outWriter.write(getDescriptionByCode(baseFile, baseCode));
                            outWriter.newLine();
                            codeFound = true;
                            break; // Sortir del bucle després de trobar la primera coincidència
                        }
                    }
                }

                if (!codeFound) {
                    notFoundCodes.add(filterCode);
                }
            }
            if (!notFoundCodes.isEmpty()) {
                infoWriter.write("Els següents codis d'article no s'han trobat en l'arxiu base.csv:");
                infoWriter.newLine();
                for (String code : notFoundCodes) {
                    infoWriter.write(code);
                    infoWriter.newLine();
                }
            } else {
                infoWriter.write("Tots els codis d'article en l'arxiu filtre.csv coincideixen amb l'arxiu base.csv");
                infoWriter.newLine();
            }

             System.out.println("Els arxius s'han generat correctament a la carpeta \"config\"" + carpetaProveïdor);
             infoTextArea.append("Els arxius s'han generat correctament en la carpeta \"config\"" + carpetaProveïdor + "\n");
        }
        else if(jRadioButton3.isSelected()){
            Set<String> baseCodes = new HashSet<>();
            String baseLine;
            while ((baseLine = baseReader.readLine()) != null) {
                String baseCode = baseLine.split(";")[0].trim();
                baseCodes.add(baseCode);
            }

            Set<String> notFoundCodes = new HashSet<>();
            String filterLine;
            while ((filterLine = filterReader.readLine()) != null) {
                String filterCode = filterLine.split(";")[0].trim();
                if (baseCodes.contains(filterCode)) {
                    outWriter.write(getDescriptionByCode(baseFile, filterCode));
                    outWriter.newLine();
                } else {
                    notFoundCodes.add(filterCode);
                }
            }

            if (!notFoundCodes.isEmpty()) {
                infoWriter.write("Els següents codis d'article no s'han trobat en l'arxiu base.csv:");
                infoWriter.newLine();
                for (String code : notFoundCodes) {
                    infoWriter.write(code);
                    infoWriter.newLine();
                }
            } else {
                infoWriter.write("Tots els codis d'article en l'arxiu filtre.csv coincideixen amb l'arxiu base.csv");
                infoWriter.newLine();
            }

             System.out.println("Els arxius s'han generat correctament a la carpeta \"config\"" + carpetaProveïdor);
             infoTextArea.append("Els arxius s'han generat correctament en la carpeta \"config\"" + carpetaProveïdor + "\n");
        } else if (jRadioButton4.isSelected()) {
             Map<String, String> baseMap = new HashMap<>();
             String line;
             while ((line = baseReader.readLine()) != null) {
                 String[] parts = line.split(";", 2);
                 if (parts.length > 0) {
                     baseMap.put(parts[0], line);
                 }
             }
             baseReader.close();

             FileWriter mergeWriter = new FileWriter(outMergeFile);
             FileWriter filtrosNotFoundWriter = new FileWriter(outFiltresNotFoundFile);
             FileWriter baseNotFoundWriter = new FileWriter(outBaseNotFoundFile);

             Set<String> foundKeys = new HashSet<>(); // Para rastrear las claves encontradas

             BufferedReader filtroReader = new BufferedReader(new FileReader(rutaArxius + sep + "filtre.csv")); // Lee el archivo filtre.csv directamente
             while ((line = filtroReader.readLine()) != null) {
                 String[] parts = line.split(";", 2);
                 if (parts.length > 0) {
                     String key = parts[0];
                     if (baseMap.containsKey(key)) {
                         mergeWriter.write(line + ";" + baseMap.get(key) + "\n");
                         foundKeys.add(key); // Agrega la clave al conjunto de claves encontradas
                     } else {
                         filtrosNotFoundWriter.write(line + "\n");
                     }
                 }
             }
             filtroReader.close();

             for (String key : baseMap.keySet()) {
                 if (!foundKeys.contains(key)) { // Verifica si la clave no se encontró en el filtro
                     baseNotFoundWriter.write(baseMap.get(key) + "\n");
                 }
             }

             mergeWriter.close();
             filtrosNotFoundWriter.close();
             baseNotFoundWriter.close();

             infoTextArea.append("Merge completat correctament\n");
         }
         else {
            infoTextArea.append("\n");
            infoTextArea.append("< -- ERROR -- > \n");
            infoTextArea.append("S'ha esborrat el contingut de out.csv i info.txt \n");
            infoTextArea.append("\n");
            JOptionPane.showMessageDialog(null, "Has de seleccionar un CAS!");
        }
    } catch (IOException e) {
        System.out.println("Error al processar els arxius: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al processar els arxius."
                + "\nVerifica que els fitxers 'base' i 'filtre' estiguin creats a la carpeta '" + carpetaProveïdor + "'.");
        infoTextArea.append("Error inesperat");
      }
        // Eliminar el archivo tempFiltre.csv
        tempFile.delete();
    }

    private String getDescriptionByCode(String baseFile, String code) throws IOException {
    try (BufferedReader baseReader = new BufferedReader(new FileReader(baseFile))) {
        String baseLine;
        while ((baseLine = baseReader.readLine()) != null) {
            String[] parts = baseLine.split(";");
            String baseCode = parts[0].trim();
            if (baseCode.equalsIgnoreCase(code)) {
                return baseLine;
            }
        }
    }
    return "";
}

public static void crearTempFiltre(){
    String filtreFile = rutaArxius + sep + "Filtre.csv";
    try {
        String input = textColumnaFiltre.getText();
        int columnaSeleccionada = Integer.parseInt(input);

        BufferedReader reader = new BufferedReader(new FileReader(filtreFile));

        // Crear el archivo tempFiltre.csv
        if (!tempFile.exists()) {
            tempFile.createNewFile();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] columns = line.split(";");
            if (columnaSeleccionada > columns.length) {
                columnaSeleccionada = columns.length;
            }
            // Comprobar si la columna seleccionada existe en la fila actual
            if (columnaSeleccionada - 1 < columns.length) {
                writer.write(columns[columnaSeleccionada - 1] + "\n");
            }
        }

        reader.close();
        writer.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}


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
            java.util.logging.Logger.getLogger(FiltreCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltreCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltreCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltreCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FiltreCSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup CasosGroup;
    private javax.swing.JComboBox<String> carpetaComboBox;
    private javax.swing.JCheckBox checkboxDuplicate;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField textColumnaFiltre;
    // End of variables declaration//GEN-END:variables
}
