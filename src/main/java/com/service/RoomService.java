package com.service;

import com.domain.Room;

import java.util.List;

public interface RoomService {
    void addRoom(Room room);
    List<Room> getRooms();
    Room getRoom(int id);
}
