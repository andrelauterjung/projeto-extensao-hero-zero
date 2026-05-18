package herozero.project.community.logic;

public class Temporada
{
    private int nenhumaHabilidade;
    private int forcaBasica;
    private int vigorBasico;
    private int cerebroBasico;
    private int intuicaoBasica;
    
    
    public void perguntaTemporadaHabilidade()
    {
        System.out.println("A temporada acrescenta algum bônus nas habilidades básicas? ");
        System.out.println("Digite 'sim' ou 'nao'. "); 
    }
    
    public void bonusNomeHabilidadeBasica()
    {
        System.out.println("Digite o nome do atributo que recebe o bônus");
        System.out.println("todas, forca, vigor, cerebro ou intuicao: ");
    }
    
    public void bonusTemporadaHabilidade()
    {
        System.out.println("Digite quanto de bônus o jogador recebe da temporada: ");
    }        
    
    
    public void verificacaoBonusTemporada(String novoNomeHabilidade, int valorBonusTemporada)
    {
        switch (novoNomeHabilidade)
        {
            case "forca":
                this.forcaBasica = valorBonusTemporada;
                System.out.printf("O personagem recebe um bônus de %d%% na força básica!\n\n", valorBonusTemporada);
                break;
                
            case "vigor":
                this.vigorBasico = valorBonusTemporada;
                System.out.printf("O personagem recebe um bônus de %d%% no vigor básico!\n\n", valorBonusTemporada);
                break;
                
            case "cerebro":
                this.cerebroBasico= valorBonusTemporada;
                System.out.printf("O personagem recebe um bônus de %d%% no cérebro básico!\n\n", valorBonusTemporada);
                break;
                
            case "intuicao":
                this.intuicaoBasica = valorBonusTemporada;
                System.out.printf("O personagem recebe um bônus de %d%% na intuição básica!\n\n", valorBonusTemporada);
                break;
                
            case "todas":
                this.forcaBasica = valorBonusTemporada;
                this.vigorBasico = valorBonusTemporada;
                this.cerebroBasico = valorBonusTemporada;
                this.intuicaoBasica = valorBonusTemporada;
                System.out.printf("O personagem recebe um bônus de %d%% em todas as habilidades básicas!", valorBonusTemporada);
                break;
        }
    }
    
    
    public void semBonusTemporada()
    {
        this.nenhumaHabilidade = 0;
        System.out.println("O jogador não recebe nenhum bônus de temporada!");
    }   
    
    
    
    
    // Métodos Setter
    public void setTemporadaSemBonus(int valorTemporadaSemBonus)
    {
        this.nenhumaHabilidade += valorTemporadaSemBonus;
    }
    
    public void setTemporadaForcaBasica(int valorTemporadaForcaBasica)
    {
        this.forcaBasica += valorTemporadaForcaBasica;
    }
    
    public void setTemporadaVigorBasico(int valorTemporadaVigorBasico)
    {
        this.vigorBasico += valorTemporadaVigorBasico;
    }
    
    public void setTemporadaCerebroBasico(int valorTemporadaCerebroBasico)
    {
        this.cerebroBasico += valorTemporadaCerebroBasico;
    }
    
    public void setTemporadaIntuicaoBasica(int valorTemporadaIntuicaoBasica)
    {
        this.intuicaoBasica += valorTemporadaIntuicaoBasica;
    }
    
    
    // Métodos Getter
    public int getSemBonusTemporada()
    {
        return this.nenhumaHabilidade;
    }
    
    public int getBonusTemporadaForca()
    {
        return this.forcaBasica;
    }
    
    public int getBonusTemporadaVigor()
    {
        return this.vigorBasico;
    }
    
    public int getBonusTemporadaCerebro()
    {
        return this.cerebroBasico;
    }
    
    public int getBonusTemporadaIntuicao()
    {
        return this.intuicaoBasica;
    }
            
}