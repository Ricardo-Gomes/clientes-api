package com.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner run(@Autowired ClienteRepository repository) {
//		return args ->{
//			Cliente cliente = Cliente.builder().cpf("11111111111").nome("Fulano").build();
//			repository.save(cliente);
//		};
//	}
}
