package herozero.project.community.logic;

import herozero.project.community.view.BonusEnergeticView;

import java.util.Scanner;

/**
 * Classe com métodos que retornam informações ao usuário e armazena valor 
 * referente ao bônus de energético de habilidade que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class EnergeticoDeHabilidade
{ 
    private int bonusEnergeticoHabilidade; // Variável onde o valor final será armazenado
    
    public void verificarEnergetico(Scanner sc)
    {
        BonusEnergeticView perguntaEnergetico = new BonusEnergeticView();
        
        perguntaEnergetico.listaEnergeticos();
        int userOpcaoEnergetico = sc.nextInt();
        sc.nextLine();
        
        switch(userOpcaoEnergetico)
        {
            case 0:
                this.bonusEnergeticoHabilidade = 0;
                break;
                
            case 1:
                this.bonusEnergeticoHabilidade = 10;
                break;
                
            case 2:
                this.bonusEnergeticoHabilidade = 25;
                break;
                
            case 3:
                this.bonusEnergeticoHabilidade = 50;
                break;
                
            default: 
                System.out.println("Valor inválido!");
                this.bonusEnergeticoHabilidade = 0;
        }
        System.out.printf("Bônus do energético de habilidade: %d%%\n", this.bonusEnergeticoHabilidade);
    }
    
    // Método Setter
    public void setBonusEnergeticoHabilidade(int valorBonusEnergeticoHabilidade)
    {
        this.bonusEnergeticoHabilidade += valorBonusEnergeticoHabilidade;
    }
    
    
    // Método Getter
    public int getBonusEnergeticoHabilidade()
    {
        return this.bonusEnergeticoHabilidade;
    }    
}