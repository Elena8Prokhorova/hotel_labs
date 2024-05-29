package hotel_labs.lr3_1.service;

import hotel_labs.lr3_1.model.Contract;
import hotel_labs.lr3_1.repository.ContractRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContractService {
    private final ContractRepository contractRepository;
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> getContracts() {
        return contractRepository.findAll();
    }

    public void addContract(Contract contract) {
        contractRepository.save(contract);
    }

    public Optional<Contract> findContractById(UUID id) {
        return contractRepository.findById(id);
    }

    public void deleteContract(UUID id) {
        contractRepository.deleteById(id);
    }

    public void updateContract(Contract contract) {
        contractRepository.save(contract);
    }
}
