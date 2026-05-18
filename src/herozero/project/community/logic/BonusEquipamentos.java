package herozero.project.community.logic;

public class BonusEquipamentos
{
    private int bonusEquipamentosForca;
    private int bonusEquipamentosVigor;
    private int bonusEquipamentosCerebro;
    private int bonusEquipamentosIntuicao;
    
    
    public void perguntaConjuntoLendario()
    {
        System.out.println("O jogador possui um conjunto lendário completo? 7 de 7 peças");
    }
    
    
    public void perguntaConjuntoEpico() // perguntar ao usuário se o personagem tem conjunto épico equipado
    {
        System.out.println("O jogador possui peças do conjunto épico?");
        System.out.println("O conjunto épico consiste em 5 peças: Sapatos, Cinto, Traje, Capa e Máscara.");
    }
    
    public void perguntaConjuntoDispositivoArma() // perguntr ao usuário se o personagem tem conjunto de dispositivo + arma equipado
    {
        System.out.println("O jogador possui um conjunto de Dispositivo + Arma?");
    }
    
    public void perguntaConjuntosMistos()
    {
        System.out.println("O personagem está com diferentes tipos de conjuntos?");
        System.out.println("Exemplo: sapatos, cinto e traje épicos - capa, máscara, dispositivo e árma lendários?");
    }
    
    
    public void perguntaConjuntoArmaMissil(String bonusDispositivoArma) 
    {
        switch(bonusDispositivoArma)
        {
            case "forca":
                this.bonusEquipamentosForca += 7;
                System.out.printf("Total de bônus no(a) %s: %d%%\n", bonusDispositivoArma, this.bonusEquipamentosForca);
                break;
                    
            case "vigor":
                this.bonusEquipamentosVigor += 7;
                System.out.printf("Total de bônus no(a) %s: %d%%\n", bonusDispositivoArma, this.bonusEquipamentosVigor);
                break;
                
            case "cerebro":
                this.bonusEquipamentosCerebro += 7;
                System.out.printf("Total de bônus no(a) %s: %d%%\n", bonusDispositivoArma, this.bonusEquipamentosCerebro);
                break;
                
            case "intuicao":
                this.bonusEquipamentosIntuicao += 7;
                System.out.printf("Total de bônus no(a) %s: %d%%\n", bonusDispositivoArma, this.bonusEquipamentosIntuicao);
                break;
        }
    }
    
    
   
    
    
    
    public void conjuntoLendarioEquipado() // Método para o conjunto épico que dá bônus de 10% em todas as habilidade básicas do personagem.
    {
                this.bonusEquipamentosForca = 10;
                this.bonusEquipamentosVigor = 10;
                this.bonusEquipamentosCerebro = 10;
                this.bonusEquipamentosIntuicao = 10;
                
                System.out.println("Todas as habilidades básicas recebem um bônus de 10% de conjunto");
    }
    
    public void conjuntoEpicoEquipado() // Método para o conjunto épico que dá bônus de 7% em todas as habilidade básicas do personagem.
    {
        this.bonusEquipamentosForca = 7;
        this.bonusEquipamentosVigor = 7;
        this.bonusEquipamentosCerebro = 7;
        this.bonusEquipamentosIntuicao = 7;
        
        System.out.printf("Todas as habilidades básicas recebem um bônus de 7%% de conjunto\n\n");
    }
    
    public void conjuntoEpicoCincoPorcento() // Método para o conjunto épico que dá bônus de 5% em todas as habilidade básicas do personagem.
    {
        this.bonusEquipamentosForca = 5;
        this.bonusEquipamentosVigor = 5;
        this.bonusEquipamentosCerebro = 5;
        this.bonusEquipamentosIntuicao = 5;
        
        System.out.printf("Todas as habilidades básicas recebem um bônus de 5% de conjunto\n\n");
    }
    
    public void semConjuntoEpicoEquipado() // Método para caso o personagem não tenha um conjunto de equipamentos, o valor do bônus do conjunto é igual a 0 em todas as habilidades.
    {
        this.bonusEquipamentosForca = 0;
        this.bonusEquipamentosVigor = 0;
        this.bonusEquipamentosCerebro = 0;
        this.bonusEquipamentosIntuicao = 0;
        
        System.out.println("O personagem não recebe bônus de conjunto de equipamentos!");
    }
    
    public void semConjuntoDispositivoArma() // se o personagem não tiver o conjunto de Dispositivo + arma, o método é chamado.
    {
        this.bonusEquipamentosForca  +=0;
        this.bonusEquipamentosVigor  +=0;
        this.bonusEquipamentosCerebro +=0;
        this.bonusEquipamentosIntuicao +=0;
    }
    
    
    /* Setters para que seja possível alterar o valor das variáveis pela classe Main
    Apenas precisa chamar o método por lá que o valor é alterado
    */
    public void setForca(int valorBonusForcaConjuntoMistoUser)
    {
        this.bonusEquipamentosForca += valorBonusForcaConjuntoMistoUser;
    }
    
    public void setVigor(int valorBonusVigorConjuntoMistoUser)
    {
        this.bonusEquipamentosVigor += valorBonusVigorConjuntoMistoUser;
    }
    
    public void setCerebro(int valorBonusCerebroConjuntoMistoUser)
    {
        this.bonusEquipamentosCerebro += valorBonusCerebroConjuntoMistoUser;
    }
    
    public void setIntuicao(int valorBonusIntuicaoConjuntoMistoUser)
    {
        this.bonusEquipamentosIntuicao += valorBonusIntuicaoConjuntoMistoUser;
    }
    
    
    /* Getters que, ao serem chamados, retornam o valor da variável.*/
    public int getForca()
    {
        return this.bonusEquipamentosForca;
    }
    
    public int getVigor()
    {
        return this.bonusEquipamentosVigor;
    }
    
    public int getCerebro()
    {
        return this.bonusEquipamentosCerebro;
    }
    
    public int getIntuicao()
    {
       return this.bonusEquipamentosIntuicao;
    }
}