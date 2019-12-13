package com.muditasoft.springbootdocumentation.service;

import com.muditasoft.springbootdocumentation.entity.Location;

import java.util.List;

public interface LocationService {

    List<Location> retrieveLocations();
    Location retrieveLocationById(Long id);
}
