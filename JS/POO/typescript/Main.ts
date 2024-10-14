import { Preguntas } from "./Preguntas.js"; // Asegúrate de que coincida exactamente

const pregunta1 = new Preguntas("¿Cuál es la capital de Francia?", "París", "Lisboa", "Madrid");

const pregunta = document.getElementById("pregunta") as HTMLDivElement;
const respuesta1 = document.getElementById("respuesta1") as HTMLDivElement;
const respuesta2 = document.getElementById("respuesta2") as HTMLDivElement;
const respuesta3 = document.getElementById("respuesta3") as HTMLDivElement;

document.addEventListener('DOMContentLoaded', () => {
    pregunta.innerText = pregunta1.pregunta;
    respuesta1.innerText = pregunta1.respuestaCorrecta;
    respuesta2.innerText = pregunta1.respuestaIncorrecta1;
    respuesta3.innerText = pregunta1.respuestaIncorrecta2;
});
