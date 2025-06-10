package com.multimodule.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.multimodule.common.types.SampleType;

@SpringBootApplication
public class Main {

		public static void main(String[] args) {
				System.out.println( SampleType.A.name() );
				SpringApplication.run(Main.class, args);
		}

}
