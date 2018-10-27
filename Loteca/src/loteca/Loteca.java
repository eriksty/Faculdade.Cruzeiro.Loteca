/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan Carlos Alcântara de Oliveira
 * @author INSERIR AQUI OS NOMES DOS COMPONENTES DO GRUPO com seus Registros de
 * Matrícula (um por linha)
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
        valorDaLoteca = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da loteca!", "valor", JOptionPane.QUESTION_MESSAGE));
        /*JOptionPane.showMessageDialog(null, 
			  "Lógica do Método em Java\n\n"
                                  + "fornecerValorXDaLoteca()\n\n"
                                  + "deve ser desenvolvido.");  
         */
    }

    /**
     * Método: cadastrarResultadoConcurso()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void cadastrarResultadoConcurso() {
        for (int i = 0; i < resultadoConcurso.length; i++) {
            int jogo = i + 1;
            int valorJogo = Integer.parseInt((JOptionPane.showInputDialog("Digite o resultado do Jogo " + jogo
                    + "\n\n 1-Para Time Mandante \n 0- Para Empate\n 3-Para Time Visitante")));

            if (valorJogo != 1 && valorJogo != 0 && valorJogo != 2) {
                JOptionPane.showMessageDialog(null, "Válidos apenas os números 1 - 0 - 2\n TENTE NOVAMENTE!", "VALOR ERRADO", JOptionPane.INFORMATION_MESSAGE);
                i = i - 1;
            } else {
                resultadoConcurso[i] = valorJogo;
            }
        }
    }

    /**
     * Método: cadastrarApostasDeJogos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void cadastrarApostasDeJogos() {
        Apostador apostador = new Apostador();

        apostador.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Apostador", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE));
        apostador.setDataDeNascimento((JOptionPane.showInputDialog(null, "Digite a Data de Nascimento do Apostador no formato ##/##/##", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE)));
        apostador.setSexoBiologico(JOptionPane.showInputDialog(null, "Digite sexo do Apostador M-Masculino F-Feminino", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE).charAt(0));
        apostador.setEmailDeContato(JOptionPane.showInputDialog(null, "Digite o Email do Apostador", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE));
        apostador.setTelefoneDeContato(JOptionPane.showInputDialog(null, "Digite o Telefone do Apostador ####-####", "Cadastro do Apostador", JOptionPane.QUESTION_MESSAGE));

        int palpitesApostador[] = new int[10];

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
        apostador.setPalpites(palpitesApostador);

        bancoApostadores[totalApostadoresBanco] = apostador;
        totalApostadoresBanco++;
        JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO!!","APOSTADOR CADASTRADO!!",JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método: apresentarValoresTotalEPremios()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarValoresTotalEPremios() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarValoresTotalEPremios()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarAcertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarAcertos() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarAcertos()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarJogosZerados()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarJogosZerados() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarJogosZerados()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarGanhadores10Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarGanhadores10Acertos() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarGanhadores10Acertos()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarGanhadores9Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarGanhadores9Acertos() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarGanhadores9Acertos()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarPercentualSexoBiologico()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarPercentualSexoBiologico() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarPercentualSexoBiologico()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarPercentualTracoMarcante()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarPercentualTracoMarcante() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarPercentualTracoMarcante()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: apresentarTracoGanhadores10Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void apresentarTracoGanhadores10Acertos() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "apresentarTracoGanhadores10Acertos()\n\n"
                + "deve ser desenvolvido.");
    }

    /**
     * Método: limparResultadosDoConcurso()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: DESCREVER.
     */
    public static void limparResultadosDoConcurso() {
        JOptionPane.showMessageDialog(null,
                "Lógica do Método em Java\n\n"
                + "limparResultadosDoConcurso()\n\n"
                + "deve ser desenvolvido.");
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
                + "NOMES + RGMs dos componentes do grupo em ordem alfabética.");
        System.exit(0);
    }
}
