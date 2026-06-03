package herozero.project.community.model;

/**
 *
 * @author andrelauterjung
 */
public class AtributosEquipPet
{
    
    private int totalAtributosForcaEquipamentosPet;
    private int totalAtributosVigorEquipamentosPet;
    private int totalAtributosCerebroEquipamentosPet;
    private int totalAtributosIntuicaoEquipamentosPet;
    
    
    // Métodos setters
    public void setForcaEquipamentosPet(int forcaEquipamentosPet)
    {
        this.totalAtributosForcaEquipamentosPet = forcaEquipamentosPet;
    }
    
    public void setVigorEquipamentosPet(int vigorEquipamentosPet)
    {
        this.totalAtributosVigorEquipamentosPet = vigorEquipamentosPet;
    }
    
    public void setCerebroEquipamentosPet(int cerebroEquipamentosPet)
    {
        this.totalAtributosCerebroEquipamentosPet = cerebroEquipamentosPet;
    }
    
    public void setIntuicaoEquipamentosPet(int intuicaoEquipamentosPet)
    {
        this.totalAtributosIntuicaoEquipamentosPet = intuicaoEquipamentosPet;
    }
    
    
    //Métodos getters
    public int getForcaTotalEquipamentosPet()
    {
        return this.totalAtributosForcaEquipamentosPet;
    }
    
    public int getVigorTotalEquipamentosPet()
    {
        return this.totalAtributosVigorEquipamentosPet;
    }
    
    public int getCerebroTotalEquipamentosPet()
    {
        return this.totalAtributosCerebroEquipamentosPet;
    }
    
    public int getIntuicaoTotalEquipamentosPet()
    {
        return this.totalAtributosIntuicaoEquipamentosPet;
    }
}
