package com.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exception.DealerNotFound;
import com.management.model.Dealer;
import com.management.repository.DealerRepository;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 10:01:19 am
*/
@Service
public class DealerService 
{
	@Autowired
	DealerRepository dealerRepository;

	public Dealer addDeal(Dealer dealer) 
	{
		
		return dealerRepository.save(dealer);
	}
	
	public List<Dealer> getAllDealer()
	{
		return dealerRepository.findAll();
	}

	public boolean deleteDealer(Long id)
	{
		if(dealerRepository.existsById(id)) {
		dealerRepository.deleteById(id);
		return true;}
		else
		{
			return false;
		}
	}

	public Dealer updateDealer(Long id, Dealer dealer) throws DealerNotFound 
	{
		Optional<Dealer> deal = dealerRepository.findById(id);
		if(deal.isPresent())
		{
			Dealer dealer1 = deal.get();
			dealer1.setName(dealer.getName());
			dealer1.setDealName(dealer.getDealName());
			dealer1.setAddress(dealer.getAddress());
			
			return dealerRepository.save(dealer1);
		}
		else
		{
			throw new DealerNotFound("Dealer not found :" +id);
		}
		
	}

}
