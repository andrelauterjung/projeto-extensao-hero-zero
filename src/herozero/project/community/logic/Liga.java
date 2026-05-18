package herozero.project.community.logic;

public class Liga
{
    private int bonusLiga;
    
    
    public void listaLigas()
    {
        System.out.printf("Digite o número referênte à Liga que o personagem está: \n\n");
    
        System.out.println("0 - O personagem não está classificado em nenhuma liga.");
        
        System.out.println("1 - O personagem está na Liga Bronze III.");
        System.out.println("2 - O personagem está na Liga Bronze II.");
        System.out.println("3 - O personagem está na Liga Bronze I.");
        
        System.out.println("4 - O personagem está na Liga Prata III.");
        System.out.println("5 - O personagem está na Liga Prata II.");
        System.out.println("6 - O personagem está na Liga Prata I.");
        
        System.out.println("7 - O personagem está na Liga Ouro III.");
        System.out.println("8 - O personagem está na Liga Ouro II.");
        System.out.println("9 - O personagem está na Liga Ouro I.");
        
        System.out.println("10 - O personagem está na Liga Campeão III.");
        System.out.println("11 - O personagem está na Liga Campeão II.");
        System.out.println("12 - O personagem está na Liga Campeão I.");
        
        System.out.println("13 - O personagem está na Liga Super-herói.");
    }
    
    
    public void verificarLiga(int opcaoLiga)
    {
        switch(opcaoLiga)
        {
            case 0:
                this.bonusLiga = 0;
                break;
                
            case 1:
                this.bonusLiga = 3;
                break;
            
            case 2:
                this.bonusLiga = 6;
                break;
                
            case 3:
                this.bonusLiga = 9;
                break;
                
            case 4:
                this.bonusLiga =12;
                break;
            
            case 5:
                this.bonusLiga = 15;
                break;
                
            case 6:
                this.bonusLiga = 18;
                break;
            
            case 7:
                this.bonusLiga = 21;
                break;
                
            case 8:
                this.bonusLiga = 24;
                break;
                
            case 9:
                this.bonusLiga = 27;
                break;
            
            case 10:
                this.bonusLiga = 30;
                break;
                
             case 11:
                 this.bonusLiga = 33;
                break;
                
            case 12:
                this.bonusLiga = 36;
                break;
            
            case 13:
                this.bonusLiga = 39;
                break;    
        }
        
        System.out.printf("O personagem possui %d%% de bônus de liga!\n", this.bonusLiga);
    }
    
    
    // Método Setter
    public void setBonusLiga(int valorBonusLiga)
    {
        this.bonusLiga += valorBonusLiga;
    }
    
    // Método Getter
    public int getBonusLiga()
    {
        return this.bonusLiga;
    }    
}