package com.ishaR.twinkHotels.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.ishaR.twinkHotels.roomwebapp.models.Room;
import com.ishaR.twinkHotels.roomwebapp.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

   private final RoomService roomService;
@Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
