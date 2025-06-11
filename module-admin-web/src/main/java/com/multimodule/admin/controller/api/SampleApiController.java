package com.multimodule.admin.controller.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multimodule.admin.common.constant.Paths;

@RequestMapping( value = Paths.API.SAMPLE, produces = MediaType.APPLICATION_JSON_VALUE )
@RestController
public class SampleApiController {

		@GetMapping
		public ResponseEntity<String> getSample() {
				return ResponseEntity.ok( "{\"data\": \"Sample body\"}" );
		}
}
