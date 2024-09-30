"use strict";
// Donde van los elementos.
const elementos = document.getElementById("elementos");
// La lista de los elementos
const items = [];
// Actualizar lista en tiempo real.
function updateDisplay() {
    elementos.innerText = `[${items.join(", ")}]`;
}
// Botones añadir
const push = document.getElementById("push");
function addelast() {
    items.push("🎃");
    updateDisplay();
}
push.addEventListener("click", addelast);
const unshift = document.getElementById("unshift");
function addearly() {
    items.unshift("🎈");
    updateDisplay();
}
unshift.addEventListener("click", addearly);
const añadir = document.getElementById("añadir");
const insert = document.getElementById("insert");
function addnum() {
    const value = añadir.value;
    if (value) {
        items.push(`${value} 🎄`);
        updateDisplay();
    }
}
unshift.addEventListener("click", addearly);
//Botones eliminar
const pop = document.getElementById("pop");
;
function popet() {
    if (items.length > 0) {
        items.pop();
        updateDisplay();
    }
}
pop.addEventListener("click", popet);
const shift = document.getElementById("shift");
const remove = document.getElementById("remove");
const eliminar = document.getElementById("eliminar");
