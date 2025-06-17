public class Circulo extends ObjetoDeDesenho{
private Ponto centro;
private double raio;
// Classe Circulo é obrigada a sobrescrever o método desenhar
@Override
public String desenhar(){
return String.format("Desenhando circulo com raio %.2f", raio);
}
}
