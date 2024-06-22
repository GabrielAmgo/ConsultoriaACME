import java.math.BigDecimal;

public class RecursosHumanos {

    static BigDecimal percentualAumento;

    public static void reajustarSalario(Funcionario funcionario) {
        if (funcionario instanceof FuncionarioTerceirizado) {
            System.out.println("Funcionário terceirizado " + funcionario.getNome() + " não tem direito a reajuste.");
        } else {
            definePercentual(funcionario);
            BigDecimal novoSalario = funcionario.getSalario().add((funcionario.getSalario().multiply(percentualAumento)));
            funcionario.setSalario(novoSalario);
            System.out.println("Novo salário de " + funcionario.getNome() + ": " + funcionario.getSalario());
        }
    }
        private static BigDecimal definePercentual(Funcionario funcionario) {
            switch (funcionario.getCargo()) {
                case ESTAGIARIO -> percentualAumento = new BigDecimal("0.3");
                case JUNIOR -> percentualAumento = new BigDecimal("0.2");
                case PLENO -> percentualAumento = new BigDecimal("0.15");
                case SENIOR -> percentualAumento = new BigDecimal("0.1");
            }
            return percentualAumento;
    }
}