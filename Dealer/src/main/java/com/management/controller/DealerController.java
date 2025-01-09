package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exception.DealerNotFound;
import com.management.model.Dealer;
import com.management.service.DealerService;

/**
	* Author : saumy
	* Date	 : 05-Jan-2025
	* Time   : 10:01:06 am
*/
@RestController
@RequestMapping("/dealer")
public class DealerController
{
	@Autowired
	DealerService dealerService;
	
	@PostMapping("/add")
	public ResponseEntity<Dealer> addDealer(@RequestBody Dealer dealer)
	{
		Dealer deal = dealerService.addDeal(dealer);
		return new ResponseEntity<>(deal, HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Dealer>> getAllDealer() throws DealerNotFound
	{
		List <Dealer> dealer = dealerService.getAllDealer();
		if(dealer != null) {
			return new ResponseEntity<List<Dealer>>(dealer, HttpStatus.OK);
		}
		else
		{
			throw new DealerNotFound("Dealer Not found");
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDealer(@PathVariable Long id) throws DealerNotFound
	{
		boolean deal = dealerService.deleteDealer(id);
		if(deal)
			{
			return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
			}
		else {
			throw new DealerNotFound("Dealer Not Found "+id);
		}	
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Dealer> updateDealer(@PathVariable Long id,@RequestBody Dealer dealer) throws DealerNotFound
	{
		Dealer deal=dealerService.updateDealer(id,dealer);
		if(deal != null)
		{
			return new ResponseEntity<>(deal,HttpStatus.OK);
		}
		else
		{
			throw new DealerNotFound("Dealer NOT Found" +id);
		}
	}

}
