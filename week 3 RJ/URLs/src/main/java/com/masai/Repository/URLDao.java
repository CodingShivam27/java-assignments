package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.been.URL;

@Repository
public interface URLDao extends JpaRepository<URL,Integer> {

}
