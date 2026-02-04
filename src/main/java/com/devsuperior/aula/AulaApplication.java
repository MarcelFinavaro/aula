package com.devsuperior.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=========================================");
		System.out.println("DESAFIO: Componentes e injeção de dependência");
		System.out.println("=========================================");

		// Exemplo 1
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println("EXEMPLO 1:");
		System.out.println("Pedido código " + order1.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order1));
		System.out.println();

		// Exemplo 2
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("EXEMPLO 2:");
		System.out.println("Pedido código " + order2.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));
		System.out.println();

		// Exemplo 3
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("EXEMPLO 3:");
		System.out.println("Pedido código " + order3.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));
		System.out.println("=========================================");
	}
}