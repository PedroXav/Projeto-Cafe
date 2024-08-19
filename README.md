
## 1. Factory Method

### Objetivo:
O padrão **Factory Method** é utilizado para criar diferentes tipos de café sem expor a lógica de criação ao cliente.

### Implementação:

- **`Cafe.java`**: Classe abstrata que define a interface para os diferentes tipos de café.
- **`Espresso.java`**: Classe concreta que estende `Cafe` e representa um Espresso.
- **`Latte.java`**: Classe concreta que estende `Cafe` e representa um Latte.
- **`FabricaCafe.java`**: Fábrica que cria instâncias de `Cafe` com base no tipo solicitado.

## 2. Decorator

### Objetivo:
O padrão **Decorator** é utilizado para adicionar responsabilidades a objetos dinamicamente, como adicionar ingredientes ao café.

### Implementação:

- **`CafeDecorator.java`**: Classe abstrata que estende `Cafe` e serve como base para os decoradores.
- **`LeiteDecorator.java`**: Classe concreta que adiciona leite ao café.
- **`AcucarDecorator.java`**: Classe concreta que adiciona açúcar ao café.

## 3. Singleton

### Objetivo:
O padrão **Singleton** garante que exista apenas uma instância do pedido durante a execução do programa.

### Implementação:

- **`PedidoSingleton.java`**: Classe que gerencia o pedido único, armazenando e exibindo os itens adicionados.

## 4. Classe Principal

### Objetivo:
A classe **`Cafeteria.java`** é a classe principal que coordena a criação dos cafés, a adição de ingredientes e o gerenciamento do pedido.

### Funcionalidade:

- Cria diferentes tipos de café usando o **Factory Method**.
- Adiciona ingredientes como leite e açúcar usando o **Decorator**.
- Adiciona os cafés ao pedido gerenciado pelo **Singleton**.
- Exibe o pedido final.

## Execução

Ao executar o programa, o pedido será montado e exibido no console, mostrando os cafés escolhidos com seus respectivos ingredientes e preços.

### Exemplo de Saída:

```plaintext
Pedido:
Latte, Leite - R$ 5.0
Espresso, Açúcar - R$ 3.5

 
