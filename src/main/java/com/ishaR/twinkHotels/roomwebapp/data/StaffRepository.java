package com.ishaR.twinkHotels.roomwebapp.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishaR.twinkHotels.roomwebapp.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, String> {

}
