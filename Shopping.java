public class Shopping {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Loja[] lojas;

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Métodos de acesso

    // Método toString
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("TODO: Implementar método toString() de Shopping.java");

        return conteudo.toString();
    }

    // Método para inserir uma loja no array
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    // Método para remover uma loja pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Método para obter a quantidade de lojas por tipo
    public int quantidadeLojasPorTipo(String tipo) {
        int quantidade = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getTipo().equals(tipo)) {
                quantidade++;
            }
        }
        if (quantidade > 0) {
            return quantidade;
        } else {
            return -1;
        }
    }

    // Método para obter a loja de Informatica com o seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        Informatica informaticaMaisCara = null;
        double valorSeguroMaisAlto = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > valorSeguroMaisAlto) {
                    informaticaMaisCara = informatica;
                    valorSeguroMaisAlto = informatica.getSeguroEletronicos();
                }
            }
        }

        return informaticaMaisCara;
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Dos Andradas", "Porto Alegre", "RS", "Brasil", "94828-760", "188", "0");
        Data data = new Data(28, 10, 2023);

        Shopping shopping1 = new Shopping("Shopping 1", endereco, 5);

        Informatica Informatica1 = new Informatica("Dino PC 1", 8, 2500, endereco, data, 200.0, 230);
        Informatica Informatica2 = new Informatica("Dino PC 2", 8, 2500, endereco, data, 600.0, 330);
        Informatica Informatica3 = new Informatica("Dino PC 3", 8, 2500, endereco, data, 1000.0, 130);
        Informatica Informatica4 = new Informatica("Dino PC 4", 8, 2500, endereco, data, 100.0, 530);
        shopping1.insereLoja(Informatica1);
        shopping1.insereLoja(Informatica2);
        shopping1.insereLoja(Informatica3);
        shopping1.insereLoja(Informatica4);

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(shopping1.toString());

        System.out.println("lojaSeguroMaisCaro");
        System.out.println(shopping1.lojaSeguroMaisCaro());

    }
}
