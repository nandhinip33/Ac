package com.onesoft.ac.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.ac.entity.Ac;
import com.onesoft.ac.repository.AcRespository;


@Repository
public class AcDao {
	@Autowired
	AcRespository ar;
	public String setData( List <Ac> e) {
		   ar.saveAll(e);
		   return "Save Successfully";
		}
	public String setUpdate(Ac a) {
		ar.save(a);
		return "Updated";
	}
	public Ac setId(int a) {
		return ar.findById(a).get();
	}
	public List<Ac> setAll() {
		return ar.findAll();
	}
	public String setDel(int id) {
		ar.deleteById(id);
		return "Deleted";
	}
	public List<Ac> getData(int a) {
		return ar.findAll();
	}
	public List<Ac> setName(String b) {
		return ar.setName(b);
	}
	public List<Ac> setColor(String c) {
		return ar.setColor(c);
	}
	public List<Ac> setPrice(int d) {
		return ar.setPrice(d);
	}
	public Ac setMax() {
		return ar.setMax();
	}
	public int setMaxprice() {
		return ar.setMaxprice();
	}
	public List<Ac> setAsc() {
		return ar.setAsc();
	}
	public List<Ac> setDesc() {
		return ar.setDesc();
	}
	public int setMinprice() {
		return ar.setMinprice();
	}
	public List<Ac> getBrand(String a) {
		return ar.findAll();
	}
	public List<Ac> getAll(int a) {
		return ar.findAll();
	}
	public List<Ac> getAllvalue(String a) {
		return ar.findAll();
	}
	public List<Ac> getAllRate(int a) {
		return ar.findAll();
	}
	

	
	

}
