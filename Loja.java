public class Loja {
    /**
     * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos
     * os atributos da classe.
     */
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Integer quantidadeFuncionarios;

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    protected Integer salarioBaseFuncionario = -1;

    public Integer getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(Integer salarioBaseFuncionario2) {
        this.salarioBaseFuncionario = salarioBaseFuncionario2;
    }

    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Data dataFundacao;

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataDeFundacao;
    }

    private Produto[] estoqueProdutos;

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    /**
     * Métodos Construtores: crie 2 construtores para a classe, sendo que um recebe
     * parâmetros para inicializar todos os atributos e outro recebe apenas valores
     * para inicializar o nome e a quantidade de funcionários, colocando -1 no
     * salário base dos funcionários.
     */
    public Loja(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Integer quantidadeMaximaProdutos) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(salarioBaseFuncionario);
        this.setEndereco(endereco);
        this.setDataFundacao(dataDeFundacao);

        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(
            String nome,
            Integer quantidadeFuncionarios,
            Endereco endereco,
            Data dataDeFundacao,
            Integer quantidadeMaximaProdutos) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setEndereco(endereco);
        this.setDataFundacao(dataDeFundacao);

        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(String nome2, Integer quantidadeFuncionarios2, Integer salarioBaseFuncionario2, Endereco endereco,
            Data dataDeFundacao) {
    }

    /*
     * Método toString: se necessário, pesquise sobre o método toString e
     * implemente-o nesta classe, retornando uma String formatada da forma que você
     * desejar, desde que contenha as informações de todos os atributos da classe.
     */
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
        conteudo.append("Gastos Com Salarios:" + this.gastosComSalario() + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");
        // Na classe Loja, atualize o métodotoString incluindo a informação acrescentada
        // na etapa 2, para retornar também o endereço (do tipo Endereco) e a data de
        // fundação (do tipo Data)
        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] != null)
                conteudo.append("Produto " + i + ": " + this.estoqueProdutos[i].toString() + "\n");
        }

        return conteudo.toString();
    }

    /*
     * Método gastosComSalario: este método não recebe parâmetros e retorna quanto a
     * loja gasta com o salário de todos os seus funcionários. Atente para o fato de
     * que não é possível realizar este cálculo caso o valor do salário base seja
     * -1. Neste caso, não realize o cálculo e retorne -1.
     */
    public Integer gastosComSalario() {
        if (this.salarioBaseFuncionario == -1)
            return -1;

        return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
    }

    /*
     * Método tamanhoDaLoja: este método não recebe parâmetros e retorna um dos
     * seguintes caracteres: ‘P’, caso a loja possua menos de 10 funcionários; ‘M’,
     * caso a loja possua entre 10 (inclusive) e 30 (inclusive) funcionários; ou
     * ‘G’, caso a loja possua mais do que 31 (inclusive) funcionários.
     */
    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios < 10)
            return 'P';

        if (this.quantidadeFuncionarios <= 30)
            return 'M';

        return 'G';
    }

    /*
     * imprimeProdutos: este método não recebe parâmetros e imprime a informação de
     * todos os produtos da loja.
     */
    public void imprimeProdutos() {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            System.out.println("Produto " + i + ": " + this.estoqueProdutos[i].toString());
        }
    }

    /*
     * insereProduto: este método recebe um Produto por parâmetro e insere-o na
     * primeira posição livre do array de estoque desta loja (ou seja, na primeira
     * posição nula do array). O método deve retornar verdadeiro caso o produto seja
     * inserido no estoque ou falso caso não, seja (no caso de não haver espaço).
     */
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }

        return false;
    }

    /*
     * removeProduto: este método recebe uma String que representa o nome de um
     * produto e remove o produto correspondente do estoque. O método retorna
     * verdadeiro caso o produto tenha sido removido e falso caso contrário (caso
     * não haja o produto solicitado no estoque).
     */
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i].getNome().equals(nomeProduto)) {
                this.estoqueProdutos[i] = null;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Dos Andradas", "Porto Alegre", "RS", "Brasil", "94828-760", "188", "0");
        Data data = new Data(28, 10, 2023);

        Loja loja1 = new Loja("Loja 1", 5, 1200, endereco, data, 5);
        loja1.insereProduto(new Produto("Produto 1", 50, data));
        loja1.insereProduto(new Produto("Produto 2", 40, data));
        loja1.insereProduto(new Produto("Produto 3", 30, data));
        loja1.insereProduto(new Produto("Produto 4", 20, data));
        loja1.insereProduto(new Produto("Produto 5", 10, data));

        // quantidadeFuncionarios
        // salarioBaseFuncionario

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(loja1.toString());

    }

    public Object getTipo() {
        return null;
    }

}