public class Main {
    public static void main(String[] args) {
        // La estructura de carpetas para un proyecto Maven debería ser la siguiente: src / main / java
        // Hay que añadir plugin maven en el pom
        // Para compilar: mvn clean package
        // Para ejecutar: java -jar target/HelloWorld-1.0-SNAPSHOT.jar [argumentos]
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