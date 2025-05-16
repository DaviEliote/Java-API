Product API – Java Spring Boot

Este projeto expõe uma API REST simples para gerenciamento de produtos em memória. Ele permite criar, consultar, atualizar e excluir produtos, utilizando uma estrutura básica com Spring Boot.

---

## Endpoints disponíveis

### `GET /product/getAllProducts`
- **Descrição**: Retorna todos os produtos armazenados em memória.
- **Resposta**: `ArrayList<Product>`

---

### `GET /product/getProductById`
- **Descrição**: Retorna um produto específico a partir do `id` enviado.
- **Body esperado (JSON)**:
```json
{
  "id": 1
}

-- Resposta: Optional<Product>



## PUT /product/updateProduct
Descrição: Atualiza um produto existente com os dados enviados.

Body esperado (JSON):

json
Copiar
Editar
{
  "id": 1,
  "name": "Produto Atualizado",
  "price": 99.99
}
Resposta: Lista atualizada de produtos (ArrayList<Product>)




POST /product/postProduct
Descrição: Adiciona um novo produto à lista em memória.

Body esperado (JSON):

json
Copiar
Editar
{
  "id": 1,
  "name": "Novo Produto",
  "price": 49.99
}
Resposta: HTTP 201 Created (sem corpo)




DELETE /product/deleteAllProducts
Descrição: Remove todos os produtos da lista.

Resposta: HTTP 200 OK

🛠️ Tecnologias utilizadas
Java

Spring Boot

Spring Web

📁 Estrutura básica do projeto
ProductController – Camada REST

ProductService – Camada de serviço

ProductDTO – Objeto de transferência de dados

Product – Modelo de domínio

