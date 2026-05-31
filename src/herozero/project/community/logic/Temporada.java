package herozero.project.community.logic;

import herozero.project.community.view.BonusTemporadaView;

import java.util.Scanner;

/**
 * Classe com métodos que retornam informações ao usuário e armazena valor 
 * referente ao bônus de temporada que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class Temporada
{
    private int nenhumaHabilidade;
    private int forcaBasica;
    private int vigorBasico;
    private int cerebroBasico;
    private int intuicaoBasica;        
    
    
    public void verificacaoBonusTemporada(Scanner sc)
    {
        BonusTemporadaView perguntaBonusTemporada = new BonusTemporadaView();
        
        
        perguntaBonusTemporada.perguntaTemporadaHabilidade(); // pergunta se a temporada acrescenta bônus nas habilidades
        String pergunta = sc.nextLine();
        
        if(pergunta.toLowerCase().equals("sim"))
        {
            perguntaBonusTemporada.bonusNomeHabilidadeBasica(); // pergunta em que habilidade vai o bônus de temporada
            String novoNomeHabilidade = sc.nextLine(); 
            
            perguntaBonusTemporada.bonusTemporadaHabilidade(); // pede para o usuário digitar o valor do bônus de temporada
            int valorBonusTemporada = sc.nextInt(); 
            sc.nextLine();
            
            switch (novoNomeHabilidade)
            {
                case "forca":
                    this.forcaBasica = valorBonusTemporada;
                    System.out.printf("O personagem recebe um bônus de %d%% na força básica!\n", valorBonusTemporada);
                    break;
                
                case "vigor":
                    this.vigorBasico = valorBonusTemporada;
                    System.out.printf("O personagem recebe um bônus de %d%% no vigor básico!\n", valorBonusTemporada);
                    break;
                
                case "cerebro":
                    this.cerebroBasico= valorBonusTemporada;
                    System.out.printf("O personagem recebe um bônus de %d%% no cérebro básico!\n", valorBonusTemporada);
                    break;
                
                case "intuicao":
                    this.intuicaoBasica = valorBonusTemporada;
                    System.out.printf("O personagem recebe um bônus de %d%% na intuição básica!\n", valorBonusTemporada);
                    break;
                
                case "todas":
                    this.forcaBasica = valorBonusTemporada;
                    this.vigorBasico = valorBonusTemporada;
                    this.cerebroBasico = valorBonusTemporada;
                    this.intuicaoBasica = valorBonusTemporada;
                    System.out.printf("O personagem recebe um bônus de %d%% em todas as habilidades básicas!\n", valorBonusTemporada);
                break;
                
                default:
                    System.out.println("Valor inválido!");
                    this.forcaBasica = 0;
                    this.vigorBasico = 0;
                    this.cerebroBasico = 0;
                    this.intuicaoBasica = 0;
            } // fechamento do switch case
        } // fechamento do if
        else
        {
            System.out.println("A temporada não acrescenta bônus às habilidades básicas do personagem!");
            this.nenhumaHabilidade = 0;
        } // fechamanto do else    
    } // fechamento do método
    
    
    // Métodos Setter
    public void setTemporadaSemBonus(int valorTemporadaSemBonus)
    {
        this.nenhumaHabilidade += valorTemporadaSemBonus;
    }
    
    public void setTemporadaForcaBasica(int valorTemporadaForcaBasica)
    {
        this.forcaBasica += valorTemporadaForcaBasica;
    }
    
    public void setTemporadaVigorBasico(int valorTemporadaVigorBasico)
    {
        this.vigorBasico += valorTemporadaVigorBasico;
    }
    
    public void setTemporadaCerebroBasico(int valorTemporadaCerebroBasico)
    {
        this.cerebroBasico += valorTemporadaCerebroBasico;
    }
    
    public void setTemporadaIntuicaoBasica(int valorTemporadaIntuicaoBasica)
    {
        this.intuicaoBasica += valorTemporadaIntuicaoBasica;
    }
    
    
    // Métodos Getter
    public int getSemBonusTemporada()
    {
        return this.nenhumaHabilidade;
    }
    
    public int getBonusTemporadaForca()
    {
        return this.forcaBasica;
    }
    
    public int getBonusTemporadaVigor()
    {
        return this.vigorBasico;
    }
    
    public int getBonusTemporadaCerebro()
    {
        return this.cerebroBasico;
    }
    
    public int getBonusTemporadaIntuicao()
    {
        return this.intuicaoBasica;
    }            
}