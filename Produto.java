import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    /*
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

    private Integer preco;

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    private Data DataValidade;

    public Data getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        DataValidade = dataValidade;
    }

    /*
     * Método Construtor: crie 1 construtor que um recebe parâmetros para
     * inicializar todos os atributos.
     */
    public Produto(String nome, Integer preco, Data dataValidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDataValidade(dataValidade);
    }

    /*
     * Método toString: se necessário, pesquise sobre o método toString e
     * implemente-o nesta classe, retornando uma String formatada da forma que você
     * desejar, desde que contenha as informações de todos os atributos da classe.
     */
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + ", ");
        conteudo.append("Preço: " + this.getPreco() + ", ");

        // Na classe Produto, atualize o método toString incluindo a informação
        // acrescentada na etapa 2, para retornar também a data de validade (do tipo
        // Data).
        conteudo.append("Data Validade: " + this.getDataValidade().toString());

        return conteudo.toString();
    }

    /*
     * Na classe Produto, crie um método chamado estaVencido, que recebe uma data
     * por parâmetro (objeto do tipo Data) e retorna verdadeiro caso o produto
     * esteja vencido em relação a esta data ou falso caso contrário.
     */
    public boolean estaVencido(Data data) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date d1 = simpleDateFormat.parse(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
            Date d2 = simpleDateFormat.parse(this.DataValidade.getDia() + "/" + this.DataValidade.getMes() + "/"
                    + this.DataValidade.getAno());

            return d1.compareTo(d2) > 0;
        } catch (Exception e) {
            return true;
        }

    }

    public static void main(String[] args) {
        Produto produto = new Produto("Coca-Cola", 5, new Data(25, 10, 2000));

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(produto.toString());
    }

}
