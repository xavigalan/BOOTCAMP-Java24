let numero = 1;
let i = 0;
do {
    if (i === 0) {
        i++;
        numero--;
        console.log(numero);
    } else {
        numero++;
        console.log(numero);
    }

} while (numero < 5);

// Ejercicio explicativo de que hace el codigo.

// Primero entramos en el if ya que el do nos hace entrar si o si, seguidamente entramos en el bucle if ya que
// nuestra variable i es 0, solamente entraremos 1 vez ya que se a i se le summa 1 en la primera vuelta
// después entramos en el else, ejecutandose hasta 1 vez la resta en el bucle if, 5 veces más hasta llegar a
// 5 en el bucle else ya que partiamos de número con el valor 0. 