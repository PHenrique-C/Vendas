package phenrique;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class ConfigApplication {
    @Bean
    public CommandLineRunner executar () {
        return args -> {
            System.out.println("RODANDO CONFIGS DE DESENVOLVIMENTO!");
        };
    }
}
