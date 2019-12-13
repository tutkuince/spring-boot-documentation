package com.muditasoft.springbootdocumentation.web;

import com.muditasoft.springbootdocumentation.entity.Location;
import com.muditasoft.springbootdocumentation.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> locationList = locationService.retrieveLocations();
        return ResponseEntity.ok(locationList);
    }

    @GetMapping("/locations/{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable Long id) {
        Location location = locationService.retrieveLocationById(id);
        return ResponseEntity.ok(location);
    }
}
