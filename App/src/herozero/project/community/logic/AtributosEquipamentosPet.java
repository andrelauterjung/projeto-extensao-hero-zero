package herozero.project.community.logic;

import herozero.project.community.view.AtributosObjetosPetView;
import herozero.project.community.model.FichaPersonagem; 
import herozero.project.community.view.ErrorStyleView;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Classe com método que pergunta informações ao usuário e armazena valores 
 * referentes aos atributos dos equipamentos e do pet que o personagem está equipado.
 * 
 * @author André Lauterjung
 * 
 */
public class AtributosEquipamentosPet
{
    boolean isFuncionando = true;
    
    private int totalAtributosForcaEquipamentosPet;
    private int totalAtributosVigorEquipamentosPet;
    private int totalAtributosCerebroEquipamentosPet;
    private int totalAtributosIntuicaoEquipamentosPet;
    
    
    public void calcularAtributosEquipPet(Scanner sc, HabilidadeTotalLogic habilidadeTotal, FichaPersonagem fichaPersonagem)
    {
        AtributosObjetosPetView perguntasAtributosEquipPet = new AtributosObjetosPetView();        
        ErrorStyleView errorMensagem = new ErrorStyleView();
        
        /* A variável pergunta pega a mesma resposta do nome da habilidade total
        que o usuário digitou anteriormente e aproveita para ser usada nesta classe
        seguindo uma ordem para o cálculo das habilidaddes. 
        
        Ou seja, se anteriormente ele digitou a força total, em seguida ele
        vai digitar os pontos de força que os equipamentos e pet acrescentam às habilidades. */
        String pergunta = habilidadeTotal.getRespHabTotalText();
        
        switch(pergunta)
        {
            /* Chama as perguntas da classe AtributosObjetosPetView referentes a
            força que os objetos acrescentam às habilidades do personagem. 
            
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/
            case "forca":
                
                // Item: Capa.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemCapa();
                        int atributoForcaEquipCapa = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipCapa <0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            isFuncionando = false;
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipCapa;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                // Item: Traje.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando)
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemTraje();
                        int atributoForcaEquipTraje = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipTraje < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipTraje;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }     
                } // Fechamento do loop while. 
                 
                
                // Item: Cinto.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando)
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemCinto();
                        int atributoForcaEquipCinto = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipCinto < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipCinto;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
    
                
                
                // Item: Sapatos.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemSapatos();
                        int atributoForcaEquipSapatos = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipSapatos < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipSapatos;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                
                // Item: Máscara.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemMascara();
                        int atributoForcaEquipMascara = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipMascara < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipMascara;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
       

                
                // Item: Dispositivo.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {perguntasAtributosEquipPet.mensagemForcaItemDispositivo();
                    int atributoForcaEquipDispositivo = sc.nextInt();
                    sc.nextLine();
                
                        if(atributoForcaEquipDispositivo < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipDispositivo;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
       
                
                     
                // Item: Arma.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemArma();
                        int atributoForcaEquipArma = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipArma < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipArma;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                

                
                // Item: Pet.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemForcaItemPet();
                        int atributoForcaEquipPet = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoForcaEquipPet < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosForcaEquipamentosPet += atributoForcaEquipPet;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                
                
                /* Adiciona o valor total dos pontos de força dos equipamentos e 
                pet equipados na classe AtributosEquipPet. */
                fichaPersonagem.getAtributosEquipPet().setForcaEquipamentosPet(this.totalAtributosForcaEquipamentosPet);
                break;
        
                
            /* Chama as perguntas da classe AtributosObjetosPetView referentes ao
            vigor que os objetos acrescentam às habilidades do personagem. 
                
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/    
            case "vigor":
                
                // Item: Capa.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemCapa();
                        int atributoVigorEquipCapa = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoVigorEquipCapa < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipCapa;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                
                
                
                // Item: Traje.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemTraje();
                        int atributoVigorEquipTraje = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoVigorEquipTraje < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipTraje;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                // Item: Cinto.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemCinto();
                        int atributoVigorEquipCinto = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoVigorEquipCinto < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipCinto;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                

                // Item: Sapatos.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemSapatos();
                        int atributoVigorEquipSapatos = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoVigorEquipSapatos < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipSapatos;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                

                
                // Item: Máscara.
                
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemMascara();
                        int atributoVigorEquipMascara = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoVigorEquipMascara < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipMascara;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
    
                
                // Item: Dispositivo.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemDispositivo();
                        int atributoVigorEquipDispositivo = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoVigorEquipDispositivo < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipDispositivo;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                

                // Item: Arma.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemArma();
                        int atributoVigorEquipArma = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoVigorEquipArma < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipArma;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                
              
                // Item: Pet.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemVigorItemPet();
                        int atributoVigorEquipPet = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoVigorEquipPet < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosVigorEquipamentosPet += atributoVigorEquipPet;    
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while.
                
 
                /* Adiciona o valor total dos pontos de vigor dos equipamentos e 
                pet equipados na classe AtributosEquipPet. */
                fichaPersonagem.getAtributosEquipPet().setVigorEquipamentosPet(this.totalAtributosVigorEquipamentosPet);
                break;
            
                              
            /* Chama as perguntas da classe AtributosObjetosPetView referentes ao
            cérebro que os objetos acrescentam às habilidades do personagem. 
                
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/    
            case "cerebro":
                
                // Item: Capa.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemCapa();
                        int atributoCerebroEquipCapa = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipCapa < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipCapa;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
  
                // Item: Traje.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemTraje();
                        int atributoCerebroEquipTraje = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoCerebroEquipTraje < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipTraje;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                  
                // Item: Cinto.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemCinto();
                        int atributoCerebroEquipCinto = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipCinto < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipCinto;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                       
                // Item: Sapatos.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemSapatos();
                        int atributoCerebroEquipSapatos = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipSapatos < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipSapatos;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                
                
                
                // Item: Máscara.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                 while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemMascara();
                        int atributoCerebroEquipMascara = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipMascara < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipMascara;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                 
                // Item: Dispositivo.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemDispositivo();
                        int atributoCerebroEquipDispositivo = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipDispositivo < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipDispositivo;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                

                // Item: Arma.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemArma();
                        int atributoCerebroEquipArma = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipArma < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipArma;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
  
                // Item: Pet.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemCerebroItemPet();
                        int atributoCerebroEquipPet = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoCerebroEquipPet < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipPet;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                /* Adiciona o valor total dos pontos de cérebro dos equipamentos
                e pet equipados na classe AtributosEquipPet. */
                fichaPersonagem.getAtributosEquipPet().setCerebroEquipamentosPet(this.totalAtributosCerebroEquipamentosPet);
                break;
                
            
                
            /* Chama as perguntas da classe AtributosObjetosPetView referentes a
            intuição que os objetos acrescentam às habilidades do personagem. 
                
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/    
            case "intuicao":
                
                // Item: Capa.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemCapa();
                        int atributoIntuicaoEquipCapa = sc.nextInt();
                        sc.nextLine();
                    
                        if(atributoIntuicaoEquipCapa < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipCapa;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                      
                // Item: Traje.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemTraje();
                        int atributoIntuicaoEquipTraje = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoIntuicaoEquipTraje < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipTraje;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
  
                     
                // Item: Cinto.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                         perguntasAtributosEquipPet.mensagemIntuicaoItemCinto();
                        int atributoIntuicaoEquipCinto = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoIntuicaoEquipCinto < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipCinto;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                

                   
                // Item: Sapatos.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemSapatos();
                        int atributoIntuicaoEquipSapatos = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoIntuicaoEquipSapatos < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipSapatos;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                // Item: Máscara.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemMascara();
                        int atributoIntuicaoEquipMascara = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoIntuicaoEquipMascara < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipMascara;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                 
                // Item: Dispositivo.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemDispositivo();
                        int atributoIntuicaoEquipDispositivo = sc.nextInt();
                        sc.nextLine();
                
                        if(atributoIntuicaoEquipDispositivo < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipDispositivo;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                

                // Item: Arma.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemArma();
                        int atributoIntuicaoEquipArma = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoIntuicaoEquipArma < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipArma;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                
                // Item: Pet.
                isFuncionando = true; // Mudando o valor da variável para true e assim iniciar outro loop while.
                while(isFuncionando) 
                {
                    try
                    {
                        perguntasAtributosEquipPet.mensagemIntuicaoItemPet();
                        int atributoIntuicaoEquipPet = sc.nextInt();
                        sc.nextLine();
                        
                        if(atributoIntuicaoEquipPet < 0)
                        {
                            errorMensagem.mensagemErroNumNegativo();
                        }
                        else
                        {
                            this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipPet;
                            isFuncionando = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        errorMensagem.mensagemEntradaInvalida();
                        sc.nextLine();
                    }    
                } // Fechamento do loop while. 
                
                /* Adiciona o valor total dos pontos de intuição dos equipamentos
                e pet equipados na classe AtributosEquipPet. */
                fichaPersonagem.getAtributosEquipPet().setIntuicaoEquipamentosPet(this.totalAtributosIntuicaoEquipamentosPet);
                break;
        
        } // fechamento do switch case
        
    } // fechamento do método calcularAtributosEquipPet
       
} // fechamento da classe