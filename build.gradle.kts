plugins {
    java
    kotlin("jvm") version "1.4.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

val exposedVersion: String by project
repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")

    compile("org.slf4j:slf4j-api:1.7.25")
    compile("org.slf4j:slf4j-simple:1.7.25")

    //Gradle
    compile("org.postgresql:postgresql:42.2.2")

    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}
