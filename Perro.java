public class Perro {
    //atributos
    private String raza;
    private String color;
    private String tamaño;
    private float peso;
    private int edad;
    private String genero;
    private String energia;
    private String cuidados;
    private String nombre;
    private float altura;
    //metodos
    public Perro(){
        this.raza = "mestizo";
        color = "cafe";
        this.tamaño = "mediano";
        this.peso = 30;
        edad = 14;
        genero = "macho";
        energia = "media";
        this.cuidados = "es un guerrero no necesita cuidados adicionales";
        this.nombre = "Choqui";
        this.altura = 30;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if (edad <= 20)
            this.edad = edad;
    }

    public String getRaza(){
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getTamaño(){
        return this.tamaño;
    }

    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getEnergia(){
        return this.energia;
    }

    public void setEnergia(String energia){
        this.energia = energia;
    }

    public String getCuidados(){
        return this.cuidados;
    }

    public void setCuidados(String cuidados){
        this.cuidados = cuidados;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        if (altura <= 100)
        this.altura = altura;
    }

    public String toString(){
        String cadena = " ";
        cadena = "El perro "+ nombre + "tiene las siguientes caracteristicas: ";
        cadena = cadena + "raza: "+raza+"\nraza: "+color+
                        "\ntamaño: "+tamaño+ "\npeso: "+peso+
                        "\nedad: "+edad+"\ngenero: "+genero+
                        "\nenergia: "+energia+"\ncuidados: "+cuidados+
                        "\naltura: "+altura;
        return cadena;
    }
}
