package herozero.project.community.logic;

/**
 * Classe com métodos que retornam informações ao usuário e armazenam valores 
 * referentes ao bônus totais que o personagem recebe.
 * 
 * @author André Lauterjung
 */
public class BonusTotal
{
    private double bonusTotalForca;
    private double bonusTotalVigor;
    private double bonusTotalCerebro;
    private double bonusTotalIntuicao;
    
    
    
    // Métodos para mostrar mensagens ao usuário
    public void mensagemBonusTotalForca()
    {
        System.out.printf("O bônus total que o personagem recebe na força é de: %d%%\n", this.bonusTotalForca);
    }
    
    public void mensagemBonusTotalVigor()
    {
        System.out.printf("O bônus total que o personagem recebe no vigor é de: %d%%\n", this.bonusTotalVigor);
    }
    
    public void mensagemBonusTotalCerebro()
    {
        System.out.printf("O bônus total que o personagem recebe no cérebro é de: %d%%\n", this.bonusTotalCerebro);
    }
    
    public void mensagemBonusTotalIntuicao()
    {
        System.out.printf("O bônus total que o personagem recebe na intuição é de: %d%%\n", this.bonusTotalIntuicao);
    }
    
    
    // Métodos Setter
    public void setBonusTotalForca(int valorBonusTotalForca)
    {
        this.bonusTotalForca += valorBonusTotalForca;
    }
    
    public void setBonusTotalVigor(int valorBonusTotalVigor)
    {
        this.bonusTotalVigor += valorBonusTotalVigor;
    }
    
    public void setBonusTotalCerebro(int valorBonusTotalCerebro)
    {
        this.bonusTotalCerebro += valorBonusTotalCerebro;
    }
    
    public void setBonusTotalIntuicao(int valorBonusTotalIntuicao)
    {
        this.bonusTotalIntuicao += valorBonusTotalIntuicao;
    }
    
    
    // Métodos Getter
    public double getBonusTotalForca()
    {
        return this.bonusTotalForca;
    }
    
    public double getBonusTotalVigor()
    {
        return this.bonusTotalVigor;
    }
    
    public double getBonusTotalCerebro()
    {
        return this.bonusTotalCerebro;
    }
    
    public double getBonusTotalIntuicao()
    {
        return this.bonusTotalIntuicao;
    }    
}