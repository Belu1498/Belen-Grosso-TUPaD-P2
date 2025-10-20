public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Televisor", 250000, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera", 3500, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Cuchara", 800, 100, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Notebook", 480000, 10, CategoriaProducto.ELECTRONICA));


        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        System.out.println("\n--- BUSCAR PRODUCTO POR ID (P003) ---");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n--- ELIMINAR PRODUCTO (P001) ---");
        inventario.eliminarProducto("P001");
        inventario.listarProductos();

        System.out.println("\n--- ACTUALIZAR STOCK (P005) ---");
        inventario.actualizarStock("P005", 15);

        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        System.out.println("\nProducto con mayor stock:");
        Producto max = inventario.obtenerProductoConMayorStock();
        if (max != null) max.mostrarInfo();

        inventario.filtrarProductosPorPrecio(1000, 3000);

        inventario.mostrarCategoriasDisponibles();
    }
    
}
