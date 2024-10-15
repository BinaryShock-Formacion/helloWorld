public class Main {
    public static void main(String[] args) {
        if(args.length > 0)
        {
            String nombre = args[0];
            Mensaje mensaje = new Mensaje(nombre);
            System.out.println(mensaje.getMsg());
        }
        else
        {
            Mensaje msg = new Mensaje();
            System.out.println(msg.getMsg());
        }
    }
}