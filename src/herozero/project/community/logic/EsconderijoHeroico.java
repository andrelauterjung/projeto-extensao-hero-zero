package herozero.project.community.logic;

import herozero.project.community.view.BonusEsconderijoView;
import herozero.project.community.model.FichaPersonagem;

import java.util.Scanner;
/**
 * Classe com método que armazena o valor referente ao bônus de esconderijo de
 * herói que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class EsconderijoHeroico
{
    private int bonusEsconderijo;
    
    public void verificarBonusEsconderijo(Scanner sc, FichaPersonagem fichaPersonagem)
    {
        BonusEsconderijoView perguntaBonusEsconderijo = new BonusEsconderijoView();
        
        perguntaBonusEsconderijo.listaNiveisLaboratorioCibernetico();
        int valorEntradaBonusEsconderijo = sc.nextInt();
        sc.nextLine();
        
        if(valorEntradaBonusEsconderijo <= 0 || valorEntradaBonusEsconderijo > 25) // Início da Estrutura condicional
        {
            this.bonusEsconderijo = 0;
            fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
            fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
            fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
            fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
            
            System.out.println("Valor inválido!");
        }

        else // Caso o usuário digite um valor maior que 0 ou menor igual a 25
        {
            this.bonusEsconderijo = valorEntradaBonusEsconderijo;
            fichaPersonagem.getBonusTotal().setBonusTotalForca(this.bonusEsconderijo);
            fichaPersonagem.getBonusTotal().setBonusTotalVigor(this.bonusEsconderijo);
            fichaPersonagem.getBonusTotal().setBonusTotalCerebro(this.bonusEsconderijo);
            fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(this.bonusEsconderijo);
            
        } // Fim da Estrutura condicional
        
        System.out.printf("O personagem recebe %d%% de bônus do esconderijo heroico\n", this.bonusEsconderijo);
   
    } // Fechamento do método verificarBonusEsconderijo

} // Fechamento da classe.