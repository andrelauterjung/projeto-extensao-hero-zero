package herozero.project.community.logic;

public class Time
{
    private int bonusTime;
    
    
    public void mensagemTime() // Método para mostrar mensagem antes do usuário digitar informações
    {
        System.out.println("Digite quanto de bônus as instalações do time acrescentam às habilidades do personagem:");
    }
    
    
    public void verificarBonusTime(int valorBonusTime)
    {
        if(valorBonusTime < 0 ||valorBonusTime >50)
        {
            this.bonusTime = 0;
            System.out.println("Valor inválido!");
        }
        else if(valorBonusTime == 0)
        {
            this.bonusTime = 0;
        }
        else
        {
            this.bonusTime = valorBonusTime;
        }
        
        System.out.printf("O personagem recebe um bônus de %d%% do time nas habilidades básicas!\n\n", this.bonusTime);
    }
    
    public void semTime() //caso o if seja false, este método é chamado
    {
        this.bonusTime = 0;
        System.out.println("O personagem não está em nenhum time!");
        System.out.println("Ele não recebe nenhum bônus de time nas habilidades básicas");
    }
    
    
    
    // Método Setter
    public void setBonusTime(int valorBonusTime)
    {
        this.bonusTime += valorBonusTime;
    }
    
    // Método Getter
    public int getBonusTime()
    {
        return this.bonusTime;
    }
   
}