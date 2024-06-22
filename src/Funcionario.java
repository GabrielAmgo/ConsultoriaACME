import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class Funcionario {

    private String nome;
    private List<String> telefones;
    private Endereco endereco;
    private BigDecimal salario;

    private Cargo cargo;
    private Setor setor;


    public Funcionario(String nome, List<String> telefones, Endereco endereco, BigDecimal salario, Cargo cargo, Setor setor) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", telefones='" + telefones + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                '}';
    }
}
