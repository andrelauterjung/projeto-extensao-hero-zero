package herozero.project.community.model;


public class HabilidadeTotal
{
    private int forcaTotalPersonagem;
    private int vigorTotalPersonagem;
    private int cerebroTotalPersonagem;
    private int intuicaoTotalPersonagem;
    
 
    public void setValorForcaTotal(int valorForcaTotal)
    {
        this.forcaTotalPersonagem = valorForcaTotal;
    }    
    
    public void setValorVigorTotal(int valorVigorTotal)
    {
        this.vigorTotalPersonagem = valorVigorTotal;
    } 
    
    public void setValorCerebroTotal(int valorCerebroTotal)
    {
        this.cerebroTotalPersonagem = valorCerebroTotal;
    } 
    
    public void setValorIntuicaoTotal(int valorIntuicaoTotal)
    {
        this.intuicaoTotalPersonagem = valorIntuicaoTotal;
    } 
    
        // Getters para retornar o valor das variáveis. 
    public int getForcaTotal()
    {
        return this.forcaTotalPersonagem;
    }
    
    public int getVigorTotal()
    {
        return this.vigorTotalPersonagem;
    }
    
    public int getCerebroTotal()
    {
        return this.cerebroTotalPersonagem;
    }
    
    public int getIntuicaoTotal()
    {
        return this.intuicaoTotalPersonagem;
    }    
    
    
}