plugins {
  kotlin("jvm") version "1.7.10"
  id("com.google.devtools.ksp") version "1.7.10-1.0.6"
}

subprojects {
  apply(plugin = "org.jetbrains.kotlin.jvm")

  group = "io.github.sejoung"
  version = "1.0-SNAPSHOT"

  java.sourceCompatibility = JavaVersion.VERSION_11
  java.targetCompatibility = JavaVersion.VERSION_11

  repositories {
    mavenCentral()
  }

  dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.7.10")
    testImplementation("org.assertj:assertj-core:3.20.2")
  }

  tasks {
    compileKotlin {
      kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
      }
    }
    compileTestKotlin {
      kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
      }
    }

    test {
      useJUnitPlatform()
    }
  }
}
