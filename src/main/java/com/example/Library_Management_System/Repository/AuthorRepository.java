package com.example.Library_Management_System.Repository;


import com.example.Library_Management_System.Models.author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<author,Integer> {
}
