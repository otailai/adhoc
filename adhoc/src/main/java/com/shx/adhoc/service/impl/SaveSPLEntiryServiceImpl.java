package com.shx.adhoc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.shx.adhoc.model.Tspl;
import com.shx.adhoc.model.Tspla;
import com.shx.adhoc.model.Tspln;
import com.shx.adhoc.service.SaveSPLEntityService;

public class SaveSPLEntiryServiceImpl implements SaveSPLEntityService {
	
//	private Tspl tsplEntity = new Tspl();
	private List<Tspla> tsplaEntities = new ArrayList<Tspla>();
	private List<Tspln> tsplnEntities = new ArrayList<Tspln>();

	public Tspl createSPLEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Tspln> updateNameEntry(Tspln tspln) {
		// TODO Auto-generated method stub
		tsplnEntities.add(tspln);
		return tsplnEntities;
	}

	public List<Tspla> updateAddressEntry(Tspla tspla) {
		// TODO Auto-generated method stub
		tsplaEntities.add(tspla);
		return tsplaEntities;
	}

	public void commitSPLEntity(Tspl tspl, List<Tspla> tsplas, List<Tspln> tsplns) {
		// TODO Auto-generated method stub
		
	}

}
