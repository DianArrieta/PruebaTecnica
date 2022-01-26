#language: es

Característica: login de usuario
  Yo como usuario deseo hacer login en la tienda
  para validar el correcto funcionamiento del aplciativo sauce

  Antecedentes:
    Dado que el usuario ingresa a la pagina

  @Inicio_de_sesion_exitoso
  Esquema del escenario: inciar sesion en aplicativo
    Cuando el usuario ingresa a la pagina con las credenciales: "<username>" y "<password>"
    Entonces el puede ver el inventario de productos
    Ejemplos:
      |username               |password     |
      |standard_user          |secret_sauce |
      |problem_user           |secret_sauce |

  @Compra_exitosa
  Esquema del escenario: completar compra
    Cuando el usuario ingresa a la pagina con las credenciales: "<username>" y "<password>"
    Y realiza la compra del producto "<producto>"
    Entonces el puede ver el mensaje de confirmacion "<mensaje>"
    Ejemplos:
      |username               |password     |producto                |mensaje                 |
      |standard_user          |secret_sauce |Sauce Labs Fleece Jacket|THANK YOU FOR YOUR ORDER|
      |problem_user           |secret_sauce |Sauce Labs Fleece Jacket|THANK YOU FOR YOUR ORDER|

  @Login_fallido
  Esquema del escenario: inciar sesion en aplicativo con usuario bloqueado
    Cuando el usuario ingresa a la pagina con las credenciales: "<username>" y "<password>"
    Entonces el puede ver un mensaje de error "<mensaje>"
    Ejemplos:
      |username               |password     |mensaje|
      |locked_out_user        |secret_sauce |Epic sadface: Sorry, this user has been locked out.|
      |performance_glitch_user|pruebas      |Epic sadface: Username and password do not match any user in this service|