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

  public void desligar(){
    System.out.println("Desligando celular");
  };

  public void atualizar(){
    System.out.println("Atualizando celular");
  };

  public void realizarChamada(){
    System.out.println("Ligando celular");
  };

  public void atenderChamada(){};
  
}
