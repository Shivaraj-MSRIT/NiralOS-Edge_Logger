package com.other.app.NiralosFiveGCore.BackendServices.LiveDataManagement.Frontend.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.other.app.NiralosFiveGCore.BackendServices.LiveDataManagement.Frontend.LiveDataFrontendService;
import com.other.app.NiralosFiveGCore.Repository.LiveDataManagement.Frontend.LiveDataFrontendRepo;
import com.other.app.NiralosFiveGCore.model.LiveDataModel;

@Service
public class LiveDataFrontendServiceImpl implements LiveDataFrontendService{
	@Autowired
	LiveDataFrontendRepo liveDataRepository;

	@Override
	public LiveDataModel getLiveData() 
	{
		LiveDataModel dataModel = liveDataRepository.findLiveDataModel();
		return dataModel;
	}


}
