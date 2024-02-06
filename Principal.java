import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = teclado.nextInt();
        Usuario[] usuarios = crearUsuarios(num);
        for (Usuario usuario : usuarios) {
            System.out.println(usuarios.nombre + " " + usuario.apellidos + ", " + usuario.email);
        }
        Scanner.close();
    }

    public static Usuario[] crearUsuarios(int num) {
        Usuario[] usuarios = new Usuario[num];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Usuario " + (i + 1));
            Usuario usuario = new Usuario();
            System.out.print("Nombre: ");
            System.out.print("Apellidos: ");
            usuario.apellidos = scanner.next();
            System.out.print("Email: ");
            usuario.email = teclado.next();
            usuario[i] = usuario;   
        }
        return usuarios;
    }
}    

class Usuarios {
    public String nombre;
    public String apellidos;
    public String email;
}
