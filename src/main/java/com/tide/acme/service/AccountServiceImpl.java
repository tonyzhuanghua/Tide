package com.tide.acme.service;


import com.tide.acme.dao.IAccountDao;
import com.tide.acme.model.domain.AccountTransaction;
import com.tide.acme.model.domain.UserAccount;
import com.tide.acme.model.dto.AccountTransactionDto;
import com.tide.acme.model.dto.UserAccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements IAccountService {
	
	@Autowired
	IAccountDao accountDao;


	@Transactional(propagation= Propagation.NOT_SUPPORTED)
	public UserAccountDto getUserAccount(String accountId) throws RuntimeException {
		UserAccount userAccount = accountDao.getUserAccount(accountId);
		UserAccountDto userAccountDto = new UserAccountDto();
		userAccountDto.setAccoutHolder(userAccount.getAccoutHolder());
		return userAccountDto;
	}

	@Transactional(propagation=Propagation.REQUIRED,
		       isolation= Isolation.READ_COMMITTED,
		       noRollbackFor={RuntimeException.class},
	            readOnly=true, timeout=30)
	public void addTransaction(AccountTransactionDto accountTransactionDto) {
		AccountTransaction accountTransaction =  new AccountTransaction();
		accountTransaction.setAmount(accountTransactionDto.getAmount());
		 accountDao.addTransaction(accountTransaction);
	}
}
