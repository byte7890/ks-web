package com.Joojunghoon.app.repository;

import com.Joojunghoon.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work,Long> {
}
