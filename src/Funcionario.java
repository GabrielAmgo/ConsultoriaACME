import java.math.BigDecimal;
import java.util.List;

public class Funcionario {

    public static final int DESENVOLVIMENTO = 0;
    public static final int DEVOPS = 1;
    public static final int BANCO_DE_DADOS = 2;

    public static final int ESTAGIARIO = 0;
    public static final int JUNIOR = 1;
    public static final int PLENO = 2;
    public static final int SENIOR = 3;

    private String nome;
    private List<String> telefones;
    private Endereco endereco;
    private BigDecimal salario;
    private final int codigoSetor;
    private final int codigoCargo;


    public Funcionario(String nome, List<String> telefones, Endereco endereco, BigDecimal salario, int codigoCargo, int codigoSetor) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.codigoCargo = codigoCargo;
        this.codigoSetor = codigoSetor;
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

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public int getCodigoCargo() {
        return codigoCargo;
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
