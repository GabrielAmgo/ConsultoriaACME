public class InterfaceUsuario implements Observer {
    private String nome;

    public InterfaceUsuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Funcionario funcionario) {
        System.out.println("Atualização recebida por " + funcionario.getNome() + ":");
        System.out.println("Novo salário de " + funcionario.getNome() + ": " + funcionario.getSalario());
    }
}

