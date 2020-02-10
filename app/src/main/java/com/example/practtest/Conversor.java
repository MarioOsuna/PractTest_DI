package com.example.practtest;

public class Conversor {


    public String dolaresAEuros(String dolares) {
        Double res = Double.parseDouble(dolares) / 1.09;

        return String.valueOf(res);
    }

    public String eurosADolares(String euros) {
        Double res = Double.parseDouble(euros) * 1.09;

        return String.valueOf(res);
    }

    public String librasAEuros(String libras) {
        Double res = Double.parseDouble(libras) / 0.85;

        return String.valueOf(res);
    }

    public String eurosALibras(String euros) {
        Double res = Double.parseDouble(euros) * 0.85;

        return String.valueOf(res);
    }
}
