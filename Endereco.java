public class Endereco {
    /*
     * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos
     * os atributos da classe.
     */
    private String nomeDaRua;

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    private String cidade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private String complemento;

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /*
     * Método Construtor: crie 1 construtor que um recebe parâmetros para
     * inicializar todos os atributos.
     */
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero,
            String complemento) {
        this.setNomeDaRua(nomeDaRua);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setCep(cep);
        this.setNumero(numero);
        this.setComplemento(complemento);
    }

    /*
     * Método toString: se necessário, pesquise sobre o método toString e
     * implemente-o nesta classe, retornando uma String formatada da forma que você
     * desejar, desde que contenha as informações de todos os atributos da classe.
     */
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Rua: " + getNomeDaRua() + ",");
        conteudo.append("Cidade: " + getCidade() + ",");
        conteudo.append("Estado: " + getEstado() + ",");
        conteudo.append("Pais: " + getPais() + ",");
        conteudo.append("Cep: " + getCep() + ",");
        conteudo.append("Numero: " + getNumero() + ",");
        conteudo.append("Complemento: " + getComplemento() + ",");

        return conteudo.toString();
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua dos Bobos", "São Paulo", "SP", "Brasil", "00000-000", "0", "0");

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(endereco.toString());
    }
}