# 🚀 Desafio: Componentes e Injeção de Dependência

## 📋 Descrição
Sistema para cálculo do valor total de pedidos com desconto e frete, desenvolvido em **Java** com **Spring Boot**.

## 🎯 Objetivo
Implementar componentes com injeção de dependência utilizando **Spring Framework**.

## 🏗️ Componentes
- **`Order`**: Entidade que representa um pedido
- **`ShippingService`**: Calcula o frete baseado no valor
- **`OrderService`**: Calcula o valor total (desconto + frete)

## 📊 Regras de Frete
- **Abaixo de R$ 100.00** → R$ 20.00
- **R$ 100.00 até R$ 200.00** → R$ 12.00  
- **R$ 200.00 ou mais** → Grátis

## 🚀 Como Executar
```bash
# Clone o repositório
git clone https://github.com/MarcelFinavaro/aula.git

# Execute
mvn spring-boot:run
```

## 📟 Saída Esperada
```
=========================================
DESAFIO: Componentes e injeção de dependência
=========================================
EXEMPLO 1:
Pedido código 1034
Valor total: R$ 132,00

EXEMPLO 2:
Pedido código 2282
Valor total: R$ 720,00

EXEMPLO 3:
Pedido código 1309
Valor total: R$ 115,90
=========================================
```

## 🔧 Tecnologias
- Java 23
- Spring Boot 3.3.0
- Maven
- Git

## 👨‍💻 Autor
Marcelo Finavaro
