/*
 * Crie uma classe chamada Bijuteria, que é um tipo de loja, representando uma
 * loja de bijuteria. As lojas de bijuteria possuem como atributo (além de tudo
 * que uma Loja tem) um double chamado metaVendas, que representa a meta de
 * vendas mensais desta loja. Crie um construtor para a classe, que receba
 * informações para inicializar todos os atributos. Além disso, crie os métodos
 * de acesso dos atributos (os métodos que ainda não existem) e sobrescreva o
 * método toString, incluindo a informação específica da classe.
 */
public class Bijuteria extends Loja {
    private Double metaVendas;

    public Double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(Double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Construtores
    public Bijuteria(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Double metaVendas,
            Integer quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
        this.setMetaVendas(metaVendas);
    }

    public Bijuteria(
            String nome,
            Integer quantidadeFuncionarios,
            Endereco endereco,
            Data dataDeFundacao,
            Double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, quantidadeFuncionarios);
        this.setMetaVendas(metaVendas);
    }

    // Sobrescrevendo metodos
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
        conteudo.append("Gastos com Salario:" + this.gastosComSalario() + "\n");
        conteudo.append("Meta de Vendas: " + this.getMetaVendas() + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");


        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        return conteudo.toString();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Voluntarios da Patria", "Porto Alegre", "RS", "Brasil", "(94828-760)", "188", "5");
        Data data = new Data(28, 10, 2023);

        Bijuteria Bijuteria1 = new Bijuteria("3A", 6, 1455, endereco, data, 20000.0, 4000);

        // quantidadeFuncionarios
        // salarioBaseFuncionario

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(Bijuteria1.toString());
    }

    public void setMetaVendas(int i) {
    }
}