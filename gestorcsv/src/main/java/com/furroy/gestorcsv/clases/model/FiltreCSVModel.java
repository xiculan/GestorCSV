package com.furroy.gestorcsv.clases.model;

import com.furroy.gestorcsv.clases.FiltreCSV;

import java.io.*;

public class FiltreCSVModel {

    static String rutaProjecte = System.getProperty("user.dir");
    static String sep = File.separator;
    // Ruta aurxiu de configuració
    static String rutaConf = new File(rutaProjecte).getParent() + sep + "config" + sep;

    static File tempFile = new File(rutaConf + "tempFiltre.csv");

    public static String getDescriptionByCode(String baseFile, String code) throws IOException {
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

    public static String getDescriptionByBaseColumn(String baseFile, String code, int columnaBaseSeleccionada) throws IOException {
        try (BufferedReader baseReader = new BufferedReader(new FileReader(baseFile))) {
            String baseLine;
            while ((baseLine = baseReader.readLine()) != null) {
                String[] parts = baseLine.split(";");
                if (parts.length > 0) {
                    // Ajusta la siguiente línea para que coincida con la columna seleccionada
                    String baseCode = parts[columnaBaseSeleccionada - 1].trim(); // Obtener el código de la columna seleccionada
                    if (baseCode.equalsIgnoreCase(code)) {
                        return baseLine;
                    }
                }
            }
        }
        return "";
    }

    public static void crearTempFiltre(String rutaArxius){
        String filtreFile = rutaArxius + sep + "Filtre.csv";
        try {
            String input = FiltreCSV.textColumnaFiltre.getText();
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

    public static void eliminarTempFiltre() {
        // Eliminar el archivo tempFiltre.csv
        tempFile.delete();
    }
}
