package herozero.project.community.logic;

public class EsconderijoHeroico
{
    private int bonusEsconderijo;
    
    
    public void listaNiveisLaboratorioCibernetico()
    {
        System.out.println("Digite o número referente ao bônus que o personagem recebe do Laboratório de Pesquisa Cibernético");
        System.out.printf("Este bônus fica no esconderijo do herói!\n\n");
        
        for(int i = 0; i <=25 ;i++)
        {   
            System.out.printf("%d - Bônus de %d%% nas habilidades básicas\n", i, i);
        }
    }
    
    
    public void verificarBonusEsconderijo(int valorEntradaBonusEsconderijo)
    {
        if(valorEntradaBonusEsconderijo < 0 || valorEntradaBonusEsconderijo > 25)
        {
            this.bonusEsconderijo = 0;
            System.out.println("Valor inválido!");
        }
        else if(valorEntradaBonusEsconderijo == 0)
        {
            this.bonusEsconderijo =0;
        }
        else
        {
            this.bonusEsconderijo = valorEntradaBonusEsconderijo;
        }
        System.out.printf("O personagem recebe %d%% de bônus do esconderijo heroico\n", this.bonusEsconderijo);
    }
    
    
    // Método Setter
    
    public void setBonusEsconderijo(int valorBonusEsconderijo)
    {
        this.bonusEsconderijo += valorBonusEsconderijo;
    }
    
    // Método Getter
    
    
    public int getBonusEsconderijo()
    {
        return this.bonusEsconderijo;
    } 
}