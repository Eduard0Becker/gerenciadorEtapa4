/*
 * Crie uma classe chamada Alimentacao, que é um tipo de loja, representando uma
 * loja de alimentação. As lojas de alimentação possuem como atributo (além de
 * tudo que uma Loja tem) um valor do tipo Data chamado dataAlvara, que indica a
 * data que a loja de alimentação recebeu o alvará de funcionamento. Crie um
 * construtor para a classe, que receba informações para inicializar todos os
 * atributos. Além disso, crie os métodos de acesso dos atributos (os métodos
 * que ainda não existem) e sobrescreva o método toString, incluindo a
 * informação específica da classe.
 */
public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Construtores
    public Alimentacao(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Data dataAlvara,
            Integer quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
        this.setDataAlvara(dataAlvara);
    }

    public Alimentacao(
            String nome,
            Integer quantidadeFuncionarios,
            Endereco endereco,
            Data dataDeFundacao,
            Data dataAlvara) {
        super(nome, quantidadeFuncionarios, endereco, dataDeFundacao, quantidadeFuncionarios);
        this.setDataAlvara(dataAlvara);
    }

    // Sobrescrevendo metodos
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
        conteudo.append("Gastos com Salario: " + this.gastosComSalario() + "\n" );
        conteudo.append("Data Alvara: " + this.getDataAlvara() + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");

        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        return conteudo.toString();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Voluntarios da Patria", "Porto Alegre", "RS", "Brasil", "(94828-760)", "188", "6");
        Data data1 = new Data(28, 10, 2023);
        Data data2 = new Data(28, 10, 2025);

       Alimentacao Alimentacao1 = new Alimentacao("Bobs", 22, 1200, endereco, data1, data2, 100);

        // quantidadeFuncionarios
        // salarioBaseFuncionario

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(Alimentacao1.toString());
    }
}