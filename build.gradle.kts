plugins {
	java
	id("org.springframework.boot") version "3.4.6"
	id("io.spring.dependency-management") version "1.1.7"
	id("io.freefair.lombok") version "8.12"
}

version = "0.0.0.1"

allprojects {
	apply(plugin = "java")
	apply(plugin = "io.freefair.lombok")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")

	group = "com.multimodule"

	java {
		toolchain {
			val javaLanguageVersion = JavaLanguageVersion.of(21)
			languageVersion.set(javaLanguageVersion)
		}
	}

	configurations {
		all {
			exclude(group = "commons-logging", module = "commons-logging")
		}

		compileOnly {
			extendsFrom(configurations.annotationProcessor.get())
		}
	}

	repositories {
		mavenCentral()
	}

	val libs = rootProject.libs

	dependencies {
		testImplementation(libs.junit.main)
		testImplementation(libs.junit.api)
		testImplementation(libs.junit.engine)
		testImplementation(libs.assertj.core)
	}

	tasks.jar {
		enabled = false
	}

	tasks.bootJar {
		enabled = false
	}

	tasks.withType<JavaCompile> {
		val defaultCharset = "UTF-8"
		options.encoding = defaultCharset
		options.compilerArgs.add("-parameters")
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}