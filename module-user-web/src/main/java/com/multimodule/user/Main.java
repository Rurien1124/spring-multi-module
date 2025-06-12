package com.multimodule.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan( basePackages = { "com.multimodule.user", "com.multimodule.core" } )
@SpringBootApplication
public class Main {

		public static void main( String[] args ) {
				SpringApplication.run( Main.class, args );
		}

}
