package hotel_labs.lr3_1.controller;

import hotel_labs.lr3_1.model.Contract;
import hotel_labs.lr3_1.service.ContractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ContractController {
    private final ContractService contractService;
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contracts_all")
    public List<Contract> get() {
        return contractService.getContracts();
    }

    @GetMapping("/findContractById")
    public Optional<Contract> getById(UUID id) {
        return contractService.findContractById(id);
    }

    @PostMapping("/addContract")
    public Contract addContract(@RequestBody Contract contract) {
        contractService.addContract(contract);
        return contract;
    }

    @DeleteMapping("/deleteContract")
    public void deleteContract(UUID id) {
        contractService.deleteContract(id);
    }

    @PutMapping("/updateContract")
    public Contract updateContract(@RequestBody Contract contract) {
        contractService.updateContract(contract);;
        return contract;
    }
}
