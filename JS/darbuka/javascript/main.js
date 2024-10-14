"use strict";
const w = document.getElementById('sonido1');
const sonidow = new Audio('./sounds/Darbuka_06_76_SP.mp3');
document.addEventListener('keydown', function (event) {
    if (event.key === 'w' || event.key === 'W') {
        sonidow.play();
        console.log('La tecla W fue presionada!');
    }
});
w.addEventListener('click', function () {
    sonidow.play();
    console.log("Has clicado en el div W");
});
const a = document.getElementById('sonido2');
const sonidoa = new Audio('./sounds/Darbuka_18_76_SP.mp3');
document.addEventListener('keydown', function (event) {
    if (event.key === 'a' || event.key === 'A') {
        sonidoa.play();
        console.log('La tecla A fue presionada!');
    }
});
a.addEventListener('click', function () {
    sonidoa.play();
    console.log("Has clicado en el div A");
});
const d = document.getElementById('sonido3');
const sonidod = new Audio('./sounds/Darbuka_42_76_SP.mp3');
document.addEventListener('keydown', function (event) {
    if (event.key === 'd' || event.key === 'D') {
        sonidod.play();
        console.log('La tecla D fue presionada!');
    }
});
d.addEventListener('click', function () {
    sonidod.play();
    console.log("Has clicado en el div D");
});
const s = document.getElementById('sonido4');
const sonidos = new Audio('./sounds/Darbuka_48_76_SP.mp3');
document.addEventListener('keydown', function (event) {
    if (event.key === 's' || event.key === 'S') {
        sonidos.play();
        console.log('La tecla S fue presionada!');
    }
});
s.addEventListener('click', function () {
    sonidos.play();
    console.log("Has clicado en el div S");
});
const e = document.getElementById('sonido5');
const sonidoe = new Audio('./sounds/Darbuka_66_76_SP.mp3');
document.addEventListener('keydown', function (event) {
    if (event.key === 'e' || event.key === 'E') {
        sonidoe.play();
        console.log('La tecla E fue presionada!');
    }
});
e.addEventListener('click', function () {
    sonidoe.play();
    console.log("Has clicado en el div E");
});
