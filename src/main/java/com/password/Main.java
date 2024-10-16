package com.password;

public class Main {
    public static void main(String[] args) {
        // La estructura de carpetas para un proyecto Maven debería ser la siguiente: src / main / java
        // Hay que añadir plugin maven en el pom
        // Para compilar: mvn clean package
        // Para ejecutar: java -jar target/HelloWorld-1.0-SNAPSHOT.jar [argumentos]

        // System.out.println(args.length > 0 ? "Hello " + args[0] : "Hello World!");
        //System.out.println(new Mensaje(args.length > 0 ? args[0] : "").getMsg());
        Mensaje mensaje = new Mensaje();
        mensaje.imprimirMensaje(args);
    }
}