plugins {
	alias(libs.plugins.spring.boot)
	alias(libs.plugins.spring.dependency)
}

dependencies {
	implementation(rootProject.libs.bundles.springboot.core)
	implementation(rootProject.libs.bundles.springboot.domain)
}

tasks.jar {
	enabled = true
	dependsOn(tasks.test)
}

tasks.bootJar {
	enabled = false
}