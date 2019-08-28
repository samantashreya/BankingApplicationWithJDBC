package com.capgemini.bankingproject.dao;

import java.util.List;

import com.capgemini.bankingproject.bean.BankCustomer;
import com.capgemini.bankingproject.bean.Transcation;
import com.capgemini.bankingproject.exception.BankException;

public interface IBankDao {
	/*
	 * long addToCustomer(Customer customer)throws BankException; void
	 * showBalance(int custId)throws BankException; int transferFunds(Transcation
	 * transaction,int sourceCustId,int destinationCustId) throws BankException;
	 */

	int insertCustomer(BankCustomer customer);

	void showBalance(int custId);
	double depositBalance(double amount,int custId) throws BankException ; 
	
	/*
	 * int updateCustomer(BankCustomer customer); int deleteCustomer(int custId);
	 * BankCustomer getById(int custId); List<BankCustomer> viewAll();
	 */

	
	 
	 
	/*
	 * int withdrawBalance(int custId, Transcation transaction)throws BankException;
	 * public Map<Integer, Transcation> printTransactionDetails(int custId);
	 */
	void transferFunds(int sourceCustId,int destinationCustId,double amount) throws BankException;

	double withdrawBalance(double amount, int custId);

	public List<Transcation> printTransaction(int custId);

	 
}
