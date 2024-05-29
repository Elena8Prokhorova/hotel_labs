package hotel_labs.lr3_1.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="client",schema="hotel_labs",catalog="hotel_labs")
public class Client {
    @Id
    @Column(name = "idClient",unique = true)
    private UUID idClient;
    @Column(name = "passportData",unique = true,nullable = false)
    private String passportData;
    @Column(name = "fullName",nullable = false)
    private String fullName;
    @Column(name = "dateBirth",nullable = false)
    private Date dateBirth;
    @Column(name = "email",unique = true,nullable = false)
    private String email;
    @Column(name = "phoneNumber",unique = true,nullable = false)
    private long phoneNumber;

    @ManyToMany
    @JoinTable(schema = "hotel_labs",
            name = "contract",
            joinColumns = @JoinColumn(name = "specificClientId"),
            inverseJoinColumns = @JoinColumn(name = "hotelRoomId"))
    Set<Contract> contractsClient;
    public Set<Contract> getContract() {
        return contractsClient;
    }
    public void setContract(Set<Contract> contracts) {
        this.contractsClient = contracts;
    }

    public Client() {
        this.idClient = UUID.randomUUID();
    }

    public Client(String passportData, String fullName, Date dateBirth, String email, long phoneNumber) {
        this.idClient = UUID.randomUUID();
        this.passportData = passportData;
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public boolean isSameId(Client client) {
        return this.getIdClient().equals(client.getIdClient());
    }

    public UUID getIdClient() {
        return idClient;
    }

    public void setIdClient(UUID idClient) {
        this.idClient = idClient;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
