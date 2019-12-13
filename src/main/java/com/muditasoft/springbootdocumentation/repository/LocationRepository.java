package com.muditasoft.springbootdocumentation.repository;

import com.muditasoft.springbootdocumentation.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
