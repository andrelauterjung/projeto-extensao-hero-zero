package herozero.project.community.logic;

import herozero.project.community.view.HabilidadeTotalView;

import java.util.Scanner;

/**
 * Classe com métodos que retornam informações ao usuário e armazena valor 
 * referente a habilidade total do personagem.
 * 
 * @author André Lauterjung
 */
public class HabilidadeTotal
{
    private int forcaTotal;
    private int vigorTotal;
    private int cerebroTotal;
    private int intuicaoTotal;
    
    private String respHabTotalText; // armazenar resposta do usuário para utilizar na classe AtributosEquipamentosPet
      
    public void armazenarHabilidadeTotal(Scanner sc)
    {
        HabilidadeTotalView perguntasHabilidadeTotal = new HabilidadeTotalView();
        
        perguntasHabilidadeTotal.mensagemHabToCalc();
        String perguntaHabTotal = sc.nextLine(); // Armazenar a habilidade que o usuário quer calcular

        this.respHabTotalText = perguntaHabTotal; 
              
        switch(perguntaHabTotal.toLowerCase()) 
        {
            case "forca":
                perguntasHabilidadeTotal.mensagemForcaTotal();
            
                int valorUserForcaTotal = sc.nextInt();
                sc.nextLine();
                
                this.forcaTotal = valorUserForcaTotal;
            
                System.out.println("Força total do personagem: "+this.forcaTotal);
                break;
                
            case "vigor":
                perguntasHabilidadeTotal.mensagemVigorTotal();
            
                int valorUserVigorTotal = sc.nextInt();
                sc.nextLine();
                this.vigorTotal = valorUserVigorTotal;
            
                System.out.println("Vigor total do personagem: "+this.vigorTotal);
                break;
                
            case "cerebro":
                perguntasHabilidadeTotal.mensagemCerebroTotal();
            
                int valorUserCerebroTotal = sc.nextInt();
                sc.nextLine();
                this.cerebroTotal = valorUserCerebroTotal;
            
                System.out.println("Cérebro total do personagem: "+this.cerebroTotal);
                break;
                
            case "intuicao":
                perguntasHabilidadeTotal.mensagemIntuicaoTotal();
            
                int valorUserIntuicaoTotal = sc.nextInt();
                sc.nextLine();
                this.intuicaoTotal = valorUserIntuicaoTotal;
            
                System.out.println("Intuição total do personagem: "+this.intuicaoTotal);
                break;
                
            default:
                System.out.println("Nome inválido!");
                
        } // fechamento do switch case
        
    } // fechamento do método armazenarHabilidadeTotal
    
    
    // Setters para o valor ser adicionado à variável indicada direto da classe Main
    public void setValorForcaTotal(int valorForcaTotal)
    {
        this.forcaTotal = valorForcaTotal;
    }    
    
    public void setValorVigorTotal(int valorVigorTotal)
    {
        this.vigorTotal = valorVigorTotal;
    } 
    
    public void setValorCerebroTotal(int valorCerebroTotal)
    {
        this.cerebroTotal = valorCerebroTotal;
    } 
    
    public void setValorIntuicaoTotal(int valorIntuicaoTotal)
    {
        this.intuicaoTotal = valorIntuicaoTotal;
    } 
    
    
    // Getters para retornar o valor das variáveis. 
    public int getForcaTotal()
    {
        return this.forcaTotal;
    }
    
    public int getVigorTotal()
    {
        return this.vigorTotal;
    }
    
    public int getCerebroTotal()
    {
        return this.cerebroTotal;
    }
    
    public int getIntuicaoTotal()
    {
        return this.intuicaoTotal;
    }    
    
    public String getRespHabTotalText()
    {
        return this.respHabTotalText;
    }
}  // fechamento da classe