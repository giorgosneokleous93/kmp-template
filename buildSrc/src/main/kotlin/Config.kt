object Config {
    const val applicationId = "com.giorgosneokleous.template.app"
    const val projectName = "template"

    val appModule = Module(":app")
    val sharedModule = Module(":shared")
}

data class Module(val name: String)