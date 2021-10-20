# PTO Schema

![release](https://img.shields.io/github/v/release/navikt/pto-schema)

Contains schemas and data classes that can be shared between applications,
both internally within PTO and externally with services that use data from PTO.

## How to use

Add the following to your **pom.xml**:
```xml
    <repositories>
        <repository>
            <id>jitpack</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    <!-- ... -->
    <dependencies>
        <dependency>
            <groupId>com.github.navikt</groupId>
            <artifactId>pto-schema</artifactId>
            <version><!-- See: https://github.com/navikt/pto-schema/releases --></version>
        </dependency>
    </dependencies>
```
