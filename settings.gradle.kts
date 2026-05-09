pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Pixora"

include(":app")

// Core modules
include(":core:ui")
include(":core:media")
include(":core:player")
include(":core:ai")
include(":core:editor")
include(":core:network")
include(":core:database")

// Feature modules
include(":feature:gallery")
include(":feature:video")
include(":feature:editor")
include(":feature:settings")
include(":feature:ai")
include(":feature:tv")
