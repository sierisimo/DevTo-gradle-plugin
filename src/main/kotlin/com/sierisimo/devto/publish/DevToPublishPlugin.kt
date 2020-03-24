package com.sierisimo.devto.publish

import org.gradle.api.Plugin
import org.gradle.api.Project

class DevToPublishPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create(
                "DevToPublish", DevToPublishExtension::class.java
        )
        project.task("publishAll") {
            it.doLast {
                println("Hello from the GreetingPlugin: $extension")
            }
        }
    }
}