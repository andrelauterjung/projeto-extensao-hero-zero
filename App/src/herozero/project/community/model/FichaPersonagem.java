package herozero.project.community.model;

/**
 *
 * @author andrelauterjung
 */
public class FichaPersonagem
{
    private BonusTotal bonusTotal;
    private HabilidadeTotal habilidadeTotal;
    private AtributosEquipPet atributosEquipPet;
    private HabilidadeBasica habilidadeBasica;

    
    
    public FichaPersonagem() // Construtor
    {
        this.bonusTotal = new BonusTotal();
        this.atributosEquipPet = new AtributosEquipPet();
        this.habilidadeBasica = new HabilidadeBasica();
        this.habilidadeTotal = new HabilidadeTotal();
    }
    
    public BonusTotal getBonusTotal()
    {
        return this.bonusTotal;
    }
    
    public AtributosEquipPet getAtributosEquipPet()
    {
        return this.atributosEquipPet;
    }
    
    public HabilidadeBasica getHabilidadeBasica()
    {
        return this.habilidadeBasica;
    }
    
    public HabilidadeTotal getHabilidadeTotal()
    {
        return this.habilidadeTotal;
    }
}
