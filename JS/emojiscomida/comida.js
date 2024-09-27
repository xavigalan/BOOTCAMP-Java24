// 1 Remplazar los elementos a partir de la pizza por 🍺.
console.log("Ejercicio 1")
arr = ['🍔', '🥙', '🥧', '🍕', '🍜', '🍱', '🍙', '🍘', '🥑'];
function replace() {
    let pizzaIndex = arr.indexOf('🍕');
    for (let i = pizzaIndex; i < arr.length; i++) {
        arr[i] = '🍺';
    }
}
replace();
console.log(arr);

// 2 Encontrar si existe un elemento 🍍.
console.log("Ejercicio 2")
arr = ['🍕', '🍕', '🍍', '🍕', '🍕',];
function piña() {
    let existepiña = arr.includes('🍍');
    return existepiña;
}
console.log(piña());

// 3 Eliminar elemento 🍍.
console.log("Ejercicio 3")
arr = ['🍕', '🍕', '🍍', '🍕', '🍕'];
function quitarpiña() {
    let eliminarpiña = arr.filter(item => item !== '🍍');
    return eliminarpiña;
}
console.log(quitarpiña())

// 4 A partir del siguiente array cambia las 🍓 por un 🍄.
console.log("Ejercicio 4")
arr = ['🍓', '🍋', '🍓', '🍋', '🍓'];
function champi() {
    let cambiarfresa = arr.map(item => item == '🍓' ? '🍄' : item);
    return cambiarfresa;
}
console.log(champi());

// 5 Añade el 🥵 después del 🌶.
console.log("Ejercicio 5")
arr = ['🌶', '🥛', '🌶', '🥛', '🌶', '🥛'];
function lengua() {
    let nuevoArr = arr.map(item => {
        return item === '🌶' ? [item, '🥵'] : [item];
    });
    return nuevoArr;
}
console.log(lengua());

// 6 Añade 🃏 en medio de 2 cartas.
console.log("Ejercicio 5");
arr = ['🎴', '🎴', '🎴', '🃏', '🎴', '🎴', '🎴'];

function comodin() {
    let comodinArr = arr.flatMap((item, index) => {
        if (item === '🎴') {
            return index < arr.length - 1 ? [item, '🃏'] : [item];
        }
        return [];
    });
    return comodinArr;
}
console.log(comodin());
