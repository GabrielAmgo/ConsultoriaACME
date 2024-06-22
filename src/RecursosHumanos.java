import java.math.BigDecimal;

public class RecursosHumanos {

    static BigDecimal percentual;

    public static void reajustarSalario(Funcionario funcionario) {
        if (funcionario instanceof FuncionarioTerceirizado) {
            System.out.println("Funcionário terceirizado " + funcionario.getNome() + " não tem direito a reajuste.");
        } else {
            switch (funcionario.getCodigoCargo()){
                case Funcionario.ESTAGIARIO -> percentual = new BigDecimal("0.3");
                case Funcionario.JUNIOR -> percentual = new BigDecimal("0.2");
                case Funcionario.PLENO -> percentual = new BigDecimal("0.15");
                case Funcionario.SENIOR -> percentual = new BigDecimal("0.1");
            }
            BigDecimal novoSalario = funcionario.getSalario().add((funcionario.getSalario().multiply(percentual)));
            funcionario.setSalario(novoSalario);
            System.out.println("Novo salário de " + funcionario.getNome() + ": " + funcionario.getSalario());
        }
    }
}