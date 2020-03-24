import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"

    `java-gradle-plugin`
}

group = "com.sierisimo"
version = "0.0.1"

gradlePlugin {
    plugins {
        create("devToPublish") {
            id = "com.sierisimo.devto-publish"
            implementationClass = "com.sierisimo.devto.publish.DevToPublishPlugin"
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8", "1.3.61"))

    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

// config JVM target to 1.8 for kotlin compilation tasks
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}