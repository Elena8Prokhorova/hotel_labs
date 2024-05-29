package hotel_labs.lr3_1.repository;

import hotel_labs.lr3_1.model.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, UUID> {
}
