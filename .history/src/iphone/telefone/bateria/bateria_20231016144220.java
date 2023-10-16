package iphone.telefone.bateria;

public class bateria {
  private int qtdBateria;

  public int getBatteryCharge(){
    return this.qtdBateria;
  };

  public void carregarBateria(){
    System.out.println("Carregando bateria");
  };
}
