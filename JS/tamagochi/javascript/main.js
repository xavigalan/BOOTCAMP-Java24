"use strict";
const gorilochi = document.getElementById("gorilochi");
const vidacomida = document.getElementById("vidacomida");
const numcomida = document.getElementById("numcomida");
vidacomida.addEventListener('input', () => {
    numcomida.textContent = vidacomida.value;
});
numcomida.textContent = vidacomida.value;
vidacomida.style.width = Number(numcomida.textContent).toString();
const vidaplay = document.getElementById("vidaplay");
const numplay = document.getElementById("numplay");
const vidafight = document.getElementById("vidafight");
const numfight = document.getElementById("numfight");
const vidasleep = document.getElementById("vidasleep");
const numsleep = document.getElementById("numsleep");
const vidahappiness = document.getElementById("vidahappiness");
const numhappiness = document.getElementById("numhappiness");
