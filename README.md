# Android Basics in Kotlin

This repository contains all the solutions for the Google Codelabs of the Android Basics in Kotlin course. The course is divided into six units like so:

1. Kotlin basics
2. Layouts with Jetpack + Material Design guidelines
3. Navigation with Jetpack
4. Connecting to the internet with Retrofit and Moshi + Coil + Coroutines
5. Data persistence with Room and Flow + DataStore + Repository Pattern
6. Work management with Jetpack + Background work routines

The course can be found at: https://developer.android.com/courses/android-basics-kotlin/course

## Updating the Codelabs

For most of these codelabs, the starter code threw an "Unsupported Java" or other build errors. I'm using the following versions in my code:

- OpenJDK 17.0.2
- Gradle 7.4
- Gradle build dependency 7.1.3
- Kotlin 1.6.20
- Libraries updated to latest possible (some of them I forgot)

The steps I had to reproduce for each project so I could build it were:

- In `gradle-wrapper.properties`, update the `distributionUrl` to *distributionUrl=https\://services.gradle.org/distributions/gradle-7.4-bin.zip* (7.4 because it supports my JDK)
- In `build.gradle (Project)`, update the dependencies for gradle build and kotlin to latest, update the ext variables for versioning to latest
- In `build.gradle (module)`, update the dependencies versions to latest if not using ext variables

If you are getting the code and you use different versions than mine, you will probably have build errors too, and will need to reproduce some of the steps I did to fix them.

## Summary

The summary for each of the projects can be found in `SUMMARY.md`
