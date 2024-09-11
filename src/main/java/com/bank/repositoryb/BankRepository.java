package com.bank.repositoryb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.Entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Integer>{
	
	@Query(value="select branchname from bank_table where ifsccode like ?",nativeQuery = true)
	public String getBranchwithIFSCcode(String a);

}
