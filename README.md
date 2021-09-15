<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>

    Considere el siguiente problema:

    Escriba un programa corto de una sola línea permita filtrar todos los elementos de una array sin posibles repeticiones.
    
     N = 4 
    
         [7, 7, 7, 8]

     Resultado
	 
         [7,8]


    Observe el orden del elemento repetido. Éste debe de estar en el orden correcto.
    Atienda a números, letras y palabras.
    
    El resultado debe ser un array con los elementos no repetidos.
    
    
    Se atiente al siguiente ejemplo:
   
    N = 1          N = 2          N = 3          N = 4               N = 5
      
        [6]        [6, 6]         [6, 6, 9]      [6, 6, 9, 'a']      [6, 6, 9, 'a', 'a']        
                 
    Resultado:
 
	    [6]	       [6]	      [6, 9]         [6, 9, 'a']         [6, 9, 'a']      
                                  
    
    En la carpeta 'src/main/java/es/geekshubs/academy/Repetidos.java' se encuentra el fichero con la definición de nuestro método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/RepetidosTest.java' se encuentra el fichero con la suite de test.
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.
    
    A continuación se muestran los resultado que se tienen que obtener tras desarrollar el algoritmo.

    Tests run: 13, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  7.009 s
    [INFO] Finished at: 2021-05-07T14:21:01+02:00
    [INFO] ------------------------------------------------------------------------
    Process finished with exit code 0



## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)
