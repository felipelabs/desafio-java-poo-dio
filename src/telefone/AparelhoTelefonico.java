package telefone;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface{

  @Override
  public void ligar() {
    System.out.println("Estou ligando.");
  }

  @Override
  public void atender() {
    System.out.println("Estou atendendo.");
  }

  @Override
  public void iniciarCorrerioVoz() {
    System.out.println("iniciando correio de voz.");
  }
  
}
