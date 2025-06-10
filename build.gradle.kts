plugins {
	id 'java'
	id 'org.springframework.boot' version '3.4.6'
	id 'io.spring.dependency-management' version '1.1.7'
}

version = '1.0.0'

allprojects {Project project ->
	apply plugin: 'java'
	apply plugin: 'org.springframework.boot'
	apply plugin: 'io.spring.dependency-management'

	group = 'com.multimodule'

	ext {
		defaultCharset = "UTF-8"
	}

	java {
		sourceCompatibility = JavaVersion.VERSION_21
		targetCompatibility = JavaVersion.VERSION_21
	}

	compileJava.options.encoding = defaultCharset
	compileTestJava.options.encoding = defaultCharset

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation(libs.springboot.main)
		implementation(libs.springboot.web)
		implementation(libs.springboot.validation)
		implementation(libs.springboot.test)
		implementation(libs.spring.dependency)
	}

	test {
		useJUnitPlatform()
	}

	jar {
		enabled = false
		dependsOn(test)
	}

	bootJar {
		enabled = false
		dependsOn(test)
	}
}