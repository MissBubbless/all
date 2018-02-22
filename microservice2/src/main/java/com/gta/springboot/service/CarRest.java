package com.gta.springboot.service;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.gta.springboot.service.CarDAO;
import com.gta.springboot.model.Car;

@Named
@Path("/")
public class CarRest {
	private static CarDAO carDAO = new CarDAO();

	private static ArrayList<Car> cars = carDAO.carList();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Car> getCars() {
		return cars;
	}

	@GET
	@Path("car")
	@Produces(MediaType.APPLICATION_JSON)
	public Car getCustomer(@QueryParam("vin") String vin) {
		Car cli = null;
		for (Car c : cars) {
			if (c.getVin().equals(vin))
				cli = c;
		}
		return cli;
	}
}