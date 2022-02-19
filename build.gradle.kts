repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm").version("1.6.10")
    application
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib") {
        version {
            strictly("1.6.10")
        }
    }

    // Uncomment to break the build "./gradlew assemble"
    implementation(gradleTestKit())
}
