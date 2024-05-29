package hotel_labs.lr3_1.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="hotelroom",schema="hotel_labs",catalog="hotel_labs")
public class HotelRoom {
    @Id
    @Column(name = "idRoom",unique = true)
    private UUID idRoom;
    @Column(name = "status",nullable = false)
    private String status;
    @Column(name = "startBooking",nullable = false)
    private Date startBooking;
    @Column(name = "endBooking",nullable = false)
    private Date endBooking;
    @Column(name = "amountPerson",nullable = false)
    private int amountPerson;
    @Column(name = "viewWindow")
    private String viewWindow;
    @Column(name = "ironInRoom")
    private boolean ironInRoom;
    @Column(name = "kettleInRoom")
    private boolean kettleInRoom;
    @Column(name = "minibarInRoom")
    private boolean minibarInRoom;

    @ManyToMany
    @JoinTable(schema = "hotel_labs",
            name = "contract",
            joinColumns = @JoinColumn(name = "hotelRoomId"),
            inverseJoinColumns = @JoinColumn(name = "specificClientId"))
    Set<Contract> contractsHotel;
    public Set<Contract> getContracts() {
        return contractsHotel;
    }
    public void setContracts(Set<Contract> contracts) {
        this.contractsHotel = contracts;
    }

    public HotelRoom() {
        idRoom = UUID.randomUUID();
    }
    public HotelRoom(String status, Date startBooking, Date endBooking,
                     int amountPerson, String viewWindow, boolean ironInRoom,
                     boolean kettleInRoom, boolean minibarInRoom) {
        this.idRoom = UUID.randomUUID();
        this.status = status;
        this.startBooking = startBooking;
        this.endBooking = endBooking;
        this.amountPerson = amountPerson;
        this.viewWindow = viewWindow;
        this.ironInRoom = ironInRoom;
        this.kettleInRoom = kettleInRoom;
        this.minibarInRoom = minibarInRoom;
    }

    public boolean isSameId(HotelRoom hotelRoom) {
        return this.getIdRoom().equals(hotelRoom.getIdRoom());
    }

    public UUID getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(UUID idRoom) {
        this.idRoom = idRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartBooking() {
        return startBooking;
    }

    public void setStartBooking(Date startBooking) {
        this.startBooking = startBooking;
    }

    public Date getEndBooking() {
        return endBooking;
    }

    public void setEndBooking(Date endBooking) {
        this.endBooking = endBooking;
    }

    public int getAmountPerson() {
        return amountPerson;
    }

    public void setAmountPerson(int amountPerson) {
        this.amountPerson = amountPerson;
    }

    public String getViewWindow() {
        return viewWindow;
    }

    public void setViewWindow(String viewWindow) {
        this.viewWindow = viewWindow;
    }

    public boolean isIronInRoom() {
        return ironInRoom;
    }

    public void setIronInRoom(boolean ironInRoom) {
        this.ironInRoom = ironInRoom;
    }

    public boolean isKettleInRoom() {
        return kettleInRoom;
    }

    public void setKettleInRoom(boolean kettleInRoom) {
        this.kettleInRoom = kettleInRoom;
    }

    public boolean isMinibarInRoom() {
        return minibarInRoom;
    }

    public void setMinibarInRoom(boolean minibarInRoom) {
        this.minibarInRoom = minibarInRoom;
    }
}
