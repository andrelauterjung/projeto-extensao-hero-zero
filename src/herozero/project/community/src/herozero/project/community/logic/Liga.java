package herozero.project.community.logic;

import herozero.project.community.view.BonusLeagueView;

import java.util.Scanner;
/**
 * Classe com métodos que retornam informações ao usuário e armazena valor 
 * referente ao bônus de liga que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class Liga
{
    private int bonusLiga;
    
    BonusLeagueView perguntaLiga = new BonusLeagueView();
    
    public void verificarLiga(Scanner sc)
    {
        perguntaLiga.listaLigas();
        int opcaoLiga = sc.nextInt();
        sc.nextLine();
        
        switch(opcaoLiga)
        {
            case 0:
                this.bonusLiga = 0;
                break;
                
            case 1:
                this.bonusLiga = 3;
                break;
            
            case 2:
                this.bonusLiga = 6;
                break;
                
            case 3:
                this.bonusLiga = 9;
                break;
                
            case 4:
                this.bonusLiga =12;
                break;
            
            case 5:
                this.bonusLiga = 15;
                break;
                
            case 6:
                this.bonusLiga = 18;
                break;
            
            case 7:
                this.bonusLiga = 21;
                break;
                
            case 8:
                this.bonusLiga = 24;
                break;
                
            case 9:
                this.bonusLiga = 27;
                break;
            
            case 10:
                this.bonusLiga = 30;
                break;
                
             case 11:
                 this.bonusLiga = 33;
                break;
                
            case 12:
                this.bonusLiga = 36;
                break;
            
            case 13:
                this.bonusLiga = 39;
                break;
                
            default:
                this.bonusLiga = 0;
        }
        
        System.out.printf("O personagem possui %d%% de bônus de liga!\n", this.bonusLiga);
    }
    
    
    // Método Setter
    public void setBonusLiga(int valorBonusLiga)
    {
        this.bonusLiga += valorBonusLiga;
    }
    
    // Método Getter
    public int getBonusLiga()
    {
        return this.bonusLiga;
    }    
}