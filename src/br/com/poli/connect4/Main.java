/**
 *  Projeto de LPOO
 * 
 *   Dupla:
 *    Alexandre Candido Souza
 *    Felipe Vasconcelos
 */

package src.br.com.poli.connect4;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String jog1,jog2;
    byte win = 0;
    boolean draw = false;;

    Scanner scn1 = new Scanner(System.in);
    Scanner scn2 = new Scanner(System.in);
    Scanner play = new Scanner(System.in);
    
    System.out.println("Jogador 1:");
    jog1 = scn1.next();
   
    System.out.println("Jogador 2:");
    jog2 = scn2.next();

    Partida partida = new Partida(jog1, jog2);
   
   
    
   
    System.out.printf("%n%-20s: começará jogando!%n", partida.getJoadorAtual());
    System.out.println(String.format("%-40s%n", " ").replace(" ", "-")); // Printar a linha no tamanho certo
  
    // String msgBase = "%-20s: jogou na coluna: %x %n";
    do{


      System.out.println(partida.fazerJogada(play.nextInt()));
      //win = checkWin(); //verifica se o jogador ganhou a partida 
      if(partida.isEmpate()){
        System.out.println("ITS A TIE!");
        break;
      } 
   /* else if(checkWin()){
     System.out.println();
      break;
    }*/
    }while(win != 1);
    System.out.println("Jogo acabou");
    play.close();
    scn1.close();
    scn2.close();
  }
}
