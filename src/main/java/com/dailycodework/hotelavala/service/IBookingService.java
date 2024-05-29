package com.dailycodework.hotelavala.service;

import com.dailycodework.hotelavala.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookings();

    BookedRoom findBookingByConfirmationCode(String confirmationCode);

    String save(Long roomId, BookedRoom bookingRequest);

    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
