import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("=== GESTIÓN DE USUARIOS - INPUT DE DATOS ===");

                // Entrada Alumno 1
                System.out.print("Introduce nombre del usuario: ");
                String nombre = sc.nextLine();
                System.out.print("Introduce email: ");
                String email = sc.nextLine();
                System.out.print("Introduce nómina en bruto: ");
                double bruto = sc.nextDouble();

                Usuario user = new Usuario(nombre, email, bruto);

                //ESTE ES UN COMENTARIO

    }
}