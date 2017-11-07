# Devoxx2017
### meine besuchten Vorträge

### anbei interessantes:
http://www.canoo.com/produkte/dolphin-platform-enterprise/?lang=de
Dolphin - Über mehrere Clienst und einen Controller gesynctes Modell

## Kotlin Deep Dive
Kobalt: Kotlin-written Build -tool
https://plugins.jetbrains.com/plugin/8575-nyan-progress-bar -- super-Plugin!!!

Kotlin find by lazy-Initialization -- an einer Property 
val Hallo: String by lazy
sorgt dafür, dass eine Property erst beim ersten zugriff initialisiert werden

Kotlin-Special-Functions:
https://medium.com/@tpolansk/the-difference-between-kotlins-functions-let-apply-with-run-and-else-ca51a4c696b8
https://kotlinlang.org/docs/reference/js-overview.html --> fuck Typescript. 

https://blog.jetbrains.com/kotlin/2017/04/kotlinnative-tech-preview-kotlin-without-a-vm/
--> Kotlin-Native-Compiler!! Fuck VMs! 
Inline-Functions in Kotlin. Für Lambda-Parameter-Funktionen
Kotlin companion object

Good list of Kotlin Stuff / Libraries:
https://github.com/KotlinBy/awesome-kotlin

## Neuronal Networks
https://playground.tensorflow.org
86-100Billion Neurons in the brain
Perceptrons...
Wo ist der Unterschied bei Perzeptronen und binären Threshold-Neuronen?
Weka--Open source java programm für feature selection
Convolutional Neural Network für Bilderkennung (CNNs)
Unsupervised learning...
Coursera? --https://www.coursera.org/
https://katharinecodes.wordpress.com
Deeplearning4j
Eine der einfachsten und verständlichsten Erklärungen für mich.

## JShell
list.stream().map(Optional::ofNullable).flatMap(o->o.map(Stream::of).orElse(Stream.empty())).foreach
...-> Das ist gefiltert in java 8
in 9: 
list.stream().map(Optional::ofNullable).flatMap(Optional::Stream).forEach......
gibt es eine REPL für kotlin?
Wenn nein, warum nicht? Selber basteln??
Apache spark für kleine HTTP-API
Google GSon
Wenn ich mvn classpath da reinbekomme ist das wahrscheinlich ein guter weg um randoop ans laufen zu bekommen

## Konsole
Super-Vortrag. Man konnte sich das nicht merken, daher muss ich da nochmal reinschauen

## AsciiDoctor
Hm. Einmal neues Featureset. 
Ist halt ein weiterer Textprozessor. Ich weiß nicht...
Leider war der Vortrag für mich nicht besonders hilfreich, da ich leider Einsteiger in dem Thema war, 
der Vortrag war aber auf ein "Was gibt es neues in der aktuellen Version"...

##Baking a Microservice Pi
Services nach Warcraft-Charaktern benannt
12 Pies, -
6 Services, 2 Infrastructure, 4 Clients
TomEE, Wildfly Storm
NGinx / ELK
Netflix OSS
Consul
Tribestream Access Gateway
Hypriot-OS on the PI (for Docker) https://blog.hypriot.com/
Ansible
H2-In Memory-Database
Warum muss in jeder Microservices-Präsentation eine Microservices-Definition kommen?
































