package herozero.project.community.main;

import herozero.project.community.logic.EnergeticoDeHabilidade; 
import herozero.project.community.logic.Liga; 
import herozero.project.community.logic.Time; 
import herozero.project.community.logic.EsconderijoHeroico; 
import herozero.project.community.logic.HabilidadePet;
import herozero.project.community.logic.Temporada;
import herozero.project.community.logic.BonusEquipamentos;
import herozero.project.community.logic.HabilidadeTotal;
import herozero.project.community.logic.AtributosEquipamentosPet;

import herozero.project.community.logic.BonusTotal;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        EnergeticoDeHabilidade energetico = new EnergeticoDeHabilidade();
        Liga liga = new Liga();
        Time time = new Time();
        EsconderijoHeroico esconderijo = new EsconderijoHeroico();
        HabilidadePet habilidadePet = new HabilidadePet();
        Temporada temporada = new Temporada();
        BonusEquipamentos bonusEquipamentos = new BonusEquipamentos();
        HabilidadeTotal habilidadeTotal = new HabilidadeTotal();
        AtributosEquipamentosPet atributosEquipamentosPet = new AtributosEquipamentosPet();
        BonusTotal bonusTotal = new BonusTotal();
        
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("***************************************************************************");
        System.out.println("***                          INICIANDO O PROGRAMA                       ***");
        System.out.printf("***************************************************************************\n\n");
        
    
        // Calculando o bônus que o energético de habilidade acrescenta nas habilidades básicas do personagem
        energetico.listaEnergeticos();
        
        int opcaoEnergetico = sc.nextInt();
        
        energetico.verificarEnergetico(opcaoEnergetico);
        
        //Armazenar o valor do bônus de energético em todas variáveis da classe BonusTotal
        int bonusEnergeticoPersonagem = energetico.getBonusEnergeticoHabilidade();
        
        
        bonusTotal.setBonusTotalForca(bonusEnergeticoPersonagem); 
        bonusTotal.setBonusTotalVigor(bonusEnergeticoPersonagem);
        bonusTotal.setBonusTotalCerebro(bonusEnergeticoPersonagem);
        bonusTotal.setBonusTotalIntuicao(bonusEnergeticoPersonagem);
        
        System.out.printf("***************************************************************************\n\n");
        // Calculando o bônus que a Liga acrescenta nas habilidades básicas do personagem.
        liga.listaLigas();
        
        int opcaoLiga = sc.nextInt();
        sc.nextLine(); // Para consumir o Enter
        
        liga.verificarLiga(opcaoLiga);
        
        //Armazenar o valor do bônus de liga em todas as variáveis da classe BonusTotal
        
        int bonusLigaPersonagem = liga.getBonusLiga();
        
        bonusTotal.setBonusTotalForca(bonusLigaPersonagem);
        bonusTotal.setBonusTotalVigor(bonusLigaPersonagem);
        bonusTotal.setBonusTotalCerebro(bonusLigaPersonagem);
        bonusTotal.setBonusTotalIntuicao(bonusLigaPersonagem);
        
        System.out.printf("***************************************************************************\n\n");
        
        
        // Calcular bônus que o time atribui às habilidades básicas
        
        System.out.println("O jogador está em uma equipe?");
        System.out.println("Digite 'sim' ou 'não' ");
        String analiseJogadorEquipe = sc.nextLine();
        
        String editAnaliseJogadorEquipe = analiseJogadorEquipe.toLowerCase(); // transforma toda a String em letras minúsculas e atribui a uma nova variável
        
        if(editAnaliseJogadorEquipe.equals("sim"))
        {
            time.mensagemTime();
            int valorBonusTime = sc.nextInt();
            
            time.verificarBonusTime(valorBonusTime);
            
            //Armazenar o valor do bônus de time em todas as variáveis classe BonusTotal
            int personagemTimeBonus = time.getBonusTime();
            
            bonusTotal.setBonusTotalForca(valorBonusTime);
            bonusTotal.setBonusTotalVigor(valorBonusTime);
            bonusTotal.setBonusTotalCerebro(valorBonusTime);
            bonusTotal.setBonusTotalIntuicao(valorBonusTime);
            
            
        }
        else 
        {
            time.semTime();
            
            int personagemSemTimeBonus = time.getBonusTime();
            
            bonusTotal.setBonusTotalForca(personagemSemTimeBonus);
            bonusTotal.setBonusTotalVigor(personagemSemTimeBonus);
            bonusTotal.setBonusTotalCerebro(personagemSemTimeBonus);
            bonusTotal.setBonusTotalIntuicao(personagemSemTimeBonus);
            
        }
        
        
        System.out.printf("***************************************************************************\n\n");
        
        // Calculando bônus que o Laboratório de Pesquisa cibernético acrescenta às habilidades básicas do personagem.
        
        esconderijo.listaNiveisLaboratorioCibernetico();
        
        int valorEntradaBonusEsconderijo = sc.nextInt();
        
        esconderijo.verificarBonusEsconderijo(valorEntradaBonusEsconderijo);
        
        //Armazenar o valor do bônus de esconderijo em todas as variáveis classe BonusTotal
        int personagemBonusEsconderijo = esconderijo.getBonusEsconderijo();
            
        bonusTotal.setBonusTotalForca(personagemBonusEsconderijo);
        bonusTotal.setBonusTotalVigor(personagemBonusEsconderijo);
        bonusTotal.setBonusTotalCerebro(personagemBonusEsconderijo);
        bonusTotal.setBonusTotalIntuicao(personagemBonusEsconderijo);
        
        
        System.out.printf("***************************************************************************\n\n");
        
        // Calcular bônus da habilidade do pet
        
        habilidadePet.perguntaHabilidadePet();
        
        habilidadePet.listaHabilidadePets();
        int escolhaHabilidadePet = sc.nextInt();
        
        habilidadePet.escolhaHabilidade(escolhaHabilidadePet);
        sc.nextLine(); 
        
        
        //Armazenar o valor do bônus de pet em todas as variáveis classe BonusTotal
        int personagemBonusPetForca = habilidadePet.getBonusPetForca();
        int personagemBonusPetVigor = habilidadePet.getBonusPetVigor();
        int personagemBonusPetCerebro = habilidadePet.getBonusPetCerebro();
        int personagemBonusPetIntuicao = habilidadePet.getBonusPetIntuicao();
            
        bonusTotal.setBonusTotalForca(personagemBonusPetForca);
        bonusTotal.setBonusTotalVigor(personagemBonusPetVigor);
        bonusTotal.setBonusTotalCerebro(personagemBonusPetCerebro);
        bonusTotal.setBonusTotalIntuicao(personagemBonusPetIntuicao);
        
        
        System.out.printf("***************************************************************************\n\n");
        
        // Calcular o bônus de temporada
        
        String verificarTemporada;
        
        temporada.perguntaTemporadaHabilidade(); // chamo o método que contém a pergunta
        verificarTemporada = sc.nextLine().toLowerCase(); // armazeno "sim" ou "não", já ficando com letras minúsculas.
        
        if(verificarTemporada.equals("sim"))
        {
            temporada.bonusNomeHabilidadeBasica(); // se for true, este método é chamado. Assim, é perguntada a habilidade que a temporada influencia
            String nomeHabilidade = sc.nextLine().toLowerCase(); // aqui armazena a resposta, "forca" por exemplo;
            
            temporada.bonusTemporadaHabilidade(); // chamo o método onde pergunta o valor do bônus
            int valorEntradaBonusTemporada = sc.nextInt(); // Aqui armazena o valor
            sc.nextLine();
            
            temporada.verificacaoBonusTemporada(nomeHabilidade, valorEntradaBonusTemporada);
            // e aqui, passando os dois valores coletados acima, chamo o método onde vai ocorrer a verificação e assim retornar a resposta. 
            
            //Armazenar o valor do bônus de pet em todas as variáveis classe BonusTotal
            int valorBonusTemporadaForca = temporada.getBonusTemporadaForca();
            int valorBonusTemporadaVigor = temporada.getBonusTemporadaVigor();
            int valorBonusTemporadaCerebro = temporada.getBonusTemporadaCerebro();
            int valorBonusTemporadaIntuicao = temporada.getBonusTemporadaIntuicao();
            
            bonusTotal.setBonusTotalForca(valorBonusTemporadaForca);
            bonusTotal.setBonusTotalVigor(valorBonusTemporadaVigor);
            bonusTotal.setBonusTotalCerebro(valorBonusTemporadaCerebro);
            bonusTotal.setBonusTotalIntuicao(valorBonusTemporadaIntuicao);
            
            
            
            
            System.out.printf("\n\n");
        }
        else
        {
           temporada.semBonusTemporada(); // só roda se a temporada não influenciar em nada as habilidades básicas. 
            System.out.printf("\n\n");
        }      
        
        System.out.printf("***************************************************************************\n\n");
        
        // Calcular bônus do conjunto de equipamentos.
        
        bonusEquipamentos.perguntaConjuntoLendario();
        String pergunta = sc.nextLine();
        
        if(pergunta.toLowerCase().equals("sim")) 
        {
            bonusEquipamentos.conjuntoLendarioEquipado();
        }
        else if(pergunta.toLowerCase().equals("nao"))
        {
            bonusEquipamentos.perguntaConjuntoEpico();
            pergunta = sc.nextLine();
            
            //bonusEquipamentos.perguntaConjuntoDispositivoArma();
            //String perguntaDispositivoArma = sc.nextLine();
            
            if(pergunta.toLowerCase().equals("sim"))
            {
                System.out.println("O conjunto épico acrescenta bônus de 5% ou 7% às habilidades básicas do personagem?");
                int verificacaoTipoConjEpico = sc.nextInt();
                sc.nextLine();
                
                switch(verificacaoTipoConjEpico)
                {
                    case 5:
                        bonusEquipamentos.conjuntoEpicoCincoPorcento();
                    break;
                    
                    case 7:
                        bonusEquipamentos.conjuntoEpicoEquipado();
                        break;
                }
                
                bonusEquipamentos.perguntaConjuntoDispositivoArma();
                String perguntaDispositivoArma = sc.nextLine();
                
                if(perguntaDispositivoArma.toLowerCase().equals("sim"))
                {
                    System.out.println("Digite em qual habilidade o bônus de dispositivo + arma é incrementado: ");
                    String nomeAtributoBonusDispositivoArma = sc.nextLine();
                    
                    
                    bonusEquipamentos.perguntaConjuntoArmaMissil(nomeAtributoBonusDispositivoArma);
                }
                else
                {
                    bonusEquipamentos.semConjuntoDispositivoArma();
                }
            }
        }
        
        else if(pergunta.toLowerCase().equals("nao"))
        {
            bonusEquipamentos.perguntaConjuntosMistos();
            String perguntaConjuntoEquipMistos = sc.nextLine();
            
            
            if(perguntaConjuntoEquipMistos.toLowerCase().equals("sim"))
            {
                System.out.println("o jogador possui peças de conjunto lendário? ");
                pergunta = sc.nextLine();
                
                
                if(pergunta.toLowerCase().equals("sim"))
                {
                    System.out.println("Digite o total de bônus que, apenas os objetos lendários equipados acrescentam a: ");
                    System.out.println("Força básica: ");
                    int pontosObjetosLendariosMistosForca = sc.nextInt();
                    bonusEquipamentos.setForca(pontosObjetosLendariosMistosForca);
                    
                    System.out.println("Vigor básico: ");
                    int pontosObjetosLendariosMistosVigor = sc.nextInt();
                    bonusEquipamentos.setVigor(pontosObjetosLendariosMistosVigor);
                    
                    System.out.println("Cérebro básico: ");
                    int pontosObjetosLendariosMistosCerebro = sc.nextInt();
                    bonusEquipamentos.setCerebro(pontosObjetosLendariosMistosCerebro);
                    
                    System.out.println("Intuicao básica: ");
                    int pontosObjetosLendariosMistosIntuicao = sc.nextInt();
                    bonusEquipamentos.setIntuicao(pontosObjetosLendariosMistosIntuicao);
                    sc.nextLine();
                    
                    System.out.println("o jogador possui peças de conjunto épico? ");
                    pergunta = sc.nextLine();
                    
                    
                    if(pergunta.toLowerCase().equals("sim"))
                    {    
                    System.out.println("Digite o total de bônus que, apenas os objetos épicos equipados acrescentam a: ");
                    
                    System.out.println("Força básica: ");
                    int pontosObjetosEpicosMistosForca = sc.nextInt();
                    bonusEquipamentos.setForca(pontosObjetosEpicosMistosForca);
                    
                    System.out.println("Vigor básico: ");
                    int pontosObjetosEpicosMistosVigor = sc.nextInt();
                    bonusEquipamentos.setVigor(pontosObjetosEpicosMistosVigor);
                    
                    System.out.println("Cérebro básico: ");
                    int pontosObjetosEpicosMistosCerebro = sc.nextInt();
                    bonusEquipamentos.setCerebro(pontosObjetosEpicosMistosCerebro);
                    
                    System.out.println("Intuicao básica: ");
                    int pontosObjetosEpicosMistosIntuicao = sc.nextInt();
                    bonusEquipamentos.setIntuicao(pontosObjetosEpicosMistosIntuicao);
                    }
                }
            }
            else
            {
                bonusEquipamentos.semConjuntoEpicoEquipado(); // como não vai ter nenhum bonus de conjunto, posso reaproveitar o método.
            }   
              
        }
        
        System.out.printf("\n\n");
        System.out.println("Resultado final dos bônus de conjunto: ");
        
        int finalBonusForcaConjuntoEquipamentos = bonusEquipamentos.getForca();
        int finalBonusVigorConjuntoEquipamentos = bonusEquipamentos.getVigor();
        int finalBonusCerebroConjuntoEquipamentos = bonusEquipamentos.getCerebro();
        int finalBonusIntuicaoConjuntoEquipamentos = bonusEquipamentos.getIntuicao();
        
        
        
        //Armazenar o valor do bônus de conjunto em todas as variáveis classe BonusTotal
        bonusTotal.setBonusTotalForca(finalBonusForcaConjuntoEquipamentos);
        bonusTotal.setBonusTotalVigor(finalBonusVigorConjuntoEquipamentos);
        bonusTotal.setBonusTotalCerebro(finalBonusCerebroConjuntoEquipamentos);
        bonusTotal.setBonusTotalIntuicao(finalBonusIntuicaoConjuntoEquipamentos);
        
        System.out.printf("Força: %d%%\n", finalBonusForcaConjuntoEquipamentos );
        System.out.printf("Vigor: %d%%\n", finalBonusVigorConjuntoEquipamentos);
        System.out.printf("Cerebro: %d%%\n", finalBonusCerebroConjuntoEquipamentos);
        System.out.printf("Intuicao: %d%%\n", finalBonusIntuicaoConjuntoEquipamentos);
        
        
        System.out.printf("***************************************************************************\n\n");
        
        
        // Perguntar ao usuário qual a habilidade base que ele quer calcular
    
        
        System.out.println("Qual a habilidade que você deseja descobrir o valor base?");
        System.out.println("Opções: força, vigor, cérebro e intuição");
        System.out.println("Observação: digite sem caracteres especiais ou acentos.");
        String perguntaHabilidadeCalculada = sc.nextLine(); // Armazenar a habilidade que o usuário quer calcular
        
        switch(perguntaHabilidadeCalculada.toLowerCase()) 
        {
            case "forca":
                habilidadeTotal.mensagemForcaTotal();
            
                int valorUserForcaTotal = sc.nextInt();
                habilidadeTotal.setValorForcaTotal(valorUserForcaTotal);
            
                int resultadoForcaTotal = habilidadeTotal.getForcaTotal();
                System.out.println("Força total do personagem: "+resultadoForcaTotal);
                break;
                
            case "vigor":
                habilidadeTotal.mensagemVigorTotal();
            
                int valorUserVigorTotal = sc.nextInt();
                habilidadeTotal.setValorVigorTotal(valorUserVigorTotal);
            
                int resultadoVigorTotal = habilidadeTotal.getVigorTotal();
                System.out.println("Vigor total do personagem: "+resultadoVigorTotal);
                break;
                
            case "cerebro":
                habilidadeTotal.mensagemCerebroTotal();
            
                int valorUserCerebroTotal = sc.nextInt();
            
                habilidadeTotal.setValorCerebroTotal(valorUserCerebroTotal);
            
                int resultadoCerebroTotal = habilidadeTotal.getCerebroTotal();
                System.out.println("Cérebro total do personagem: "+resultadoCerebroTotal);
                break;
                
            case "intuicao":
                habilidadeTotal.mensagemIntuicaoTotal();
            
                int valorUserIntuicaoTotal = sc.nextInt();
                sc.nextLine(); // consumir o enter
            
                habilidadeTotal.setValorIntuicaoTotal(valorUserIntuicaoTotal);
            
                int resultadoIntuicaoTotal = habilidadeTotal.getIntuicaoTotal();
                System.out.println("Intuição total do personagem: "+resultadoIntuicaoTotal);
                break;
                
                
            default:
                System.out.println("Nome inválido!");
        }
        
       System.out.printf("***************************************************************************\n\n");
        
        // Entrada de dados dos atributos dos objetos
        
        switch(perguntaHabilidadeCalculada.toLowerCase())
        {
            case "forca":
                // Perguntar e armazernar o valor total de pontos de força que a capa acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemCapa();
                int atributoForcaEquipamentosCapa = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentosCapa);
            
            
                // Perguntar e armazernar o valor total de pontos de força que o traje acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemTraje();
                int atributoForcaEquipamentosTraje = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentosTraje);
            
            
                // Perguntar e armazernar o valor total de pontos de força que o cinto acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemCinto();
                int atributoForcaEquipamentosCinto = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentosCinto);
            
            
                // Perguntar e armazernar o valor total de pontos de força que os sapatos acrescentam às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemSapatos();
                int atributoForcaEquipamentoSapatos = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentoSapatos);
            
            
                // Perguntar e armazernar o valor total de pontos de força que a máscara acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemMascara();
                int atributoForcaEquipamentoMascara = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentoMascara);
            
            
                // Perguntar e armazernar o valor total de pontos de força que o dispositivo acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemDispositivo();
                int atributoForcaEquipamentoDispositivo = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentoDispositivo);
            
            
                // Perguntar e armazernar o valor total de pontos de força que a arma acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemArma();
                int atributoForcaEquipamentoArma = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentoArma);
            
                // Perguntar e armazernar o valor total de pontos de força que o acompanhante acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemPet();
                int atributoForcaEquipamentoPet = sc.nextInt();
            
                atributosEquipamentosPet.setForcaEquipamentosPet(atributoForcaEquipamentoPet);
                    
            
            
                // Pegar o valor final da força depois que o usuário terminar de digitar
                int resultadoFinalForcaEquipamentosPet = atributosEquipamentosPet.getForcaTotalEquipamentosPet();
                System.out.println("O total que pontos que os objetos acrescentam à força do personagem é: "+resultadoFinalForcaEquipamentosPet+" Pontos!");
                break;
        
            case "vigor":
                // Perguntar e armazernar o valor total de pontos de vigor que a capa acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemCapa();
                int atributoVigorEquipamentoCapa = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoCapa);
                
                
                
                // Perguntar e armazernar o valor total de pontos de vigor que o traje acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemTraje();
                int atributoVigorEquipamentoTraje = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoTraje);
                
                
                // Perguntar e armazernar o valor total de pontos de vigor que o cinto acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemCinto();
                int atributoVigorEquipamentoCinto = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoCinto);



                // Perguntar e armazernar o valor total de pontos de vigor que os sapatos acrescentam às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemSapatos();
                int atributoVigorEquipamentoSapatos = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoSapatos);
                
                
                // Perguntar e armazernar o valor total de pontos de vigor que a máscara acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemMascara();
                int atributoVigorEquipamentoMascara = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoMascara);
                
                
                // Perguntar e armazernar o valor total de pontos de vigor que o dispositivo acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemDispositivo();
                int atributoVigorEquipamentoDispositivo = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoDispositivo);
                
                
                // Perguntar e armazernar o valor total de pontos de vigor que o dispositivo acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemArma();
                int atributoVigorEquipamentoArma = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoArma);
                
                
                // Perguntar e armazernar o valor total de pontos de vigor que o dispositivo acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemVigorItemPet();
                int atributoVigorEquipamentoPet = sc.nextInt();
                
                atributosEquipamentosPet.setVigorEquipamentosPet(atributoVigorEquipamentoPet);
                
                
                // Pegar o valor final do vigor depois que o usuário terminar de digitar
                int resultadoFinalVigorEquipamentosPet = atributosEquipamentosPet.getVigorTotalEquipamentosPet();
                System.out.println("O total que pontos que os objetos acrescentam ao vigor do personagem é: "+resultadoFinalVigorEquipamentosPet+" Pontos!");        
                break;
            
                
                
            case "cerebro":
                // Perguntar e armazernar o valor total de pontos de cérebro que a capa acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemCapa();
                int atributoCerebroEquipamentoCapa = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentoCapa);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que o traje acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemTraje();
                int atributoCerebroEquipamentoTraje = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentoTraje);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que o cinto acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemCinto();
                int atributoCerebroEquipamentoCinto = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentoCinto);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que os sapatos acrescentam às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemSapatos();
                int atributoCerebroEquipamentoSapatos = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentoSapatos);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que a máscara acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemMascara();
                int atributoCerebroEquipamentosMascara = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentosMascara);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que o dispositivo acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemDispositivo();
                int atributoCerebroEquipamentosDispositivo = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentosDispositivo);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que a arma acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemArma();
                int atributoCerebroEquipamentosArma = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentosArma);
                
                
                // Perguntar e armazernar o valor total de pontos de cérebro que o pet acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemCerebroItemPet();
                int atributoCerebroEquipamentosPet = sc.nextInt();
                
                atributosEquipamentosPet.setCerebroEquipamentosPet(atributoCerebroEquipamentosPet);
                
                
                // Pegar o valor final do cérebro depois que o usuário terminar de digitar
                int resultadoFinalCerebroEquipamentosPet = atributosEquipamentosPet.getCerebroTotalEquipamentosPet();
                System.out.println("O total que pontos que os objetos acrescentam ao cérebro do personagem é: "+resultadoFinalCerebroEquipamentosPet+" Pontos!");
                break;
                
                
            case "intuicao":
                // Perguntar e armazernar o valor total de pontos de intuição que a capa acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuicaoItemCapa();
                int atributoIntuicaoEquipamentosCapa = sc.nextInt();
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosCapa);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que o traje acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuicaoItemTraje();
                int atributoIntuicaoEquipamentosTraje = sc.nextInt();
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosTraje);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que o cinto acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemForcaItemCinto();
                int atributoIntuicaoEquipamentosCinto = sc.nextInt();
                
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosCinto);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que os sapatos acrescenta, às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuiçãoItemSapatos();
                int atributoIntuicaoEquipamentosSapatos = sc.nextInt();
                
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosSapatos);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que a máscara acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuicaoItemMascara();
                int atributoIntuicaoEquipamentosMascara = sc.nextInt();
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosMascara);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que o dispositivo acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuicaoItemDispositivo();
                int atributoIntuicaoEquipamentosDispositivo = sc.nextInt();
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosDispositivo);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que a arma acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuicaoItemArma();
                int atributoIntuicaoEquipamentosArma = sc.nextInt();
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosArma);
                
                
                // Perguntar e armazernar o valor total de pontos de intuição que a arma acrescenta às habilidades do personagem
                atributosEquipamentosPet.mensagemIntuicaoItemPet();
                int atributoIntuicaoEquipamentosPet = sc.nextInt();
                
                atributosEquipamentosPet.setIntuicaoEquipamentosPet(atributoIntuicaoEquipamentosPet);
                
                
                
                // Pegar o valor final da intuição depois que o usuário terminar de digitar
                int resultadoFinalIntuicaoEquipamentosPet = atributosEquipamentosPet.getIntuicaoTotalEquipamentosPet();
                System.out.println("O total que pontos que os objetos acrescentam à intuição do personagem é: "+resultadoFinalIntuicaoEquipamentosPet+" Pontos!");
                break;
                
            default:
                System.out.println("Habilidade indisponível!");
        }
        
        System.out.printf("***************************************************************************\n\n");
        // Parte final da lógica do programa
        
        
        // Fórmula: habilidadeBasica + bonusTotal = HabilidadeTotal - pontosHailidadeEquipamentosPet
        
        /*Exemplo para calcular a força básica do personagem:
        
            habilidadeBasica + bonusTotal = HabilidadeTotalForca - pontosHailidadeEquipamentosPetForca
            habilidadeBasica + bonusTotal = resultadoSubForcaTotEquipPet
            habilidadeBasica = resultadoSubForcaTotEquipPet / (1+(bonusTotal/100))*/
    
        switch(perguntaHabilidadeCalculada.toLowerCase())
        {
            case "forca":
                double bonusTotalForca = bonusTotal.getBonusTotalForca(); // pega o bônus total e armazena na variável
        
                int ForcaTotalPersonagem = habilidadeTotal.getForcaTotal(); // pega a habilidade total e armazena na variável
                int totalForcaEquipamentosPet = atributosEquipamentosPet.getForcaTotalEquipamentosPet(); // pega o valor total que os equipamentos e pet acrescentam na força
        
                int resultadoSubForcaTotEquipPet = ForcaTotalPersonagem - totalForcaEquipamentosPet; // subtrai o valor total que os equipamentos e pets acrescentam na força total
        
            double habilidadeBasicaForca = resultadoSubForcaTotEquipPet / (1+(bonusTotalForca/100)); 
            
            System.out.printf("FORÇA BÁSICA QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaForca);
            
            break;
            
            case "vigor":
                double bonusTotalVigor = bonusTotal.getBonusTotalVigor();
                
                int vigorTotalPersonagem = habilidadeTotal.getVigorTotal();
                int totalVigorEquipamentosPet = atributosEquipamentosPet.getVigorTotalEquipamentosPet();
                
                int resultadoSubVigorTotEquipPet = vigorTotalPersonagem - totalVigorEquipamentosPet;
                
                
                double habilidadeBasicaVigor = resultadoSubVigorTotEquipPet / (1+(bonusTotalVigor/100));
                
                System.out.printf("VIGOR BÁSICO QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaVigor);
                
                break;
            case "cerebro":
                double bonusTotalCerebro = bonusTotal.getBonusTotalCerebro();
                
                int cerebroTotalPersonagem = habilidadeTotal.getCerebroTotal();
                int totalCerebroEquipamentosPet = atributosEquipamentosPet.getCerebroTotalEquipamentosPet();
                
                int resultadoSubCerebroTotEquipPet = cerebroTotalPersonagem - totalCerebroEquipamentosPet;
                
                
                double habilidadeBasicaCerebro = resultadoSubCerebroTotEquipPet / (1+(bonusTotalCerebro/100));
                
                System.out.printf("CÉREBRO BÁSICO QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaCerebro);
                
                break;
                
                
            case "intuicao":
                double bonusTotalIntuicao = bonusTotal.getBonusTotalIntuicao();
                
                int intuicaoTotalPersonagem = habilidadeTotal.getIntuicaoTotal();
                int totalIntuicaoEquipamentosPet = atributosEquipamentosPet.getIntuicaoTotalEquipamentosPet();
                
                int resultadoSubIntuicaoTotEquipPet = intuicaoTotalPersonagem - totalIntuicaoEquipamentosPet;
                
                
                double habilidadeBasicaIntuicao = resultadoSubIntuicaoTotEquipPet / (1+(bonusTotalIntuicao/100));
                
                System.out.printf("INTUIÇÃO BÁSICA QUE O PERSONAGEM POSSUI: %.1f PONTOS.\n\n", habilidadeBasicaIntuicao);
                
                break;
                
            default:
                System.out.println("Habilidade inexistente, tente novamente!");
        }
        
        System.out.println("********************************************************************************");
        System.out.println("***                      PROGRAMA ENCERRADO!                                 ***");
        System.out.println("********************************************************************************");
    }
}