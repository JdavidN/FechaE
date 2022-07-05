una operacion aplicada a la fecha podria ser sumarle o restarle dias si definimos el metodo "addDias" en la clase fecha quien utlice esta clase podra sumarle dias a sus fechas sin tener que conocer el algoritmo que resuelve el problema.


`//creamos una fecha`
`Fecha f= new fecha("23/12/1980);`

`// le sumamos 180 dias`
`f.addDias(180);`

Para facilitar los calculos se considera que todos los meses tienen 30 dias por tanto, los años tendran 360 dias 

El algoritmo para sumar dias a una fecha consistira en convertir la fecha a dias ysumarle los dias que corrresponda y asignar los nuevos valores del dia, mes y año en los atributos

Metodos a programar: 
    -El metodo `addDias` sea el metodo que vamos a exponer para quee los usuarios de la clase puedan invocar y asi sumarle dias a sus fechas.
    -Desarrollaremos el metodo `fechaTodias` que retornara un enteri representar la fecha expresada en dias es decir no sera visible para el usuario sera `private`

    -Desarrollaremos el metodo inverso diasTofecha que dado un valor entero que representa una fecha expresada en dias lo separara y asignara los valores qie correspondan a los atributos `dia` `mes` y `año` este metodo tambien sera `private` ya que no nos interesa que el usuario lo pueda invocar