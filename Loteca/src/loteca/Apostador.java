/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteca;

import javax.swing.JOptionPane;

/**
 * Esta classe representa um Apostador com os dados: nome da Pessoa, idade, sexo
 * biológico, data de nascimento, telefone de contato, e-mail de contato,
 * palpites.
 *
 * @author Ivan Carlos Alcântara de Oliveira
 * @author INSERIR AQUI OS NOMES DOS COMPONENTES DO GRUPO com seus Registros de
 * Matrícula
 * @version 0.5, 17/10/2018
 */
public class Apostador {

    public static int MAX_JOGOS = 10;  // Constante Máximo de Jogos
    public String nome;  //  Nome do jogador 
    public String CPF;   //  CPF do jogador
    private char sexoBiologico; // com os valores possíveis “M” para mulher e “H” para homens.
    private String dataDeNascimento; // no formato: dia/mês/ano, onde dia e mês possui 2 caracteres e ano 4 caracteres.
    private String telefoneDeContato; // no formato (99) 99999-9999.
    private String emailDeContato; // no formato: identificacao@enderecodoprovedor.
    // Palpites do jogador para cada um dos jogos 
    // O valor: 1 - indica coluna um, 0 - indica coluna do meio e 2 - representa coluna dois
    public int palpites[] = new int[MAX_JOGOS];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(char sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefoneDeContato() {
        return telefoneDeContato;
    }

    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public String getEmailDeContato() {
        return emailDeContato;
    }

    public void setEmailDeContato(String emailDeContato) {
        this.emailDeContato = emailDeContato;
    }

    public void setPalpites(int palpites[]) {
        this.palpites = palpites;
    }

    public int[] getPalpites() {
        return palpites;
    }

    /**
     * Método: nomeSexoBiologico()
     *
     * @param: lista de parâmetros inexistente.
     * @return: o retorno é uma cadeia contendo o nome do sexo biológico da
     * pessoa. Funcionalidade: baseado na sigla do sexoBiologico retorna o nome
     * correspondente a sigla 'H': Homem ou 'M': Mulher.
     */
    public String nomeSexoBiologico() {
        switch (sexoBiologico) {
            case 'H':
                return "Homem";
            case 'M':
                return "Mulher";
            default:
                return "Valor Incorreto";
        }
    }

    /**
     * Método: tracoMarcatePersonalidade()
     *
     * @return
     * @param: lista de parâmetros inexistente.
     * @return: o retorno é um valor numérico entre 0 e 8 correspondente ao
     * traco marcante de personalidade. Funcionalidade: baseado na
     * dataNascimento calcula o traco marcante de personalidade, identificado
     * pelo valor numérico 0: Irresistível, 1: Impetuoso, 2: Discreto, 3:
     * Amoroso, 4: Tímico,5: Paquerador, 6: Estudioso, 7: Sonhador, 8: Charmoso.
     */
    public int tracoMarcantePersonalidade() {
        int z = 0;
        int resto = 0;

        int diaNascimento = Integer.parseInt(dataDeNascimento.substring(0, 2));
        int mesNascimento = Integer.parseInt(dataDeNascimento.substring(3, 5));
        int anoNascimento = Integer.parseInt(dataDeNascimento.substring(6, 10));
        /*JOptionPane.showMessageDialog(null, dataDeNascimento + " " + anoNascimento + " " + mesNascimento + " " + diaNascimento);*/
        // O código para obter o traço marcante de personalidade deve ser desenvolvido aqui
        z = diaNascimento % 10 + diaNascimento / 10;
        z += mesNascimento % 10;
        z += mesNascimento / 10;

        z += anoNascimento / 1000;
        resto = anoNascimento % 1000;

        z += resto / 100;
        resto = resto % 100;

        z += resto / 10;
        resto = resto % 10;

        z += resto;

        return z % 9; // o valor Z do traço marcante deve ser retornado aqui e substituir o 0.
    }
}
