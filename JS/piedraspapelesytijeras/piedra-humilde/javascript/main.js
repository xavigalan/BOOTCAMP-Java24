"use strict";
const cartas = ["🥌", "🧻", "✂"];
document.write("<h1>Bienvenido a Piedra 🥌 Papel 🧻 o Tijera ✂!</h1>");
document.write("<p>Fichas:</p>" + (cartas.join(", ")));
let mispuntos = 0;
let puntoscomputer = 0;
const resultadoDiv = document.getElementById('resultado');
const mensajevictoria = document.getElementById('mensajevictoria');
const restart = document.getElementById('restart');
restart.addEventListener('click', () => {
    mispuntos = 0;
    puntoscomputer = 0;
    resultadoDiv.innerHTML = '';
    mensajevictoria.innerHTML = '';
});
function startgame(opcion) {
    if (mispuntos < 3 && puntoscomputer < 3) {
        let opcioncomputer = cartas[Math.floor(Math.random() * cartas.length)];
        let resultado = "";
        if (opcion === opcioncomputer) {
            resultado = `Empate! Has sacado ${opcion} y tu rival ${opcioncomputer}, repetimos turno!`;
        }
        else if ((opcion === cartas[0] && opcioncomputer === cartas[2]) || // Piedra gana a Tijera
            (opcion === cartas[1] && opcioncomputer === cartas[0]) || // Papel gana a Piedra
            (opcion === cartas[2] && opcioncomputer === cartas[1]) // Tijera gana a Papel
        ) {
            mispuntos++;
            resultado = `Has ganado el turno! Has sacado ${opcion} y tu rival ${opcioncomputer}.`;
        }
        else {
            puntoscomputer++;
            resultado = `Has perdido el turno! Has sacado ${opcion} y tu rival ${opcioncomputer}.`;
        }
        resultado += `<br>Tus puntos: ${mispuntos} | Puntos del rival: ${puntoscomputer}.`;
        if (mispuntos === 3) {
            mensajevictoria.innerHTML = `¡Victoria! Has ganado con un total de ${mispuntos} puntos a ${puntoscomputer}.`;
        }
        else if (puntoscomputer === 3) {
            mensajevictoria.innerHTML = `¡Derrota! Has perdido con un total de ${mispuntos} puntos contra ${puntoscomputer}.`;
        }
        resultadoDiv.innerHTML = resultado;
    }
}
document.addEventListener('DOMContentLoaded', () => {
    const piedra = document.getElementById('piedra');
    const papel = document.getElementById('papel');
    const tijera = document.getElementById('tijera');
    piedra.addEventListener('click', () => startgame(cartas[0]));
    papel.addEventListener('click', () => startgame(cartas[1]));
    tijera.addEventListener('click', () => startgame(cartas[2]));
});
