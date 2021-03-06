/*
   Projeto de LPOO
  
    Dupla:
     Alexandre Candido Souza
     Felipe Vasconcelos
 */

package br.com.poli.connect4;

public class Jogador extends Pessoa {
  private final Integer numero;

  public Jogador(int numero, String nome) {
    super(nome);
    this.numero = numero;
  }

  public Integer getNumero() {
    return numero;
  }

  @Override
  public String toString() {
    // Chamando a Super pra não ter repetição e manter a padronização
    return "[" + this.getNumero() + "] " + super.toString();
  }

}
