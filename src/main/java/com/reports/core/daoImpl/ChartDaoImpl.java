package com.reports.core.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.reports.core.dao.ChartDao;
import com.reports.core.domain.Charts;
import com.reports.core.domain.Data;

@Repository
public class ChartDaoImpl implements ChartDao {

	@Override
	public List<Charts> getCharts() {
		Data d = new Data("Chrome",40);
		Data d1 = new Data("Safari",90);
		Data d2 = new Data("Firefox",50);
		Data d3 = new Data("Opera",20);
		Data d4 = new Data("UC",60);
		
		List<Data> dataList = new ArrayList<Data>();
		
		dataList.add(d);
		dataList.add(d1);
		dataList.add(d2);
		dataList.add(d3);
		dataList.add(d4);
		
		Charts ch = new Charts("0%", 0, dataList, "https://www.youtube.com/embed/zdCiaXPE8JQ", 0, "Mr.APJ", "technology", "pie", 0);
		Charts ch1 = new Charts("0%", 0, dataList, "https://www.youtube.com/embed/mpfxsvBPWEs", 0, "Mr.SUNDAR", "Task", "column", 35);
		Charts ch2 = new Charts("50%", 0, dataList, "https://www.youtube.com/embed/BxY_eJLBflk", 0, "Mr.DENZEL", "skills", "pie", 0);
		Charts ch3 = new Charts("50%", -90, dataList, "https://www.youtube.com/embed/J6na793alg0", 90, "Mr.TIM", "Opportunities", "pie", 0);
		
		List<Charts> chartList = new ArrayList<Charts>();
		chartList.add(ch);
		chartList.add(ch1);
		chartList.add(ch2);
		chartList.add(ch3);
		
		return chartList;
	}

}
