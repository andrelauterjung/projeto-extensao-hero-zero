package herozero.project.community.view;

/**
 *
 * @author andrelauterjung
 */
public class BonusEquipamentosView
{
    public void perguntaConjuntoLendario()
    {
        System.out.println("O jogador possui um conjunto lendário completo? 7 de 7 peças");
        System.out.println("Digite 'sim' ou 'nao' "); 
    }
    
    
    public void perguntaConjuntoEpico() // perguntar ao usuário se o personagem tem conjunto épico equipado
    {
        System.out.printf("O jogador possui um conjunto épico completo? 5 de 5 peças\n");
        System.out.println("Digite 'sim' ou 'nao' "); 
    }

    
    
    public void perguntaConjuntoDispositivoArmaMissil() // perguntr ao usuário se o personagem tem conjunto de dispositivo + arma equipado
    {
        System.out.printf("O jogador possui um conjunto de Dispositivo + Arma ou Arma + Míssil?\n");
        System.out.println("Digite 'sim' ou 'nao' "); 
    }
    
    public void perguntaConjuntosMistos()
    {
        System.out.println("O personagem está com diferentes tipos de conjuntos?");
        System.out.println("Exemplo: sapatos, cinto e traje épicos - capa, máscara, dispositivo e árma lendários, entre outras combinações");
    }
}
