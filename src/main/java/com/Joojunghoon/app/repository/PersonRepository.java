package com.Joojunghoon.app.repository;

import com.Joojunghoon.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
