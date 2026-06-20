package herozero.project.community.logic;

import herozero.project.community.view.BonusEquipamentosView;
import herozero.project.community.model.FichaPersonagem;

import java.util.Scanner;

/**
 * Classe com método que pergunta informações ao usuário e armazena valores 
 * referentes aos bônus dos equipamentos que o personagem está usando.
 * 
 * @author André Lauterjung
 * 
 */
public class BonusEquipamentos
{
    private int bonusEquipamentosForca;
    private int bonusEquipamentosVigor;
    private int bonusEquipamentosCerebro;
    private int bonusEquipamentosIntuicao;
    
    
    public void verificarConjuntos(Scanner sc, FichaPersonagem fichaPersonagem)
    {
        
        BonusEquipamentosView perguntaBonusEquipamentos = new BonusEquipamentosView();
        
        perguntaBonusEquipamentos.perguntaConjuntoLendario();
        String perguntaLendario = sc.nextLine();
        
        
        /* Início da primeira estrutura de condição
        Roda caso o usuário digite que o personagem tenha conjunto 
        lendário equipado. */
        if(perguntaLendario.toLowerCase().equals("sim"))
        {
            this.bonusEquipamentosForca = 10;
            this.bonusEquipamentosVigor = 10;
            this.bonusEquipamentosCerebro = 10;
            this.bonusEquipamentosIntuicao = 10;
            
            fichaPersonagem.getBonusTotal().setBonusTotalForca(this.bonusEquipamentosForca);
            fichaPersonagem.getBonusTotal().setBonusTotalVigor(this.bonusEquipamentosVigor);
            fichaPersonagem.getBonusTotal().setBonusTotalCerebro(this.bonusEquipamentosCerebro);
            fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(this.bonusEquipamentosIntuicao);
            
            System.out.println("Todas as habilidades básicas recebem um bônus de 10% de conjunto");
            return;
        } // Fim da primeira estrutura de condição
        
        
        
        perguntaBonusEquipamentos.perguntaConjuntoEpico();
        String perguntaEpico = sc.nextLine();
        
        /* Início da segunda estrutura de condição
        Roda caso o usuário digite que o personagem tenha conjunto 
        épico equipado. */
        if(perguntaEpico.toLowerCase().equals("sim")) // Roda caso o usuário digite que o personagem tenha conjunto épico.
        {
            System.out.println("O conjunto épico acrescenta bônus de 5% ou 7% às habilidades básicas do personagem?");
            int verificacaoTipoConjEpico = sc.nextInt();
            sc.nextLine();
                
            switch(verificacaoTipoConjEpico)
            {
                case 5:
                    this.bonusEquipamentosForca = 5;
                    this.bonusEquipamentosVigor = 5;
                    this.bonusEquipamentosCerebro = 5;
                    this.bonusEquipamentosIntuicao = 5;
        
                    System.out.printf("Todas as habilidades básicas recebem um bônus de 5%% de conjunto\n"); 
                break;
                    
                case 7:
                    this.bonusEquipamentosForca = 7;
                    this.bonusEquipamentosVigor = 7;
                    this.bonusEquipamentosCerebro = 7;
                    this.bonusEquipamentosIntuicao = 7;
        
                    System.out.printf("Todas as habilidades básicas recebem um bônus de 7%% de conjunto\n");
                    break;
                        
                default:
                    System.out.println("Valor inválido!");
                        
                    this.bonusEquipamentosForca = 0;
                    this.bonusEquipamentosVigor = 0;
                    this.bonusEquipamentosCerebro = 0;
                    this.bonusEquipamentosIntuicao = 0;
        
                    System.out.println("O personagem não recebe bônus de conjunto de equipamentos!");
            } // Fechamento do Switch case.
        
        } // Fim da segunda estrutura de condição.   
                
        
        perguntaBonusEquipamentos.perguntaConjuntoDispositivoArmaMissil();
        String perguntaDispoArmaMissil = sc.nextLine();
        
        /*Início da terceira estrutura de condição
        Roda caso o usuário digite que o personagem tenha conjunto 
        de arma + míssil ou dispositivo + arma equipado.*/
        if(perguntaDispoArmaMissil.toLowerCase().equals("sim")) 
        {
            System.out.println("Em qual habilidade o bônus é acrescentado?");
            System.out.println("Opções: forca, vigor, cerebro ou intuicao");
            System.out.println("Observação: digite sem caracteres especiais ou acentos.\n\n");
            String verifHabilidadeConjDispArmaMissil = sc.nextLine();
    
            switch(verifHabilidadeConjDispArmaMissil.toLowerCase())
            {
                case "forca":
                    this.bonusEquipamentosForca += 7;
                    System.out.printf("Total de bônus no(a) %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosForca);
                    break;
                    
                case "vigor":
                    this.bonusEquipamentosVigor += 7;
                    System.out.printf("Total de bônus no(a) %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosVigor);
                    break;
                
                case "cerebro":
                    this.bonusEquipamentosCerebro += 7;
                    System.out.printf("Total de bônus no(a) %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosCerebro);
                    break;
                
                case "intuicao":
                    this.bonusEquipamentosIntuicao += 7;
                    System.out.printf("Total de bônus no(a) %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosIntuicao);
                    break;
                        
                default:
                    System.out.println("Valor inválido!");
            } // Fechamento do Switch case.
            
        } // Fim da terceira estrutura de condição
         
          
        // Início da Quarta estrutura de condição
        /* Roda somente caso o usuário digite que o personagem NÃO tenha conjunto 
        lendário e NÃO tenha conjunto épico equipado.*/
        
        if(!perguntaLendario.equalsIgnoreCase("sim") && !perguntaEpico.equalsIgnoreCase("sim"))
        {
            perguntaBonusEquipamentos.perguntaConjuntosMistos();
            String perguntaMist = sc.nextLine();
            
            // Roda caso o usuário digite que o personagem tenha conjunto misto.
            if(perguntaMist.toLowerCase().equals("sim")) // se ele tiver conjuntos mistos equipados 
            {   
        
                System.out.println("Digite o total de bônus que a seguinte habilidade recebe do conjunto de objetos: ");
                System.out.println("Observação: se o personagem recebe bônus de diferentes conjuntos na mesma habilidade, como capa+traje(7% na força) e cinto+sapatos(7% na força), some o bônus (7+7, por exemplo) e insira na respectiva habilidade");
                System.out.println("ATENÇÃO: Não some os bônus de arma, dispositivo e míssil, pois já foram calculados!");
                    
                System.out.println("Força básica: ");
                int pontosObjetosMistosForca = sc.nextInt();
                sc.nextLine();
                this.bonusEquipamentosForca += pontosObjetosMistosForca;
              
                    
                System.out.println("Vigor básico: ");
                int pontosObjetosMistosVigor = sc.nextInt();
                sc.nextLine();
                this.bonusEquipamentosVigor += pontosObjetosMistosVigor;
                    
                    
                System.out.println("Cérebro básico: ");
                int pontosObjetosMistosCerebro = sc.nextInt();
                sc.nextLine();
                this.bonusEquipamentosCerebro += pontosObjetosMistosCerebro; 
              
                    
                System.out.println("Intuicao básica: ");
                int pontosObjetosMistosIntuicao = sc.nextInt();
                sc.nextLine();
                this.bonusEquipamentosIntuicao += pontosObjetosMistosIntuicao;
            }
            // Roda caso o usuário digite que o personagem não tem conjunto misto.
            else
            {
            this.bonusEquipamentosForca += 0;
            this.bonusEquipamentosVigor += 0;
            this.bonusEquipamentosCerebro += 0;
            this.bonusEquipamentosIntuicao += 0;
        
            System.out.println("Nenhum bonus de conjunto misto adicionado!");
            }
            
        } // Fim da quarta estrutura de condição.
        
         fichaPersonagem.getBonusTotal().setBonusTotalForca(this.bonusEquipamentosForca);
         fichaPersonagem.getBonusTotal().setBonusTotalVigor(this.bonusEquipamentosVigor);
         fichaPersonagem.getBonusTotal().setBonusTotalCerebro(this.bonusEquipamentosCerebro);
         fichaPersonagem.getBonusTotal().setBonusTotalIntuicao(this.bonusEquipamentosIntuicao);
    
    } // Fechamento do método verificarConjuntos.   

} // Fechamento da classe.