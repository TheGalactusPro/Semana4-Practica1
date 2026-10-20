public class Main {
    static void main() {
        System.out.println("El número total de productos es: " +Producto.getContador());

        Producto p1 = new Producto("Mouse",25.5,10);
        Producto p2 = new Producto("Teclado",50,5);
        Producto p3 = new Producto("Monitor",100,-8);
        Producto p4 = new Producto("TV",350,8);
        Producto p5 = new Producto("Parlante",400,50);

        p1.setId(001);
        p2.setId(002);
        p3.setId(003);
        p4.setId(004);
        p5.setId(005);

        System.out.println("Producto 1");
        p1.mostrarInformacion();
        System.out.println("\nProducto 2");
        p2.mostrarInformacion();
        System.out.println("\nProducto 3");
        p3.mostrarInformacion();
        System.out.println("\nProducto 4");
        p4.mostrarInformacion();
        System.out.println("\nProducto 5");
        p5.mostrarInformacion();

        System.out.println("\nEl número total de productos es: " +Producto.getContador());
    }
}
