public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        // Dependencia de creación: crea un CódigoQR dentro del método
        CodigoQR codigo = new CodigoQR(valor, usuario);
        codigo.mostrarDatos();
    }
}
