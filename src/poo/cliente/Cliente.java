package cliente;

public class Cliente {
    public String nome;
    public String nome2;

    protected  float consumo;
    private  int anoNascimento;
    // Get e Set

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception{
        if ((anoNascimento < 1960) || (anoNascimento>2025)){
            throw new Exception("O ano de nascimento está inválido: ");
        }
        this.anoNascimento = anoNascimento;
    }
}


// public -> Não realiza restrições de acesso a variáveis e/ou a métodos.
// Private ->  Atributo ou método fica disponivel somente a classe a que pertence.
// Protected -> Está disponivel ao pacote a que pertence.