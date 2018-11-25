/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Carlos Alcântara de Oliveira
 * @author INSERIR AQUI OS NOMES DOS COMPONENTES DO GRUPO com seus Registros de
 * Matrícula (um por linha)
 * @author Michael Douglas	RGM: 1908513-3
 * @author Erik Coelho Gama	RGM: 1947384-2
 * @author Carlos Ivan Uemura Rodrigues	RGM: 1947485-7
 * @authorIgor George Alves	RGM: 1948524-7
 *
 * @version 0.5 - 17/10/2018
 *
 */
public class Loteca {
    // Constante que representa o número máximo de Apostadores que o banco comporta 

    public static int MAXIMO_APOSTADORES = 1000;
    // Constante que indica que o sistema realmente deve ser finalizado
    public static int TERMINA_SISTEMA = 14;
    // Constante que indica que o sistema não deve ser finalizado
    public static int NAO_TERMINA_SISTEMA = 0;
    // Variável Global “bancoApostadores” que representa o Banco de Apostadors 
    // Profissional e Relacionamento, como um vetor de Apostadores.  
    public static Apostador[] bancoApostadores = new Apostador[MAXIMO_APOSTADORES];
    // Total de Apostadores atuais armazenadas no banco
    public static int totalApostadoresBanco = 0;
    public static int[] resultadoConcurso = new int[10];
    public static double valorDaLoteca = 0;
    public static int[] totalDeAcertoPlayer = new int[MAXIMO_APOSTADORES];
    public static int[] jogadoresZero = new int[MAXIMO_APOSTADORES];
    public static boolean resultadosCadastrado = false;

    /**
     * Método: carregarBanco()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: carrega todos os dados
     * das Apostadors pré-cadastradas no banco de dados da empresa de “Recursos
     * Humanos e Relacionamentos Cruzeiro do Sul S.A”.
     */
    public static void carregarBanco() {
        // 1o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Diego R. Dias");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("09/10/1935");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(14) 4049-9273");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("diegoribeirodias@cuvox.com.br");
        int palpites_apostador_1[] = new int[]{1, 0, 2, 1, 0, 2, 1, 0, 2, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_1);
        totalApostadoresBanco++;

        // 2o Apostador	  
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Thiago C. Dias");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("22/05/1962");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(19) 7934-2108");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("tiagocorreiadias@superrito.com.br");
        int palpites_apostador_2[] = {1, 1, 1, 1, 0, 2, 1, 2, 2, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_2);
        totalApostadoresBanco++;

        // 3o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Isabelle C. Pereira");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("07/03/1982");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 3052-5955");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("isabellecarvalhopereira@armyspy.com.br");
        int palpites_apostador_3[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_3);
        totalApostadoresBanco++;

        // 4o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Laura A. Silva");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("29/06/1973");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 3057-4509");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("lauraazevedosilva@cuvox.com.br");
        int palpites_apostador_4[] = {1, 1, 1, 1, 0, 1, 1, 0, 0, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_4);
        totalApostadoresBanco++;

        // 5o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Davi R. Melo");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/08/1978");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 99978-7839");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("davirochamelo@einrot.com.br");
        int palpites_apostador_5[] = {1, 2, 2, 1, 0, 2, 1, 0, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_5);
        totalApostadoresBanco++;

        // 6o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Julieta C. Gomes");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("13/10/1990");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95820-8592");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("julietacorreiagomes@teleworm.com.br");
        int palpites_apostador_6[] = {1, 2, 0, 2, 1, 2, 1, 1, 2, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_6);
        totalApostadoresBanco++;

        // 7o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Mateus M. Cunha");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("16/12/1982");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95487-5993");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("MateusMelocunha@fleckens.com.br");
        int palpites_apostador_7[] = {2, 1, 1, 1, 0, 0, 2, 1, 1, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_7);
        totalApostadoresBanco++;

        // 8o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Giovana A. Pinto");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("24/03/1984");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 99386-3507");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("GiovanaAzevedoPinto@einrot.com.br");
        int palpites_apostador_8[] = {2, 1, 1, 1, 1, 0, 1, 1, 2, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_8);
        totalApostadoresBanco++;

        // 9o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Nicolash F. Rocha");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("14/10/1997");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 94230-8817");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("nicolashfernandesrocha@fleckens.com.br");
        int palpites_apostador_9[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_9);
        totalApostadoresBanco++;

        // 10o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Evelyn C. Correia");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("21/07/1959");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95412-5037");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("evelyncunhacorreia@armyspy.com.br");
        int palpites_apostador_10[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_10);
        totalApostadoresBanco++;

        // Adicionar os outros Apostadores solicitados a partir daqui
        // 11o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Erik Coelho Gama");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("16/07/1999");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 4636-4391");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("erik.j07@hotmail.com");
        int palpites_apostador_11[] = {1, 0, 2, 2, 1, 0, 1, 2, 0, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_11);
        totalApostadoresBanco++;

        // 12o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Igor George Alves");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("03/01/1994");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95485-3214");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("igorgeorge.a@hotmail.com");
        int palpites_apostador_12[] = {1, 0, 1, 2, 1, 0, 2, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_12);
        totalApostadoresBanco++;

        // 13o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Carlos Ivan Uemura");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("08/12/1993");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 94826-3557");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("uemurarodrigues@hotmail.com");
        int palpites_apostador_13[] = {0, 1, 0, 1, 2, 2, 0, 0, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_13);
        totalApostadoresBanco++;

        // 14o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Michael Douglas");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("11/02/1999");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95959-9579");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("doug12@hotmail.com");
        int palpites_apostador_14[] = {0, 0, 0, 1, 1, 2, 2, 0, 1, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_14);
        totalApostadoresBanco++;

        // 15o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Guilherme Paulo Ferreira");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("04/02/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 97137-7126");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("gui.ferreira.42@gmail.com");
        int palpites_apostador_15[] = {1, 2, 0, 1, 1, 2, 2, 1, 1, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_15);
        totalApostadoresBanco++;

        // 16o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Carlos Gabriel Mussato");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("27/02/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95959-9579");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("amanda_olv@hotmail.com.br");
        int palpites_apostador_16[] = {0, 0, 0, 1, 1, 2, 2, 0, 1, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_16);
        totalApostadoresBanco++;

        // 18o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Marcos Roberto do Santos");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/07/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 91598-3485");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("marcos.santos@hotmail.com");
        int palpites_apostador_18[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_18);
        totalApostadoresBanco++;

        // 19o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Dafne Lopes Calazans");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/07/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 91598-3485");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("dafne.lopes@hotmail.com");
        int palpites_apostador_19[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_19);
        totalApostadoresBanco++;

        // 20o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Leticia Macedo");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/08/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 99146-7532");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("leticia.macedo@hotmail.com");
        int palpites_apostador_20[] = {1, 0, 2, 1, 0, 2, 1, 0, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_20);
        totalApostadoresBanco++;
    }

    /**
     * Método msgPalpites()
     *
     * @param: palpites: vetor contendo os palpites do jogador com "0" coluna do
     * meio, "1" coluna 1" e "2" coluna 2.
     * @return: texto contendo os palpites formatados. Funcionalidade: monta
     * mensagem contendo os resultados dos palpites para um apostador.
     */
    public static String msgPalpites(int[] palpites) {
        int cont;
        String msg;
        msg = "";
        for (cont = 0; cont < Apostador.MAX_JOGOS; cont++) {
            if (palpites[cont] == 1) {
                msg = msg + "Jogo " + (cont + 1) + ": coluna 1\n";
            } else if (palpites[cont] == 0) {
                msg = msg + "Jogo " + (cont + 1) + ": coluna do meio\n";
            } else {
                msg = msg + "Jogo " + (cont + 1) + ": coluna 2\n";
            }
        }
        return msg;
    }

    /**
     * Método: apresentarApostadores()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresentar todos os
     * dados das Apostadors pré-cadastradas no banco de dados da empresa de
     * “Recursos Humanos e Relacionamentos Cruzeiro do Sul S.A” utilizando uma
     * interface para os dados de uma pessoa.
     */
    public static void apresentarApostadores() {
        int cont;
        for (cont = 0; cont < totalApostadoresBanco; cont++) {
            JOptionPane.showMessageDialog(null, (cont + 1) + "o Apostador\n\n"
                    + "nome______________: " + bancoApostadores[cont].getNome() + "\n"
                    + "data de nascimento___: " + bancoApostadores[cont].getDataDeNascimento() + "\n"
                    + "sexo biológico_______: " + bancoApostadores[cont].getSexoBiologico() + "\n"
                    + "telefone de contato___: " + bancoApostadores[cont].getTelefoneDeContato() + "\n"
                    + "e-mail de contato_____: " + bancoApostadores[cont].getEmailDeContato() + "\n"
                    + "Palpites_____________: \n" + msgPalpites(bancoApostadores[cont].getPalpites())
            );
        }
    }

    /**
     * Método: menuOpcoes()
     *
     * @param: lista de parâmetros inexistente.
     * @return: opcao válida selecionada pelo usuário do menu de 13 opções.
     * Funcionalidade: apresentar o menu de 13 opções ao usuário, obter a opção
     * selecionada, validar se opção existe e retornar o valor validado.
     */
    public static int menuOpcoes() {
        int opcao;  // opção selecionada pelo usuário do menu de opções
        // String que monta o conteúdo para o menu de opções
        String menu = "Menu de Opções da LotDigSul\n\n"
                + " 1 - Fornecer o Valor da Loteca\n"
                + " 2 - Cadastrar Resultados do Concurso\n"
                + " 3 - Cadastrar Apostas de Jogos\n"
                + " 4 - Apresentar Apostadores\n"
                + " 5 - Apresentar Valores (Total e Prêmios)\n"
                + " 6 - Apresentar Acertos\n"
                + " 7 - Apresentar Jogos Zerados\n"
                + " 8 - Apresentar Ganhadores 10 acertos\n"
                + " 9 - Apresentar Ganhadores 9 acertos\n"
                + "10 - Apresentar Percentual Sexo Biológico\n"
                + "11 - Apresentar Percentual Traço Marcante\n"
                + "12 - Apresentar Traço Ganhadores 10 acertos\n"
                + "13 - Limpar Resultados do Concurso\n"
                + "14 - Terminar Sistema\n\n"
                + "Informe a opcao desejada:";
        // Obtém a opção selecionada do menu pelo usuário 
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        // Caso a opção selecionada não seja válida informa mensagem,  
        // apresenta menu novamente e solicita nova opção
        while (opcao < 1 || opcao > 14) {
            JOptionPane.showMessageDialog(null, "Opção inválida!!!");
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
        return opcao;
    }

    /**
     * Método: cadastrarNovaApostador()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: cadastra os dados de um
     * apostador no banco. Necessário ler os dados (campos) de cada apostador,
     * UM A UM, por meio de JOptionPane.showInputDialog para cada campo e
     * inserir esses dados no banco da forma:
     * bancoApostadores[++totalApostadoresBanco] = new Apostador();
     * bancoApostadores[totalApostadoresBanco].setNome(
     * JOptionPane.showInputDialog("Forneça o nome da Apostador:") );
     */
    public static void cadastrarNovoApostador() {
        // Cria um espaço no vetor para mais um apostador se não ultrapassou o limite estabelecido
        if (totalApostadoresBanco < MAXIMO_APOSTADORES) {
            bancoApostadores[totalApostadoresBanco] = new Apostador();

            // Obtém o nome do Apostador
            bancoApostadores[totalApostadoresBanco].setNome(JOptionPane.showInputDialog("Forneça o nome do Apostador:"));

            // Obtém os outros campos - OS VALORES ABAIXO SÃO SOMENTE TESTE E DEVEM SER LIDOS
            // UM A UM.
            bancoApostadores[totalApostadoresBanco].setDataDeNascimento("21/07/1959");
            bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
            bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 95412-5037");
            bancoApostadores[totalApostadoresBanco].setEmailDeContato("evelyncunhacorreia@armyspy.com.br");
            int palpites_apostador[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
            bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador);

            // Um novo apostador foi cadastrado
            totalApostadoresBanco++;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Banco de Apostadores com limite excedido!");
        }
    }

    /**
     * Método: fornecerValorXDaLoteca()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void fornecerValorXDaLoteca() {
        //cadastra o valor da loteca, guardando na variavel valorDaLoteca
        valorDaLoteca = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da loteca!", "Valor Lotece", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "! VALOR DA LOTECA CADASTRADO !", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método: cadastrarResultadoConcurso()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void cadastrarResultadoConcurso() {
        //variavel criada para ser reutilizada no metodo limpar valores.
        resultadosCadastrado = true;
        //cadastra os resultados dos jogos, existe uma verificação que obrigada o jogador digitar apenas resultados válidos
        for (int i = 0; i < resultadoConcurso.length; i++) {
            int jogo = i + 1;
            int valorJogo = Integer.parseInt((JOptionPane.showInputDialog("Digite o resultado do Jogo " + jogo
                    + "\n\n 1-Para Time Mandante \n 0- Para Empate\n 2-Para Time Visitante")));

            if (valorJogo != 1 && valorJogo != 0 && valorJogo != 2) {
                JOptionPane.showMessageDialog(null, "Válidos apenas os números 1 - 0 - 2\n TENTE NOVAMENTE!", "VALOR ERRADO", JOptionPane.INFORMATION_MESSAGE);
                i = i - 1;
            } else {
                resultadoConcurso[i] = valorJogo;
            }
        }
        JOptionPane.showMessageDialog(null, "Resultados Cadastrados com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método: cadastrarApostasDeJogos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void cadastrarApostasDeJogos() {

        /*instancia da class apostador, estou utilizando os gatters e setters 
        disponibilizado pelo profressor para dar valor os atributos do professor.
         */
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Apostador", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE));
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento((JOptionPane.showInputDialog(null, "Digite a Data de Nascimento do Apostador no formato ##/##/##", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE)));
        bancoApostadores[totalApostadoresBanco].setSexoBiologico(JOptionPane.showInputDialog(null, "Digite sexo do Apostador H-Homem  M-Mulher", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE).charAt(0));
        bancoApostadores[totalApostadoresBanco].setEmailDeContato(JOptionPane.showInputDialog(null, "Digite o Email do Apostador", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE));
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato(JOptionPane.showInputDialog(null, "Digite o Telefone do Apostador ####-####", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE));
        int palpitesApostador[] = new int[10];

        /*Disponibiliza para o usuário o cadastramento dos palpites do novo jogador,
        novamene obrigado o usuário digitar apenas valores corretos.
         */
        for (int i = 0; i < palpitesApostador.length; i++) {
            int jogo = i + 1;
            int valorJogo = Integer.parseInt((JOptionPane.showInputDialog("Digite o resultado do Jogo " + jogo
                    + "\n\n 1-Para Time Mandante \n 0- Para Empate\n 2-Para Time Visitante")));

            if (valorJogo != 1 && valorJogo != 0 && valorJogo != 2) {
                JOptionPane.showMessageDialog(null, "Válidos apenas os números 1 - 0 - 2\n TENTE NOVAMENTE!", "VALOR ERRADO", JOptionPane.INFORMATION_MESSAGE);
                i = i - 1;
            } else {
                palpitesApostador[i] = valorJogo;
            }
        }
        //seta os palpites no vetor banco.
        bancoApostadores[totalApostadoresBanco].setPalpites(palpitesApostador);
        totalApostadoresBanco++;
        JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!!", "APOSTADOR CADASTRADO!!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método: apresentarValoresTotalEPremios()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarValoresTotalEPremios() {
        JOptionPane.showMessageDialog(null, "Valor da Loteca: " + valorDaLoteca, "", JOptionPane.INFORMATION_MESSAGE);
        //Divide o valor do concurso loteca de acordo com regra do professor.
        double quarenta = valorDaLoteca * 0.4;
        double setenta = quarenta * 0.7;
        double trinta = quarenta * 0.3;

        //Pega os acertos dos jogadores
        for (int i = 0; i < totalApostadoresBanco; i++) {
            int count = 0;
            int palpites[] = bancoApostadores[i].getPalpites();
            for (int j = 0; j < 10; j++) {
                if (resultadoConcurso[j] == palpites[j]) {
                    count++;
                }
            }
            totalDeAcertoPlayer[i] = count;
        }

        int count1 = 0;
        int count2 = 0;

        //
        for (int i = 0; i < totalApostadoresBanco; i++) {
            if (totalDeAcertoPlayer[i] == 9) {
                //JOptionPane.showMessageDialog(null, "!! ACERTOU TUDO !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i], "10 ACERTOS", JOptionPane.QUESTION_MESSAGE);
                count1++;
            } else if (totalDeAcertoPlayer[i] == 10) {
                //JOptionPane.showMessageDialog(null, "!! ACERTOU TUDO !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i], "10 ACERTOS", JOptionPane.QUESTION_MESSAGE);
                count2++;
            }
        }

        if (count1 == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Obteve os 9 Acertos!", "Nínguem Acertou 9!", JOptionPane.QUESTION_MESSAGE);
        }

        if (count2 == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Obteve os 10 Acertos!", "Nínguem Acertou 10!", JOptionPane.QUESTION_MESSAGE);
        }

        if (count1 == 0 && count2 == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Obteve os 10 ou 9 Acertos!", "Nínguem Acertou 10 ou 9!", JOptionPane.QUESTION_MESSAGE);
        } else {

            for (int i = 0; i < totalApostadoresBanco; i++) {
                if (totalDeAcertoPlayer[i] == 9) {
                    JOptionPane.showMessageDialog(null, "!! Teve 9 Acertos !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i] + "\nPrêmio: " + trinta / count1, "9 ACERTOS", JOptionPane.QUESTION_MESSAGE);

                } else if (totalDeAcertoPlayer[i] == 10) {
                    JOptionPane.showMessageDialog(null, "!! Teve 10 Acertos !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i] + "\nPrêmio: " + setenta / count2, "10 ACERTOS", JOptionPane.QUESTION_MESSAGE);
                }
            }
        }

    }

    /**
     * Método: apresentarAcertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarAcertos() {
        //Guarda no vetor palpites as apostas dos jogadores.
        for (int i = 0; i < totalApostadoresBanco; i++) {
            int count = 0;
            int palpites[] = bancoApostadores[i].getPalpites();
            for (int j = 0; j < 10; j++) {
                if (resultadoConcurso[j] == palpites[j]) {
                    count++;
                }
            }
            totalDeAcertoPlayer[i] = count;
        }
        // Mostra quantos acertos os apostadores tiveram.
        for (int i = 0; i < totalApostadoresBanco; i++) {
            JOptionPane.showMessageDialog(null, "Jogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i], "Resultado", JOptionPane.QUESTION_MESSAGE);
        }
    }

    /**
     * Método: apresentarJogosZerados()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarJogosZerados() {
        //Pega a quantidade de acertos de cada apostador.
        for (int i = 0; i < totalApostadoresBanco; i++) {
            int count = 0;
            int palpites[] = bancoApostadores[i].getPalpites();
            for (int j = 0; j < 10; j++) {
                if (resultadoConcurso[j] == palpites[j]) {
                    count++;
                }
            }
            totalDeAcertoPlayer[i] = count;
        }
        int count = 0;
        //Apresenta os jogadores que zeraram.
        for (int i = 0; i < totalApostadoresBanco; i++) {

            if (totalDeAcertoPlayer[i] == 0) {
                JOptionPane.showMessageDialog(null, "!!ZEROU !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i], "0 ACERTOS", JOptionPane.QUESTION_MESSAGE);
                count++;
            }
        }
        //Apresenta uma caixa de texto, se nenhum jogador zerar.
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Zerou!", "Nínguem Zerou!", JOptionPane.QUESTION_MESSAGE);
        }
    }

    /**
     * Método: apresentarGanhadores10Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarGanhadores10Acertos() {
        //Pega a quantidade de acertos de cada apostador.
        for (int i = 0; i < totalApostadoresBanco; i++) {
            int count = 0;
            int palpites[] = bancoApostadores[i].getPalpites();
            for (int j = 0; j < 10; j++) {
                if (resultadoConcurso[j] == palpites[j]) {
                    count++;
                }
            }
            totalDeAcertoPlayer[i] = count;
        }

        int count = 0;
        
        
        /* Pecorre o vetor Total totalApostadoresBanco e compara os resultados 
        utilizando o vetor totalDeAcertoPlayer, ambos utilziando a variavel/contador i
         */
        for (int i = 0; i < totalApostadoresBanco; i++) {
            if (totalDeAcertoPlayer[i] == 10) {
                JOptionPane.showMessageDialog(null, "!! ACERTOU TUDO !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i], "10 ACERTOS", JOptionPane.QUESTION_MESSAGE);
                count++;
            }
        }
        //verifica se todos o jogadores não acertaram 10;
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Obteve os 10 Acertos!", "Nínguem Acertou 10!", JOptionPane.QUESTION_MESSAGE);
        }
    }

    /**
     * Método: apresentarGanhadores9Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarGanhadores9Acertos() {
        //Pega os p
        for (int i = 0; i < totalApostadoresBanco; i++) {
            int count = 0;
            int palpites[] = bancoApostadores[i].getPalpites();
            for (int j = 0; j < 10; j++) {
                if (resultadoConcurso[j] == palpites[j]) {
                    count++;
                }
            }
            totalDeAcertoPlayer[i] = count;
        }

        int count = 0;

        for (int i = 0; i < totalApostadoresBanco; i++) {

            if (totalDeAcertoPlayer[i] == 9) {
                JOptionPane.showMessageDialog(null, "!! ACERTOU 9 !! \nJogador: " + bancoApostadores[i].getNome() + "\nAcertou: " + totalDeAcertoPlayer[i], "9 ACERTOS", JOptionPane.QUESTION_MESSAGE);
                count++;
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Obteve os 9 Acertos!", "Nínguem Acertou 9!", JOptionPane.QUESTION_MESSAGE);
        }
    }

    /**
     * Método: apresentarPercentualSexoBiologico()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarPercentualSexoBiologico() {
        int countM = 0;
        int countF = 0;
        float totalPessoas = 0;

        for (int i = 0; i < totalApostadoresBanco; i++) {
            String sexo = String.valueOf(bancoApostadores[i].getSexoBiologico());
            if (sexo.equals("H") || sexo.equals("h")) {
                countM++;
            } else if (sexo.equals("M") || sexo.equals("m")) {
                countF++;
            }
        }
        totalPessoas = countM + countF;

        String resultH = Float.toString(((countM * 100) / totalPessoas));
        String resultM = Float.toString(((countF * 100) / totalPessoas));

        JOptionPane.showMessageDialog(null, "Porcentagem de Homens: " + resultH.substring(0, 4) + "%", "Homens", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Porcentagem de Mulheres: " + resultM.substring(0, 4) + "%", "Mulheres", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Total de Apostadores: " + totalPessoas, "Total", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método: apresentarPercentualTracoMarcante()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarPercentualTracoMarcante() {
        //Matriz interna de traço marcante
        double[][] traco = new double[9][2];
        String msg = "";

        //Preencher Primeira coluna com os códigos dos traços marcantes.
        for (int i = 0; i < 9; i++) {
            traco[i][0] = i;
        }

        //Adicionar quantidade de pessoas com detemirnado traço na segunda coluna da matriz  "traco".
        for (int cont = 0; cont < totalApostadoresBanco; cont++) {
            switch (bancoApostadores[cont].tracoMarcantePersonalidade()) {
                case 0:
                    traco[0][1]++;
                    break;
                case 1:
                    traco[1][1]++;
                    break;
                case 2:
                    traco[2][1]++;
                    break;
                case 3:
                    traco[3][1]++;
                    break;
                case 4:
                    traco[4][1]++;
                    break;
                case 5:
                    traco[5][1]++;
                    break;
                case 6:
                    traco[6][1]++;
                    break;
                case 7:
                    traco[7][1]++;
                    break;
                case 8:
                    traco[8][1]++;
                    break;
            }
        }

        //ordenar a matriz em ordem crescente.
        for (int k = 0; k < traco.length; k++) {
            for (int j = k; j < traco.length; j++) {
                if (traco[k][1] > traco[j][1]) {
                    double[] vetorTemporario = traco[k];
                    traco[k] = traco[j];
                    traco[j] = vetorTemporario;
                }
            }
        }

        //armazenar a menssagem com os traços marcantes.
        for (int x = 0; x < 9; x++) {
            if (traco[x][0] == 0) {
                msg = msg + "Irresistível: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 1) {
                msg = msg + "Impetuoso: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 2) {
                msg = msg + "Discreto: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 3) {
                msg = msg + "Amoroso: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 4) {
                msg = msg + "Tímido: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 5) {
                msg = msg + "Paquerador: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 6) {
                msg = msg + "Estudioso: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 7) {
                msg = msg + "Sonhador: " + traco[x][1] + "%\n";
            } else if (traco[x][0] == 8) {
                msg = msg + "Charmoso: " + traco[x][1] + "%\n";
            }
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    //}

    /**
     * Método: apresentarTracoGanhadores10Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarTracoGanhadores10Acertos() {
        //pegar as apostas do jogadores
        for (int i = 0; i < totalApostadoresBanco; i++) {
            int count = 0;
            int palpites[] = bancoApostadores[i].getPalpites();
            for (int j = 0; j < 10; j++) {
                if (resultadoConcurso[j] == palpites[j]) {
                    count++;
                }
            }
            totalDeAcertoPlayer[i] = count;
        }

        int count = 0;
        int soma;
        int ganhadores10Acertos = 0;
        //pegar quantidade de jogadores com 10 acertos
        for (int i = 0; i < totalApostadoresBanco; i++) {
            if (totalDeAcertoPlayer[i] == 10) {
                ganhadores10Acertos++;
            }
        }

        //verificar se existe jogadores com 10 acertos
        if (ganhadores10Acertos != 0) {
            double[][] traco = new double[9][2];
            String msg = "";

            //Preencher Primeira coluna com os códigos dos traços marcantes.
            for (int i = 0; i < 9; i++) {
                traco[i][0] = i;
            }

            //Adicionar quantidade de pessoas com detemirnado traço na segunda coluna da matriz  "traco".
            for (int cont = 0; cont < ganhadores10Acertos; cont++) {
                switch (bancoApostadores[cont].tracoMarcantePersonalidade()) {
                    case 0:
                        traco[0][1]++;
                        break;
                    case 1:
                        traco[1][1]++;
                        break;
                    case 2:
                        traco[2][1]++;
                        break;
                    case 3:
                        traco[3][1]++;
                        break;
                    case 4:
                        traco[4][1]++;
                        break;
                    case 5:
                        traco[5][1]++;
                        break;
                    case 6:
                        traco[6][1]++;
                        break;
                    case 7:
                        traco[7][1]++;
                        break;
                    case 8:
                        traco[8][1]++;
                        break;
                }
            }

            //ordenar a matriz em ordem decrescente.
            for (int k = 0; k < traco.length; k++) {
                for (int j = k; j < traco.length; j++) {
                    if (traco[k][1] < traco[j][1]) {
                        double[] vetorTemporario = traco[k];
                        traco[k] = traco[j];
                        traco[j] = vetorTemporario;
                    }
                }
            }

            //armazenar a menssagem com os traços marcantes.
            for (int x = 0; x < 9; x++) {
                if (traco[x][0] == 0) {
                    msg = msg + "Irresistível: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 1) {
                    msg = msg + "Impetuoso: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 2) {
                    msg = msg + "Discreto: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 3) {
                    msg = msg + "Amoroso: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 4) {
                    msg = msg + "Tímido: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 5) {
                    msg = msg + "Paquerador: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 6) {
                    msg = msg + "Estudioso: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 7) {
                    msg = msg + "Sonhador: " + traco[x][1] + "%\n";
                } else if (traco[x][0] == 8) {
                    msg = msg + "Charmoso: " + traco[x][1] + "%\n";
                }
            }
            JOptionPane.showMessageDialog(null, msg);
        }

        if (ganhadores10Acertos == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Jogador Obteve os 10 Acertos!", "Nínguem Acertou 10!", JOptionPane.QUESTION_MESSAGE);
        }
    }

    /**
     * Método: limparResultadosDoConcurso()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void limparResultadosDoConcurso() {
        if (!resultadosCadastrado) {
            JOptionPane.showMessageDialog(null, "Os Resultados não foram Cadastrados!", "Resultados não Cadastrados!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (int i = 0; i < resultadoConcurso.length; i++) {
                resultadoConcurso[i] = -1;
            }
            JOptionPane.showMessageDialog(null, "O Resultado do Concurso Loteca foram ZERADOS!", "RESULTADO ZERADO", JOptionPane.INFORMATION_MESSAGE);

            resultadosCadastrado = false;
        }

    }

    /**
     * Método: verificarTerminoDoSistema()
     *
     * @param: lista de parâmetros inexistente.
     * @return: resposta com a informação de término ou não do sistema.
     * Funcionalidade: verifica se o usuário deseja realmente finalizar o
     * sistema. Se sim, retorna a constante TERMINA_SISTEMA, caso contrário,
     * retorna a constante NAO_TERMINA_SISTEMA.
     */
    public static int verificarTerminoDoSistema() {
        int resposta
                = JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar o sistema?",
                        "Finalizar Sistema",
                        JOptionPane.YES_NO_OPTION);

        // Se resposta fornecida for igual a YES
        if (resposta == JOptionPane.YES_OPTION) {
            return TERMINA_SISTEMA;
        } else {
            return NAO_TERMINA_SISTEMA;
        }
    }

    /**
     * Método: main()
     *
     * @param: String [] args: vetor de argumentos fornecidos na linha de
     * comando durante a chamada do sistema.
     * @return: nenhum valor de retorno. Funcionalidades: carrega o banco de
     * dados de pessoas pré-cadastradas da empresa apresentar o menu de 13
     * opções e chamar os módulos correspondentes a cada uma.
     */
    public static void main(String[] args) {

        int opcao; // recebe a opção do menu selecionada pelo usuário
        // Carrega o banco de dados de pessoas pré-cadastradas da empresa
        carregarBanco();
        // Inicia opção com NAO_TERMINA_SISTEMA
        // Estratégia utilizada somente para apresentar pela 1a vez o menu de opções
        // do RHRSis e continuar a exibir enquanto o usuário desejar continuar a usá-lo
        opcao = NAO_TERMINA_SISTEMA;

        // Verifica se o usuário realmente deseja terminar de executar o sistema
        while (opcao != TERMINA_SISTEMA) {

            switch (menuOpcoes()) {
                // 1 - fornecer valor da X da loteca
                case 1:
                    fornecerValorXDaLoteca();
                    break;

                // 2 - cadastrar resultado do concurso
                case 2:
                    cadastrarResultadoConcurso();
                    break;

                // 3 - Cadastrar Apostas de Jogos 
                case 3:
                    cadastrarApostasDeJogos();
                    break;

                // 4 - Apresentar Apostadores (implementado)
                case 4:
                    apresentarApostadores();
                    break;

                // 5 - Apresentar Valores (Total e Prêmios)	
                case 5:
                    apresentarValoresTotalEPremios();
                    break;

                // 6 - Apresentar Acertos
                case 6:
                    apresentarAcertos();
                    break;

                // 7 - Apresentar Jogos Zerados
                case 7:
                    apresentarJogosZerados();
                    break;

                // 8 - Apresentar Ganhadores 10 acertos
                case 8:
                    apresentarGanhadores10Acertos();
                    break;

                // 9 - Apresentar Ganhadores 9 acertos 
                case 9:
                    apresentarGanhadores9Acertos();
                    break;

                // 10 - Apresentar Percentual Sexo Biológico
                case 10:
                    apresentarPercentualSexoBiologico();
                    break;

                // 11 - Apresentar Percentual Traço Marcante
                case 11:
                    apresentarPercentualTracoMarcante();
                    break;

                // 12 - Apresentar Traço Ganhadores 10 acertos.
                case 12:
                    apresentarTracoGanhadores10Acertos();
                    break;

                // 13 - Limpar Resultados do Concurso.
                case 13:
                    limparResultadosDoConcurso();
                    break;

                // 14 - verifica se o usuário deseja realmente finalizar o sistema.
                //      Se sim, retorna a constante TERMINA_SISTEMA, caso contrário,
                //      retorna a constante NAO_TERMINA_SISTEMA. (Implementado)
                case 14:
                    opcao = verificarTerminoDoSistema();
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Obrigado por utilizar a Loteca Digital Simplificada!\n\n"
                + "Desenvolvedor(es):\n"
                + "Carlos Ivan Uemura Rodrigues	RGM: 1947485-7\n"
                + "Erik Coelho Gama RGM: 1947384-2\n"
                + "Michael Douglas RGM: 1908513-3\n"
                + "Igor George Alves RGM: 1948524-7");
        System.exit(0);
    }
}
