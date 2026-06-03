package herozero.project.community.logic;

import herozero.project.community.view.BonusTemporadaView;
import herozero.project.community.model.FichaPersonagem;

import java.util.Scanner;

/**
 * Classe com método que armazena o valor referente ao 
 * bônus de temporada que o personagem recebe.
 * 
 */
public class Temporada
{

    private int forcaBasica;
    private int vigorBasico;
    private int cerebroBasico;
    private int intuicaoBasica;        
    
    
    public void verificacaoBonusTemporada(Scanner sc, FichaPersonagem fichaPersonagem)
    {
        
        BonusTemporadaView perguntaBonusTemporada = new BonusTemporadaView();
        
        
        perguntaBonusTemporada.perguntaTemporadaHabilidade(); // pergunta se a temporada acrescenta bônus nas habilidades
        String pergunta = sc.nextLine();
        
        
        if(pergunta.toLowerCase().equals("sim")) // Início da estrutura de condição.
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
                    fichaPersonagem.getBonusTotal().setBonusTotalForca(this.forcaBasica);
                    
                    System.out.printf("O personagem recebe um bônus de %d%% na força básica!\n", valorBonusTemporada);
                    break;
                
                case "vigor":
                    this.vigorBasico = valorBonusTemporada;
                    fichaPersonagem.getBonusTotal().setBonusTotalVigor(this.vigorBasico);
                    
                    System.out.printf("O personagem recebe um bônus de %d%% no vigor básico!\n", valorBonusTemporada);
                    break;
                
                case "cerebro":
                    this.cerebroBasico= valorBonusTemporada;
                    fichaPersonagem.getBonusTotal().setBonusTotalCerebro(this.cerebroBasico);
                    
                    System.out.printf("O personagem recebe um bônus de %d%% no cérebro básico!\n", valorBonusTemporada);
                    break;
                
                case "intuicao":
                    this.intuicaoBasica = valorBonusTemporada;
                    fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(this.intuicaoBasica);
                    
                    System.out.printf("O personagem recebe um bônus de %d%% na intuição básica!\n", valorBonusTemporada);
                    break;
                
                case "todas":
                    this.forcaBasica = valorBonusTemporada;
                    this.vigorBasico = valorBonusTemporada;
                    this.cerebroBasico = valorBonusTemporada;
                    this.intuicaoBasica = valorBonusTemporada;
                    
                    fichaPersonagem.getBonusTotal().setBonusTotalForca(this.forcaBasica);
                    fichaPersonagem.getBonusTotal().setBonusTotalVigor(this.vigorBasico);
                    fichaPersonagem.getBonusTotal().setBonusTotalCerebro(this.cerebroBasico);
                    fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(this.intuicaoBasica);
                    
                    
                    System.out.printf("O personagem recebe um bônus de %d%% em todas as habilidades básicas!\n", valorBonusTemporada);
                break;
                
                default:
                    System.out.println("Valor inválido!");
                    
                    fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
                    fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
                    fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
                    fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
        
            } // Fechamento do switch case.
        
        } 
        else
        {
            System.out.println("A temporada não acrescenta bônus às habilidades básicas do personagem!");
            
            fichaPersonagem.getBonusTotal().setBonusTotalForca(0);
            fichaPersonagem.getBonusTotal().setBonusTotalVigor(0);
            fichaPersonagem.getBonusTotal().setBonusTotalCerebro(0);
            fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(0);
        
        } // fechamanto do else
        
    } // Fechamento do método verificacaoBonusTemporada.
    
} // Fechamento da classe.