package com.example.DATN_WebFiveTus.repository;

import com.example.DATN_WebFiveTus.entity.ChiTietSanBong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ChiTietSanBongRepository extends JpaRepository<ChiTietSanBong,Integer> {

}
