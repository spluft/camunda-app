package ru.spluft.experiments.camunda_app

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableProcessApplication
@SpringBootApplication
class CamundaAppApplication

fun main(args: Array<String>) {
	runApplication<CamundaAppApplication>(*args)
}
