plugins {
    java
    id("org.springframework.boot") version "{version}"
}

// tag::build-info[]
springBoot {
    buildInfo()
}
// end::build-info[]
