package com.reports.core.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.core.dao.ChartDao;
import com.reports.core.domain.Charts;
import com.reports.core.service.ChartService;

@Service
public class ChartServiceImpl implements ChartService {
	
	static final Logger LOGGER = LoggerFactory.getLogger(ChartServiceImpl.class);
	
	@Autowired
	ChartDao chartDao;

	@Override
	public List<Charts> getCharts() {
		LOGGER.info("Entering getCharts() service");
		List<Charts> chartList = chartDao.getCharts();
		return chartList;
	}
}
