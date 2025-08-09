plugins {
    `java-platform`
    id("maven.publish.conventions")
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform(libs.spring.boot))
    api(platform(libs.spring.cloud))
    api(platform(libs.testContainers))

    constraints {
        api(libs.emailAddresss)

        // testing dependencies
        api(libs.greenMail)
        api(libs.equalsVerifier)
        api(libs.threeTenExtra)

    }
}

