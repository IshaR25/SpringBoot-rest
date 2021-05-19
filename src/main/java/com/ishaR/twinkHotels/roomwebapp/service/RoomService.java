package com.ishaR.twinkHotels.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;

import com.ishaR.twinkHotels.roomwebapp.data.RoomRepository;
import com.ishaR.twinkHotels.roomwebapp.models.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

 //   private static final List<Room> rooms = new ArrayList();

//    static{
//        for(int i=0;i<10;i++){
//            rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
//        }
 //   }
private  final RoomRepository roomrepository;
@Autowired
public RoomService(RoomRepository roomrepository) 
{
	this.roomrepository=roomrepository;}

    public List<Room> getAllRooms(){
        return roomrepository.findAll();
    }
}