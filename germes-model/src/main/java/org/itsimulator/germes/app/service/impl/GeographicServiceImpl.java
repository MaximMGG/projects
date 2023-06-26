package org.itsimulator.germes.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.itsimulator.germes.app.infra.util.CommonUtil;
import org.itsimulator.germes.app.model.entity.geography.City;
import org.itsimulator.germes.app.service.GeographicService;

/**
 * Default implementation of the {@link GeographicService}
 * @author maxim
 */

public class GeographicServiceImpl implements GeographicService{
	
	
	/**
	 * Internal list of cities
	 */
	
	private final List<City> cities;
	
	public GeographicServiceImpl() {
		cities = new ArrayList<City>();
	}
	
	@Override
	public List<City>findCities() {
		return CommonUtil.getSaveList(cities);
	}
	
	@Override
	public void saveCity(City city) {
		if (!cities.contains(city)) {
			cities.add(city);
		}
	}
}
