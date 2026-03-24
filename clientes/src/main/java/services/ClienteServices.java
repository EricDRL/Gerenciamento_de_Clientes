package services;

import entity.Cliente;
import repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}