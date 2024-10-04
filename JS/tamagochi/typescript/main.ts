const gorilochi = document.getElementById("gorilochi") as HTMLImageElement;

const vidacomida = document.getElementById("vidacomida") as HTMLMeterElement;
const numcomida = document.getElementById("numcomida") as HTMLDivElement;

const vidaplay = document.getElementById("vidaplay") as HTMLMeterElement;
const numplay = document.getElementById("numplay") as HTMLDivElement;

const vidafight = document.getElementById("vidafuerza") as HTMLMeterElement;
const numfight = document.getElementById("numfuerza") as HTMLDivElement;

const vidasleep = document.getElementById("vidasleep") as HTMLMeterElement;
const numsleep = document.getElementById("numsleep") as HTMLDivElement;

const vidahappiness = document.getElementById("vidahappiness") as HTMLMeterElement;
const numhappiness = document.getElementById("numhappiness") as HTMLDivElement;

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

const comerButtons = Array.from(document.getElementsByClassName("comer") as HTMLCollectionOf<HTMLButtonElement>);
comerButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorcomida = Number(vidacomida.value);
        let newvalorcomida = Math.min(valorcomida + 5, 100);
        vidacomida.value = newvalorcomida;
        numcomida.textContent = newvalorcomida.toString();
        bajafelicidad();
    });
});

const playButtons = Array.from(document.getElementsByClassName("jugar") as HTMLCollectionOf<HTMLButtonElement>);
playButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorplay = Number(vidaplay.value);
        let newvalorplay = Math.min(valorplay + 5, 100);
        vidaplay.value = newvalorplay;
        numplay.textContent = newvalorplay.toString();
        bajafelicidad();
    });
});

const fuerzaButtons = Array.from(document.getElementsByClassName("fuerza") as HTMLCollectionOf<HTMLButtonElement>);
fuerzaButtons.forEach(button => {
    button.addEventListener('click', () => {
        let valorfight = Number(vidafight.value);
        let newvalorfight = Math.min(valorfight + 5, 100);
        vidafight.value = newvalorfight;
        numfight.textContent = newvalorfight.toString();
        bajafelicidad();
    });
});

const sleepButtons = Array.from(document.getElementsByClassName("dormir") as HTMLCollectionOf<HTMLButtonElement>);
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
    } else if (vidasleep.value === 0) {
        gorilochi.src = "./gorilochizzz.png";
    } else {
        gorilochi.src = "./gorilochi.png";
    }
};

bajafelicidad();
