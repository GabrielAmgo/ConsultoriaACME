# Projeto Clean Code e Padrões de projeto
## Consultoria ACME

O projeto a seguir foi feito para o cumprimento da matéria de Clean Code da pós graduação em Engenharia de Software na INFNET.
O projeto será separado em três entregas, cada uma em uma branch.

### A primeira entrega 
Se refere ao desenvolvimento do projeto, o projeto inicialmente não foi feito com foco em boas práticas por conta das próximas entregas, porém foi aplicado os cinco principios do SOLID.

### A segunda entrega
Durante essa fase, o código inicial foi refatorado, eliminando os bad smells e aplicando os princípios do Clean Code. As principais mudanças foram:

- As constantes relacionada a Cargos (Estagiário, Júnior, Pleno e Sênior) foram substituidas por Enums.
- As constantes relacionada a Setores (Desenvolvimento, DevOps e Banco de dados) foram substituidas por Enums.
- Foi refatorado os construtores de Funcionario e Funcionarios Terceirizados para receber as mudanças acima.
- O Switch de RecursosHumanos foi alterado de forma a receber as enums.
- O método de reajustarSalario de RecursosHumanos foi refatorado de forma a ter apenas uma responsabilidade.
- Criado novo método definePercentual, que ajusta qual percentual de reajuste salarial para cada cargo.
- Renomeado algumas variáveis e métodos para maior coesão.

### A terceira entrega
Na terceira entrega, foi implementado alguns desing patterns que podem ou não estar ligado ao projeto, sendo eles:

Criacionais:
- Builder: O padrão Builder foi utilizado por sua facilidade em construir objetos com muitos parâmetros, e coube bem no projeto.
- Prototype: Permite copiar objetos existentes sem fazer o código ficar dependente de suas classes, para o projeto em questão, não é tão relevante.

Estrutural:
- Proxy: O proxy atua como um intermediário que pode adicionar uma camada de controle e proteção sem modificar a lógica existente da classe Funcionario.

Comportamental:
- Observer: Este padrão foi utilizado pois através dele é possível notificar os usuários a cada alteração de salário de um funcionário.
