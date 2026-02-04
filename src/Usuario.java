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
}
