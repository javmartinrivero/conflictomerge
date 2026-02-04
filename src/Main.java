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

        //OTRO_ALUMNO
        user.configurarGastosMensuales(750.0, 200.0);

        double misGastos = user.calcularGastosTotales();
        System.out.println("Total gastos registrados: " + misGastos + "€");

    }
}