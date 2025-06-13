version = "0.0.0.1"

tasks.jar {
	enabled = true
	dependsOn(tasks.test)
}