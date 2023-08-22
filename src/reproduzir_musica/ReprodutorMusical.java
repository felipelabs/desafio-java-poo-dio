package reproduzir_musica;

public class ReprodutorMusical implements ReprodutorMusicalInterface {

  @Override
  public void tocar() {
    System.out.println("Tocando musica.");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando musica.");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando musica..");
  }
  
}
