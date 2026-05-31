package herozero.project.community.logic;

import herozero.project.community.view.BonusEquipamentosView;

import java.util.Scanner;

/**
 * Classe com métodos que perguntam informações ao usuário e armazenam valores referentes
 * aos bônus dos equipamentos que o personagem está usando.
 * 
 * @author André Lauterjung
 */
public class BonusEquipamentos
{
    private int bonusEquipamentosForca;
    private int bonusEquipamentosVigor;
    private int bonusEquipamentosCerebro;
    private int bonusEquipamentosIntuicao;
    
    
    public void verificarConjuntos(Scanner sc)
    {
        BonusEquipamentosView perguntaBonusEquipamentos = new BonusEquipamentosView();
        
        perguntaBonusEquipamentos.perguntaConjuntoLendario();
        String perguntaLendario = sc.nextLine();
        if(perguntaLendario.toLowerCase().equals("sim")) // caso o usúário digite que o personagem tenha conjunto lendário 
        {
            this.bonusEquipamentosForca = 10;
            this.bonusEquipamentosVigor = 10;
            this.bonusEquipamentosCerebro = 10;
            this.bonusEquipamentosIntuicao = 10;
                
            System.out.println("Todas as habilidades básicas recebem um bônus de 10% de conjunto");
            return;
        }
        
        
        perguntaBonusEquipamentos.perguntaConjuntoEpico();
        String perguntaEpico = sc.nextLine();
        
        if(perguntaEpico.toLowerCase().equals("sim")) // caso ele tenha conjunto épico completo
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
            } // fechamento do switch case   
        }    
                
        perguntaBonusEquipamentos.perguntaConjuntoDispositivoArmaMissil();
        String perguntaDispoArmaMissil = sc.nextLine();
        
        if(perguntaDispoArmaMissil.toLowerCase().equals("sim")) // pergunta bônus de dispositivo + arma ou arma + missil
        {
            System.out.println("Em qual habilidade o bônus é acrescentado?");
            System.out.println("Opções: forca, vigor, cerebro ou intuicao");
            System.out.println("Observação: digite sem caracteres especiais ou acentos.\n\n");
            String verifHabilidadeConjDispArmaMissil = sc.nextLine();
    
            switch(verifHabilidadeConjDispArmaMissil)
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
            }
            return;
        }
         
        perguntaBonusEquipamentos.perguntaConjuntosMistos();
        String perguntaMist = sc.nextLine();
        
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
        else
        {
            this.bonusEquipamentosForca += 0;
            this.bonusEquipamentosVigor += 0;
            this.bonusEquipamentosCerebro += 0;
            this.bonusEquipamentosIntuicao += 0;
        
            System.out.println("O personagem não recebe bônus de conjunto de equipamentos!");
        }         
    }

    
    /* Setters para que seja possível alterar o valor das variáveis pela classe Main
    Apenas precisa chamar o método por lá que o valor é alterado
    */
    public void setForca(int valorBonusForcaConjuntoMistoUser)
    {
        this.bonusEquipamentosForca += valorBonusForcaConjuntoMistoUser;
    }
    
    public void setVigor(int valorBonusVigorConjuntoMistoUser)
    {
        this.bonusEquipamentosVigor += valorBonusVigorConjuntoMistoUser;
    }
    
    public void setCerebro(int valorBonusCerebroConjuntoMistoUser)
    {
        this.bonusEquipamentosCerebro += valorBonusCerebroConjuntoMistoUser;
    }
    
    public void setIntuicao(int valorBonusIntuicaoConjuntoMistoUser)
    {
        this.bonusEquipamentosIntuicao += valorBonusIntuicaoConjuntoMistoUser;
    }
    
    
    /* Getters que, ao serem chamados, retornam o valor da variável.*/
    public int getForca()
    {
        return this.bonusEquipamentosForca;
    }
    
    public int getVigor()
    {
        return this.bonusEquipamentosVigor;
    }
    
    public int getCerebro()
    {
        return this.bonusEquipamentosCerebro;
    }
    
    public int getIntuicao()
    {
       return this.bonusEquipamentosIntuicao;
    }
}