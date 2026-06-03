package herozero.project.community.logic;

import herozero.project.community.view.AtributosObjetosPetView;
import herozero.project.community.model.FichaPersonagem;

import java.util.Scanner;
/**
 * Classe com métodos que perguntam informações ao usuário e armazenam valores referentes
 * aos atributos dos equipamentos que o personagem está usando.
 * 
 * @author André Lauterjung
 */
public class AtributosEquipamentosPet
{
    private int totalAtributosForcaEquipamentosPet;
    private int totalAtributosVigorEquipamentosPet;
    private int totalAtributosCerebroEquipamentosPet;
    private int totalAtributosIntuicaoEquipamentosPet;
    
    
    public void calcularAtributosEquipPet(Scanner sc, HabilidadeTotalLogic habilidadeTotal, FichaPersonagem fichaPersonagem)
    {
        AtributosObjetosPetView perguntasAtributosEquipPet = new AtributosObjetosPetView();        
        
        
        String pergunta = habilidadeTotal.getRespHabTotalText();
        /* A variável pergunta pega a mesma resposta do nome da habilidade total
        que o usuário digitou anteriormente e aproveita para ser usada nesta classe
        seguindo uma ordem para o cálculo das habilidaddes. 
        
        Ou seja, se anteriormente ele digitou a força total, em seguida ele
        vai digitar os pontos de força que os equipamentos e pet acrescentam às habilidades*/
        
        switch(pergunta.toLowerCase())
        {
            /* Chama as perguntas da classe AtributosObjetosPetView referentes a
            força que os objetos acrescentam às habilidades do personagem. 
            
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/
            case "forca":
                // Item: Capa
                perguntasAtributosEquipPet.mensagemForcaItemCapa();
                int atributoForcaEquipCapa = sc.nextInt();
                sc.nextLine();
            
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipCapa;
                
            
            
                // Item: Traje
                perguntasAtributosEquipPet.mensagemForcaItemTraje();
                int atributoForcaEquipTraje = sc.nextInt();
                sc.nextLine();
            
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipTraje;
                
            
                // Item: Cinto
                perguntasAtributosEquipPet.mensagemForcaItemCinto();
                int atributoForcaEquipCinto = sc.nextInt();
                sc.nextLine();
            
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipCinto;
                
            
                // Item: Sapatos
                perguntasAtributosEquipPet.mensagemForcaItemSapatos();
                int atributoForcaEquipSapatos = sc.nextInt();
                sc.nextLine();
            
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipSapatos;
                
            
                // Item: Máscara
                perguntasAtributosEquipPet.mensagemForcaItemMascara();
                int atributoForcaEquipMascara = sc.nextInt();
                sc.nextLine();
            
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipMascara;
                
            
                // Item: Dispositivo
                perguntasAtributosEquipPet.mensagemForcaItemDispositivo();
                int atributoForcaEquipDispositivo = sc.nextInt();
                sc.nextLine();
            
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipDispositivo;
                
            
                // Item: Arma
                perguntasAtributosEquipPet.mensagemForcaItemArma();
                int atributoForcaEquipArma = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipArma;
                
                
                // Item: Pet
                perguntasAtributosEquipPet.mensagemForcaItemPet();
                int atributoForcaEquipPet = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosForcaEquipamentosPet += atributoForcaEquipPet;
                
                
                
                fichaPersonagem.getAtributosEquipPet().setForcaEquipamentosPet(this.totalAtributosForcaEquipamentosPet);
                
                break;
        
                
            /* Chama as perguntas da classe AtributosObjetosPetView referentes ao
            vigor que os objetos acrescentam às habilidades do personagem. 
                
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/    
            case "vigor":
                // Item: Capa
                perguntasAtributosEquipPet.mensagemVigorItemCapa();
                int atributoVigorEquipCapa = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipCapa;
                
                
                // Item: Traje
                perguntasAtributosEquipPet.mensagemVigorItemTraje();
                int atributoVigorEquipTraje = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipTraje;
                
                
                // Item: Cinto
                perguntasAtributosEquipPet.mensagemVigorItemCinto();
                int atributoVigorEquipCinto = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipCinto;
                

                // Item: Sapatos
                perguntasAtributosEquipPet.mensagemVigorItemSapatos();
                int atributoVigorEquipSapatos = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipSapatos;
                
                
                // Item: Máscara
                perguntasAtributosEquipPet.mensagemVigorItemMascara();
                int atributoVigorEquipMascara = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipMascara;
                
                
                // Item: Dispositivo
                perguntasAtributosEquipPet.mensagemVigorItemDispositivo();
                int atributoVigorEquipDispositivo = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipDispositivo;
                
                
                // Item: Arma
                perguntasAtributosEquipPet.mensagemVigorItemArma();
                int atributoVigorEquipArma = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipArma;
                
                
                // Item: Pet
                perguntasAtributosEquipPet.mensagemVigorItemPet();
                int atributoVigorEquipPet = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosVigorEquipamentosPet += atributoVigorEquipPet;       
                
                
                fichaPersonagem.getAtributosEquipPet().setVigorEquipamentosPet(this.totalAtributosVigorEquipamentosPet);
                break;
            
            /* Chama as perguntas da classe AtributosObjetosPetView referentes ao
            cérebro que os objetos acrescentam às habilidades do personagem. 
                
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/    
            case "cerebro":
                // Item: Capa
                perguntasAtributosEquipPet.mensagemCerebroItemCapa();
                int atributoCerebroEquipCapa = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipCapa;
                
                
                // Item: Traje
                perguntasAtributosEquipPet.mensagemCerebroItemTraje();
                int atributoCerebroEquipTraje = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipTraje;
                
                
                // Item: Cinto
                perguntasAtributosEquipPet.mensagemCerebroItemCinto();
                int atributoCerebroEquipCinto = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipCinto;
                
                
                // Item: Sapatos
                perguntasAtributosEquipPet.mensagemCerebroItemSapatos();
                int atributoCerebroEquipSapatos = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipSapatos;
                
                
                // Item: Máscara
                perguntasAtributosEquipPet.mensagemCerebroItemMascara();
                int atributoCerebroEquipMascara = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipMascara;
                
                
                // Item: Dispositivo
                perguntasAtributosEquipPet.mensagemCerebroItemDispositivo();
                int atributoCerebroEquipDispositivo = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipDispositivo;
                
                
                // Item: Arma
                perguntasAtributosEquipPet.mensagemCerebroItemArma();
                int atributoCerebroEquipArma = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipArma;
                
                
                // Item: Pet
                perguntasAtributosEquipPet.mensagemCerebroItemPet();
                int atributoCerebroEquipPet = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosCerebroEquipamentosPet += atributoCerebroEquipPet;
                
                
                fichaPersonagem.getAtributosEquipPet().setCerebroEquipamentosPet(this.totalAtributosCerebroEquipamentosPet);
                break;
                
            
            /* Chama as perguntas da classe AtributosObjetosPetView referentes a
            intuição que os objetos acrescentam às habilidades do personagem. 
                
            Após isso, o usuário digita o total de atributos ao respectivo objeto*/    
            case "intuicao":
                // Item: Capa
                perguntasAtributosEquipPet.mensagemIntuicaoItemCapa();
                int atributoIntuicaoEquipCapa = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipCapa;
                
                
                // Item: Traje
                perguntasAtributosEquipPet.mensagemIntuicaoItemTraje();
                int atributoIntuicaoEquipTraje = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipTraje;
                
                
                // Item: Cinto
                perguntasAtributosEquipPet.mensagemIntuicaoItemCinto();
                int atributoIntuicaoEquipCinto = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipCinto;
                
                
                // Item: Sapatos
                perguntasAtributosEquipPet.mensagemIntuicaoItemSapatos();
                int atributoIntuicaoEquipSapatos = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipSapatos;
                
                
                // Item: Máscara
                perguntasAtributosEquipPet.mensagemIntuicaoItemMascara();
                int atributoIntuicaoEquipMascara = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipMascara;
                
                
                // Item: Dispositivo
                perguntasAtributosEquipPet.mensagemIntuicaoItemDispositivo();
                int atributoIntuicaoEquipDispositivo = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipDispositivo;
                
                
                // Item: Arma
                perguntasAtributosEquipPet.mensagemIntuicaoItemArma();
                int atributoIntuicaoEquipArma = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipArma;
                
                
                // Item: Pet
                perguntasAtributosEquipPet.mensagemIntuicaoItemPet();
                int atributoIntuicaoEquipPet = sc.nextInt();
                sc.nextLine();
                
                this.totalAtributosIntuicaoEquipamentosPet += atributoIntuicaoEquipPet;
                
                
                
                fichaPersonagem.getAtributosEquipPet().setIntuicaoEquipamentosPet(this.totalAtributosIntuicaoEquipamentosPet);
                break;
                
            default:
                fichaPersonagem.getAtributosEquipPet().setForcaEquipamentosPet(0);
                fichaPersonagem.getAtributosEquipPet().setVigorEquipamentosPet(0);
                fichaPersonagem.getAtributosEquipPet().setCerebroEquipamentosPet(0);
                fichaPersonagem.getAtributosEquipPet().setIntuicaoEquipamentosPet(0);
                System.out.println("Habilidade indisponível!");
                
        } // fechamento do switch case
        
    } // fechamento do método calcularAtributosEquipPet
    
} // fechamento da classe