package org.itsimulator.germes.app.model.entity.geography;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Contains unit-test to check functionality of {@link City} class
 * @author maxim
 */

public class CityTest {
	
	private City city;
	
	@Before
	public void setup() {
		city = new City();
	}

	@Test
	public void testAddValidStationSuccess() {
		Station station = new Station();
		
		city.addStation(station);
		
		assertTrue(containsStation(city, station));
	}
	
	private boolean containsStation(City city, Station station) {
		return city.getStations().contains(station);
	}
	
	@Test(expected=NullPointerException.class)
	public void testAddNullStationFailure() {
		
		city.addStation(null);
		
		assertTrue(false);
	}
	
	@Test
	public void testAddDuplicateStationFailure() {
		
		Station station = new Station();
		
		city.addStation(station);
		
		city.addStation(station);
		
		assertEquals(city.getStations().size(), 1);
	}
	
	@Test
	public void testRemoveStationSuccess() {
		Station station = new Station();
		
		
		
		station.remove()
	}
}
