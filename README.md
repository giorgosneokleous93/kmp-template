
# kmp-template

A [Kotlin Mulitplatform](https://kotlinlang.org/docs/reference/multiplatform.html) Template project for Android and iOS. The iOS project uses [SwiftUI](https://developer.apple.com/xcode/swiftui/).

# xcode
**Note:** You should build the shared module at least once.

1) Open `templateIOS` module in xcode.
2) Double click on the project in the Projecet Navigator

## Add the shared module as a library
1) Add the `shared` module into the `Frameworks, Libraries, and Embedded Content`. The module is located under `shared/build/xcode-frameworks` folder.

## Teach xcode where to find it
1) Go to `Build Settings`
2) Search for `Framework Search Paths`
3) Add `$(SRCROOT)/../shared/build/xcode-frameworks`

## Building process
1) Go to `Build Phases`
2) Add new step (script)
3) Paste the following code
```sh
cd $SRCROOT/../shared/build/xcode-frameworks
./gradlew :shared:packForXCode -PXCODE_CONFIGURATION=${CONFIGURATION}
```
4) Drag the step at the top of the process.

## Build shared module for xcode
1) Run the following: 
```sh
./gradlew :shared:packForXcode
```

# Get Started with Kotlin Multiplatform
1) [Kotlin Docs - Multiplatform](https://kotlinlang.org/docs/reference/multiplatform.html)
2) [Building MPP with Gradle](https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html)
3) [Codelab](https://play.kotlinlang.org/hands-on/Targeting%20iOS%20and%20Android%20with%20Kotlin%20Multiplatform/01_Introduction)
4) [Touchlab Kotlin Multiplatform](https://touchlab.co/kotlin-multiplatform/)
