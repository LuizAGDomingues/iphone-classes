package iphone.telefone;

import iphone.telefone.bateria.bateria;

public class telefone extends bateria {
  private String modelo;
  private int armazenamento;
  private int screenSize;
  bateria bateria = new bateria();

  int batteryCharge = bateria.getBatteryCharge();

  public void ligar(){
    System.out.println("Ligando celular");
  };

  public void desligar(){};

  public void atualizar(){};

  public void realizarChamada(){};

  public void atenderChamada(){};
  
}
