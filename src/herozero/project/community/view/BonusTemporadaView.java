package herozero.project.community.view;

/**
 *
 * @author andrelauterjung
 */
public class BonusTemporadaView 
{
    public void perguntaTemporadaHabilidade()
    {
        System.out.println("A temporada acrescenta algum bônus nas habilidades básicas? ");
        System.out.println("Digite 'sim' ou 'nao' "); 
    }
    
    
    public void bonusNomeHabilidadeBasica()
    {
        System.out.println("Digite o nome do atributo que recebe o bônus");
        System.out.println("opções: todas, forca, vigor, cerebro ou intuicao. ");
        System.out.println("Observação: digite sem caracteres especiais ou acentos.");
    }
    
    public void bonusTemporadaHabilidade()
    {
        System.out.println("Digite quanto de bônus o jogador recebe da temporada: ");
    }
}
