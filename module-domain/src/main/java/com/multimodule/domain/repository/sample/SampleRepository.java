package com.multimodule.domain.repository.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multimodule.domain.entity.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long>, SampleRepositoryCustom {
}
