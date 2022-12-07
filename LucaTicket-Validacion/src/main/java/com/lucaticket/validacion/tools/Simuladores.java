package com.lucaticket.validacion.tools;


public class Simuladores {

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

}
