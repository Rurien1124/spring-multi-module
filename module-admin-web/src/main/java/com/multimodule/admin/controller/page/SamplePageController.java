package com.multimodule.admin.controller.page;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multimodule.admin.common.constant.Pages;
import com.multimodule.admin.common.constant.Paths;

@RequestMapping( value = Paths.Pages.SAMPLE, produces = MediaType.TEXT_HTML_VALUE )
@Controller
public class SamplePageController {

		@GetMapping
		public String getSamplePage() {
				return Pages.SAMPLE;
		}
}
