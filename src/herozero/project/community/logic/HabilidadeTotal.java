package herozero.project.community.logic;

public class HabilidadeTotal
{
    private int forcaTotal;
    private int vigorTotal;
    private int cerebroTotal;
    private int intuicaoTotal;
    
    // Mensagens a serem exibidas após verificação da habilidade que o usuário quer calcular.
    
    public void mensagemForcaTotal()
    {
        System.out.println("Digite o total de força que o personagem possui: ");
    }
    
    public void mensagemVigorTotal()
    {
        System.out.println("Digite o total de vigor que o personagem possui: ");
    }
    
    public void mensagemCerebroTotal()
    {
        System.out.println("Digite o total de cérebro que o personagem possui: ");
    }
    
    public void mensagemIntuicaoTotal()
    {
        System.out.println("Digite o total de intuição que o personagem possui: ");
    }
    
    
    // Setters para o valor ser adicionado à variável indicada direto da classe Main
    public void setValorForcaTotal(int valorForcaTotal)
    {
        this.forcaTotal = valorForcaTotal;
    }    
    
    public void setValorVigorTotal(int valorVigorTotal)
    {
        this.vigorTotal = valorVigorTotal;
    } 
    
    public void setValorCerebroTotal(int valorCerebroTotal)
    {
        this.cerebroTotal = valorCerebroTotal;
    } 
    
    public void setValorIntuicaoTotal(int valorIntuicaoTotal)
    {
        this.intuicaoTotal = valorIntuicaoTotal;
    } 
    
    
    // Getters para retornar o valor das variáveis. 
    public int getForcaTotal()
    {
        return this.forcaTotal;
    }
    
    public int getVigorTotal()
    {
        return this.vigorTotal;
    }
    
    public int getCerebroTotal()
    {
        return this.cerebroTotal;
    }
    
    public int getIntuicaoTotal()
    {
        return this.intuicaoTotal;
    }    
}  