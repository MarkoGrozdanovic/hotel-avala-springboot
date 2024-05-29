package com.dailycodework.hotelavala.repository;

import com.dailycodework.hotelavala.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {
    @Query("select room.roomType "+
           "from Room room")
    List<String> getRoomTypes();
}
