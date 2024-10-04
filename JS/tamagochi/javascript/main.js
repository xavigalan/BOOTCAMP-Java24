"use strict";
const gorilochi = document.getElementById("gorilochi");
const vidacomida = document.getElementById("vidacomida");
const numcomida = document.getElementById("numcomida");
const vidaplay = document.getElementById("vidaplay");
const numplay = document.getElementById("numplay");
const vidafight = document.getElementById("vidafuerza");
const numfight = document.getElementById("numfuerza");
const vidasleep = document.getElementById("vidasleep");
const numsleep = document.getElementById("numsleep");
const vidahappiness = document.getElementById("vidahappiness");
const numhappiness = document.getElementById("numhappiness");
const decreaseLife = () => {
    let valorcomida = Number(vidacomida.value);
    if (valorcomida > 0) {
        vidacomida.value = Math.max(0, valorcomida - 2);
        numcomida.textContent = vidacomida.value.toString();
    }
    let valorplay = Number(vidaplay.value);
    if (valorplay > 0) {
        vidaplay.value = Math.max(0, valorplay - 2);
        numplay.textContent = vidaplay.value.toString();
    }
    let valorfight = Number(vidafight.value);
    if (valorfight > 0) {
        vidafight.value = Math.max(0, valorfight - 2);
        numfight.textContent = vidafight.value.toString();
    }
    let valorsleep = Number(vidasleep.value);
    if (valorsleep > 0) {
        vidasleep.value = Math.max(0, valorsleep - 2);
        numsleep.textContent = vidasleep.value.toString();
    }
    bajafelicidad();
};
setInterval(decreaseLife, 5000);
const comerButtons = Array.from(document.getElementsByClassName("comer"));
comerButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorcomida = Number(vidacomida.value);
        let newvalorcomida = Math.min(valorcomida + 5, 100);
        vidacomida.value = newvalorcomida;
        numcomida.textContent = newvalorcomida.toString();
        bajafelicidad();
    });
});
const playButtons = Array.from(document.getElementsByClassName("jugar"));
playButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorplay = Number(vidaplay.value);
        let newvalorplay = Math.min(valorplay + 5, 100);
        vidaplay.value = newvalorplay;
        numplay.textContent = newvalorplay.toString();
        bajafelicidad();
    });
});
const fuerzaButtons = Array.from(document.getElementsByClassName("fuerza"));
fuerzaButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorfight = Number(vidafight.value);
        let newvalorfight = Math.min(valorfight + 5, 100);
        vidafight.value = newvalorfight;
        numfight.textContent = newvalorfight.toString();
        bajafelicidad();
    });
});
const sleepButtons = Array.from(document.getElementsByClassName("dormir"));
sleepButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorsleep = Number(vidasleep.value);
        let newvalorsleep = Math.min(valorsleep + 5, 100);
        vidasleep.value = newvalorsleep;
        numsleep.textContent = newvalorsleep.toString();
        bajafelicidad();
    });
});
const bajafelicidad = () => {
    const comida = Number(vidacomida.value);
    const play = Number(vidaplay.value);
    const fight = Number(vidafight.value);
    const sleep = Number(vidasleep.value);
    const promedio = (comida + play + fight + sleep) / 4;
    vidahappiness.value = Math.floor(Math.max(0, Math.min(100, promedio)));
    numhappiness.textContent = vidahappiness.value.toString();
    if (vidahappiness.value === 0) {
        gorilochi.src = "./gorilochidead.png";
    }
    else if (vidasleep.value === 0) {
        gorilochi.src = "./gorilochizzz.png";
    }
    else {
        gorilochi.src = "./gorilochi.png";
    }
};
bajafelicidad();
