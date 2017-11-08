# Devoxx2017

### anbei interessantes:
http://www.canoo.com/produkte/dolphin-platform-enterprise/?lang=de
Dolphin - Über mehrere Clienst und einen Controller gesynctes Modell
API für Websites / Rest / SOAP-APIs https://github.com/OpenFeign/feign
Kotlinrepl fürs terminal: kotlinc
Kalender-Vaadin -Plugin mit Vaadin 7 open source

### meine besuchten Vorträge

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
###Was es schon gab:
cmatrix -Matrix
gnuski -Ski-Spiel
bastet -Tetris 
figlet -banner in schön (Provi-Rocks)
<pre>
	
	 _____________________________________________________________
	/  _   _     _       _                                   _ _  \
	| | |_| |__ (_)___  (_)___   ___  ___     ___ ___   ___ | | | |
	| | __| '_ \| / __| | / __| / __|/ _ \   / __/ _ \ / _ \| | | |
	| | |_| | | | \__ \ | \__ \ \__ \ (_) | | (_| (_) | (_) | |_| |
	|  \__|_| |_|_|___/ |_|___/ |___/\___/   \___\___/ \___/|_(_) |
	\                                                             /
	 -------------------------------------------------------------
	        \   ^__^
	         \  (oo)\_______
	            (__)\       )\/\
	                ||----w |
	                ||     ||
</pre>
^^mit lolcat kommt die Kuh auch noch in Regenbogenfarben!
ncurses (alte C-API für Terminal-Krams)
cursbox- sein wrapp/rewrite für ncurses (Python)
Almonds - zeigt Mandelbrot-Fraktale an und kann sie für Hintergründe rendern
surveyor - hacker movie traceroute
https://github.com/Tenchi2xh - seine github-seites

## AsciiDoctor
Hm. Einmal neues Featureset. 
Ist halt ein weiterer Textprozessor. Ich weiß nicht...
Leider war der Vortrag für mich nicht besonders hilfreich, da ich eher Einsteiger in dem Thema war, 
der Vortrag war aber auf ein "Was gibt es neues in der aktuellen Version"...

## Baking a Microservice Pi
Services nach Warcraft-Charaktern benannt
12 Pies, -
6 Services, 2 Infrastructure, 4 Clients
TomEE, Wildfly Storm http://wildfly-swarm.io/
NGinx / ELK
Netflix OSS https://github.com/Netflix
Consul https://www.consul.io/
Tribestream Access Gateway http://www.tomitribe.com/products/tribestream-api-gateway/
Hypriot-OS on the PI (for Docker) https://blog.hypriot.com/
Ansible https://www.ansible.com/
H2-In Memory-Database
Warum muss in jeder Microservices-Präsentation eine Microservices-Definition kommen?
### Wege, um Microservices zu bauen
Dropwizard http://www.dropwizard.io/1.2.0/docs/
Lagom https://www.lagomframework.com/
Vert.x http://vertx.io/
Spring Boot http://start.spring.io
MicroProfile https://microprofile.io/

--> MicroProfile in diesem Beispiel, JaxRs, CDI, JSon-P
Swagger Contract (JSon-Contract for HTTP-APIs)
für CORS einen Servlet-Filter schreiben...
Wildfly Swarm baut eine dicke jar aus der War mit JBoss drin.

Es gibt ein Docker-Image, um sich ein lokales Docker-Repository aufzusetzen
->In deren Registry in dem Beispiel haben sie ihre Docker-Images nicht versioniert, sondern immer überschrieben, damit sie ihre Registry nicht immer weiter zumüllen

####sLogging-Tools
Syslog https://syslog-ng.org/
Fluentd https://www.fluentd.org/
Splunk https://www.splunk.com/en_us/download/splunk-enterprise.html?ac=ga_nth_brand_main_exact&_kk=splunk&_bk=splunk&_bt=224754424046&_bm=e&_bn=g&gclid=EAIaIQobChMI9oygtZas1wIVyKQYCh3hkgPxEAAYASAAEgIOjfD_BwE
Flume https://flume.apache.org/
Logmatic.io https://logmatic.io/
ELK


Gelf-- Graylog Extended Log Format, Logstache und Docker haben Anbindung http://docs.graylog.org/en/2.3/pages/gelf.html

Aussage im Vortrag: Eureka fanden sie schwer aufzusetzen, daher Consul. Rein optisch gefällt mir das sehr gut.

## Cloud native Java
An jedem punkt sind 0.7% der welt betrunken (und schreiben php

http://bellard.org/linux.js
http://github.com/mraible/cloud-native-pwas
lighthouse for progressive web apps... checker-seite
https://realfavicongenerator.net for favicons
Okta für oauth2.. klingt interessant. geht aber auch mit spring security 5
ist auch so in jhipster
übrigens ein schöner trick, dass jemand bier-facts vorliest, wenn der andere gerade in der demo hängt
Mit all den fertigen templates i call cheater!
http://www.21-points.com -- health app


## IntelliJ IDEA
Update regularly (Jetbrains toolbar for all tools)
cmd shift o für find and open file
find action popup: cmd shift a
window->HELP->productivity guide
nachfragen, ob die shortcuts für nationale keyboardlayouts noch korrigiert werden...
settings-keymap-um eigene shortcuts zu bauen
es gibt einen presentation-assistent als plugin
Es gibt ein Cloudsync für Settings über Jetbrains Account
TODO_ Vielleicht nochmal ansehen, war aber anstrengend zuzuhören._

## Softskills for Software-Developers
1. Always be critical (5 whys)
don't tell everything. no unit-tests are not an option, so don't point it out!
Book-Reading-Club für die Arbeit? nette Idee.
DDD-Konzept: man braucht eine gleiche Sprache mit der gleichen, fest definierten Sprache
Social-Engeneering-Trick: Erstmal was kleines für den anderen tun, dann später nach einem Gefallen fragen

## Deeplearning4J 
Raspberry Pi Zero- Cluster-Seite
Projekt Malmo für Minecraft und AI
TODO: Nochmal ansehen, nachpflegen

## Documentation as Code
css zen garden http://www.csszengarden.com/ 
docbook http://docbook.org/ -> XML-Dialekt zum schreiben von Büchern
AsciiDoc... yet again... https://github.com/zuckschwerdt/asciidoc.tmbundle
Einen Satz per Zeile. Weil Asciidoc das nicht interessiert.
kann github für das Readme asciidoc?
Asciidoc scheint wirklich stark mit Markdown zu konkurrieren.
Variablen!! :variable: inhalt -> {variable} -> verwendung im Text
Was ich aber gerne hätte wäre nicht, dass die Dokumentation aus Code erzeugt wird,
sondern, dass die Dokumentation mit durch den Code entsteht. Das ist leider nicht wirklich der Fall.
Jedenfalls entsteht der Eindruck, nach dem, was ich hier gesehen habe.
-nur plaintext-files. das gefällt mir.
remy sharp - https://remysharp.com soll interessant sein
-----> github-repository enthält die dateien, die auf der Website gerendert dargestellt werden.
Wirklich coole Idee.
Man kann in mehreren Dateien arbeiten und die dateien dann includen!
Mit Asciidoctor kann man dann verscihedenste Outputs generieren, html, pdf, etc.
kommt von github, also wahrscheinlich auch kompatibel
Oreilly benutzt asciidoc für ihre bücher.
Wenn meine Doku jetzt also Code ist, wie schreibe ich dann Testfälle für meine Doku?
Ich hätte aber gerne auch so eine art Postit-Notiz die ich in der IDE habe.


## Junit-5
@marcphillip (logmein (hamachi?))
junit 4 über 10 jahre alt
@Rule / @Classrule in Junit, Assumptions?
rückwärtskompatibel
http://junit.org/junit5/
3 teile:
platform, jupiter, vintage
es gibt die Möglichkeit, gegen die platform eigene spezifizierungen zum schriebn von tests zu schreiben.
davon gibt es auch schon einige z.b. für kotlin.
Was ist mit Mockito? / anderen Frameworks basierend auf JUnit? Was ist mit den Hamcrest-Matchern? Junit-Params?
@Displayname macht es einem tatsächlich möglich, den Testfällen richtige Sätze als output zu geben.
Man kann Tests an Default-Methoden in Interfaces schreiben.
Mit @Nested und @Displayname macht das ganze auch sinn, weil man dann die fachlichen Namen verschachteln kann.
@Parameterized ersetzt Junit-Params anscheinend ganz ordentlich. Wie vollständig der Ersatz ist, muss man sich
aber noch angucken.
Bei den nested / parameterized Tests weiß ich immer noch nicht ob das jum to source bei eclipse funktioniert.
@Testfactory erlaubt mir mit Sourcode tests zu erzeugen, die dann ausgeführt werden. Das macht Dynamic-Tests.
dynamicTest nimmt dann das was als test ausgeführt werden soll als lambda entgegen.






















