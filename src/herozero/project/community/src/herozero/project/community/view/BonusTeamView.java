package herozero.project.community.view;

/**
 *
 * @author andrelauterjung
 */
public class BonusTeamView
{
    public void perguntaPersonagemTime()
    {
        System.out.println("O jogador está em uma equipe? (Digite 'sim' ou 'nao') ");
    }
 
    public void mensagemTime() // Método para mostrar mensagem antes do usuário digitar informações
    {
        System.out.println("Digite quanto de bônus as instalações do time acrescentam às habilidades do personagem:");
    }
    
    
    public void semBonusTime() //caso o if seja false, este método é chamado
    {
        System.out.println("O personagem não está em nenhum time!");
        System.out.println("Ele não recebe nenhum bônus de time nas habilidades básicas");
    }
    
}
