package herozero.project.community.logic;

public class EnergeticoDeHabilidade
{
    private int bonusEnergeticoHabilidade;
    
    
    
    public void listaEnergeticos()
    {
        System.out.printf("Digite o número correspondente ao energético que o herói está usando:\n\n");

        System.out.println("0 - O jogador não equipou nenhum energético no personagem.");
        System.out.println("1 - Energético que dá bônus de 10% nas habilidades básicas do personagem.");
        System.out.println("2 - Energético que dá bônus de 25% nas habilidades básicas do personagem.");
        System.out.println("3 - Energético que dá bônus de 50% nas habilidades básicas do personagem.");
    }
    
    public void verificarEnergetico(int opcaoEnergetico)
    {
        switch(opcaoEnergetico)
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
                
        }
        System.out.printf("Bônus do energético de habilidade: %d%%\n",this.bonusEnergeticoHabilidade);
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