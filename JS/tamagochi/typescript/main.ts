const gorilochi = document.getElementById("gorilochi") as HTMLImageElement;

const vidacomida = document.getElementById("vidacomida") as HTMLInputElement;
const numcomida = document.getElementById("numcomida") as HTMLDivElement;

vidacomida.addEventListener('input', () => {
    numcomida.textContent = vidacomida.value;

})
numcomida.textContent = vidacomida.value;

vidacomida.style.width = Number(numcomida.textContent).toString();


const vidaplay = document.getElementById("vidaplay") as HTMLDivElement;
const numplay = document.getElementById("numplay") as HTMLDivElement;

const vidafight = document.getElementById("vidafight") as HTMLDivElement;
const numfight = document.getElementById("numfight") as HTMLDivElement;

const vidasleep = document.getElementById("vidasleep") as HTMLDivElement;
const numsleep = document.getElementById("numsleep") as HTMLDivElement;

const vidahappiness = document.getElementById("vidahappiness") as HTMLDivElement;
const numhappiness = document.getElementById("numhappiness") as HTMLDivElement;
