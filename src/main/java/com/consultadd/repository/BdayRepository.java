package com.consultadd.repository;

import com.consultadd.model.Bday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BdayRepository extends JpaRepository<Bday,String> {
}
