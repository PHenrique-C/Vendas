package phenrique.repository;

import org.springframework.stereotype.Repository;
import phenrique.model.Clientes;

@Repository
public class ClientesRepository {
    public void persistir(Clientes.Cliente cliente) {
        //acessa a base e salva o cliente
    }
}
