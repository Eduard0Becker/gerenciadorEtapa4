/*
 * Crie uma classe chamada Cosmetico, que é um tipo de loja, representando uma
 * loja de cosméticos. As lojas de cosméticos possuem o atributo
 * taxaComercializacao, do tipo double (além de tudo que uma Loja tem). Esta
 * taxa é aplicada para as lojas que comercializam produtos de beleza. Crie um
 * construtor para a classe, que receba informações para inicializar todos os
 * atributos. Além disso, crie os métodos de acesso dos atributos (os métodos
 * que ainda não existem) e sobrescreva o método toString, incluindo a
 * informação específica da classe.
 */
public class Cosmetico extends Loja {
    private Double taxaComercializacao;

    public Double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(Double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Construtores
    public Cosmetico(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Double taxaComercializacao,
            Integer quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
        this.setTaxaComercializacao(taxaComercializacao);
    }

    public Cosmetico(
            String nome,
            Integer quantidadeFuncionarios,
            Endereco endereco,
            Data dataDeFundacao,
            Double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, quantidadeFuncionarios);
        this.setTaxaComercializacao(taxaComercializacao);
    }

    // Sobrescrevendo metodos
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
        conteudo.append("Gastos com Salario:" + this.gastosComSalario() + "\n");
        conteudo.append("Taxa Comercialização: " + this.getTaxaComercializacao() + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");


        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        return conteudo.toString();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Voluntarios da Patria", "Porto Alegre", "RS", "Brasil", "94828-760", "188", "4");
        Data data = new Data(28, 10, 2023);
       
    
        Cosmetico cosmetico1 = new Cosmetico("Beth MM", 6, 1340, endereco, data, 50.0, 2009);

        // quantidadeFuncionarios
        // salarioBaseFuncionario

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(cosmetico1.toString());
    }
}