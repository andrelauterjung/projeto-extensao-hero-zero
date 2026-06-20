package herozero.project.community.view;

/**
 *
 * @author andrelauterjung
 */
public class HabilidadeTotalView
{
    
    public void mensagemHabToCalc()      
    {
        System.out.println("Qual a habilidade que você deseja descobrir o valor base?");
        System.out.println("Opções: forca, vigor, cerebro e intuicao");
        System.out.println("Observação: digite sem caracteres especiais ou acentos.");
    }
    
    
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
      
}
