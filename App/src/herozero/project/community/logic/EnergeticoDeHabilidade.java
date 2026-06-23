package herozero.project.community.logic;

import herozero.project.community.view.BonusEnergeticView;
import herozero.project.community.model.FichaPersonagem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe com método para armazena valor referente ao bônus de energético de 
 * habilidade que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class EnergeticoDeHabilidade
{     
    public void verificarEnergetico(Scanner sc, FichaPersonagem fichaPersonagem)
    {
        BonusEnergeticView perguntaEnergetico = new BonusEnergeticView();
        
        boolean isEnergeticQuestRunning = true;
        int userOpcaoEnergetico = -1;
        
        while(isEnergeticQuestRunning)
        {
            try
            {
               perguntaEnergetico.listaEnergeticos();
               userOpcaoEnergetico = sc.nextInt();
               sc.nextLine();
               
               if(userOpcaoEnergetico >= 0 && userOpcaoEnergetico < 4)
               {
                   isEnergeticQuestRunning = false;   
               }
               else
               {
                   System.out.printf("\nX X X X X X X X X X X X X X X X X X X\n");
                   System.out.println("    Você digitou um número inválido!");
                   System.out.println("         TENTE NOVAMENTE!");
                   System.out.printf("X X X X X X X X X X X X X X X X X X X \n\n");
               }
               
            }
            catch(InputMismatchException e)
            {
                userOpcaoEnergetico = -1;
                System.out.printf("\nX X X X X X X X X X X X X X X X X X X X X X X X X X X X X X X\n");
                System.out.println("Você digitou uma String onde deve ir número, tente novamente!");
                System.out.println("ERRO: "+e.getMessage());
                System.out.printf("X X X X X X X X X X X X X X X X X X X X X X X X X X X X X X X\n\n");
                
                sc.next();
            }
        }
        
        
        switch(userOpcaoEnergetico)
        {
            case 0:
                fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
                
                System.out.println("O personagem não recebe bônus de energético!");
                break;
                
            case 1:
                fichaPersonagem.getBonusTotal().setBonusTotalForca(10);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(10);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(10);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(10);
                
                System.out.println("O personagem recebe um bônus de 10% do energético!");
                break;
                
            case 2:
                fichaPersonagem.getBonusTotal().setBonusTotalForca(25);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(25);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(25);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(25);
                
                System.out.println("O personagem recebe um bônus de 25% do energético!");
                break;
                
            case 3:
                fichaPersonagem.getBonusTotal().setBonusTotalForca(50);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(50);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(50);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(50);
                
                System.out.println("O personagem recebe um bônus de 50% do energético!");
                break;
                
            default: 
                System.out.println("Valor inválido!");
                fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
                
                System.out.println("O personagem não recebe bônus de energético!");
                
        } // fechamento do switch case
        
    } // fechamento do método 
    
} // fechamento da classe