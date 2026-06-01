package herozero.project.community.main;

import herozero.project.community.logic.EnergeticoDeHabilidade; 
import herozero.project.community.logic.Liga; 
import herozero.project.community.logic.Time; 
import herozero.project.community.logic.EsconderijoHeroico; 
import herozero.project.community.logic.HabilidadePet;
import herozero.project.community.logic.Temporada;
import herozero.project.community.logic.BonusEquipamentos;
import herozero.project.community.logic.HabilidadeTotal;
import herozero.project.community.logic.AtributosEquipamentosPet;
import herozero.project.community.logic.CalculoFinalHabilidadeBasica;

import herozero.project.community.logic.BonusTotal;

import java.util.Scanner;


/**=== HISTÓRICO DE VERSÕES ===

[v1.0.1] - 01/06/2026
* Projeto: Calculadora de Habilidade básica Hero Zero
* Versão atual: 1.0.1
* Desenvolvedor: André Lauterjung
* 
* Novidades: Agora é possível saber a quantidade total de bônus que o personagem
* recebe em determinada habilidade no final do cálculo. Tornando mais fácil e rápida
* a verificação de um resultado. 
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
        HabilidadeTotal habilidadeTotal = new HabilidadeTotal();
        AtributosEquipamentosPet atributosEquipamentosPet = new AtributosEquipamentosPet();
        BonusTotal bonusTotal = new BonusTotal();
        CalculoFinalHabilidadeBasica calculoFinal = new CalculoFinalHabilidadeBasica();
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*******  Calculadora de Habilidade Básica Hero Zero v1.0.0  ***************");
        System.out.println("***************************************************************************");
        System.out.println("***                          INICIANDO O PROGRAMA                       ***");
        System.out.printf("***************************************************************************\n\n");
        
    
        // Calculando o bônus que o energético de habilidade acrescenta nas habilidades básicas do personagem
        energetico.verificarEnergetico(sc);
        
        int valorBonusEnergeticoHabilidade = energetico.getBonusEnergeticoHabilidade();
        
        bonusTotal.setBonusTotalForca(valorBonusEnergeticoHabilidade); 
        bonusTotal.setBonusTotalVigor(valorBonusEnergeticoHabilidade);
        bonusTotal.setBonusTotalCerebro(valorBonusEnergeticoHabilidade);
        bonusTotal.setBonusTotalIntuicao(valorBonusEnergeticoHabilidade);
        
        
        System.out.printf("O personagem recebe um bônus de %d%% do Energético de habilidade!", valorBonusEnergeticoHabilidade);
        System.out.printf("\n***************************************************************************\n\n");
        
        // Calculando o bônus que a Liga acrescenta nas habilidades básicas do personagem.
        liga.verificarLiga(sc);
        
        //Armazenar o valor do bônus de liga em todas as variáveis da classe BonusTotal
        int bonusLigaPersonagem = liga.getBonusLiga();
        
        bonusTotal.setBonusTotalForca(bonusLigaPersonagem);
        bonusTotal.setBonusTotalVigor(bonusLigaPersonagem);
        bonusTotal.setBonusTotalCerebro(bonusLigaPersonagem);
        bonusTotal.setBonusTotalIntuicao(bonusLigaPersonagem);
        
        System.out.printf("O personagem recebe um bônus de Liga de %d%% nas habilidades!", bonusLigaPersonagem);
        System.out.printf("\n***************************************************************************\n\n");

        
        // Calcular bônus que o time atribui às habilidades básica
        time.verificarBonusTime(sc);
       
        int bonusTimePersonagem = time.getBonusTime();
        
        bonusTotal.setBonusTotalForca(bonusTimePersonagem);
        bonusTotal.setBonusTotalVigor(bonusTimePersonagem);
        bonusTotal.setBonusTotalCerebro(bonusTimePersonagem);
        bonusTotal.setBonusTotalIntuicao(bonusTimePersonagem);  
        
        System.out.printf("O personagem recebe um bônus de Time de %d%% nas habilidades!", bonusTimePersonagem);
        System.out.printf("\n***************************************************************************\n");
        
        
        // Calculando bônus que o Laboratório de Pesquisa cibernético acrescenta às habilidades básicas do personagem.
        esconderijo.verificarBonusEsconderijo(sc);
        
        //Armazenar o valor do bônus de esconderijo em todas as variáveis classe BonusTotal
        int personagemBonusEsconderijo = esconderijo.getBonusEsconderijo();
            
        bonusTotal.setBonusTotalForca(personagemBonusEsconderijo);
        bonusTotal.setBonusTotalVigor(personagemBonusEsconderijo);
        bonusTotal.setBonusTotalCerebro(personagemBonusEsconderijo);
        bonusTotal.setBonusTotalIntuicao(personagemBonusEsconderijo);
        
        System.out.printf("O personagem recebe um bônus de Esconderijo de %d%% nas habilidades!", personagemBonusEsconderijo);
        System.out.printf("\n***************************************************************************\n\n");
        
        
        // Calcular bônus da habilidade do pet
        habilidadePet.escolhaHabilidade(sc);
        
        //Armazenar o valor do bônus de pet em todas as variáveis classe BonusTotal
        int personagemBonusPetForca = habilidadePet.getBonusPetForca();
        int personagemBonusPetVigor = habilidadePet.getBonusPetVigor();
        int personagemBonusPetCerebro = habilidadePet.getBonusPetCerebro();
        int personagemBonusPetIntuicao = habilidadePet.getBonusPetIntuicao();
            
        bonusTotal.setBonusTotalForca(personagemBonusPetForca);
        bonusTotal.setBonusTotalVigor(personagemBonusPetVigor);
        bonusTotal.setBonusTotalCerebro(personagemBonusPetCerebro);
        bonusTotal.setBonusTotalIntuicao(personagemBonusPetIntuicao);
        
        System.out.printf("O personagem recebe um bônus de Pet de %d%% na força básica!", personagemBonusPetForca);
        System.out.printf("O personagem recebe um bônus de Pet de %d%% no vigor básico!", personagemBonusPetVigor);
        System.out.printf("O personagem recebe um bônus de Pet de %d%% no cérebro básico!", personagemBonusPetCerebro);
        System.out.printf("O personagem recebe um bônus de Pet de %d%% na intuição básica!", personagemBonusPetIntuicao);
        System.out.printf("\n***************************************************************************\n\n");
        
        
        // Calcular o bônus de temporada
        temporada.verificacaoBonusTemporada(sc);
            
        //Armazenar o valor do bônus de temporada em todas as variáveis classe BonusTotal
        
        int valorBonusTemporadaForca = temporada.getBonusTemporadaForca();
        int valorBonusTemporadaVigor = temporada.getBonusTemporadaVigor();
        int valorBonusTemporadaCerebro = temporada.getBonusTemporadaCerebro();
        int valorBonusTemporadaIntuicao = temporada.getBonusTemporadaIntuicao();
        
        bonusTotal.setBonusTotalForca(valorBonusTemporadaForca);
        bonusTotal.setBonusTotalVigor(valorBonusTemporadaVigor);
        bonusTotal.setBonusTotalCerebro(valorBonusTemporadaCerebro);
        bonusTotal.setBonusTotalIntuicao(valorBonusTemporadaIntuicao);
            
               
        System.out.printf("\n***************************************************************************\n\n");
        
        
        
        // Calcular bônus do conjunto de equipamentos.
        bonusEquipamentos.verificarConjuntos(sc);
        System.out.println("Resultado final dos bônus de conjunto: ");
        
        int finalBonusForcaConjuntoEquipamentos = bonusEquipamentos.getForca();
        int finalBonusVigorConjuntoEquipamentos = bonusEquipamentos.getVigor();
        int finalBonusCerebroConjuntoEquipamentos = bonusEquipamentos.getCerebro();
        int finalBonusIntuicaoConjuntoEquipamentos = bonusEquipamentos.getIntuicao();
 
        
        //Armazenar o valor do bônus de conjunto em todas as variáveis classe BonusTotal
        bonusTotal.setBonusTotalForca(finalBonusForcaConjuntoEquipamentos);
        bonusTotal.setBonusTotalVigor(finalBonusVigorConjuntoEquipamentos);
        bonusTotal.setBonusTotalCerebro(finalBonusCerebroConjuntoEquipamentos);
        bonusTotal.setBonusTotalIntuicao(finalBonusIntuicaoConjuntoEquipamentos);
        
        System.out.printf("Força: %d%%\n", finalBonusForcaConjuntoEquipamentos);
        System.out.printf("Vigor: %d%%\n", finalBonusVigorConjuntoEquipamentos);
        System.out.printf("Cerebro: %d%%\n", finalBonusCerebroConjuntoEquipamentos);
        System.out.printf("Intuicao: %d%%\n", finalBonusIntuicaoConjuntoEquipamentos);       
        System.out.printf("***************************************************************************\n\n");
        
    
        
        // Perguntar ao usuário qual habilidade a ser calculada e pedir o valor de habilidade total
        habilidadeTotal.armazenarHabilidadeTotal(sc);
        
        
        System.out.printf("***************************************************************************\n\n");
        
        atributosEquipamentosPet.calcularAtributosEquipPet(sc, habilidadeTotal); // passando o objeto como parâmetro
        

        System.out.printf("\n***************************************************************************\n\n");
        

        // Parte final da lógica do programa
        calculoFinal.calculoFinalHabilidadeBasica(habilidadeTotal, bonusTotal, atributosEquipamentosPet);
        
      
        System.out.println("********************************************************************************");
        System.out.println("***                      PROGRAMA ENCERRADO!                                 ***");
        System.out.println("********************************************************************************");
    }
}