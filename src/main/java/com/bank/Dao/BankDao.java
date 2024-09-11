package com.bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.Entity.BankEntity;
import com.bank.repositoryb.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository br;
	public String postAll(List<BankEntity> b) {
		br.saveAll(b);
		return "POSTED DONE";
	}
	
	public String getBranchwithIFSCcode(String a) {
		return br.getBranchwithIFSCcode(a);
	}

}
