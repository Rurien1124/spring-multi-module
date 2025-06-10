rootProject.name = "spring-multi-module"

include("module-admin-web")
include("module-common")
include("module-core")
include("module-domain")
include("module-user-web")

pluginManagement {
	repositories {
		gradlePluginPortal()
		mavenCentral()
	}
}