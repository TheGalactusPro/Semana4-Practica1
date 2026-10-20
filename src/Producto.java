public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contador = 0;

    // Constructor

    public Producto(String nombre, double precio, int stock) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);

        contador ++;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setStock(int stock) {
        if(stock>=0){
            this.stock = stock;
        }
    }

    public void setPrecio(double precio) {
        if(precio>=0){
            this.precio = precio;
        }
    }

    public void setNombre(String nombre) {
        if(nombre!=null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }

    // Getters


    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    // Mostrar

    public void mostrarInformacion(){
        System.out.println("ID: " +getId()+
                "\nNombre: " +getNombre()+
                "\nPrecio: " +getPrecio()+
                "\nStock: " +getStock());
    }
}
