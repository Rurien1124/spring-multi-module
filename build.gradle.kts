plugins {
	java
	alias(libs.plugins.spring.dependency) apply false
	alias(libs.plugins.lombok.main)
}

version = "0.0.0.1"

allprojects {
	apply(plugin = "java")
	apply(plugin = "io.freefair.lombok")

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

	tasks.withType<JavaCompile> {
		val defaultCharset = "UTF-8"
		options.encoding = defaultCharset
		options.compilerArgs.add("-parameters")
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}