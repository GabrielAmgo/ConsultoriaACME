import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class FuncionarioTerceirizado extends Funcionario {

    private String empresaContratada;
    private LocalDate dataFimContrato;
    private long permanenciaEmDias;

    // Construtor privado para ser acessado apenas pelo Builder
    private FuncionarioTerceirizado(Builder builder) {
        super(builder.nome, builder.telefones, builder.endereco, builder.salario, builder.cargo, builder.setor);
        this.empresaContratada = builder.empresaContratada;
        this.dataFimContrato = builder.dataFimContrato;
        this.permanenciaEmDias = calcularPermanenciaEmDias(builder.dataFimContrato);
    }

    // Método privado para calcular a permanência em dias
    private long calcularPermanenciaEmDias(LocalDate dataFimContrato) {
        return LocalDate.now().until(dataFimContrato).getDays();
    }

    // Getters para os atributos adicionais
    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public LocalDate getDataFimContrato() {
        return dataFimContrato;
    }

    public long getPermanenciaEmDias() {
        return permanenciaEmDias;
    }

    // toString() para exibir informações do funcionário terceirizado
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "empresaContratada='" + empresaContratada + '\'' +
                ", dataFimContrato=" + dataFimContrato +
                ", permanenciaEmDias=" + permanenciaEmDias;
    }

    // Classe Builder estática interna
    public static class Builder {
        private String nome;
        private List<String> telefones;
        private Endereco endereco;
        private BigDecimal salario;
        private Cargo cargo;
        private Setor setor;
        private String empresaContratada;
        private LocalDate dataFimContrato;

        // Construtor que inicializa os parâmetros obrigatórios
        public Builder(String nome, BigDecimal salario) {
            this.nome = nome;
            this.salario = salario;
            this.cargo = cargo;
            this.setor = setor;
        }

        public Builder telefones(List<String> telefones) {
            this.telefones = telefones;
            return this;
        }

        public Builder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder Cargo(Cargo cargo){
            this.cargo = cargo;
            return this;
        }

        public Builder Setor(Setor setor){
            this.setor = setor;
            return this;
        }

        public Builder empresaContratada(String empresaContratada) {
            this.empresaContratada = empresaContratada;
            return this;
        }

        public Builder dataFimContrato(LocalDate dataFimContrato) {
            this.dataFimContrato = dataFimContrato;
            return this;
        }

        // Método para construir o objeto FuncionarioTerceirizado
        public FuncionarioTerceirizado build() {
            return new FuncionarioTerceirizado(this);
        }


    }
}
