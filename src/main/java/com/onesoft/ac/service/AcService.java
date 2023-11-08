package com.onesoft.ac.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.ac.dao.AcDao;
import com.onesoft.ac.entity.Ac;

@Service
public class AcService {
	@Autowired
	AcDao ad;
	public String setData(List<Ac>a){
		return ad.setData(a);
	}
	public String setUpdate(Ac a) {
		return ad.setUpdate(a);
	}
	public Ac setId(int a) {
		return ad.setId(a);
	}
	public List<Ac> setAll() {
		
		return ad.setAll();
	}
	public String setDel(int id) {
		return ad.setDel(id);
	}
	public List<Ac> setValues(int a) {
		List<Ac> c = ad.getData(a);
		List <Ac> d = c.stream().filter(x->x.getPrice()>100).collect(Collectors.toList());
		return d;
	}
	public List<Ac> setName(String b) {
		return ad.setName(b);
	}
	public List<Ac> setColor(String c) {
		return ad.setColor(c);
	}
	public List<Ac> setPrice(int d) {
		return ad.setPrice(d);
	}
	public Ac setMax() {
		return ad.setMax();
	}
	public int setMaxprice() {
		return ad.setMaxprice();
	}
	public List<Ac> setAsc() {
		return ad.setAsc();
	}
	public List<Ac> setDesc() {
		return ad.setDesc();
	}
	public int setMinprice() {
		return ad.setMinprice();
	}
	
	public List<Ac> setValue(int a, String b) {
		List<Ac> c = ad.getData(a);
		List <Ac> d = c.stream().filter(x->x.getPrice()>a && x.getCapacity().equals(b)).collect(Collectors.toList());
		return d;
	}
	public List<Ac> setBrand(String a) {
		List<Ac> e = ad.getBrand(a);
		List <Ac> s = e.stream().filter(x->x.getBrand().equals(e)).collect(Collectors.toList());
		return s;
	}
	public List<Ac> getPrice(int a) {
		List<Ac> r = ad.getAll(a);
		List <Ac> y = r.stream().filter(x->x.getPrice()>a).collect(Collectors.toList());
		return y;
	}
	public List<Ac> getCapacity(String a) {
		List<Ac> v = ad.getAllvalue(a);
		List <Ac> p = v.stream().filter(x->x.getCapacity().equals(a)).collect(Collectors.toList());
		return p;
	}
	public List<Ac> getRating(int a) {
		List<Ac> m = ad.getAllRate(a);
		List <Ac> n = m.stream().filter(x->x.getRating()>40).collect(Collectors.toList());
		return n;
	}
}

	



