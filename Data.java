import java.text.SimpleDateFormat;

public class Data {
    /*
     * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos
     * os atributos da classe.
     */
    private Integer dia;

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    private Integer mes;

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    private Integer ano;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /*
     * Método toString: se necessário, pesquise sobre o método toString e
     * implemente-o nesta classe, retornando uma String que representa a data no
     * formato dia/mês/ano.
     */
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append(this.getDia())
                .append("/")
                .append(this.getMes())
                .append("/")
                .append(this.getAno());

        return conteudo.toString();
    }

    /*
     * Método Construtor: crie 1 construtor que um recebe parâmetros para
     * inicializar todos os atributos. Neste construtor, você deve validar a data
     * informada nos parâmetros. Ou seja, o método construtor deve verificar se o
     * dia é condizente com o mês, levando em conta, também, o fato de o ano poder
     * ser bissexto. Por exemplo, o dia 29 para o mês 2 só pode ser atribuído em
     * anos bissextos. Caso a data seja inválida, o método construtor deve imprimir
     * uma mensagem de erro e alterar a data para a seguinte data padrão: 1/1/2000.
     */
    public Data(Integer dia, Integer mes, Integer ano) {
        try {
            // Valida se a data informada é uma data válida
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(dia + "/" + mes + "/" + ano);

            this.setDia(dia);
            this.setMes(mes);
            this.setAno(ano);
        } catch (Exception e) {
            System.out.println("A data informada é inválida!");

            this.setDia(1);
            this.setMes(1);
            this.setAno(2000);
        }

    }

    /*
     * Método verificaAnoBissexto: este método não recebe parâmetros e retorna
     * verdadeiro caso o ano seja bissexto e falso caso contrário.
     */
    public boolean verificaAnoBissexto() {
        return this.getAno() % 4 == 0;
    }

    public static void main(String[] args) {
        Data data1 = new Data(13, 03, 1992);
        Data data2 = new Data(13, 03, 1993);
        Data data3 = new Data(31, 13, 2023);

        // quantidadeFuncionarios
        // salarioBaseFuncionario

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(data1.verificaAnoBissexto());
        System.out.println(data2.verificaAnoBissexto());
        System.out.println(data3.getAno());
    }
}