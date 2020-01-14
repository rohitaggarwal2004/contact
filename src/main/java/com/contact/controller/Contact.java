package com.contact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.Model.ContactMeModel;

@RestController
@RequestMapping(path = "/contactme")
public class Contact {

	@GetMapping(path = "/list")
	public boolean getCertifications() {
		return true;

	}

	@PostMapping(path = "/save")
	public boolean saveContact(@RequestBody ContactMeModel contactMeModel) {
		return true;

	}
}
