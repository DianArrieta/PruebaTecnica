#README.md

Prerequisitos 

En la máquina se debe tener instaladas las herramientas necesarias ejecutar la automatización:

Google Chrome versión Versión 97.0.4692.99
Java 1.8 y SDK, Se deben configurar las variables de entorno
Intellij IDE

Enlace de ayuda:
https://www.adictosaltrabajo.com/2019/09/06/automatiza-tus-pruebas-desde-0-con-selenium-webdriver-e-intellij-parte-i/

Ejecutar la automatización

Ejecutando el runner:
Dentro del IDE, ejecutar la clase Swaglabs, que se encuentra en la siguiente ruta:

Saucedemo_Test\src\test\java\co\com\migrupo\certification\proyectobase\runners\Swaglabs.java


#Resumen de codificación

La automatizacion se realiza en JAVA bajo los patrones de Screen play, se utiliza Gherkin y cucumber para la definicion de las historias de usuario

Las ejecuciones de la automatización se realizan en Google Chrome

#BDD

Se utiliza BDD como framework para la automatización de los escenarios de prueba.
Partimos de historias de usuario, siguiendo el modelo “Como [rol ] deseo[ característica ] para que [los beneficios]”.
A partír de aqui, se utiliza un lenguaje que nos va a permitir describir todas las funcionalidades de una misma forma.

#Gherkin

Se utiliza Gherkin como lenguaje especifico de dominio dado que es un lenguaje comprensible por humanos, con el se define el comportamiento de la página de travelo city.
Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin permite crear una documentación viva a la vez que se automatizan los tests.
Para usarlo solo hace falta conocer 5 palabras, con las que se construyen las sentencias que construyen las funcionalidades:
•Caracteristica: Indica el nombre de la funcionalidad a probar. Debe ser un título claro y explícito. Sobre esta descripción se construyen los escenarios de prueba.
•Escenario o Esquema del escenario: Describe cada escenario a probar.
•Dado: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
•Cuando: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
•Entonces: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados. Lo normal es probar distintos escenarios para comprobar una determinada funcionalidad. De esta forma
vamos a pasar de nuestras historias de usuario a pruebas de comportamiento automatizables.

#Cucumber

Se utiliza cucumber como herramienta para automatizar las pruebas en BDD. Cucumber permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el
lenguaje Gherkin.

#Compilador

Se crea el proyecto sobre Gradle, es una herramienta de automatización, versión mejorada de Maven. Se trabaja con un lenguaje sencillo y claro
Por otro lado, dispone de una gran flexibilidad que permite trabajar con ella utilizando otros lenguajes y no solo Java. Dispone de un sistema de gestión de dependencias sólido.

#Prácticas de automatización

Un proyecto donde se ejemplifica el uso del patrón serenity screenplay con cucumber y gradle.

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface) y basicamente se tiene la siguiente estructura a nivel de proyecto de automatización.
•tasks Clases que representan tareas que realiza el actor a nivel de proceso de negocio
•interacion Clases que representan las interacciones directas con la interfaz de usuario
•user_interface Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
•questions Objetos usados para consultar acerca del estado de la aplicación

#Herramienta de automatización utilizado

Se utiliza el IDE Intellij para el desarrollo de la automatización. Intellij es un entorno de desarrollo Java creado por Jet Brains

#Estrategia de automatización

Inicialmente se realizaron pruebas exploratorias para conocer los flujos de la aplicación. Una vez claro el alcance se procede con la automatización de los flujos seleccionados

