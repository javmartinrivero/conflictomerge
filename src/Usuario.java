public class Usuario {
    // Alumno 1: Atributos base
    String nombre;
    String email;
    double nominaBruto;

    public Usuario(String nombre, String email, double nominaBruto) {
        this.nombre = nombre;
        this.email = email;
        this.nominaBruto = nominaBruto;
    }

    // --- ALUMNO 1: Gestión de Perfil ---
    public void editarPerfil(String nuevoNombre, String nuevoEmail) {
        this.nombre = nuevoNombre;
        this.email = nuevoEmail;
    }

    double alquiler;
    double gastosVarios;

    // Método para establecer estos gastos
    public void configurarGastosMensuales(double alquiler, double gastosVarios) {
        this.alquiler = alquiler;
        this.gastosVarios = gastosVarios;
    }

    // Funcionalidad de cálculo de gastos totales
    public double calcularGastosTotales() {
        double totalViajes = 0;


        double total = this.alquiler + this.gastosVarios + totalViajes;
        System.out.println("📉 Calculando gastos totales...");
        return total;
    }
}
