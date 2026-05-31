package herozero.project.community.view;

/**
 *
 * @author andrelauterjung
 */
public class BonusEsconderijoView
{
    public void listaNiveisLaboratorioCibernetico()
    {
        System.out.println("Digite o número referente ao bônus que o personagem recebe do Laboratório de Pesquisa Cibernético");
        System.out.printf("Este bônus fica no esconderijo do herói!\n\n");
        
        for(int i = 0; i <=25 ;i++)
        {   
            System.out.printf("%d - Bônus de %d%% nas habilidades básicas\n", i, i);
        }
    }
}
