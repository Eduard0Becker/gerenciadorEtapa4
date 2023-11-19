/*
 * Crie uma classe chamada Informatica, que é um tipo de loja, representando uma
 * loja de informática. As lojas de informática possuem como atributos (além de
 * tudo que uma Loja tem) um valor do tipo double chamado seguroEletronicos, que
 * representa um seguro que lojas que vendem aparelhos eletrônicos devem pagar
 * mensalmente. Crie um construtor para a classe, que receba informações para
 * inicializar todos os atributos. Além disso, crie os métodos de acesso dos
 * atributos (os métodos que ainda não existem) e sobrescreva o método toString,
 * incluindo a informação específica da classe.
 */
public class Informatica extends Loja {
    private Double seguroEletronicos;

    public Double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(Double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Construtores
    public Informatica(
        String nome,
        Integer quantidadeFuncionarios,
        Integer salarioBaseFuncionario,
        Endereco endereco,
        Data dataDeFundacao,
        Double seguroEletronicos,
        Integer quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeMaximaProdutos);
        this.setSeguroEletronicos(seguroEletronicos);
    }

    public Informatica(
        String nome,
        Integer quantidadeFuncionarios,
        Endereco endereco,
        Data dataDeFundacao,
        Double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, quantidadeFuncionarios, endereco, dataDeFundacao);
   }

    // Sobrescrevendo metodos
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
         conteudo.append("Gastos com Salario:" + this.gastosComSalario() + "\n");
        conteudo.append("Seguro Eletronicos: " + this.getSeguroEletronicos() + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");

        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        return conteudo.toString();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Voluntarios da Patria", "Porto Alegre", "RS", "Brasil", "(94828-760)", "188", "9");
        Data data = new Data(28, 10, 2023);

       Informatica Informatica1 = new Informatica("Dino PC", 8, 2500, endereco, data, 800.0, 230);
        
        

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(Informatica1.toString());
    }

    public void setSeguroEletronicos(int i) {
    }

    
    
}