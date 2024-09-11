package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Entity.BankEntity;
import com.bank.service.BankService;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	@Autowired
	BankService bs;
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<BankEntity> b) {
		return bs.postAll(b);
	}
	
	@GetMapping(value="/getByIFSC/{a}")
	public String getBranchwithIFSCcode(@PathVariable String a) {
		return bs.getBranchwithIFSCcode(a);
	}

}
