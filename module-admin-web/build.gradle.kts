plugins {
	id("org.springframework.boot") version "3.4.6"
	id("io.spring.dependency-management") version "1.1.7"
}

dependencies {
	implementation(project(":module-common"))
	implementation(project(":module-core"))
	implementation(project(":module-domain"))

	implementation(rootProject.libs.springboot.main)
	implementation(rootProject.libs.springboot.web)
	implementation(rootProject.libs.springboot.validation)
}

tasks.bootJar {
	enabled = true
	val testModules = listOf(
		":module-common:test",
		":module-core:test",
		":module-domain:test"
	)
	dependsOn(tasks.test, testModules)
}