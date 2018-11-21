package com.soaint.util.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CSVParser {
    private BufferedReader br;
    private Integer columsCant;
    private String separator;
    private String currentLine;
    private Integer lineNumber = 0;

    public CSVParser(InputStream is, Integer cant) throws CSVException {
        this.columsCant = cant;
        InputStreamReader ir = new InputStreamReader(is);
        br = new BufferedReader(ir);
        this.PasseCSV();
    }

    public Boolean hasNext() throws CSVException {
        try {
            this.currentLine = br.readLine();
            if (this.currentLine != null) {
                this.lineNumber++;
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new CSVException("Problemas en el registro número '" +
                                   this.lineNumber + "': " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new CSVException("Problemas en el registro número '" +
                                   this.lineNumber + "': " + e.getMessage());
        }
        return false;
    }

    public String next() {
        return this.currentLine;
    }

    public String[] nextSplited() throws CSVException {
        String[] re = this.currentLine.split(this.separator);
        if (re.length < this.columsCant) {
            throw new CSVException("El registro número '" + this.lineNumber +
                                   "' no tiene la cantidad de columnas necesarias.");
        }
        return re;
    }

    protected BufferedReader PasseCSV() throws CSVException {
        try {
            String line1 = br.readLine();
            this.detectSeparator(line1);
            String[] split = line1.split(this.separator);
            this.lineNumber++;
            if (split.length < this.columsCant) {
                throw new CSVException("El registro número '" +
                                       (this.lineNumber - 1) +
                                       "' no tiene la cantidad de columnas necesarias.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return br;
    }

    private void detectSeparator(String line) throws CSVException {
        if (line.indexOf(";") != -1) {
            this.separator = ";";
        } else if (line.indexOf(",") != -1) {
            this.separator = ",";
        } else if (line.indexOf("-") != -1) {
            this.separator = "-";
        }
        if (line.indexOf(" ") != -1) {
            this.separator = " ";
        }
        if (this.separator == null || this.separator.equals("")) {
            throw new CSVException("No se encontro el separador de campos revise el formato del archivo CSV.");
        }
    }

    public String getSeparator() {
        return separator;
    }
}
