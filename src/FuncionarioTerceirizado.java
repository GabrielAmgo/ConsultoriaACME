import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class FuncionarioTerceirizado extends Funcionario{
    String empresaContratada;
    LocalDate dataFimContrato;
    long PermanenciaEmDias;


    public FuncionarioTerceirizado(String nome, List<String> telefones, Endereco endereco, BigDecimal salario, int codigoCargo, int codigoSetor, String empresaContratada, LocalDate dataFimContrato) {
        super(nome, telefones, endereco, salario, codigoCargo, codigoSetor);
        this.empresaContratada = empresaContratada;
        this.dataFimContrato = dataFimContrato;
        this.PermanenciaEmDias = calcularPermanenciaEmDias(dataFimContrato);
    }

    private long calcularPermanenciaEmDias(LocalDate dataFimContrato) {
        return ChronoUnit.DAYS.between(LocalDate.now(), dataFimContrato);
    }

    public String toString() {
        return super.toString() + "\n" +
                "empresaContratada='" + empresaContratada + '\'' +
                ", dataFimContrato=" + dataFimContrato +
                ", PermanenciaEmDias=" + PermanenciaEmDias +
                '}';
    }
}
