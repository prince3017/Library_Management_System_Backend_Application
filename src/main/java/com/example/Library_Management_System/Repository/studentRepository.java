package com.example.Library_Management_System.Repository;

import com.example.Library_Management_System.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Students,Integer> {

    Students findByEmail(String email);



}
