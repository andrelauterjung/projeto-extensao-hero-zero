package herozero.project.community.logic;

import herozero.project.community.view.BonusTeamView;
import herozero.project.community.model.FichaPersonagem;

import java.util.Scanner;
/**
 * Classe com método que armazena o valor referente ao 
 * bônus de time que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class Time
{
    private int bonusTime; 
    
    public void verificarBonusTime(Scanner sc, FichaPersonagem fichaPersonagem)
    {
        BonusTeamView perguntaBonusTime = new BonusTeamView();
        
        perguntaBonusTime.perguntaPersonagemTime();
        String analiseJogadorEquipe = sc.nextLine(); // Armazena o 'sim' ou 'nao'
        String editAnaliseJogadorEquipe = analiseJogadorEquipe.toLowerCase(); // transforma toda a String em letras minúsculas e atribui a uma nova variável

        
        if(editAnaliseJogadorEquipe.equals("sim")) // Início da primeira estrutura condicional.
        {  
            
            
            perguntaBonusTime.mensagemTime(); // pergunta o total de bônus que a equipe dá às habilidades básicas do personagem
            int valorBonusTime = sc.nextInt();
            sc.nextLine();
            
            
            if(valorBonusTime <= 0 ||valorBonusTime >50) // Início da segunda estrutura condicional.
            { 
                
                fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
                
                System.out.println("Valor inválido!");
                perguntaBonusTime.semBonusTime();
            }
            
            else // Caso ele digite um valor maior que zero ou menor igual a 50
            {
                this.bonusTime = valorBonusTime;
                
                fichaPersonagem.getBonusTotal().setBonusTotalForca(this.bonusTime);
                fichaPersonagem.getBonusTotal().setBonusTotalVigor(this.bonusTime);
                fichaPersonagem.getBonusTotal().setBonusTotalCerebro(this.bonusTime);
                fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(this.bonusTime);
                
                
                System.out.printf("O personagem recebe um bônus de %d%% do time nas habilidades básicas!\n", this.bonusTime);
            
            } // Fim da segunda estrutura condicional.
        }
        
        else // caso o usuário digite 'não'
        {
           perguntaBonusTime.semBonusTime();
           
           fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
           fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
           fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
           fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
       
        } // Fim da primeira estrutura condicional. 
        
    } // Fechamento do método verificarBonusTime
    
} // Fechamento da classe.