package hotel_labs.lr3_1.controller;

import hotel_labs.lr3_1.model.Client;
import hotel_labs.lr3_1.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/clients_all")
    public List<Client> get() {
        return clientService.getClients();
    }

    @GetMapping("/findClientById")
    public Optional<Client> getById(UUID id) {
        return clientService.findClientById(id);
    }

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        clientService.addClient(client);;
        return client;
    }

    @DeleteMapping("/deleteClient")
    public void deleteClient(UUID id) {
        clientService.deleteClient(id);;
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client) {
        clientService.updateClient(client);;
        return client;
    }
}
