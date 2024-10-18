package com.password;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Crear una Clase de Pruebas
* En Maven ha de ir en src/test/java
* Escribir pruebas unitarias para comprobar que el mensaje generado sea correcto
* Como lo escribe por pantalla lo guardo en un fichero
* */
public class MensajeTest {

    @Test
    public void testMensajeConNombre() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = {"Aitor"};
        Mensaje.imprimirMensaje(args);

        //¿Que espero? ¿Es igual?
        assertEquals("Hello Aitor!", outContent.toString().trim());

        // Restaurar la salida estándar original: Restaurar el System.out después de cada prueba, para no afectar otras partes del código.
        System.setOut(System.out);
    }

    @Test
    public void testMensajeSinNombre() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = {};
        Mensaje.imprimirMensaje(args);

        //¿Que espero? ¿Es igual?
        assertEquals("Hello world desde clase!", outContent.toString().trim());

        // Restaurar la salida estándar original: Restaurar el System.out después de cada prueba, para no afectar otras partes del código.
        System.setOut(System.out);
    }

    @Test
    public void testMensajeConVariosNombres() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = {"Pablo", "Aitor", "Dani"};
        Mensaje.imprimirMensaje(args);

        //¿Que espero? ¿Es igual? En la logica no controla si recibe mas de un argmumento por lo que solo saluda al primero
        assertEquals("Hello Pablo!", outContent.toString().trim());

        // Restaurar la salida estándar original: Restaurar el System.out después de cada prueba, para no afectar otras partes del código.
        System.setOut(System.out);
    }
}
