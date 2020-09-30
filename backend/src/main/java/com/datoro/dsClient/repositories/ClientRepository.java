package com.datoro.dsClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datoro.dsClient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
