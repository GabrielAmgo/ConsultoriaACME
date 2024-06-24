import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioObservable {

    private List<Observer> observers = new ArrayList<>();
    private Funcionario funcionario;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(funcionario);
        }
    }

    public void modificarSalario(BigDecimal novoSalario) {
        if (funcionario != null) {
            funcionario.setSalario(novoSalario);
            notifyObservers();
        }
    }
}
