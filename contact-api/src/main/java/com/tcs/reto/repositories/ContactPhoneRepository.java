package com.tcs.reto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.reto.entities.ContactPhone;

public interface ContactPhoneRepository extends JpaRepository<ContactPhone, String> {

}
