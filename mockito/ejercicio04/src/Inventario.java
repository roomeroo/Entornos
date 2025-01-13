public class Inventario {
    private RepositorioInventario repositorioInventario;

    public Inventario(RepositorioInventario repositorioInventario) {
        this.repositorioInventario = repositorioInventario;
    }

    public void eliminarProducto(String producto) {
        repositorioInventario.eliminarProducto(producto);
    }

    public boolean contieneProducto(String producto) {
        return repositorioInventario.contieneProducto(producto);
    }
}