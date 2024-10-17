package com.password;

public class Mensaje {

    public static void imprimirMensaje(String[] argumentos) {
        if (argumentos.length > 0) {
            System.out.printf("Hello " + argumentos[0] + "!");
        }
        else {
            System.out.printf("Hello world desde clase!");
        }
    }
}
