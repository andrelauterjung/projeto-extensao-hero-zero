package herozero.project.community.logic;

import herozero.project.community.view.HabilidadeTotalView;
import herozero.project.community.model.FichaPersonagem;


import java.util.Scanner;
        

public class HabilidadeTotalLogic
{
    private int forcaTotal;
    private int vigorTotal;
    private int cerebroTotal;
    private int intuicaoTotal;
    
    private String respHabTotalText; // armazenar resposta do usuário para utilizar na classe AtributosEquipamentosPet
      
    public void armazenarHabilidadeTotal(Scanner sc, FichaPersonagem fichaPersonagem)
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
                
                fichaPersonagem.getHabilidadeTotal().setValorForcaTotal(this.forcaTotal);
            
                System.out.println("Força total do personagem: "+this.forcaTotal);
                break;
                
            case "vigor":
                perguntasHabilidadeTotal.mensagemVigorTotal();
            
                int valorUserVigorTotal = sc.nextInt();
                sc.nextLine();
                this.vigorTotal = valorUserVigorTotal;
            
                fichaPersonagem.getHabilidadeTotal().setValorVigorTotal(this.vigorTotal);
                System.out.println("Vigor total do personagem: "+this.vigorTotal);
                break;
                
            case "cerebro":
                perguntasHabilidadeTotal.mensagemCerebroTotal();
            
                int valorUserCerebroTotal = sc.nextInt();
                sc.nextLine();
                this.cerebroTotal = valorUserCerebroTotal;
            
                fichaPersonagem.getHabilidadeTotal().setValorCerebroTotal(this.cerebroTotal);
                System.out.println("Cérebro total do personagem: "+this.cerebroTotal);
                break;
                
            case "intuicao":
                perguntasHabilidadeTotal.mensagemIntuicaoTotal();
            
                int valorUserIntuicaoTotal = sc.nextInt();
                sc.nextLine();
                this.intuicaoTotal = valorUserIntuicaoTotal;
            
                fichaPersonagem.getHabilidadeTotal().setValorIntuicaoTotal(this.intuicaoTotal);
                System.out.println("Intuição total do personagem: "+this.intuicaoTotal);
                break;
                
            default:
                System.out.println("Nome inválido!");
                
        } // fechamento do switch case
        
    } // fechamento do método armazenarHabilidadeTotal
    
   
    public String getRespHabTotalText()
    {
        return this.respHabTotalText;
    }
}  // fechamento da classe