package herozero.project.community.main;

import herozero.project.community.logic.EnergeticoDeHabilidade; 
import herozero.project.community.logic.Liga; 
import herozero.project.community.logic.Time; 
import herozero.project.community.logic.EsconderijoHeroico; 
import herozero.project.community.logic.HabilidadePet;
import herozero.project.community.logic.Temporada;
import herozero.project.community.logic.BonusEquipamentos;
import herozero.project.community.logic.HabilidadeTotalLogic;
import herozero.project.community.logic.AtributosEquipamentosPet;
import herozero.project.community.logic.CalculoFinalHabilidadeBasica;
import herozero.project.community.model.FichaPersonagem;


import java.util.Scanner;


/**=== HISTÓRICO DE VERSÕES ===

[v1.1.0] - 03/06/2026
* Projeto: Calculadora de Habilidade básica Hero Zero
* Versão atual: 1.1.0
* Desenvolvedor: André Lauterjung
* 
* Novidades: Agora é possível saber a quantidade total de bônus que uma habilidade 
* recebe, a quantitade total de pontos dos atributos que uma habilidade recebe
* e também o programa realiza um cálculo retornando a habilidade total aproximada
* que o personagem possui, o que valida o resultado da habilidade básica calculada.
* 
*/

public class Main
{
    public static void main(String[] args)
    {
        EnergeticoDeHabilidade energetico = new EnergeticoDeHabilidade();
        Liga liga = new Liga();
        Time time = new Time();
        EsconderijoHeroico esconderijo = new EsconderijoHeroico();
        HabilidadePet habilidadePet = new HabilidadePet();
        Temporada temporada = new Temporada();
        BonusEquipamentos bonusEquipamentos = new BonusEquipamentos();
        HabilidadeTotalLogic habilidadeTotal = new HabilidadeTotalLogic();
        AtributosEquipamentosPet atributosEquipamentosPet = new AtributosEquipamentosPet();
        CalculoFinalHabilidadeBasica calculoFinal = new CalculoFinalHabilidadeBasica();
        
        
        FichaPersonagem fichaPersonagem = new FichaPersonagem();
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*******  Calculadora de Habilidade Básica Hero Zero v1.1.0  ***************");
        System.out.println("***************************************************************************");
        System.out.println("***                          INICIANDO O PROGRAMA                       ***");
        System.out.printf("***************************************************************************\n\n");
        
    
        // Calculando o bônus que o energético de habilidade acrescenta nas habilidades básicas do personagem
        energetico.verificarEnergetico(sc, fichaPersonagem);
          
        System.out.printf("\n***************************************************************************\n\n");
        
        
        
        // Calculando o bônus que a Liga acrescenta nas habilidades básicas do personagem.
        liga.verificarLiga(sc, fichaPersonagem);
        
        System.out.printf("\n***************************************************************************\n\n");

        
        // Calcular bônus que o time atribui às habilidades básica
        time.verificarBonusTime(sc, fichaPersonagem);
       
        System.out.printf("\n***************************************************************************\n");
        
        
        // Calculando bônus que o Laboratório de Pesquisa cibernético acrescenta às habilidades básicas do personagem.
        esconderijo.verificarBonusEsconderijo(sc, fichaPersonagem);
        
        System.out.printf("\n***************************************************************************\n\n");
        
        
        // Calcular bônus da habilidade do pet
        habilidadePet.escolhaHabilidade(sc, fichaPersonagem);
        
        
        System.out.printf("\n***************************************************************************\n\n");
        
        
        
        // Calcular o bônus de temporada
        temporada.verificacaoBonusTemporada(sc, fichaPersonagem);
               
        System.out.printf("\n***************************************************************************\n\n");
        
        
        
        // Calcular bônus do conjunto de equipamentos.
        bonusEquipamentos.verificarConjuntos(sc, fichaPersonagem);
               
        System.out.printf("***************************************************************************\n\n");
        
    
        // Perguntar ao usuário qual habilidade a ser calculada e pedir o valor de habilidade total
        habilidadeTotal.armazenarHabilidadeTotal(sc, fichaPersonagem);
        
        
        System.out.printf("***************************************************************************\n\n");
        
        atributosEquipamentosPet.calcularAtributosEquipPet(sc, habilidadeTotal, fichaPersonagem); // passando o objeto como parâmetro
        
        System.out.printf("\n***************************************************************************\n\n");
        

        // Parte final da lógica do programa
        calculoFinal.calculoFinalHabilidadeBasica(habilidadeTotal, fichaPersonagem);
        
      
        System.out.println("********************************************************************************");
        System.out.println("***                      PROGRAMA ENCERRADO!                                 ***");
        System.out.println("********************************************************************************");
    }
}