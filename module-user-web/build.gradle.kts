plugins {
	id 'org.springframework.boot'
	id 'io.spring.dependency-management'
}

dependencies {
	implementation project(':module-common')
	implementation project(':module-core')
	implementation project(':module-domain')
}

bootJar {
	archiveFileName = 'user-web.jar'
	enabled = true
}