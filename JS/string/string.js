// 1 Cambiar A por O.

let palabra = 'Buenas noches y hasta la proxima orlando!';
function opora() {
    console.log(palabra.replace(/o/g, 'a'));
}
opora();

// 2 Incluye aca

let academia = 'academia';
let escuela = 'escuela';

function aca() {
    console.log(academia.startsWith('aca'));
    console.log(escuela.startsWith('aca'));
}
aca();

// 3 Hola 3 veces

let hola = 'Hola';

function compruebahola() {
    console.log(hola.includes('Hola'));
}
compruebahola();
if (compruebahola) {
    console.log('Hola buenos dias!');
    console.log('Hola buenos dias!');
    console.log('Hola buenos dias!');
}