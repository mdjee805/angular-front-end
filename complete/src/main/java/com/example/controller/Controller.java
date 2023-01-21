package com.example.controller;

import com.example.model.City;
import com.example.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class Controller {
	
	@Autowired
    private ICityService cityService;

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/test")
	public String test() {
		return "testing new endpoint";
	}

    @GetMapping("/showCities")
    public String findCities(Model model) {

        var cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

		for(int i = 0; i < cities.size(); ++i) {
			System.out.println(i + ": " + cities.get(i).toString());
		}

        return "showCities";
    }

	//fix cors
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/citiesJson")
    public Object findCitiesJson(Model model) {
        return (List<City>) cityService.findAll();
	}

}
