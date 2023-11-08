package com.onesoft.ac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.ac.entity.Ac;
import com.onesoft.ac.service.AcService;

@RestController
@RequestMapping(value = "/admin")
public class AcController {
		@Autowired
		AcService as;

		@PostMapping(value = "/added")
		public String setData(@RequestBody List<Ac> a) {
			return as.setData(a);
		}

		@PutMapping(value = "/update")
		public String setUpdate(@RequestBody Ac a) {
			return as.setUpdate(a);
		}

		@GetMapping(value = "/fet/{a}")

		public Ac setId(@PathVariable int a) {
			return as.setId(a);
		}

		@DeleteMapping(value = "/del/{id}")
		public String setDel(@PathVariable int id) {
			return as.setDel(id);
		}

		

	}
	


