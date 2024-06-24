import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Funcionario implements Cloneable{

    private String nome;
    private List<String> telefones;
    private Endereco endereco;
    private BigDecimal salario;
    private Cargo cargo;
    private Setor setor;
    private List<Observer> observers = new ArrayList<>();

    Funcionario(String nome, List<String> telefones, Endereco endereco, BigDecimal salario, Cargo cargo, Setor setor) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.cargo = cargo;
        this.setor = setor;
    }

    protected Funcionario(Funcionario target){
        if (target != null){
            this.nome = target.nome;
            this.telefones = target.telefones;
            this.endereco = target.endereco;
            this.salario = target.salario;
            this.cargo = target.cargo;
            this.setor = target.setor;
        }

    }
    @Override
    public Funcionario clone() {
        return new Funcionario(this);
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public static class Builder {
        private String nome;
        private List<String> telefones;
        private Endereco endereco;
        private BigDecimal salario;
        private Cargo cargo;
        private Setor setor;

        public Builder(String nome, BigDecimal salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public Builder telefones(List<String> telefones) {
            this.telefones = telefones;
            return this;
        }

        public Builder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder cargo(Cargo cargo) {
            this.cargo = cargo;
            return this;
        }

        public Builder setor(Setor setor) {
            this.setor = setor;
            return this;
        }
        public Funcionario build() {
            return new Funcionario(nome, telefones, endereco, salario, cargo, setor);
        }
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco=" + endereco +
                ", salario=" + salario +
                ", cargo=" + cargo +
                ", setor=" + setor +
                '}';
    }
}
