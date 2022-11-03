package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.been.Tags;

@Repository
public interface TagsDao extends JpaRepository<Tags, Integer>{

}
