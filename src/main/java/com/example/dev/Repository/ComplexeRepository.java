package com.example.dev.Repository;

import com.example.dev.entity.Complexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexeRepository extends JpaRepository<Complexe, Long> {

}
