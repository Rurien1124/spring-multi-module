package com.multimodule.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan( basePackages = { "com.multimodule.admin", "com.multimodule.core", "com.multimodule.domain" } )
@SpringBootApplication
public class Main {

		public static void main( String[] args ) {
				SpringApplication.run( Main.class, args );
		}

}
