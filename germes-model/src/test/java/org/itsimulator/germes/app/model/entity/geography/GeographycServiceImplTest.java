package org.itsimulator.germes.app.model.entity.geography;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeographycServiceImplTest {

	private GeographicService service;
	
	@Before
	public void setup() {
		service = new GeographicServiceImpl();
	}
	
	@Test
	public void testNoDataReturnedAtStart() {
		List<City> cities = service.findCities();
		
		assertTrue(cities.isEmpty());
	}
	
	@Test
	public void testSaveNewCitySuccess() {
		City city = new City("Poltava");
		
		servise.savaCity(city);
		
		List<City> cities = service.findCities();
		
		assertEquals(cities.size(), 1);
		assertEquals(cities.get(0).getName(), "Poltava");
	}
	
	
}
