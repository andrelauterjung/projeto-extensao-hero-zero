package herozero.project.community.logic;

import herozero.project.community.model.FichaPersonagem;

/**
 *
 * @author andrelauterjung
 */
public class CalculoFinalHabilidadeBasica
{
    // Fórmula: habilidadeBasica + bonusTotal = HabilidadeTotal - pontosHailidadeEquipamentosPet
        
        /*  Exemplo para calcular a força básica do personagem:
        
            habilidadeBasica + bonusTotal = HabilidadeTotalForca - pontosHailidadeEquipamentosPetForca
            habilidadeBasica + bonusTotal = resultadoSubForcaTotEquipPet
            habilidadeBasica = resultadoSubForcaTotEquipPet / (1+(bonusTotal/100))     */
    
    public void calculoFinalHabilidadeBasica(HabilidadeTotalLogic habilidadeTotal, FichaPersonagem fichaPersonagem)
    {
        String pergunta = habilidadeTotal.getRespHabTotalText();
        
        
        switch(pergunta.toLowerCase())
        {
            case "forca":
                // pega o bônus total e armazena na variável
                double bonusTotalForca = fichaPersonagem.getBonusTotal().getBonusTotalForca();
        
                // pega a habilidade total e armazena na variável
                int forcaTotalPersonagem = fichaPersonagem.getHabilidadeTotal().getForcaTotal();
                
                // pega o valor total que os equipamentos e pet acrescentam na força
                int totalForcaEquipamentosPet = fichaPersonagem.getAtributosEquipPet().getForcaTotalEquipamentosPet();
        
                
                // subtrai o valor total que os equipamentos e pets acrescentam na força total
                int resultadoSubForcaTotEquipPet = forcaTotalPersonagem - totalForcaEquipamentosPet;
        
                
                // Calcula a habilidade básica aproximada e armazena na variável habilidadeBasicaForca
                double habilidadeBasicaForca = resultadoSubForcaTotEquipPet / (1+(bonusTotalForca/100)); 
            
                fichaPersonagem.getHabilidadeBasica().setForcaBasic(habilidadeBasicaForca);
                
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe na força
                double pegarBonusTotalForca = fichaPersonagem.getBonusTotal().getBonusTotalForca();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NA FORÇA: "+pegarBonusTotalForca+"%%");
             
                // Armazenar o valor total da força
                int pegarValorForcaTotal = fichaPersonagem.getHabilidadeTotal().getForcaTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NA FORÇA: "+pegarValorForcaTotal+" PONTOS!");
                
                // Armazenar o valor total que os objetos acrescentam à força
                int pegarValorTotalObjetosForca = fichaPersonagem.getAtributosEquipPet().getForcaTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM À FORÇA: "+pegarValorTotalObjetosForca+" PONTOS!");
                 
                // Resultado da fórmula de calculo de habilidade básica
                System.out.printf("VALOR APROXIMADO DE FORÇA BÁSICA QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaForca);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                
                
                // Retornar ao usuário o valor da habilidade total para que ele compreenda se o cálculo de habilidade básica funcionou 
                double somaHabTotBonTot = fichaPersonagem.getHabilidadeBasica().getForcaBasic() * (1+(fichaPersonagem.getBonusTotal().getBonusTotalForca()/100));
                double habilidadeTotalAprox = somaHabTotBonTot + fichaPersonagem.getAtributosEquipPet().getForcaTotalEquipamentosPet();
        
                System.out.printf("VALOR APROXIMADO DA HABILIDADE TOTAL NA FORÇA COM BASE NOS DADOS DIGITADOS PELO USUÁRIO: %.1f\n", habilidadeTotalAprox);
                System.out.println("ATENÇÃO: caso o valor seja quase exato ao total de habilidade do personagem, significa que a habilidade básica está quase exata!");
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");

                break;
            
            case "vigor":
                // pega o bônus total e armazena na variável
                double bonusTotalVigor = fichaPersonagem.getBonusTotal().getBonusTotalVigor();
        
                // pega a habilidade total e armazena na variável
                int vigorTotalPersonagem = fichaPersonagem.getHabilidadeTotal().getVigorTotal();
                
                // pega o valor total que os equipamentos e pet acrescentam no vigor
                int totalVigorEquipamentosPet = fichaPersonagem.getAtributosEquipPet().getVigorTotalEquipamentosPet();
        
                
                // subtrai o valor total que os equipamentos e pets acrescentam no vigor total
                int resultadoSubVigorTotEquipPet = vigorTotalPersonagem - totalVigorEquipamentosPet;
        
                
                // Calcula a habilidade básica aproximada e armazena na variável habilidadeBasicaVigor
                double habilidadeBasicaVigor = resultadoSubVigorTotEquipPet / (1+(bonusTotalVigor/100));
                
                fichaPersonagem.getHabilidadeBasica().setVigorBasic(habilidadeBasicaVigor);
                
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe no vigor
                double pegarBonusTotalVigor = fichaPersonagem.getBonusTotal().getBonusTotalVigor();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NO VIGOR: "+pegarBonusTotalVigor+"%%");
             
                // Armazenar o valor total de vigor.
                int pegarValorVigorTotal = fichaPersonagem.getHabilidadeTotal().getVigorTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NO VIGOR: "+pegarValorVigorTotal+" PONTOS!");
                
                // Armazenar o valor total que os objetos acrescentam ao vigor.
                int pegarValorTotalObjetosVigor = fichaPersonagem.getAtributosEquipPet().getVigorTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM AO VIGOR: "+pegarValorTotalObjetosVigor+" PONTOS!");
                 
                // Resultado da fórmula de calculo de habilidade básica
                System.out.printf("VALOR APROXIMADO DE VIGOR BÁSICO QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaVigor);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                
                
                // Retornar ao usuário o valor da habilidade total para que ele compreenda se o cálculo de habilidade básica funcionou
                double somaHabTotBonTotV = fichaPersonagem.getHabilidadeBasica().getVigorBasic() * (1+(fichaPersonagem.getBonusTotal().getBonusTotalVigor()/100));
                double habilidadeTotalAproxV = somaHabTotBonTotV + fichaPersonagem.getAtributosEquipPet().getVigorTotalEquipamentosPet();
        
                System.out.printf("VALOR APROXIMADO DA HABILIDADE TOTAL NO VOGOR COM BASE NOS DADOS DIGITADOS PELO USUÁRIO: %.1f\n", habilidadeTotalAproxV);
                System.out.println("ATENÇÃO: caso o valor seja quase exato ao total de habilidade do personagem, significa que a habilidade básica está quase exata!");
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                
                break;
                
            case "cerebro":
                // pega o bônus total e armazena na variável
                double bonusTotalCerebro = fichaPersonagem.getBonusTotal().getBonusTotalCerebro();
        
                // pega a habilidade total e armazena na variável
                int cerebroTotalPersonagem = fichaPersonagem.getHabilidadeTotal().getCerebroTotal();
                
                // pega o valor total que os equipamentos e pet acrescentam no cérebro
                int totalCerebroEquipamentosPet = fichaPersonagem.getAtributosEquipPet().getCerebroTotalEquipamentosPet();
        
                
                // subtrai o valor total que os equipamentos e pets acrescentam no cérebro total
                int resultadoSubCerebroTotEquipPet = cerebroTotalPersonagem - totalCerebroEquipamentosPet;
        
                
                // Calcula a habilidade básica aproximada e armazena na variável habilidadeBasicaCerebro
                double habilidadeBasicaCerebro = resultadoSubCerebroTotEquipPet / (1+(bonusTotalCerebro/100));
                
                fichaPersonagem.getHabilidadeBasica().setCerebroBasic(habilidadeBasicaCerebro);
                
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe no cérebro.
                double pegarBonusTotalCerebro = fichaPersonagem.getBonusTotal().getBonusTotalCerebro();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NO CÉREBRO: "+pegarBonusTotalCerebro+"%%");
             
                // Armazenar o valor total do cérebro
                int pegarValorCerebroTotal = fichaPersonagem.getHabilidadeTotal().getCerebroTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NO CÉREBRO: "+pegarValorCerebroTotal+" PONTOS!");
                
                // Armazenar o valor total que os objetos acrescentam ao cérebro.
                int pegarValorTotalObjetosCerebro = fichaPersonagem.getAtributosEquipPet().getCerebroTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM AO CÉREBRO: "+pegarValorTotalObjetosCerebro+" PONTOS!");
                 
                // Resultado da fórmula de calculo de habilidade básica
                System.out.printf("VALOR APROXIMADO DE CÉREBRO BÁSICO QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaCerebro);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
               
                // Retornar ao usuário o valor da habilidade total para que ele compreenda se o cálculo de habilidade básica funcionou
                double somaHabTotBonTotC = fichaPersonagem.getHabilidadeBasica().getCerebroBasic() * (1+(fichaPersonagem.getBonusTotal().getBonusTotalCerebro()/100));
                double habilidadeTotalAproxC = somaHabTotBonTotC + fichaPersonagem.getAtributosEquipPet().getCerebroTotalEquipamentosPet();
        
                System.out.printf("VALOR APROXIMADO DA HABILIDADE TOTAL NO CÉREBRO COM BASE NOS DADOS DIGITADOS PELO USUÁRIO: %.1f\n", habilidadeTotalAproxC);
                System.out.println("ATENÇÃO: caso o valor seja quase exato ao total de habilidade do personagem, significa que a habilidade básica está quase exata!");
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                
                break;
                               
            case "intuicao":
                double bonusTotalIntuicao = fichaPersonagem.getBonusTotal().getBonusTotalIntuicao();
        
                // pega a habilidade total e armazena na variável
                int intuicaoTotalPersonagem = fichaPersonagem.getHabilidadeTotal().getIntuicaoTotal();
                
                // pega o valor total que os equipamentos e pet acrescentam na intuição
                int totalIntuicaoEquipamentosPet = fichaPersonagem.getAtributosEquipPet().getIntuicaoTotalEquipamentosPet();
        
                
                // subtrai o valor total que os equipamentos e pets acrescentam na intuição total
                int resultadoSubIntuicaoTotEquipPet = intuicaoTotalPersonagem - totalIntuicaoEquipamentosPet;
        
                
                // Calcula a habilidade básica aproximada e armazena na variável habilidadeBasicaIntuicao
                double habilidadeBasicaIntuicao = resultadoSubIntuicaoTotEquipPet / (1+(bonusTotalIntuicao/100)); 
                
                fichaPersonagem.getHabilidadeBasica().setIntuicaoBasic(habilidadeBasicaIntuicao);
                
                
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe na Intuição.
                double pegarBonusTotalIntuicao = fichaPersonagem.getBonusTotal().getBonusTotalIntuicao();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NA INTUIÇÃO: "+pegarBonusTotalIntuicao+"%%");
             
                // Armazenar o valor total da intuição.
                int pegarValorIntuicaoTotal = fichaPersonagem.getHabilidadeTotal().getIntuicaoTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NA INTUIÇÃO: "+pegarValorIntuicaoTotal+" PONTOS!");
                
                // Armazenar o valor total que os objetos acrescentam à intuição.
                int pegarValorTotalObjetosIntuicao = fichaPersonagem.getAtributosEquipPet().getIntuicaoTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM À INTUIÇÃO: "+pegarValorTotalObjetosIntuicao+" PONTOS!");
                 
                // Resultado da fórmula de calculo de habilidade básica
                System.out.printf("VALOR APROXIMADO DE INTUIÇÃO BÁSICA QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaIntuicao);
                
                
                // Retornar ao usuário o valor da habilidade total para que ele compreenda se o cálculo de habilidade básica funcionou
                double somaHabTotBonTotI = fichaPersonagem.getHabilidadeBasica().getIntuicaoBasic() * (1+(fichaPersonagem.getBonusTotal().getBonusTotalIntuicao()/100));
                double habilidadeTotalAproxI = somaHabTotBonTotI + fichaPersonagem.getAtributosEquipPet().getIntuicaoTotalEquipamentosPet();
        
                System.out.printf("VALOR APROXIMADO DA HABILIDADE TOTAL NA INTUIÇÃO COM BASE NOS DADOS DIGITADOS PELO USUÁRIO: %.1f\n", habilidadeTotalAproxI);
                System.out.println("ATENÇÃO: caso o valor seja quase exato ao total de habilidade do personagem, significa que a habilidade básica está quase exata!");
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                
                break;
                
            default:
                System.out.println("Habilidade inexistente, tente novamente!");
        }
   
    }
}