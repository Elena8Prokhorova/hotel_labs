package hotel_labs.lr3_1.service;

import hotel_labs.lr3_1.model.Client;
import hotel_labs.lr3_1.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public void addClient(Client client) {
        clientRepository.save(client);
    }

    public Optional<Client> findClientById(UUID id) {
        return clientRepository.findById(id);
    }

    public void deleteClient(UUID id) {
        clientRepository.deleteById(id);
    }

    public void updateClient(Client client) {
        clientRepository.save(client);
    }
}
