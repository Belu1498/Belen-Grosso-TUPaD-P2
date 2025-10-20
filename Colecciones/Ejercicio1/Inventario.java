import java.util.ArrayList;
/**
 *
 * @author belen
 */
public class Inventario {

    private final ArrayList<Producto> productos = new ArrayList<>();

    // Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            productos.forEach(Producto::mostrarInfo);
        }
    }

    // Buscar producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // Eliminar producto por ID
    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto eliminado: " + id);
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }

    // Actualizar stock
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + p.getNombre() + ": " + nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\nProductos de la categoría " + categoria + ":");
        productos.stream()
                .filter(p -> p.getCategoria() == categoria)
                .forEach(Producto::mostrarInfo);
    }

    // Total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    // Filtrar por precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\nProductos con precio entre $" + min + " y $" + max + ":");
        productos.stream()
                .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
                .forEach(Producto::mostrarInfo);
    }

    // Mostrar categorías disponibles
    public void mostrarCategoriasDisponibles() {
        System.out.println("\nCategorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}
