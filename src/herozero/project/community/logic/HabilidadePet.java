package herozero.project.community.logic;

public class HabilidadePet
{
    private int bonusPetForca;
    private int bonusPetVigor;
    private int bonusPetCerebro;
    private int bonusPetIntuicao;
    
    
    public void perguntaHabilidadePet()
    {
        System.out.printf("Digite o número correspondente à habilidade de nível 20 do pet que o personagem está utilizando: \n\n");
    }
    
    
    public void listaHabilidadePets()
    {
        System.out.println("Lista de todas habilidaes que acrescentam bônus às habilidades básicas do personagem!:");
        System.out.println("Observação: Todas as habilidades são de nível 20");
        System.out.printf("\n\n");
        
        System.out.println("0 - O personagem não está com nenhum pet equipado.");
          
        System.out.println("1 - Pequeno, mas poderoso! | Aumenta Cérebro, Vigor, Força e Intuição básicos em 20%");
        System.out.println("2 - Sommelier Seletiva | Aumenta Cérebro, Vigor, Força e Intuição básicos em 20%");
        System.out.println("3 - Esconde-esconde | Aumenta Cérebro, Vigor, Força e Intuição básicos em 20%.");
        System.out.println("4 - Postura Nobre | Aumenta Cérebro, Vigor, Força e Intuição básicos em 20%.");
        System.out.println("5 - Multitalentoso | Aumenta Cérebro, Vigor, Força e Intuição básicos em 20%");
        
   
        System.out.println("6 - Cachecol Mágico de Magias | Aumenta Cérebro, Vigor, Força e Intuição básicos em 19%");
        
        System.out.println("7 - Atitude Durona (pet com capacete)| Aumenta Cérebro, Vigor, Força e Intuição básicos em 18%.");
        System.out.println("8 - Meditação Profunda | Aumenta Cérebro, Vigor, Força e Intuição básicos em 18%");
        
        System.out.println("9 - Atitude Durona (pet com barba)| Aumenta Cérebro, Vigor, Força e Intuição básicos em 17%.");
        
        System.out.println("10 - Atitude Durona (pet marrom)| Aumenta Cérebro, Vigor, Força e Intuição básicos em 16%.");
        
        System.out.println("11 - Sabedoria do Dragão Mágico | Aumenta Cérebro, Vigor, Força e Intuição básicos em 15%.");
        System.out.println("12 - Sorriso Estampado no Rosto | Aumenta Cérebro, Vigor, Força e Intuição básicos em 15%.");
        System.out.println("13 - Transcendência | Aumenta Cérebro, Vigor, Força e Intuição básicos em 15%.");
        
        
        System.out.println("14 - Força dupla | Aumenta a Força básica em 10%");
        
        System.out.println("15 - Energético de Néctar | Aumenta o Vigor básico em 25%");
        System.out.println("16 - Escavação Persistente | Aumenta o Vigor básico em 20%.");
        System.out.println("17 - Parceiro de corrida | Aumenta o Vigor básico em 10%");
        
        System.out.println("18 - Sabedoria do gigante oceânico | Aumenta o cérebro básico em 20%.");
        System.out.println("19 - Supercérebro Cibernético | Aumenta o cérebro básico em 20%.");
        System.out.println("20 - Instinto | Aumenta o Cérebro básico em 20%");
        System.out.println("21 - Garoto esperto | Aumenta o cérebro básico em 10%");
       
        System.out.println("22 - Lobo em pele de cordeiro | Aumenta a intuição básica em 25%.");
        System.out.println("23 - Levitação | Aumenta a intuição básica em 25%.");
        System.out.println("24 - Equilíbrio perfeito | Aumenta a intuição básica em 25%.");
        System.out.println("25 - Ferrão Veloz | Aumenta a intuição básica em 25%.");
        System.out.println("26 - Bazinga! | Aumenta a intuição básica em 20%.");
        System.out.println("27 - Quatro olhos | Aumenta a Intuição básica em 10%");
    }
    
    public void escolhaHabilidade (int escolhaHabilidadePet)
    {
        switch(escolhaHabilidadePet)
        {
            case 0:
                this.bonusPetForca = 0;
                this.bonusPetVigor = 0;
                this.bonusPetCerebro = 0;
                this.bonusPetIntuicao = 0;
                System.out.println("O jogador não está com um pet equipado!");
                break;
                
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bonusPetForca = 20;
                this.bonusPetVigor = 20;
                this.bonusPetCerebro = 20;
                this.bonusPetIntuicao = 20;
                System.out.println("A habilidade do pet dá um bônus de 20% em todas as habilidades básicas!");
                break;
                
            case 6:
                this.bonusPetForca = 19;
                this.bonusPetVigor = 19;
                this.bonusPetCerebro = 19;
                this.bonusPetIntuicao = 19;
                
                
                System.out.println("A habilidade do pet dá um bônus de 19% em todas as habilidades básicas!");
                break;
                
            case 7:
            case 8:
                this.bonusPetForca = 18;
                this.bonusPetVigor = 18;
                this.bonusPetCerebro = 18;
                this.bonusPetIntuicao = 18;
                System.out.println("A habilidade do pet dá um bônus de 18% em todas as habilidades básicas!");
                break;
                
            case 9:
                this.bonusPetForca = 17;
                this.bonusPetVigor = 17;
                this.bonusPetCerebro = 17;
                this.bonusPetIntuicao = 17;
                System.out.println("A habilidade do pet dá um bônus de 17% em todas as habilidades básicas!");
                break;
                
            case 10:
                this.bonusPetForca = 16;
                this.bonusPetVigor = 16;
                this.bonusPetCerebro = 16;
                this.bonusPetIntuicao = 16;
                System.out.println("A habilidade do pet dá um bônus de 16% em todas as habilidades básicas!");
                break;
                
            case 11:
            case 12:
            case 13:
                this.bonusPetForca = 15;
                this.bonusPetVigor = 15;
                this.bonusPetCerebro = 15;
                this.bonusPetIntuicao = 15;
                System.out.println("A habilidade do pet dá um bônus de 15% em todas as habilidades básicas!");
                break;
                
            case 14:
                this.bonusPetForca = 10;
                System.out.println("A habilidade do pet dá um bônus de 10% na força básica!");
                break;
                
            case 15:
                this.bonusPetVigor = 25;
                System.out.println("A habilidade do pet dá um bônus de 25% no vigor básico!");
                break;
                
            case 16:
                this.bonusPetVigor = 20;
                System.out.println("A habilidade do pet dá um bônus de 20% no vigor básico!");
                break;
                
            case 17:
                this.bonusPetVigor = 10;
                System.out.println("A habilidade do pet dá um bônus de 10% no vigor básico!");
                break;
                
            case 18:
            case 19:
            case 20:
                this.bonusPetCerebro = 20;
                System.out.println("A habilidade do pet dá um bônus de 20% no cérebro básico!");
                break;
                
            case 21:
                this.bonusPetCerebro = 10;
                System.out.println("A habilidade do pet dá um bônus de 10% no cérebro básico!");
                break;
                
            case 22:
            case 23:
            case 24:
            case 25:
                this.bonusPetIntuicao = 25;
                System.out.println("A habilidade do pet dá um bônus de 25% na intuição básica!");
                break;
                
            case 26: 
                this.bonusPetIntuicao = 20;
                System.out.println("A habilidade do pet dá um bônus de 20% na intuição básica");
                break;
                
            case 27:
                this.bonusPetIntuicao = 10;
                System.out.println("A habilidade do pet dá um bônus de 10% na intuição básica!");
                break;
        }
    }
    
    
    
    // Métodos Setter
    public void setBonusPetForca(int valorBonusPetForca)
    {
        this.bonusPetForca += bonusPetForca;
    }
    
    public void setBonusPetVigor(int valorBonusPetVigor)
    {
        this.bonusPetVigor += bonusPetVigor;
    }
    
    public void setBonusPetCerebro(int valorBonusPetCerebro)
    {
        this.bonusPetCerebro += valorBonusPetCerebro;
    }
    
    public void setBonusPetIntuicao(int valorBonusPetIntuicao)
    {
        this.bonusPetIntuicao += valorBonusPetIntuicao;
    }
    
    
    // Métodos Getter
    public int getBonusPetForca()
    {
        return this.bonusPetForca;
    }
    
    public int getBonusPetVigor()
    {
        return this.bonusPetVigor;
    }        
            
    public int getBonusPetCerebro()
    {
        return this.bonusPetCerebro;
    }
    
    public int getBonusPetIntuicao()
    {
        return this.bonusPetIntuicao;
    }
        
}