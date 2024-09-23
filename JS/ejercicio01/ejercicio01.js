let nombre = "Xavi";
console.log(nombre);
console.log(typeof (nombre));

var edad = 21;
console.log(edad);
console.log(typeof (edad));

const ESTUDIANDO = true;
console.log(ESTUDIANDO);
console.log(typeof (ESTUDIANDO));

let global = true;

if (global === true) {
    if (ESTUDIANDO === true) {
        let local = "Prueba de variable local";
        console.log(local);
        console.log(typeof local);
    } else {
        console.log("No, no está estudiando.");
    }
} else {
    console.log("No")
}


