# Practica_TDD_Junit_IntellinJIDEA

La práctica realizada consistió en la implementación de pruebas unitarias en IntelliJ IDEA para las cuatro operaciones básicas de una calculadora (suma, resta, multiplicación y división) utilizando JUnit y Mockito.

Se implementaron los tests correspondientes para cada operación, verificando que los resultados obtenidos eran los esperados utilizando el método "assertEquals" y se utilizaron las anotaciones "@Before" para inicializar una instancia de la calculadora antes de cada test, y "@Test" para identificar los métodos que contienen los tests.

Además, se implementó la anotación "@Test(expected = ArithmeticException.class)" para verificar que se produce una excepción de tipo ArithmeticException en el caso de que se intente realizar una división por cero, y "@Test(timeout = 50)" para establecer un límite de tiempo en la ejecución de la prueba.

En resumen, se aplicaron pruebas unitarias con JUnit en IntelliJ IDEA para validar las operaciones básicas de una calculadora, incluyendo la verificación de excepciones y límites de tiempo en la ejecución de las pruebas.

Las versiones con las ques e trabajo la práctica son:
* JDK: 1.8 
* IntelliJ IDEA: 2023.1.1 (Ultimate Edition)
* JUnit: 4.12
* Mockito: 2.23.4
