package Padrão;

public class Principal
{
    String nome;
    int anoNascimento;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(final String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "O Nome da Pessoa \u00e9: " + this.nome + " E o Ano de Nascimento \u00e9: " + this.anoNascimento + ".";
    }
    
    public int getAnoNascimento() {
        return this.anoNascimento;
    }
    
    public void setAnoNascimento(final int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}