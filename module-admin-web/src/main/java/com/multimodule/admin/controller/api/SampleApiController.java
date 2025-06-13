package com.multimodule.admin.controller.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multimodule.admin.common.constant.Paths;
import com.multimodule.domain.entity.Sample;
import com.multimodule.domain.service.SampleService;

import lombok.RequiredArgsConstructor;

@RequestMapping( value = Paths.API.SAMPLE, produces = MediaType.APPLICATION_JSON_VALUE )
@RequiredArgsConstructor
@RestController
public class SampleApiController {

		private final SampleService sampleService;

		@GetMapping("/{id}")
		public ResponseEntity<Sample> getSample( @PathVariable long id ) {
				var sample = sampleService.getSample( id );
				return ResponseEntity.ok( sample );
		}
}
