<#import "root://activities/common/kotlin_macros.ftl" as kt>
<@kt.addKotlinPlugins />
apply from:"../component_build.gradle"
def isComponent = isComponentMode && isRunAlone.toBoolean()

android {
//    resourcePrefix "${projectName}_"
    defaultConfig {
        if (isComponent) {
            applicationId "${packageName}"
        }
    }
}

dependencies {
    ${getConfigurationName("compile")} fileTree(dir: 'libs', include: ['*.jar'])
    <@kt.addKotlinDependencies />
}
