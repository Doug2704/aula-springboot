package com.candido.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candido.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
