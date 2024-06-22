package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Order;

public interface OrderrRepository extends JpaRepository<Order, Long>{

}
