package com.gifted.rssfeed.repository;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gifted.rssfeed.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
	@Transactional
	@Modifying
	@Query(value="update item i set i.description=:description, i.publication=:publication where i.title =:title", nativeQuery = true)
	public void update(@Param("description")String description,@Param("publication")Date publication,@Param("title") String title);
	
		
		

}
