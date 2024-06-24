import java.math.BigDecimal;

public class FuncionarioProxy extends Funcionario {

    private Funcionario funcionario;
    private boolean isAuthorized;

    public FuncionarioProxy(Funcionario funcionario, boolean isAuthorized) {
        super(funcionario);
        this.funcionario = funcionario;
        this.isAuthorized = isAuthorized;
    }

    @Override
    public BigDecimal getSalario() {
        if (isAuthorized) {
            return funcionario.getSalario();
        } else {
            throw new SecurityException("O acesso as informações salariais não está autorizado.");
        }
    }

    @Override
    public void setSalario(BigDecimal salario) {
        if (isAuthorized) {
            funcionario.setSalario(salario);
        } else {
            throw new SecurityException("Não é permitido alterar as informações salariais.");
        }
    }
}

