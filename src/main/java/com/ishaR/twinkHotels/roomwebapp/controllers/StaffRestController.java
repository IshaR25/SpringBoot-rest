package com.ishaR.twinkHotels.roomwebapp.controllers;

import java.util.List;

import com.ishaR.twinkHotels.roomwebapp.models.StaffMember;
import com.ishaR.twinkHotels.roomwebapp.service.StaffService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}