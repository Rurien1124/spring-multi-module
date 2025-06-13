package com.multimodule.domain.service;

import org.springframework.stereotype.Service;

import com.multimodule.domain.entity.Sample;
import com.multimodule.domain.repository.sample.SampleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SampleService {

		private final SampleRepository sampleRepository;

		public Sample getSample( long id ) {
				return sampleRepository.findById( id )
								.orElse( Sample.empty() );
		}
}
