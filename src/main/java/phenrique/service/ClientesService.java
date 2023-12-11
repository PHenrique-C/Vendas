package phenrique.service;

import org.springframework.stereotype.Service;
import phenrique.model.Clientes;
import phenrique.repository.ClientesRepository;

@Service
public class ClientesService {
    private ClientesRepository repository;
    public ClientesService ( ClientesRepository repository) {
        this.repository = repository;
    }
    public void salvarCliente ( Clientes.Cliente cliente ) {
        validarCliente ( cliente );
        this.repository.persistir ( cliente );
    }
    public void validarCliente ( Clientes.Cliente cliente ) {
        //aplica validações
    }
}
