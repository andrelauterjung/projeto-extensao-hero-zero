package herozero.project.community.model;

/**
 *
 * @author andrelauterjung
 */
public class HabilidadeBasica 
{
    private double forcaBasicPersonagem;
    private double vigorBasicPersonagem;
    private double cerebroBasicPersonagem;
    private double intuicaoBasicPersonagem;
    
    // Métodos Setters
    public void setForcaBasic(double forcaBasic)
    {
        this.forcaBasicPersonagem += forcaBasic;
    }
    
    public void setVigorBasic(double vigorBasic)
    {
        this.vigorBasicPersonagem += vigorBasic;
    }
    
    public void setCerebroBasic(double cerebroBasic)
    {
        this.cerebroBasicPersonagem += cerebroBasic;
    }
    
    public void setIntuicaoBasic(double intuicaoBasic)
    {
        this.intuicaoBasicPersonagem += intuicaoBasic;
    }
    
    
    // Métodos Getters
    public double getForcaBasic()
    {
        return this.forcaBasicPersonagem;
    }
    
    public double getVigorBasic()
    {
        return this.vigorBasicPersonagem;
    }
    
    public double getCerebroBasic()
    {
        return this.cerebroBasicPersonagem;
    }
    
    public double getIntuicaoBasic()
    {
        return this.intuicaoBasicPersonagem;
    }
}
