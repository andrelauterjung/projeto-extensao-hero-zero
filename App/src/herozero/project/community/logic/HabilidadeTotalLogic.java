package herozero.project.community.logic;

import herozero.project.community.view.HabilidadeTotalView;
import herozero.project.community.model.FichaPersonagem;

import java.util.Scanner;
import java.util.InputMismatchException;
        

public class HabilidadeTotalLogic
{
    boolean isVerificandoHabilidade = true;
    boolean isVerificandoForcaTotal = true;
    boolean isVerificandoVigorTotal = true;
    boolean isVerificandoCerebroTotal = true;
    boolean isVerificandoIntuicaoTotal = true;
    
    private int forcaTotal;
    private int vigorTotal;
    private int cerebroTotal;
    private int intuicaoTotal;
    String perguntaHabTotal;
    int valorUserForcaTotal;
    int valorUserVigorTotal;
    int valorUserCerebroTotal;
    int valorUserIntuicaoTotal;
    
    private String respHabTotalText; // armazenar resposta do usuário para utilizar na classe AtributosEquipamentosPet
      
    public void armazenarHabilidadeTotal(Scanner sc, FichaPersonagem fichaPersonagem)
    {
        HabilidadeTotalView perguntasHabilidadeTotal = new HabilidadeTotalView();
        
        
        
        
        while(isVerificandoHabilidade)
        {
            perguntasHabilidadeTotal.mensagemHabToCalc();
            perguntaHabTotal = sc.nextLine(); // Armazenar a habilidade que o usuário quer calcular
            perguntaHabTotal = perguntaHabTotal.toLowerCase();
            
            if(!perguntaHabTotal.equals("forca") && !perguntaHabTotal.equals("vigor") 
            && !perguntaHabTotal.equals("cerebro") && !perguntaHabTotal.equals("intuicao"))
            {
                System.out.println("Você digitou 'forca', 'vigor', 'cerebro' ou 'intuicao' errado! Tente novamente!");
            }
            else
            {
                this.respHabTotalText = perguntaHabTotal; 
                isVerificandoHabilidade = false;
            }
            
        }
           
            
        switch(perguntaHabTotal) 
        {
            case "forca":
                
                while(isVerificandoForcaTotal)
                {
                    try
                    {
                        perguntasHabilidadeTotal.mensagemForcaTotal();
                        valorUserForcaTotal = sc.nextInt();
                        sc.nextLine();
                        
                        if(valorUserForcaTotal < 0)
                        {
                            System.out.println("ERRO: Você digitou um valor inválido!");
                            System.out.println("TENTE NOVAMENTE!");
                        }
                        else
                        {
                            this.forcaTotal = valorUserForcaTotal;
                            fichaPersonagem.getHabilidadeTotal().setValorForcaTotal(this.forcaTotal);
            
                            System.out.println("Força total do personagem: "+this.forcaTotal);
                            isVerificandoForcaTotal = false;
                        }   
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("ERRO: Você digitou uma String onde deve ir número. ");
                        System.out.println("TENTE NOVAMENTE!");
                        sc.nextLine();
                    }
               
                } // Fechamento do loop while.
                break;
                
            case "vigor":
                
                while(isVerificandoVigorTotal)
                {
                    try
                    {
                        perguntasHabilidadeTotal.mensagemVigorTotal();
                        valorUserVigorTotal = sc.nextInt();
                        sc.nextLine();
                        
                        if(valorUserVigorTotal < 0)
                        {
                            System.out.println("ERRO: Você digitou um valor inválido!");
                            System.out.println("TENTE NOVAMENTE!");
                        }
                        else
                        {
                            this.vigorTotal = valorUserVigorTotal;
            
                            fichaPersonagem.getHabilidadeTotal().setValorVigorTotal(this.vigorTotal);
                            System.out.println("Vigor total do personagem: "+this.vigorTotal);
                            isVerificandoVigorTotal = false;
                        }
   
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("ERRO: Você digitou uma String onde deve ir número. ");
                        System.out.println("TENTE NOVAMENTE!");
                        sc.nextLine();
                    }

                } // Fechamento do loop while -> vigor.
                break;
                
                
    
            case "cerebro":
                
                while(isVerificandoCerebroTotal)
                {
                    try
                    {
                        perguntasHabilidadeTotal.mensagemCerebroTotal();            
                        valorUserCerebroTotal = sc.nextInt();
                        sc.nextLine();
                        
                        
                        if(valorUserCerebroTotal < 0)
                        {
                            System.out.println("ERRO: Você digitou um valor inválido!");
                            System.out.println("TENTE NOVAMENTE!");
                        }
                        else
                        {
                            this.cerebroTotal = valorUserCerebroTotal;
            
                            fichaPersonagem.getHabilidadeTotal().setValorCerebroTotal(this.cerebroTotal);
                            System.out.println("Cérebro total do personagem: "+this.cerebroTotal);
                            isVerificandoCerebroTotal = false;
                        }
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("ERRO: Você digitou uma String onde deve ir número. ");
                        System.out.println("TENTE NOVAMENTE!");
                        sc.nextLine();
                    }
                } // Fechamento do loop while -> cérebro.    
                break;
                
            case "intuicao":
                
                while(isVerificandoIntuicaoTotal)
                {
                    try
                    {
                        perguntasHabilidadeTotal.mensagemIntuicaoTotal();
                        valorUserIntuicaoTotal = sc.nextInt();
                        sc.nextLine();
                        
                        if(valorUserIntuicaoTotal < 0)
                        {
                            System.out.println("ERRO: Você digitou um valor inválido!");
                            System.out.println("TENTE NOVAMENTE!");
                        }
                        else
                        {
                            this.intuicaoTotal = valorUserIntuicaoTotal;
                            fichaPersonagem.getHabilidadeTotal().setValorIntuicaoTotal(this.intuicaoTotal);
                            
                            System.out.println("Intuição total do personagem: "+this.intuicaoTotal);
                            isVerificandoIntuicaoTotal = false;
                        }
                        
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("ERRO: Você digitou uma String onde deve ir número. ");
                        System.out.println("TENTE NOVAMENTE!");
                        sc.nextLine();
                    }
                } // Fechamento loop while -> intuição.
                break;
                
        } // fechamento do switch case
        
    } // fechamento do método armazenarHabilidadeTotal
    
   
    public String getRespHabTotalText()
    {
        return this.respHabTotalText;
    }
}  // fechamento da classe