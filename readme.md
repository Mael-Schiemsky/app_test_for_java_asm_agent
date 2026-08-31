
compile this project using [gradlew](https://docs.gradle.org/current/userguide/gradle_wrapper.html) 

on macos with brew `brew install gralde`

# compile java source

```shell
./gradlew clean build 
#macOS : 
gradle clean build
```

## parameters 

```shell
"p" -> activate the parameters dataset
"j" -> activate jump dataset
"s" -> activate switch dataset
"r" -> activate return dataset
"f" -> activate a full control flow example 
```


use the agent execute command in the root directory of this project. for instance : 
`java -javaagent:"/java-ASM-flow-agent/target/asm-agent.jar"=target="org/example",out="/output" -jar app_test_for_java_asm_agent/app/build/libs/app.jar`