# 🧭 Guia de Campo: Jornada Backend Java

>Este guia documenta meu progresso, aprendizados técnicos e erros comuns durante minha jornada como desenvolvedor backend. 
Ele serve como minha própria documentação viva de aprendizado, com foco em Java e lógica de programação, especialmente 
durante exercícios práticos.

---

## 📌 Dificuldades frequentes e o que aprendi com elas

### ☕ Scanner e entrada de dados
- Esqueci de usar `nextLine()` depois de `nextInt()` e `nextDouble()`, o que causava leitura incorreta.
- Solução: inserir `scanner.nextLine();` após leitura numérica quando for ler uma string depois.

### 🧮 Declaração de variáveis e tipos
- Confundi `float` com `double` — no Beecrowd, sempre use `double` para precisão.
- Use `int` para inteiros e `double` para valores com casas decimais.

### 🔁 Retorno em métodos `void`
- Usei `return` com valor em métodos `void`, o que gerava erro de compilação.
- Correção: em métodos `void`, use apenas `return;` ou nada, nunca `return valor`.

---

## 💡 Formatação de saída no Beecrowd

- Sempre que usar `System.out.printf()`, **finalize com `%n`**.
- Exemplo correto:
  ```java
  System.out.printf("TOTAL = R$ %.2f%n", salario);

## 📌 Referência rápida — Formatação com `printf()` em Java

| Código | Descrição                           | Exemplo de saída    |
|--------|-------------------------------------|---------------------|
| `%s`   | String (texto)                      | `"Name: Ana"`       |
| `%d`   | Número inteiro (`int`)              | `"Age: 25"`         |
| `%.2f` | Número decimal com 2 casas decimais | `"Salary: 2500.75"` |
| `%.5f` | Decimal com 5 casas decimais        | `"6.43182"`         |
| `%n`   | Quebra de linha (como `\n`)         | Inicia nova linha   |

---

### 🧪 Exemplo combinado

```java
String name = "Lucas";
int age = 30;
double salary = 2480.50;

System.out.printf("Name: %s | Age: %d | Salary: $ %.2f%n", name, age, salary);

```
## 🧠 Reflexão
> Essa semana foi de clareza. Percebi que minha principal dificuldade não está na lógica, mas sim na atenção aos detalhes dos enunciados. Com isso em mente, comecei a mudar minha forma de leitura e abordagem dos exercícios. Estou desenvolvendo uma visão mais madura como programador, e isso me deixa motivado a continuar evoluindo passo a passo.
Não estou apenas aprendendo Java — estou aprendendo a pensar como um desenvolvedor, com clareza, paciência e atenção às entrelinhas dos problemas.
