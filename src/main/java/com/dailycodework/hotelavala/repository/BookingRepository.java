package com.dailycodework.hotelavala.repository;

import com.dailycodework.hotelavala.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> findByRoomId(Long roomId);
}
