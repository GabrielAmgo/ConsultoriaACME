import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario.Builder("Gabriel", new BigDecimal("3000.00"))
                .telefones(Arrays.asList("(11)999999", "(21)888888"))
                .endereco(new Endereco("Rua Silvio", "67","jardim das cerejeiras", "São Caetano", "São Paulo"))
                .cargo(Cargo.ESTAGIARIO)
                .setor(Setor.DESENVOLVIMENTO)
                .build();

            FuncionarioTerceirizado funcionario2 = new FuncionarioTerceirizado.Builder("Claudinho", new BigDecimal("7000.00"))
                .telefones(Arrays.asList("(11)123456", "(21)654321"))
                .endereco(new Endereco("Rua Marcos Fernandez", "34","parque dos pássaros","Santo Antonio", "Ceará"))
                .Cargo(Cargo.SENIOR)
                .Setor(Setor.BANCODEDADOS)
                .empresaContratada("Consultoria Dois irmãos")
                .dataFimContrato(LocalDate.of(2024,07,17))
                .build();

        System.out.println(funcionario1);
        RecursosHumanos.reajustarSalario(funcionario1);

        System.out.println(funcionario2);
        RecursosHumanos.reajustarSalario(funcionario2);

        Funcionario funcionario3 = funcionario1.clone();
        System.out.println(funcionario3);

    }
}