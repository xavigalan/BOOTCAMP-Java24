// 1 Devuelve los elementos de la lista.

lista = ['a', 'b', 'c', 'd', 'e'];

lista.forEach(element => {
    console.log(element);
});

// 2 Devuelve los elementos de la lista hasta numero llegar al valor 0.

numero = 5;

lista.forEach(element => {
    if (!(numero) == 0) {
        numero = numero--
        console.log(element);
    }
});