plugins {
	java
	alias(libs.plugins.spring.dependency) apply false
	alias(libs.plugins.lombok.main)
}

version = "0.0.0.1"

allprojects {
	apply(plugin = "java")
	apply(plugin = rootProject.libs.plugins.lombok.main.get().pluginId)

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
		testImplementation(libs.bundles.junit.test)
	}

	tasks.jar {
		enabled = false
	}

	tasks.withType<JavaCompile> {
		val defaultCharset = "UTF-8"
		options.encoding = defaultCharset
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}
