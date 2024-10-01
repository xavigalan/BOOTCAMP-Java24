const cartas: string[] = ["🥌", "🧻", "✂"];
let mispuntos = 0;
let puntoscomputer = 0;

document.write("<h1>Bienvenido a Piedra 🥌 Papel 🧻 o Tijera ✂!</h1>");
document.write("<p>Fichas:</p>" + (cartas.join(", ")));

// Mostrar el overlay
const overlay = document.getElementById('overlay') as HTMLDivElement;
const showDialogBtn = document.getElementById('showDialog') as HTMLButtonElement;

// Mostrar el overlay al hacer clic en el botón
showDialogBtn.addEventListener('click', () => {
    overlay.style.display = 'flex';
});

// Función para seleccionar una opción
function seleccionarOpcion(opcion: string) {
    let seleccionComputadora = cartas[Math.floor(Math.random() * cartas.length)];
    let resultado = '';

    // Comparar la opción del jugador con la de la computadora
    if (opcion === seleccionComputadora) {
        resultado = `Empate! Ambos eligieron ${opcion}.`;
    } else if (
        (opcion === '🥌' && seleccionComputadora === '✂') ||
        (opcion === '🧻' && seleccionComputadora === '🥌') ||
        (opcion === '✂' && seleccionComputadora === '🧻')
    ) {
        mispuntos++;
        resultado = `Ganaste! Tú eligiste ${opcion} y la computadora eligió ${seleccionComputadora} 
Tus puntos: ${mispuntos} Puntos del rival: ${puntoscomputer}.`;
    } else {
        puntoscomputer++;
        resultado = `Perdiste! Tú elegiste ${opcion} y la computadora eligió ${seleccionComputadora} 
Tus puntos: ${mispuntos} Puntos del rival: ${puntoscomputer}.`;
    }

    // Mostrar el resultado
    alert(resultado); // Muestra el resultado
    console.log(`Tus puntos: ${mispuntos}, Puntos de la computadora: ${puntoscomputer}`);

    // Verificar si alguien ganó
    if (mispuntos === 3) {
        alert("¡Felicidades! Has ganado el juego.");
        overlay.style.display = 'none';
        reiniciarJuego();
    } else if (puntoscomputer === 3) {
        alert("¡Lo siento! La computadora ha ganado el juego.");
        overlay.style.display = 'none';
        reiniciarJuego();
    }
}

// Función para reiniciar el juego
function reiniciarJuego() {
    mispuntos = 0;
    puntoscomputer = 0;
    console.log("El juego ha sido reiniciado.");
}

// Asignar eventos a los botones
document.addEventListener('DOMContentLoaded', () => {
    const btn1 = document.getElementById('btn1') as HTMLButtonElement;
    const btn2 = document.getElementById('btn2') as HTMLButtonElement;
    const btn3 = document.getElementById('btn3') as HTMLButtonElement;

    if (btn1) {
        btn1.addEventListener('click', () => seleccionarOpcion(cartas[0])); // Piedra
    }

    if (btn2) {
        btn2.addEventListener('click', () => seleccionarOpcion(cartas[1])); // Papel
    }

    if (btn3) {
        btn3.addEventListener('click', () => seleccionarOpcion(cartas[2])); // Tijera
    }
});
