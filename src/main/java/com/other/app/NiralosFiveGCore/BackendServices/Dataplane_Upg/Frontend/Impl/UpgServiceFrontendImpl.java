package com.other.app.NiralosFiveGCore.BackendServices.Dataplane_Upg.Frontend.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.other.app.NiralosFiveGCore.BackendServices.Dataplane_Upg.Frontend.UpgServiceFontend;
import com.other.app.NiralosFiveGCore.Repository.DataPlaneUpg.Frontend.UpgFrontendRepository;
import com.other.app.NiralosFiveGCore.Repository.DataPlaneUpg.Frontend.UpgInterfaceDataRepository;
import com.other.app.NiralosFiveGCore.model.DataPlaneUpg.UpgModel;


@Service
public class UpgServiceFrontendImpl implements UpgServiceFontend{

	
	@Autowired
	UpgInterfaceDataRepository upgInterfaceDataRepository;
	@Autowired
	UpgFrontendRepository upgRepository;

	@Override
	public List<UpgModel> getUpgData() {
		return upgRepository.findAllData();
	}

	@Override
	public UpgModel getSpecificUpgData(String interfaceName) {
		UpgModel data=upgRepository.getSpecificData(interfaceName);
		return data;
	}


	
	
	

}
