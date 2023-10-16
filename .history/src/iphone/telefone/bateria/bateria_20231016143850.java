package iphone.telefone.bateria;

public class bateria {
  private int qtdBateria;

  protected int getBatteryCharge(){
    return this.qtdBateria;
  };

  void carregarBateria(){
    System.out.println("Carregando bateria");
  };
}
