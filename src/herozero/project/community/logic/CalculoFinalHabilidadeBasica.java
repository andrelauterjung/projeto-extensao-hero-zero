package herozero.project.community.logic;



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
    
    public void calculoFinalHabilidadeBasica(HabilidadeTotal habilidadeTotal, BonusTotal bonusTotal, AtributosEquipamentosPet atributosEquipamentosPet)
    {
        String pergunta = habilidadeTotal.getRespHabTotalText();
        
        
        switch(pergunta.toLowerCase())
        {
            case "forca":
                double bonusTotalForca = bonusTotal.getBonusTotalForca(); // pega o bônus total e armazena na variável
        
                int ForcaTotalPersonagem = habilidadeTotal.getForcaTotal(); // pega a habilidade total e armazena na variável
                int totalForcaEquipamentosPet = atributosEquipamentosPet.getForcaTotalEquipamentosPet(); // pega o valor total que os equipamentos e pet acrescentam na força
        
                int resultadoSubForcaTotEquipPet = ForcaTotalPersonagem - totalForcaEquipamentosPet; // subtrai o valor total que os equipamentos e pets acrescentam na força total
        
                double habilidadeBasicaForca = resultadoSubForcaTotEquipPet / (1+(bonusTotalForca/100)); 
            
            
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe na força
                double pegarBonusTotalForca = bonusTotal.getBonusTotalForca();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NA FORÇA: "+pegarBonusTotalForca+"%%");
             
                // Armazenar o valor total da força
                int pegarValorForcaTotal = habilidadeTotal.getForcaTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NA FORÇA: "+pegarValorForcaTotal+" PONTOS!");
                
                // Armazenar o valor total que os objetos acrescentam à força
                int pegarValorTotalObjetosForca = atributosEquipamentosPet.getForcaTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM À FORÇA: "+pegarValorTotalObjetosForca+" PONTOS!");
                 
                // Resultado da fórmula de calculo de habilidade básica
                System.out.printf("VALOR APROXIMADO DE FORÇA BÁSICA QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaForca);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            break;
            
            case "vigor":
                double bonusTotalVigor = bonusTotal.getBonusTotalVigor();
                
                int vigorTotalPersonagem = habilidadeTotal.getVigorTotal();
                int totalVigorEquipamentosPet = atributosEquipamentosPet.getVigorTotalEquipamentosPet();
                
                int resultadoSubVigorTotEquipPet = vigorTotalPersonagem - totalVigorEquipamentosPet;
                
                
                double habilidadeBasicaVigor = resultadoSubVigorTotEquipPet / (1+(bonusTotalVigor/100));
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe na força
                double pegarBonusTotalVigor = bonusTotal.getBonusTotalVigor();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NO VIGOR: "+pegarBonusTotalVigor+"%%");
                
                int pegarValorVigorTotal = habilidadeTotal.getVigorTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NO VIGOR: "+pegarValorVigorTotal+" PONTOS!");
                
                int pegarValorTotalObjetosVigor = atributosEquipamentosPet.getVigorTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM AO VIGOR: "+pegarValorTotalObjetosVigor+" PONTOS!");
                
                System.out.printf("VALOR APROXIMADO DE VIGOR BÁSICO QUE O PERSONAGEM POSSUI %.1f PONTOS.\n\n", habilidadeBasicaVigor);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                break;
                
            case "cerebro":
                double bonusTotalCerebro = bonusTotal.getBonusTotalCerebro();
                
                int cerebroTotalPersonagem = habilidadeTotal.getCerebroTotal();
                int totalCerebroEquipamentosPet = atributosEquipamentosPet.getCerebroTotalEquipamentosPet();
                
                int resultadoSubCerebroTotEquipPet = cerebroTotalPersonagem - totalCerebroEquipamentosPet;
                
                
                double habilidadeBasicaCerebro = resultadoSubCerebroTotEquipPet / (1+(bonusTotalCerebro/100));
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe na força
                double pegarBonusTotalCerebro = bonusTotal.getBonusTotalCerebro();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NO CÉREBRO: "+pegarBonusTotalCerebro+"%%");
                
                int pegarValorCerebroTotal = habilidadeTotal.getCerebroTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NO CÉREBRO: "+pegarValorCerebroTotal+" PONTOS!");
                
                int pegarValorTotalObjetosCerebro = atributosEquipamentosPet.getCerebroTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM AO CÉREBRO: "+pegarValorTotalObjetosCerebro+" PONTOS!");
                
                System.out.printf("VALOR APROXIMADO DE CÉREBRO BÁSICO QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaCerebro);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                break;
                               
            case "intuicao":
                double bonusTotalIntuicao = bonusTotal.getBonusTotalIntuicao();
                
                int intuicaoTotalPersonagem = habilidadeTotal.getIntuicaoTotal();
                int totalIntuicaoEquipamentosPet = atributosEquipamentosPet.getIntuicaoTotalEquipamentosPet();
                
                int resultadoSubIntuicaoTotEquipPet = intuicaoTotalPersonagem - totalIntuicaoEquipamentosPet;
                
                
                double habilidadeBasicaIntuicao = resultadoSubIntuicaoTotEquipPet / (1+(bonusTotalIntuicao/100));
                
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                // Armazenar o valor total de bônus que o personagem recebe na força
                double pegarBonusTotalIntuicao = bonusTotal.getBonusTotalIntuicao();
                System.out.println("BONUS TOTAL QUE O PERSONAGEM RECEBE NA INTUIÇÃO: "+pegarBonusTotalIntuicao+"%%");
                
                int pegarValorIntuicaoTotal = habilidadeTotal.getIntuicaoTotal();
                System.out.println("TOTAL DE PONTOS DE HABILIDADE NA INTUIÇÃO: "+pegarValorIntuicaoTotal+" PONTOS!");
                
                int pegarValorTotalObjetosIntuicao = atributosEquipamentosPet.getIntuicaoTotalEquipamentosPet();
                System.out.println("TOTAL DE PONTOS QUE OS OBJETOS ACRESCENTAM À INTUIÇÃO: "+pegarValorTotalObjetosIntuicao+" PONTOS!");
                
                System.out.printf("VALOR APROXIMADO DE INTUIÇÃO BÁSICA QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaIntuicao);
                System.out.printf("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                break;
                
            default:
                System.out.println("Habilidade inexistente, tente novamente!");
        }
    }
}
