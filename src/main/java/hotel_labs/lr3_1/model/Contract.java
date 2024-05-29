package hotel_labs.lr3_1.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="contract",schema="hotel_labs",catalog="hotel_labs")
public class Contract {
    @Id
    @Column(name = "idContract",unique = true)
    private UUID idContract;
    @Column(name = "hotelRoomId",unique = true,nullable = false)
    private UUID idHotelRoom;
    @Column(name = "specificClientId",unique = true,nullable = false)
    private UUID idClient;
    @Column(name = "dateConclusion",nullable = false)
    private Date dateConclusion;
    @Column(name = "signatureHotel",nullable = false)
    private String signatureHotel;
    @Column(name = "signatureClient",nullable = false)
    private String signatureClient;


    public Contract() {
        this.idContract = UUID.randomUUID();
    }

    public Contract(UUID idHotelRoom, UUID idClient, Date dateConclusion, String signatureHotel, String signatureClient) {
        this.idContract = UUID.randomUUID();
        this.idHotelRoom = idHotelRoom;
        this.idClient = idClient;
        this.dateConclusion = dateConclusion;
        this.signatureHotel = signatureHotel;
        this.signatureClient = signatureClient;
    }

    public boolean isSameId(Contract contract) {
        return this.getIdContract().equals(contract.getIdContract());
    }

    public UUID getIdContract() {
        return idContract;
    }

    public void setIdContract(UUID idContract) {
        this.idContract = idContract;
    }

    public UUID getIdHotelRoom() {
        return idHotelRoom;
    }

    public void setIdHotelRoom(UUID idHotelRoom) {
        this.idHotelRoom = idHotelRoom;
    }

    public UUID getIdClient() {
        return idClient;
    }

    public void setIdClient(UUID idClient) {
        this.idClient = idClient;
    }

    public Date getDateConclusion() {
        return dateConclusion;
    }

    public void setDateConclusion(Date dateConclusion) {
        this.dateConclusion = dateConclusion;
    }

    public String getSignatureHotel() {
        return signatureHotel;
    }

    public void setSignatureHotel(String signatureHotel) {
        this.signatureHotel = signatureHotel;
    }

    public String getSignatureClient() {
        return signatureClient;
    }

    public void setSignatureClient(String signatureClient) {
        this.signatureClient = signatureClient;
    }
}
