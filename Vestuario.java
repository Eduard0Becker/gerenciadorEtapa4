/*
 * Crie uma classe chamada Vestuario, que é um tipo de loja, representando uma
 * loja de vestuário. As lojas de vestuários possuem como atributo (além de tudo
 * que uma Loja tem) um valor booleano chamado produtosImportados. Este atributo
 * indica se a loja de vestuário vende roupas importadas ou não. Crie um
 * construtor para a classe, que receba informações para inicializar todos os
 * atributos. Além disso, crie os métodos de acesso dos atributos (os métodos
 * que ainda não existem) e sobrescreva o método toString, incluindo a
 * informação específica da classe.
 */
public class Vestuario extends Loja {
    private Boolean produtosImportados;

    public Boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(Boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Construtores
    public Vestuario(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Boolean produtosImportados,
            Integer quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
        this.setProdutosImportados(produtosImportados);
    }

    public Vestuario(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeFuncionarios);
        this.setProdutosImportados(produtosImportados);
    }

    // Sobrescrevendo metodos
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
        conteudo.append("Gastos com Salario:" + this.gastosComSalario() + "\n");
        conteudo.append("Produtos importados: " + (this.getProdutosImportados() ? "Sim" : "Não") + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");

        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        return conteudo.toString();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Voluntarios da Patria", "Porto Alegre", "RS", "Brasil", "(94828-760)", "188", "9");
        Data data = new Data(28, 10, 2023);

        Vestuario Vestuario1 = new Vestuario("GasPop", 34, 2000, endereco, data, true, 10000);
        
        // quantidadeFuncionarios
        // salarioBaseFuncionario

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(Vestuario1.toString());
    }
}