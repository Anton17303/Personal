public class Modelo{
  private String nombre;
  private int Lugar;
  private int Esquinas;
  private int juegosGanados;
  private int juegosPerdidos;
  private int Tiros;
  private int goles;
  private int tarjetasAmarillas;
  private int tarjetasRojas;
  private int faltas;

public String getnombre(){
  return this.nombre;
}
public void setnombre(String nombre){
  this.nombre = nombre;
}
public int getLugar(){
  return this.Lugar;
}
public void setLugar(int Lugar){
  this.Lugar = Lugar;
}
public int getEsquinas(){
  return this.Esquinas;
}

}
