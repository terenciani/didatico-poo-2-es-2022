# Sistemas para Gestão de Empréstimos de Armários do IFPR - Campus Paranavaí

## Objetivo
Este sistema tem como objetivo realizar o controle dos empréstimos de armários disponíveis no campus.

## Convenções
As funcionalidades do sistema estão especificadas de acordo com a técnica de escrita de Casos de Uso na versão expandida. Além disso, todos os casos de uso serão numerados para facilitar a rastreabilidade. Todo caso de uso terá uma prioridade de 0 a 10, sendo 0 a mais baixa e 10 a mais alta.

## Público-alvo e Sugestões de Leitura
O público-alvo são os estudantes, que desenpenham papel de desenvolvedores. Por isso, recomenda-se a leitura da documentação por completo

## Escopo do Projeto
Diariamente os estudantes emprestam armários da biblioteca e do bloco administrativo, já que em alguns espaços não são permitidas mochilas, alimentos e liquídos. Dessa forma o sistema proposto tem como finalidade oferecer uma gestão dos empréstimos de armários disponibilizados pelo campus. Para isso, além das funcionalidades de empréstimo e devolução de armários/chaves, também será necessário realizar o cadastro do estudantes e também dos gestores do sistema. É esperado que o sistema armazene um registro histórico dos armários (quem utilizou) e também importe os cadastros a partir de um arquivo csv, já que todo início de ano novos estudantes são incluídos, isso também se aplica a remoção de estudantes formandos.

## Funcionalidades do Produto
Diagrama de Casos de Uso a ser incluído no projeto

## Perfis e Características dos Usuários

- Estudante: aquele que empresta e devolve a chave. Interage pouco com o sistema e não precisa de familiaridade com a tecnologia.
- Gestores: aqueles que administram o sistema, podendo ser bibliotecários ou assitentes de aluno. Espera-se que tenham familiaridade com o uso de sistemas desktop.

## Ambiente Operacional
Configurações minímas para uma aplicação Java Desktop, com banco de dados MySQL.

## Restrições de Projeto e Implementação
O desenvolvimento é restrito à linguagem Java, pois será desenvolvido ao longo da disciplina. Além disso, será utilizado o pacote Swing para a construção das interfaces gráficas.

# Funcionalidades do Sistema

<details>
  <summary>UC-001 - Empréstimo de Armário</summary>
  
| Seções                    |              Descrição               |
|----------                 | -------------                        |
| Nome do Caso de Uso       | UC-001 - Empréstimo de Armário       |
| Prioridade                | 10                                   | 
| Ator Principal            | Estudante                            |
| Ator Secundário           |                                      |
| Interessados e Interesses | Gestão do Campus                     |
| Pré-condições             | Estudante precisa estar cadastrado   |
| Garantias de Sucesso      | O estado do armário é atualizado para ocupado e o empréstimo é realizado.   |
| Cenário de sucesso principal | 1. o estudante chega ao terminal para registrar o número do armário que pegou. <br> 2. O estudante informa suas credenciais. <br> 3. O estudante informa o armário que está emprestando. <br> 4. O estudante aceita os termos de uso. <br> 5. O estudante confirma o empréstimo. <br> 6. O sistema exibe a mensagem de confirmação.|
| Cenários alternativos | **2.1 Matrícula não encontrada** <br> 2.1.1  Sistema informa que matrícula não foi encontrada. <br> 2.1.2 Retorna ao passo 2. <br> **2.2 Senha incorreta** <br> 2.2.1  Sistema informa que a senha está incorreta. <br> 2.2.2 Retorna ao passo 2. <br> **2.3 Matrícula inativa** <br>2.3.1 O sistema informa que a matrícula está inativa <br> 2.3.2 Procurar um administrador (bibliotecário ou assistente de aluno) para regularizar o cadastro. <br> 2.3.3 Retorna para o passo 2. <br> **3.1 Armário indisponível** <br> 3.1.1 O sistema informa que o armário está indisponível. <br> 3.1.2 O estudante informa o administrador para regularizar a siutação. <br> 3.1.3 Retorna para o passo 1. <br> **4.1 Não aceitou os termos de uso** <br> 4.1.1 O sistema informa que o estudante deve estar de acordo com os termos de uso. <br> 4.1.2 Retorna para o passo 4. |
|Variantes| Não se aplica. |
|Cenário alternativo das variantes | Não se aplica. |
|Variantes tecnológicas| Não se aplica.|
|Frequência de ocorrência| Várias vezes ao dia. Sendo essa a principal funcionalidade do sistema.|
|Diversos| Não se aplica.|
|Regras de Negócio| O processo de empréstimo é realizado pelo próprio estudante. Ele deve pegar a chave, dirigir-se ao terminal de empréstimos e efetuar o registro. Durante o ato de empréstimo, não é necessário uma área restrita para o estudante. A senha é utilizada para que a reserva não seja efetuada em nome de outro estudante.|

</details>


