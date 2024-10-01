// Donde van los elementos.
const elementos = document.getElementById("elementos") as HTMLElement;

// La lista de los elementos
const items: string[] = [];
const emoticonos: string[] = ["🎈", "🧨", "🥽", "🦺", "🏈", "👑", "⛑", "⛏", "🎭", "🎎", "🥋"]


// Actualizar lista en tiempo real.
function updateDisplay() {
    elementos.innerText = `[${items.join(",")}]`;
}

// Botones añadir
const push = document.getElementById("push") as HTMLButtonElement;
function addelast() {
    const listarandom = Math.round(Math.random() * (emoticonos.length - 1));
    items.push(emoticonos[listarandom]);
    updateDisplay();
}
push.addEventListener("click", addelast);

const unshift = document.getElementById("unshift") as HTMLButtonElement;
function addearly() {
    const listarandom = Math.round(Math.random() * (emoticonos.length - 1));
    items.unshift(emoticonos[listarandom]);
    updateDisplay();
}
unshift.addEventListener("click", addearly);

const añadir = document.getElementById("añadir") as HTMLInputElement;
const insert = document.getElementById("insert") as HTMLButtonElement;

function addnum() {
    const listarandom = Math.round(Math.random() * (emoticonos.length - 1));
    console.log(listarandom);
    const value = parseInt(añadir.value, 10) - 1;

    if (items.length === 0) {
        items.unshift(emoticonos[listarandom]);
        updateDisplay();
    } else if (!isNaN(value) && value >= 0 && value <= items.length) {
        items.splice(value, 0, emoticonos[listarandom]);
        updateDisplay();
    } else {
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
const pop = document.getElementById("pop") as HTMLButtonElement;
function popet() {
    if (items.length > 0) {
        items.pop();
        updateDisplay();
    }
}
pop.addEventListener("click", popet);

const shift = document.getElementById("shift") as HTMLButtonElement;
function shifet() {
    if (items.length > 0) {
        items.shift();
        updateDisplay();
    }
}
shift.addEventListener("click", shifet);

const eliminar = document.getElementById("eliminar") as HTMLInputElement;
const remove = document.getElementById("remove") as HTMLButtonElement;

function delnum() {
    const value = parseInt(eliminar.value, 10) - 1;
    if (items.length === 0) {
        alert("No hay elementos en la lista.");
    } else if (!isNaN(value) && value >= 0 && value < items.length) {
        items.splice(value, 1);
        updateDisplay();
    } else {
        alert("Índice no válido.");
    }
}

remove.addEventListener("click", delnum);
