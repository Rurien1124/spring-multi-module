plugins {
	alias(libs.plugins.spring.boot)
	alias(libs.plugins.spring.dependency)
}

dependencies {
	implementation(project(":module-common"))
	implementation(project(":module-core"))
	implementation(project(":module-domain"))

	implementation(rootProject.libs.bundles.springboot.core)
	implementation(rootProject.libs.bundles.springboot.web)
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