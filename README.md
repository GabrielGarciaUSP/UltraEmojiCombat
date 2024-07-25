# Ultra Emoji Combat

## Descrição

Ultra Emoji Combat é um projeto em Java que simula uma competição de luta entre vários lutadores. O sistema permite registrar lutadores, marcar e realizar lutas, e acompanhar o desempenho de cada lutador. Este projeto demonstra conceitos fundamentais de Programação Orientada a Objetos (POO), incluindo Abstração, Encapsulamento, Herança e Polimorfismo.

## Funcionalidades

- **Cadastro de Lutadores**: Adiciona informações sobre lutadores, como nome, nacionalidade, idade, altura, peso, e estatísticas de vitórias, empates e derrotas.
- **Marcação de Lutas**: Permite marcar uma luta entre dois lutadores, verificando se eles estão na mesma categoria.
- **Simulação de Lutas**: Simula o resultado da luta de forma aleatória e atualiza as estatísticas dos lutadores.
- **Visualização de Estatísticas**: Exibe as estatísticas dos lutadores, incluindo vitórias, empates e derrotas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **Pessoa**: Classe base para representar pessoas com informações básicas.
2. **Lutador**: Classe que estende `Pessoa` e adiciona características específicas de um lutador.
3. **Luta**: Classe para gerenciar e simular lutas entre lutadores.
4. **Ultraemojicombat**: Classe principal contendo o método `main` para executar o programa.

## Exemplos de Código

### 1. Abstração

**Pessoa.java**
```java
package ultraemojicombat;

public abstract class Pessoa {
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa(String nome, String nacionalidade, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void apresentar();
}
```
### 2. Encapsulamento

```java
package ultraemojicombat;

public class Lutador extends Pessoa {
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
        super(nome, nacionalidade, idade);
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        setCategoria();
    }

    private void setCategoria() {
        // Define categoria com base no peso
    }
    // Métodos getters e setters para acessar e modificar as variáveis privadas
}
```
### 3. Herança
```java
public class Lutador extends Pessoa {
    // Atributos e métodos adicionais específicos de um lutador
}
```

### 4. Polimorfismo
```java
package ultraemojicombat;

public class Ultraemojicombat {
    public static void main(String[] args) {
        Pessoa p = new Lutador("Inconnu", "Desconhecido", 99, 1.80f, 75.0f, 0, 0, 0);
        System.out.println("### APRESENTAÇÃO ###");
        p.apresentar(); // Chama o método apresentar() da classe Lutador
    }
}
``` 



