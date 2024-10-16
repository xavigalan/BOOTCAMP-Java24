import { Preguntas } from "./Preguntas.js"; // Asegúrate de que coincida exactamente

// Definimos las preguntas
const pregunta1 = new Preguntas("¿Cuál es la capital de Francia?", "París", "Lisboa", "Madrid", "Roma");
const pregunta2 = new Preguntas("¿Cuál de las siguientes opciones no es un editor de codigo?", "vim", "vscode", "emacs", "word");
const pregunta3 = new Preguntas(
    "¿Cuál de las siguientes opciones no es un lenguaje de programación?",
    "HTML",
    "Python",
    "Java",
    "C++"
);

// Lista de preguntas
const listPreguntas: Preguntas[] = [pregunta1, pregunta2, pregunta3];

// Referencias a los elementos del DOM
const pregunta = document.getElementById("pregunta") as HTMLDivElement;
const respuesta1 = document.getElementById("respuesta1") as HTMLDivElement;
const respuesta2 = document.getElementById("respuesta2") as HTMLDivElement;
const respuesta3 = document.getElementById("respuesta3") as HTMLDivElement;
const respuesta4 = document.getElementById("respuesta4") as HTMLDivElement;
const numpreg = document.getElementById("numpreg") as HTMLDivElement;
const resultado = document.getElementById("resultado") as HTMLDivElement; // Para mostrar si la respuesta fue correcta o incorrecta
const puntuacionDiv = document.getElementById("puntuacion") as HTMLDivElement; // Para mostrar la puntuación

let currentQuestionIndex = 0;
let puntuacion = 0;

// Función para barajar las respuestas
function shuffleRespuestas(pregunta: Preguntas): string[] {
    const respuestas = [
        pregunta.respuestaCorrecta,
        pregunta.respuestaIncorrecta1,
        pregunta.respuestaIncorrecta2,
        pregunta.respuestaIncorrecta3,
    ];
    return respuestas.sort(() => Math.random() - 0.5); // Barajar las respuestas
}

// Función para actualizar la pregunta y respuestas
function updateQuestion(index: number) {
    const currentQuestion = listPreguntas[index];
    const respuestasBarajadas = shuffleRespuestas(currentQuestion);
    
    pregunta.innerText = currentQuestion.pregunta;
    respuesta1.innerText = respuestasBarajadas[0];
    respuesta2.innerText = respuestasBarajadas[1];
    respuesta3.innerText = respuestasBarajadas[2];
    respuesta4.innerText = respuestasBarajadas[3];
    
    numpreg.innerText = "Question " + (index + 1) + " of " + listPreguntas.length;
}

// Función para verificar la respuesta seleccionada
function verificarRespuesta(respuestaSeleccionada: string) {
    const currentQuestion = listPreguntas[currentQuestionIndex];
    if (respuestaSeleccionada === currentQuestion.respuestaCorrecta) {
        puntuacion++; // Incrementa la puntuación si la respuesta es correcta
        resultado.innerText = "¡Correcto!";
    } else {
        resultado.innerText = "Incorrecto";
    }

    puntuacionDiv.innerText = "Puntuación: " + puntuacion;
    
    // Avanzar a la siguiente pregunta después de 1 segundo
    setTimeout(() => {
        resultado.innerText = ""; // Limpiar el mensaje de resultado
        nextQuestion(); // Pasar a la siguiente pregunta
    }, 1000);
}

function nextQuestion() {
    if (currentQuestionIndex < listPreguntas.length - 1) {
        currentQuestionIndex++;
        updateQuestion(currentQuestionIndex);
    } else {
        pregunta.innerText = "¡Has completado todas las preguntas!";
        respuesta1.style.display = "none";
        respuesta2.style.display = "none";
        respuesta3.style.display = "none";
        respuesta4.style.display = "none";
        numpreg.innerText = "";
        resultado.innerText = "Puntuación final: " + puntuacion + " de " + listPreguntas.length;
    }
}

// Escuchar clics en las respuestas para verificar si son correctas
respuesta1.addEventListener("click", () => verificarRespuesta(respuesta1.innerText));
respuesta2.addEventListener("click", () => verificarRespuesta(respuesta2.innerText));
respuesta3.addEventListener("click", () => verificarRespuesta(respuesta3.innerText));
respuesta4.addEventListener("click", () => verificarRespuesta(respuesta4.innerText));

// Inicializar la primera pregunta al cargar la página
document.addEventListener('DOMContentLoaded', () => {
    updateQuestion(currentQuestionIndex);
});
