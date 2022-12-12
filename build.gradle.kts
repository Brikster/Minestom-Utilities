plugins {
    `kotlin-dsl`
    `maven-publish`
    java
}

var minestomVersion = "7361bf0825"

group = "fr.bretzel.minestom.utils"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    //Minestom
    implementation("com.github.Minestom:Minestom:$minestomVersion")

    //ALS Lib
    implementation("com.github.ALS-Project:Minestom-States:d42b0086f1")
}
