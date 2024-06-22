import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Endereco enderecoFuncionario1 = new Endereco("Rua Silvio", "67","jardim das cerejeiras", "São Caetano", "São Paulo");

        List<String> telefonesFuncionario1 = new ArrayList<>();
        telefonesFuncionario1.add("(11)999999");
        telefonesFuncionario1.add("(21)888888");

        Endereco enderecoFuncionario2 = new Endereco("Rua Marcos Fernandez", "34","parque dos pássaros","Santo Antonio", "Ceará");

        List<String> telefonesFuncionario2 =  new ArrayList<>();
        telefonesFuncionario2.add("(11)123456");
        telefonesFuncionario2.add("(21)654321");


        Funcionario funcionario1 = new Funcionario("Gabriel", telefonesFuncionario1 , enderecoFuncionario1,new BigDecimal("3000"),
                                                    Cargo.JUNIOR,Setor.DESENVOLVIMENTO);

        FuncionarioTerceirizado funcionario2 = new FuncionarioTerceirizado("Claudinho", telefonesFuncionario2, enderecoFuncionario2,new BigDecimal("7000"),
                                                    Cargo.SENIOR, Setor.BANCODEDADOS,"Consultoria Dois irmãos",
                                                    LocalDate.of(2024,07,17));

        System.out.println(funcionario1);
        RecursosHumanos.reajustarSalario(funcionario1);

        System.out.println(funcionario2);
        RecursosHumanos.reajustarSalario(funcionario2);


    }
}