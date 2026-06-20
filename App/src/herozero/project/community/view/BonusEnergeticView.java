package herozero.project.community.view;

/**
 *
 * @author andrelauterjung
 */
public class BonusEnergeticView
{ 
    public void listaEnergeticos()
    {
        System.out.printf("Digite o número correspondente ao energético que o herói está usando:\n\n");

        System.out.println("0 - O jogador não equipou nenhum energético no personagem.");
        System.out.println("1 - Energético que dá bônus de 10% nas habilidades básicas do personagem.");
        System.out.println("2 - Energético que dá bônus de 25% nas habilidades básicas do personagem.");
        System.out.println("3 - Energético que dá bônus de 50% nas habilidades básicas do personagem.");
    }
}
