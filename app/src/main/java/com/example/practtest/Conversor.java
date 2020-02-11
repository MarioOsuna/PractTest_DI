package com.example.practtest;

import java.text.DecimalFormat;

public class Conversor {

    private static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public String dolaresAEuros(String dolares) {
        if (isNumeric(dolares)) {
            Double res = Double.parseDouble(dolares) / 1.1;
            DecimalFormat df = new DecimalFormat("#.00");
            return String.valueOf(df.format(res));
        } else {
            return "Error";
        }
    }

    public String eurosADolares(String euros) {
        if (isNumeric(euros)) {
            Double res = Double.parseDouble(euros) * 1.1;
            DecimalFormat df = new DecimalFormat("#.00");
            return String.valueOf(df.format(res));
        } else {
            return "Error";
        }
    }

    public String librasAEuros(String libras) {
        if (isNumeric(libras)) {
            Double res = Double.parseDouble(libras) * 1.18;
            DecimalFormat df = new DecimalFormat("#.00");
            return String.valueOf(df.format(res));
        } else {
            return "Error";
        }
    }

    public String eurosALibras(String euros) {
        if (isNumeric(euros)) {
            Double res = Double.parseDouble(euros) / 1.18;
            DecimalFormat df = new DecimalFormat("#.00");
            return String.valueOf(df.format(res));
        } else {
            return "Error";
        }
    }
}
