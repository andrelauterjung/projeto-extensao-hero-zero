package herozero.project.community.view;

/**
 * Classe contendo métodos que retornam mensagens sobre erros.
 * 
 * @author andrelauterjung
 */
public class ErrorStyleView
{
    
    
    public void mensagemEntradaInvalida()
    {
        System.out.printf("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("ERRO: Você digitou uma String onde deve ir número!");
        System.out.println("TENTE NOVAMENTE!");
        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
    
    public void mensagemErroNumNegativo()
    {
        System.out.printf("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("ERRO: Você digitou um número negativo!");
        System.out.println("TENTE NOVAMENTE!");
        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
    
    public void mensagemNumeroInvalido()
    {
        System.out.printf("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("Você digitou um valor inválido!");
        System.out.println("TENTE NOVAMENTE!");
        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
    
    public void mensagemOpcaoErro()
    {
        System.out.printf("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("Você digitou \"sim\", \"não\" ou \"nao\" errado!");
        System.out.println("TENTE NOVAMENTE!");
        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
    
    public void mensagemErroNomeHabilidade()
    {
        System.out.printf("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        System.out.println("Você digitou \"forca\", \"vigor\", \"cerebro\", "
                + "\"intuicao\" ou \"todas\" errado!");
        System.out.println("TENTE NOVAMENTE!");
        System.out.printf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
    }
        
    
}
