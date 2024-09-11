package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bank.Dao.BankDao;
import com.bank.Entity.BankEntity;

@Service
public class BankService {
	@Autowired
	BankDao bd;
	
	public String postAll(List<BankEntity> b) {
		return bd.postAll(b);
	}
	
	public String getBranchwithIFSCcode(String a) {
		return bd.getBranchwithIFSCcode(a);
	}

}
