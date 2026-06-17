# Validador de Login: Comparação de Strings em Java

Um programa simples em java desenvolvido com a finalidade de praticar estruturas condicionais e entender a forma de comparar textos (Strings)

## O que aprendi aqui (Diferença entre `==` e `.equals()`):
Ao validar Strings em Java, descobri que o comportamento dos operadors é diferente:
* **Operador `==`: **Compara a **Referência da memória** dos objetos. Se Duas Strings têm o mesmo texto, mas estão em locais diferentes da memória, o `==` pode dizer que são diferentes.


* **Método `.equals()`:** Compara o **conteúdo real** do texto, caractere por caractere. Para comparar textos digitados pelo usuário (como o login), o `.equals()` é sempre a escolha correta.

## Como o programa funciona (Lógica Aplicada)

Para provar a diferença conceitual entre o operador `==` e o método `.equals()`, o código foi estruturado da seguinte forma:

1. **`usuarioCadastrado`:** Uma String literal definida diretamente no código (`"admin"`).
2. **`usuarioDigitado`:** Uma String criada explicitamente na memória usando o construtor `new String("admin")`. Isso força o Java a alocar esse texto em um endereço de memória diferente do primeiro.
3. **Estrutura Condicional (`if` / `else`):** Utilizada para testar as duas formas de comparação.

---

## O Código na Prática

No trecho abaixo, podemos ver o teste real. Se trocarmos o `.equals()` pelo `==` (que está comentado), o programa exibirá "Usuário incorreto" devido aos endereços de memória diferentes:

```java
String usuarioCadastrado = "admin";
String usuarioDigitado = new String("admin");

// Se usarmos (usuarioCadastrado == usuarioDigitado), o resultado será FALSO.
if (usuarioCadastrado.equals(usuarioDigitado)) {
    System.out.println("Acesso permitido");
} else {
    System.out.println("Usuário incorreto");
}