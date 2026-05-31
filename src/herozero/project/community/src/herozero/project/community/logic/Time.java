package herozero.project.community.logic;

import herozero.project.community.view.BonusTeamView;

import java.util.Scanner;
/**
 * Classe com métodos que retornam informações ao usuário e armazena valor 
 * referente ao bônus de time que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class Time
{
    private int bonusTime; 
    
    public void verificarBonusTime(Scanner sc)
    {
        BonusTeamView perguntaBonusTime = new BonusTeamView();
        
        perguntaBonusTime.perguntaPersonagemTime();
        String analiseJogadorEquipe = sc.nextLine(); // Armazena o 'sim' ou 'nao'
        String editAnaliseJogadorEquipe = analiseJogadorEquipe.toLowerCase(); // transforma toda a String em letras minúsculas e atribui a uma nova variável
  
        if(editAnaliseJogadorEquipe.equals("sim"))
        {
            perguntaBonusTime.mensagemTime(); // pergunta o total de bônus que a equipe dá às habilidades básicas do personagem
            int valorBonusTime = sc.nextInt();
            sc.nextLine();
            
            
            if(valorBonusTime <= 0 ||valorBonusTime >50)
            {
                this.bonusTime = 0;
                System.out.println("Valor inválido!");
                perguntaBonusTime.semBonusTime();
            }
            
            else 
            {
                this.bonusTime = valorBonusTime;
                
                System.out.printf("O personagem recebe um bônus de %d%% do time nas habilidades básicas!\n\n", this.bonusTime);
                //Armazenar o valor do bônus de time em todas as variáveis classe BonusTotal
  
            }
        }
        
        else 
        {
           perguntaBonusTime.semBonusTime();
           
           this.bonusTime = 0;
        }   
    }
    
    // Método Setter
    public void setBonusTime(int valorBonusTime)
    {
        this.bonusTime += valorBonusTime;
    }
    
    // Método Getter
    public int getBonusTime()
    {
        return this.bonusTime;
    }
}