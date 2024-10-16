package com.password;

public class Mensaje {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Mensaje() {
        this.msg = "Hello world desde clase!";
    }

    public Mensaje(String nombre) {
        this.msg = "Hello " + nombre +"!";
    }

    public void imprimirMensaje(String[] argumentos) {
        /*if (argumentos.length > 0) {
            System.out.println("Hello " + argumentos[0] + "!");
        }
        else {
            System.out.println(this.msg);
        }*/

        System.out.println(argumentos.length > 0 ? "Hello " + argumentos[0] + "!" : this.msg);
    }
}
