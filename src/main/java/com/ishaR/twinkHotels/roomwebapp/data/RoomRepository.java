package com.ishaR.twinkHotels.roomwebapp.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ishaR.twinkHotels.roomwebapp.models.Room;
public interface RoomRepository extends JpaRepository<Room, Long>{

}
