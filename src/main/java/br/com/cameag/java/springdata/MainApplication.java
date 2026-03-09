package br.com.cameag.java.springdata;

import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.Bean;

import br.com.cameag.java.springdata.entity.Cliente;
import br.com.cameag.java.springdata.service.ClienteService;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class})
public class MainApplication {

    private final ClienteService clienteService;

    public MainApplication(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            List<Cliente> listaCliente = clienteService.findAllCliente();
            System.out.println("Lista Cliente count: " + listaCliente.size());
            System.out.println("Lista Cliente: " + listaCliente.toString());

            listaCliente.forEach(x ->{
                if(x.getCliente_id() > 15000)
                	clienteService.deleteById(x.getCliente_id());
            });

			listaCliente.forEach(x ->{ System.out.println("Procedure: " +
			clienteService.functionGetNome(x.getCliente_id().intValue())); });

        };
    }
}
