"use strict";
// Donde van los elementos.
const elementos = document.getElementById("elementos");
// La lista de los elementos
const items = [];
const emoticonos = ["🎈", "🧨", "🥽", "🦺", "🏈", "👑", "⛑", "⛏", "🎭", "🎎", "🥋"];
// Actualizar lista en tiempo real.
function updateDisplay() {
    elementos.innerText = `[${items.join(",")}]`;
}
// Botones añadir
const push = document.getElementById("push");
function addelast() {
    const listarandom = Math.round(Math.random() * (emoticonos.length - 1));
    items.push(emoticonos[listarandom]);
    updateDisplay();
}
push.addEventListener("click", addelast);
const unshift = document.getElementById("unshift");
function addearly() {
    const listarandom = Math.round(Math.random() * (emoticonos.length - 1));
    items.unshift(emoticonos[listarandom]);
    updateDisplay();
}
unshift.addEventListener("click", addearly);
const añadir = document.getElementById("añadir");
const insert = document.getElementById("insert");
function addnum() {
    const listarandom = Math.round(Math.random() * (emoticonos.length - 1));
    console.log(listarandom);
    const value = parseInt(añadir.value, 10) - 1;
    if (items.length === 0) {
        items.unshift(emoticonos[listarandom]);
        updateDisplay();
    }
    else if (!isNaN(value) && value >= 0 && value <= items.length) {
        items.splice(value, 0, emoticonos[listarandom]);
        updateDisplay();
    }
    else {
        alert("La posición está fuera del rango de la lista.");
    }
    // Que me inserte tantos emoticonos dependiendo el valor
    // if (!isNaN(value) && value > 0) {
    //     for (let i = 0; i < value; i++) {
    //         items.push(emoticonos[listarandom]);
    //     }
    //     updateDisplay();
    // }
}
insert.addEventListener("click", addnum);
//Botones eliminar
const pop = document.getElementById("pop");
function popet() {
    if (items.length > 0) {
        items.pop();
        updateDisplay();
    }
}
pop.addEventListener("click", popet);
const shift = document.getElementById("shift");
function shifet() {
    if (items.length > 0) {
        items.shift();
        updateDisplay();
    }
}
shift.addEventListener("click", shifet);
const eliminar = document.getElementById("eliminar");
const remove = document.getElementById("remove");
function delnum() {
    const value = parseInt(eliminar.value, 10) - 1;
    if (items.length === 0) {
        alert("No hay elementos en la lista.");
    }
    else if (!isNaN(value) && value >= 0 && value < items.length) {
        items.splice(value, 1);
        updateDisplay();
    }
    else {
        alert("Índice no válido.");
    }
}
remove.addEventListener("click", delnum);
