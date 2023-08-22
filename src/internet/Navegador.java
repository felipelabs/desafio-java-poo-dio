package internet;

public class Navegador implements NavegadorInterface{

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo pagina.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualaziando pagina.");
  }
  
}
