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
}
