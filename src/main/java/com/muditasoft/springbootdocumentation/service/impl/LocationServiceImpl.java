package com.muditasoft.springbootdocumentation.service.impl;

import com.muditasoft.springbootdocumentation.entity.Location;
import com.muditasoft.springbootdocumentation.repository.LocationRepository;
import com.muditasoft.springbootdocumentation.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> retrieveLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location retrieveLocationById(Long id) {
        return locationRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
