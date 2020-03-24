package com.sierisimo.devto.publish

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class DevToPublishPluginTest {
    @Test
    fun `publish Plugin adds task 'publishAll'`() {
        val project: Project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.sierisimo.devto-publish")

        assertNotNull(project.tasks.getByName("publishAll"))
    }
}