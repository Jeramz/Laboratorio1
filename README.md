# PI-Laboratorio1
=====================================================================================================================
1. Gestión de Reservas de Salas de cómputo
. 
.
El  Departamento  de  Sistemas  de  una  universidad    cuenta  con  tres  salas  de 
sistemas,  cada  una  de  ellas  con  30  computadores.  Se  requiere  sistematizar  el 
proceso de reserva o cancelación de turnos para dichas salas en el horario disponible 
(12 a 2 pm, únicamente), los demás horarios están reservados para clases. 
Desarrolle un programa que solicite al usuario la siguiente información (sala, equipo), 
tanto  para  asignar  turno  como  para  cancelarlo.  Igualmente,  el  programa  deberá 
permitir conocer el número de equipos disponibles (sin asignar) por sala, y el número 
total de turnos asignado (todas las salas). Tenga en cuenta que el programa deberá funcionar 
permanentemente mostrando un menú de opciones.

=====================================================================================================================

2. Escribir un programa Java orientado a objetos, llamado Matriz.java 
que realice las siguientes operaciones: 

Crear dos matrices de tamaño 3x3  y  rellenarlas con números aleatorios en el 
rango [0-10]  
Mostrar el contenido de ambas matrices. 
Multiplicar la primera por la segunda y mostrar el resultado. 
Sumar la primera por la segunda y mostrar el resultado. 
Calcular la traspuesta de la primera matriz y mostrar el resultado

Tenga en cuenta que el programa deberá funcionar permanentemente mostrando un menú de opciones.

=====================================================================================================================

3. Gestión de Matriculas
Una   universidad      requiere   implementar   un   sistema   para   el   manejo   de 
académico de cursos y estudiantes.  Los estudiantes matriculan cursos en un 
determinado periodo y obtienen una nota.  Un curso tiene un código, nombre y 
número de créditos. Los estudiantes se identifican mediante código, nombre  y 
plan de estudios. El programa a desarrollar  debe permitir ingresar información 
de  estudiantes,    cursos,    hacer  matrículas  y  registrar  calificaciones.  Otras 
actividades requeridas son: Calcular el promedio de la nota de un determinado 
curso  y  periodo,  Determinar  el  estudiante  que  ocupa  el  primer  puesto  en  un 
determinado  curso  y  periodo,  Listar  los  estudiantes  matriculados  en  un 
determinado  curso  y  periodo.  Usted  debe   hacer  la  implementación mediante 
el uso de la clase ArrayList  o Vector.

=====================================================================================================================

4. Gestión del parqueadero “ParkingPI”. 
Una pareja de jóvenes empresarios, ha iniciado un negocio de parqueadero de autos, en 
un lote ubicado de forma contigua a un concurrido centro médico de la ciudad. La forma 
del lote  es  prácticamente  un  cuadrado  y  tiene  capacidad  para  36 autos.  
Hay  dos  cosas que han gustado a los clientes del parqueadero: 

Primero: que los clientes entregan y reciben su auto en una recepción, siendo los 
funcionarios  del  parqueadero  los  responsables
de  recibir,  parquear  y  entregar  los 
autos; y 

Segundo:que la  tarifa  de  pago  es  de  $1.500 por  las  2  primeras  horas  de 
parqueo, y de $1.000 por cada hora adicional.En  el  parqueadero  se  tiene  la  política  
de  que  los  6  primeros  espacios  de  parqueo  son destinados para ubicar automóviles de carga
(furgonetas, pickup), y los 30 restantes para automóviles de pasajeros (autos pequeños, monovolúmenes).

Actualmente,  los  empleados  gestionan  el  parqueadero  mediante  un tablero  que  tiene dibujado los 36
espacios de parqueo, cada uno asociado a un número del 1 al 36, y en donde anotan la placa del automóvil 
que se encuentra parqueado en dicho espacio. Este tablero les sirve para determinar si todavía 
existe capacidad de parqueo, y donde está un determinado auto, con base en su placa.

Sin embargo, este sistema manual no es rápido y es propenso a que se cometan errores 
cuando se les olvida anotar o borrar la placa de un auto.
Los  jóvenes  empresarios  han  detectado  este  problema  y  para  solucionarlo  piensan 
contratar a un estudiante de ingeniería de sistemas del curso de programación interactiva 
de la Universidad del Valle, para que les escriba un programa en Java que les permita 
gestionar  el  parqueadero  y  la  recolección  de  dinero  con  base  en  los  parqueos  del  día. 
Ellos han pensado que las opciones que el programa debe ofrecer son las siguientes:

Ingresar Auto: Si el parqueadero se encuentra lleno, el programa informa que no 
se  pueden  recibir  más  autos.  En  caso  contrario se  procede  a  solicitar 
el  tipo  de auto,  si  los  espacios  de  parqueo  para  ese  tipo  de  auto  se  encuentran  llenos,
el programa  informa  que  no  se  pueden  recibir  más  autos  de  dicho  tipo.    En  caso contrario,
se  solicita la  placa  del  auto.  A  dicho  auto  el  programa le determina donde  debe  ser  estacionado,  
asignándole  el  primer  puesto  vacío  que encuentre de acuerdo al tipo.

Consultar Auto:
con base en la placa del auto se verifica que este se encuentre 
parqueado  en  el  lote, mediante  una  búsqueda  y  comparación  con  las  placas  de 
los  autos  que  están  parqueados.  En  caso  tal  que  la  placa  suministrada  no 
coincida  con  la  de  los  autos  estacionados 
se  le  informa  al  usuario.  Cuando  la 
placa  suministrada  coincide  con  una  de  los  autos  parqueados,  el  programa 
retorna el número de puesto en el cual este se encuentra.

Visualizar Parqueadero:
se debe imprimir, una representación del parqueadero en  forma  de  matriz,  
de  manera  tal  que  se  impriman  las  placas  del  auto  en  los puestos   ocupados   
y   caracteres   de   espaciado,   para   los   puestos   que   se encuentren libres.

Retirar Auto: 
con  base  en  la  placa  del auto  se  verifica  que  este  se  encuentre 
parqueado  en  el  lote,  mediante  un  proceso  similar  al  de  la  opción  de  consultar 
auto. Cuando la placa suministrada coincide con una de los autos parqueados, el 
programa retorna el número de puesto en el cual este se encuentra y procede a 
registrar  que  dicho  espacio  se  encuentra  libre  nuevamente,  y  se  le  informa  al 
usuario cuánto debe pagar por el servicio.

Arqueo de Caja: 
se muestra la cantidad de autos que han ingresado en el día, la cantidad  de  autos  que  han  sido
retirados,  el  total  de  autos  que  se  encuentran parqueados  actualmente,  y  la  cantidad  
de  dinero  que  debe  haber  en  la  caja menor por concepto de parqueos.
Estas  opciones  se  deben  desplegar  a  través  de  un  menú,  y  así  permitir  que  el  usuario 
seleccione  qué  operación  quiere  realizar.  La aplicación  a  desarrollar  tiene  como  propósito 
apoyar  a  los  jóvenes  empresarios  en  la  gestión  del  parqueadero.  Esta  debe  seguir  los 
lineamientos  arriba  mencionados,    y  debe  modelar  el  parqueadero  como  un  arreglo 
bidimensional (array[][]) de tamaño 6x6.
