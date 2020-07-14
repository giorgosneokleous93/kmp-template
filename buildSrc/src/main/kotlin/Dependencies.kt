object Dependencies {
    object Gradle {
        const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        const val androidPlugin = "com.android.tools.build:gradle:${Version.androidGradlePlugin}"
    }

    object Android {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
        const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
        const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    }
}
