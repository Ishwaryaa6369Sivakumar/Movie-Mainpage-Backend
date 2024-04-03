package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket,Integer>{
    
}