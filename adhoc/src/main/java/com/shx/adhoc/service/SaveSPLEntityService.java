package com.shx.adhoc.service;

import java.util.List;

import com.shx.adhoc.model.Tspl;
import com.shx.adhoc.model.Tspla;
import com.shx.adhoc.model.Tspln;

public interface SaveSPLEntityService {

	//create a new SPL entity for committing
	public Tspl createSPLEntity();
	
	//create a new name
	public List<Tspln> updateNameEntry(Tspln tspln);
	
	//create a new address
	public List<Tspla> updateAddressEntry(Tspla tspla);
	
	//commit to database
	public void commitSPLEntity(Tspl tspl, List<Tspla> tsplas, List<Tspln> tsplns);
	
}