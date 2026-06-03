package herozero.project.community.model;

/**
 *
 * @author andrelauterjung
 */
public class BonusTotal
{
    private double bonusTotalForca;
    private double bonusTotalVigor;
    private double bonusTotalCerebro;
    private double bonusTotalIntuicao;
   
    
    
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
