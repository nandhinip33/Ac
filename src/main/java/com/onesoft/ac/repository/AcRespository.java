package com.onesoft.ac.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesoft.ac.entity.Ac;


public interface AcRespository extends JpaRepository<Ac, Integer>{
	
	@Query(value = "select * from ac.ac_details where brand  like %?", nativeQuery  = true)
	public List <Ac> setName(String b);
	
	@Query(value = "select * from ac.ac_details where colour like %?", nativeQuery = true)
	public List <Ac> setColor(String c);
		
	@Query(value ="select * from ac.ac_details where price > ?", nativeQuery=true)
	public List<Ac> setPrice(int d);
	
	@Query(value="select max(price) from ac.ac_details", nativeQuery = true)
	public int setMaxprice();
	
	@Query(value="select * from ac.ac_details where price = (select max(price) from ac.ac_details)", nativeQuery = true)
	public Ac setMax();
	
	@Query(value="select * from ac.ac_details order by price asc", nativeQuery = true)
	public List<Ac> setAsc();
	
	@Query(value="select * from ac_details order by price desc", nativeQuery = true)
	public List<Ac> setDesc();
	
	@Query(value="select min(price) from ac.ac_details", nativeQuery = true)
	public int setMinprice();
	
	@Query(value = "select * from ac.ac_details where price > ? and capacity = ?", nativeQuery = true)
	public List <Ac> setValue(int a, String b);
}

