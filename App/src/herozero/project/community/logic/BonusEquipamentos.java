package herozero.project.community.logic;

import herozero.project.community.view.BonusEquipamentosView;
import herozero.project.community.model.FichaPersonagem;
import herozero.project.community.view.ErrorStyleView;
import java.util.Scanner;
import java.util.InputMismatchException;
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
        ErrorStyleView errorMensagem = new ErrorStyleView();
        
        boolean isVerificandoConjLendario = true;
        boolean isVerificandoValBonusEpic = true;
        boolean isVerificandoRespConjEpic = true;
        boolean isPerguntandoConjDispArmMis = true;
        boolean isNomeHabilidadeConjDispArmMis = true;
        boolean isPerguntandoConjMis = true;
        
        int verificacaoTipoConjEpico = -1;
        int pontosObjetosMistosForca = -1;
        int pontosObjetosMistosVigor = -1;
        int pontosObjetosMistosCerebro = -1;
        int pontosObjetosMistosIntuicao = -1;
        String perguntaLendario = "";
        String perguntaEpico = "";
        String perguntaDispoArmaMissil = "";
        String verifHabilidadeConjDispArmaMissil = "";
        String perguntaMist = "";
        
        
        
        /* Este loop continuará em funcionamento enquanto o usuário não digitar
        "sim", "não" ou "nao" corretamente referente a pergunta sobre conjuntos
        lendários. */
        while(isVerificandoConjLendario)
        {
            perguntaBonusEquipamentos.perguntaConjuntoLendario();
            perguntaLendario = sc.nextLine();
            perguntaLendario = perguntaLendario.toLowerCase();
        
            /* Início da primeira estrutura de condição
            Roda caso o usuário digite que o personagem tenha conjunto 
            lendário equipado. */
            if(perguntaLendario.equals("sim"))
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
                
                isVerificandoConjLendario = false; 
                return;
                
            }
            
            else if(perguntaLendario.equals("não") || perguntaLendario.equals("nao"))
            {
                
                /* Este loop while continuará ativo enquanto o usuário não digitar 
                "sim", "não" ou "nao" corretamente referente a pergunta sobre
                conjuntos épicos. */  
                while(isVerificandoRespConjEpic)
                {   
                 
                    perguntaBonusEquipamentos.perguntaConjuntoEpico();
                    perguntaEpico = sc.nextLine();
                    perguntaEpico = perguntaEpico.toLowerCase();
                    
                    if(!perguntaEpico.equals("sim") && !perguntaEpico.equals("não") && !perguntaEpico.equals("nao"))
                    {
                        errorMensagem.mensagemOpcaoErro();
                    }
                    else
                    {
                        isVerificandoRespConjEpic = false;
                    }
                    
                    isVerificandoConjLendario = false;
                }
                
               
                
                /* Início da segunda estrutura de condição
                Roda caso o usuário digite que o personagem tenha conjunto 
                épico equipado. */
                if(perguntaEpico.equals("sim"))
                {
                    
                    while(isVerificandoValBonusEpic)
                    {
                        try
                        {
                            System.out.println("O conjunto épico acrescenta bônus de 5% ou 7% às habilidades básicas do personagem?");
                            verificacaoTipoConjEpico = sc.nextInt();
                            sc.nextLine();
                            
                            if(verificacaoTipoConjEpico != 5 && verificacaoTipoConjEpico != 7)
                            {
                                System.out.println("ERRO: Você precisa digitar 5 ou 7!");
                                System.out.println("Tente novamente!");
                            }
                            else
                            {
                                isVerificandoValBonusEpic = false;                              
                            } // Fechamento da Estrutura de condição.
                            
                        }
                        catch(InputMismatchException e)
                        {                          
                            errorMensagem.mensagemEntradaInvalida();
                            sc.nextLine();
                        } // Fechamento do Try-catch. 
                            
                    } // Fechamento do loop while isVerificandoBonusEpic.
                        
                        
                        
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
                            
                    } // Fechamento do Switch case.
                    
                    isVerificandoConjLendario = false;
        
                }
                else
                {
                    this.bonusEquipamentosForca = 0;
                    this.bonusEquipamentosVigor = 0;
                    this.bonusEquipamentosCerebro = 0;
                    this.bonusEquipamentosIntuicao = 0;
        
                    System.out.println("O personagem não recebe bônus de conjunto de equipamentos!");
                    
                } // Fechamento da segunda estrutura de condição.
     
            }
            else
                
            {
                errorMensagem.mensagemOpcaoErro();
                
            } // Fechamento da primeira estrutura de condição.
        
        } // Fechamento do loop while.
        
        
           
        /*Início da verificação de conjunto de arma+dispositivo ou arma+míssil. 
        
        Caso o jogador possua conjunto lendário, este bloco não roda.*/

        if(!perguntaLendario.equals("sim"))
        {
            while(isPerguntandoConjDispArmMis)
            {
                perguntaBonusEquipamentos.perguntaConjuntoDispositivoArmaMissil();
                perguntaDispoArmaMissil = sc.nextLine();
                perguntaDispoArmaMissil = perguntaDispoArmaMissil.toLowerCase();
                
                if(perguntaDispoArmaMissil.equals("sim") || perguntaDispoArmaMissil.equals("não") || perguntaDispoArmaMissil.equals("nao"))
                {
                    isPerguntandoConjDispArmMis = false;
                }
                else
                {
                    errorMensagem.mensagemOpcaoErro();
                        
                }
                
            } // Fechamento loop while
            
        } // Fechamento da estrutura de condição.


        /*Início da terceira estrutura de condição
        Roda caso o usuário digite que o personagem tenha conjunto 
        de arma + míssil ou dispositivo + arma equipado.*/
        if(perguntaDispoArmaMissil.equals("sim")) 
        {
                    
            // Adicionar loop while para que continue em execução enquanto o usuário não digite a habilidade corretamente
            while(isNomeHabilidadeConjDispArmMis)
            {
                System.out.println("Em qual habilidade o bônus é acrescentado?");
                System.out.println("Opções: forca, vigor, cerebro ou intuicao");
                    
                verifHabilidadeConjDispArmaMissil = sc.nextLine();
                verifHabilidadeConjDispArmaMissil = verifHabilidadeConjDispArmaMissil.toLowerCase();
                   
                if(!verifHabilidadeConjDispArmaMissil.equals("forca") && !verifHabilidadeConjDispArmaMissil.equals("vigor")
                && !verifHabilidadeConjDispArmaMissil.equals("cerebro") && !verifHabilidadeConjDispArmaMissil.equals("intuicao"))
                {
                    System.out.println("Você digitou 'forca', 'vigor', 'cerebro' ou 'intuicao' errado! Tente novamente!");
                }
                else
                {
                    isNomeHabilidadeConjDispArmMis= false;
                }
            }
                            
            switch(verifHabilidadeConjDispArmaMissil)
            {
                case "forca":
                    this.bonusEquipamentosForca += 7;
                    System.out.printf("Total de bônus na %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosForca);
                    break;
                    
                case "vigor":
                    this.bonusEquipamentosVigor += 7;
                    System.out.printf("Total de bônus no %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosVigor);
                    break;
                
                case "cerebro":
                    this.bonusEquipamentosCerebro += 7;
                    System.out.printf("Total de bônus no %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosCerebro);
                    break;
                
                case "intuicao":
                    this.bonusEquipamentosIntuicao += 7;
                    System.out.printf("Total de bônus na %s: %d%%\n", verifHabilidadeConjDispArmaMissil, this.bonusEquipamentosIntuicao);
                    break;

            } // Fechamento do Switch case.
            
        } // Fim da terceira estrutura de condição
                

        /* Início da Quarta estrutura de condição
        
        Roda somente caso o usuário digite que o personagem NÃO tenha conjunto 
        lendário e NÃO tenha conjunto épico equipado.*/
        if(!perguntaLendario.equals("sim") && !perguntaEpico.equals("sim"))
        {
            
            // Adicionar loop while para continuar em execução caso o usuário digite errado 'sim ou nao/não'
            
            while(isPerguntandoConjMis)
            {
   
                perguntaBonusEquipamentos.perguntaConjuntosMistos();
                perguntaMist = sc.nextLine();
                perguntaMist = perguntaMist.toLowerCase();
                
                if(!perguntaMist.equals("sim") && !perguntaMist.equals("não") && !perguntaMist.equals("nao"))
                {
                    errorMensagem.mensagemOpcaoErro();
                }
                else
                {
                    isPerguntandoConjMis = false;
                }
            }
              
            // Roda caso o usuário digite que o personagem tenha conjunto misto.
            if(perguntaMist.equals("sim")) // se ele tiver conjuntos mistos equipados 
            {   
        
                System.out.println("Digite o total de bônus que a seguinte habilidade recebe do conjunto de objetos: ");
                System.out.println("Observação: se o personagem recebe bônus de diferentes conjuntos na mesma habilidade, como capa+traje(7% na força) e cinto+sapatos(7% na força), some o bônus (7+7, por exemplo) e insira na respectiva habilidade");
                System.out.println("ATENÇÃO: Não some os bônus de arma, dispositivo e míssil, pois já foram calculados!");
                   
                
                //Adicionar loops while
                boolean isForcaConjMistoRun = true;
                while(isForcaConjMistoRun)
                {
                    try
                    {
                        System.out.println("Força básica: ");
                        pontosObjetosMistosForca = sc.nextInt();
                        sc.nextLine(); 
                    
                        if(pontosObjetosMistosForca < 0 || pontosObjetosMistosForca > 28)
                        {
                            errorMensagem.mensagemNumeroInvalido();
                        }
                        else
                        {
                            isForcaConjMistoRun = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }
                }
                this.bonusEquipamentosForca += pontosObjetosMistosForca;
              
                    
                boolean isVigorConjMistoRun = true;
                while(isVigorConjMistoRun)
                {
                    try
                    {
                        System.out.println("Vigor básico: ");
                        pontosObjetosMistosVigor = sc.nextInt();
                        sc.nextLine();
                    
                        if(pontosObjetosMistosVigor < 0 || pontosObjetosMistosVigor > 28)
                        {
                            errorMensagem.mensagemNumeroInvalido();
                        }
                        else
                        {
                            isVigorConjMistoRun = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }
                }
                this.bonusEquipamentosVigor += pontosObjetosMistosVigor;
                    
                
                
                boolean isCerebroConjMistoRun = true;
                while(isCerebroConjMistoRun)
                {                    
                    try
                    {
                        System.out.println("Cérebro básico: ");
                        pontosObjetosMistosCerebro = sc.nextInt();
                        sc.nextLine();
                
                        if(pontosObjetosMistosCerebro < 0 || pontosObjetosMistosCerebro > 28)
                        {
                            errorMensagem.mensagemNumeroInvalido();
                        }
                        else
                        {
                            isCerebroConjMistoRun = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }
                }
                this.bonusEquipamentosCerebro += pontosObjetosMistosCerebro; 
              
                
                
                boolean isIntuicaoConjMistoRun = true;
                while(isIntuicaoConjMistoRun)
                {
                    try
                    {
                        System.out.println("Intuicao básica: ");
                        pontosObjetosMistosIntuicao = sc.nextInt();
                        sc.nextLine();
                    
                        if(pontosObjetosMistosIntuicao < 0 || pontosObjetosMistosIntuicao > 28)
                        {
                            errorMensagem.mensagemNumeroInvalido();
                        }
                        else
                        {
                            isIntuicaoConjMistoRun = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }
                }
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