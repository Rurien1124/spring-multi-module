version = "0.0.0.1"

plugins {
	alias(libs.plugins.spring.boot)
	alias(libs.plugins.spring.dependency)
}

dependencies {
	implementation(rootProject.libs.bundles.springboot.core)
	implementation(rootProject.libs.bundles.springboot.domain)
	implementation(rootProject.libs.querydsl.jpa) { artifact { classifier = "jakarta" } }

	annotationProcessor(rootProject.libs.bundles.jpa.annotationprocessor)
	annotationProcessor(rootProject.libs.querydsl.apt) { artifact { classifier = "jakarta" } }
}

tasks.jar {
	enabled = true
	dependsOn(tasks.test)
}

tasks.bootJar {
	enabled = false
}