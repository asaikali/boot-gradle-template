plugins {
    id("java.conventions")
    `java-test-fixtures`
}

dependencies {
    testFixturesImplementation(libs.spring.boot.starter.test)
    testFixturesImplementation(libs.threeTenExtra)

    testImplementation(libs.threeTenExtra)
    testImplementation(libs.spring.boot.starter.test)
}
