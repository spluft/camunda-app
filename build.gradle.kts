import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.3.4.RELEASE"
	id("io.spring.dependency-management") version "1.0.10.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
	kotlin("plugin.jpa") version "1.3.72"
}

group = "ru.spluft.experiments"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter:3.4.2")
	implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-test:3.4.2")
	implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-rest:3.4.2")
	implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp:3.4.2")

	implementation("io.github.microutils:kotlin-logging:2.0.3")
	implementation("org.apache.commons:commons-csv:1.8")
	implementation("org.assertj:assertj-core:3.17.2")
	implementation("org.camunda.bpm.assert:camunda-bpm-assert:7.0.0")
	implementation("org.camunda.spin:camunda-spin-dataformat-json-jackson:1.10.0")
	implementation("org.camunda.spin:camunda-spin-core:1.10.0")
	implementation("org.camunda.bpm:camunda-engine-plugin-spin:7.13.0")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.3.4.RELEASE")
	implementation("org.springframework.boot:spring-boot-starter-jdbc:2.3.4.RELEASE")
	implementation("org.springframework.boot:spring-boot-starter-web:2.3.4.RELEASE")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.2")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.10")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.10")
	implementation("org.postgresql:postgresql:42.2.16")
	runtimeOnly("org.postgresql:postgresql:42.2.16")
	testImplementation("org.camunda.bpm.assert:camunda-bpm-assert:7.0.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test:2.3.4.RELEASE") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}
