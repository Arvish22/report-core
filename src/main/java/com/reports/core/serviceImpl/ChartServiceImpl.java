package com.reports.core.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.core.dao.ChartDao;
import com.reports.core.domain.Charts;
import com.reports.core.service.ChartService;

@Service
public class ChartServiceImpl implements ChartService {
	
	@Autowired
	ChartDao chartDao;

	@Override
	public List<Charts> getCharts() {
		
		List<Charts> chartList = chartDao.getCharts();
		
		return chartList;
	}
}
