package herozero.project.community.logic;

import herozero.project.community.view.BonusEnergeticView;
import herozero.project.community.model.FichaPersonagem;

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
        
        perguntaEnergetico.listaEnergeticos();
        int userOpcaoEnergetico = sc.nextInt();
        sc.nextLine();
        
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