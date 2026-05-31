package herozero.project.community.logic;

import herozero.project.community.view.BonusEsconderijoView;

import java.util.Scanner;
/**
 * Classe com métodos que retornam informações ao usuário e armazena valor 
 * referente ao bônus de esconderijo de herói que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class EsconderijoHeroico
{
    private int bonusEsconderijo;
    
    public void verificarBonusEsconderijo(Scanner sc)
    {
        BonusEsconderijoView perguntaBonusEsconderijo = new BonusEsconderijoView();
        
        perguntaBonusEsconderijo.listaNiveisLaboratorioCibernetico();
        int valorEntradaBonusEsconderijo = sc.nextInt();
        sc.nextLine();
        
        if(valorEntradaBonusEsconderijo < 0 || valorEntradaBonusEsconderijo > 25)
        {
            this.bonusEsconderijo = 0;
            System.out.println("Valor inválido!");
        }
        else if(valorEntradaBonusEsconderijo == 0)
        {
            this.bonusEsconderijo =0;
        }
        else
        {
            this.bonusEsconderijo = valorEntradaBonusEsconderijo;
        }
        System.out.printf("O personagem recebe %d%% de bônus do esconderijo heroico\n", this.bonusEsconderijo);
    }
    
    
    // Método Setter
    
    public void setBonusEsconderijo(int valorBonusEsconderijo)
    {
        this.bonusEsconderijo += valorBonusEsconderijo;
    }
    
    // Método Getter
    
    
    public int getBonusEsconderijo()
    {
        return this.bonusEsconderijo;
    } 
}