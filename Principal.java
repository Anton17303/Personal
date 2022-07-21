public class Principal {
    public static void main(String[] args) {
        Perro miViejito = new Perro();
        System.out.println(miViejito.getNombre());
        miViejito.setNombre( "Choqui Garcia Perez");
        System.out.println(miViejito.getNombre());
        miViejito.setEdad( 15);
        System.out.println(miViejito.getEdad());
        miViejito.setRaza( "Poodle");
        System.out.println(miViejito.getRaza());
        miViejito.setColor( "blanco");
        System.out.println(miViejito.getColor());
        miViejito.setTamaño( "mediano");
        System.out.println(miViejito.getTamaño());
        miViejito.setGenero( "hembra");
        System.out.println(miViejito.getGenero());
        miViejito.setPeso( 15);
        System.out.println(miViejito.getPeso());
        System.out.println("caracteristicas del perro");
        System.out.println("----------------------------");
        System.out.println(miViejito);




    }

}
