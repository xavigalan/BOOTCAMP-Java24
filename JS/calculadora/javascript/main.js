"use strict";
document.addEventListener('DOMContentLoaded', () => {
    // Selección de elementos
    const resultadodiv = document.querySelector(".resultado");
    // Numeros
    const siete = document.getElementById("siete");
    const ocho = document.getElementById("ocho");
    const nueve = document.getElementById("nueve");
    const del = document.getElementById("del");
    const cuatro = document.getElementById("cuatro");
    const cinco = document.getElementById("cinco");
    const seis = document.getElementById("seis");
    const suma = document.getElementById("mas");
    const uno = document.getElementById("uno");
    const dos = document.getElementById("dos");
    const tres = document.getElementById("tres");
    const resta = document.getElementById("resta");
    const punto = document.getElementById("punto");
    const cero = document.getElementById("cero");
    const dividir = document.getElementById("dividir");
    const multiplicar = document.getElementById("multiplicar");
    const reset = document.getElementById("reset");
    const resultadobtn = document.getElementById("resultadobtn");
    // Variables para almacenar el estado
    let operacionActual = '';
    let operacionAnterior = '';
    let operador = '';
    // Función para actualizar el resultado en la interfaz
    const actualizarResultado = () => {
        resultadodiv.innerText = operacionActual || '0';
    };
    // Función para agregar números
    const agregarNumero = (numero) => {
        if (numero === '.' && operacionActual.includes('.'))
            return; // Evita múltiples puntos decimales
        operacionActual += numero;
        actualizarResultado();
    };
    // Función para manejar la operación
    const manejarOperacion = (operadorSeleccionado) => {
        if (operacionActual === '')
            return;
        if (operacionAnterior !== '') {
            calcular();
        }
        operador = operadorSeleccionado;
        operacionAnterior = operacionActual;
        operacionActual = '';
    };
    // Función para calcular el resultado
    const calcular = () => {
        const prev = parseFloat(operacionAnterior);
        const current = parseFloat(operacionActual);
        if (isNaN(prev) || isNaN(current))
            return;
        let resultado;
        switch (operador) {
            case '+':
                resultado = prev + current;
                break;
            case '-':
                resultado = prev - current;
                break;
            case '/':
                resultado = prev / current;
                break;
            case 'x':
                resultado = prev * current;
                break;
            default:
                return;
        }
        operacionActual = resultado.toString();
        actualizarResultado();
    };
    // Event listeners para los números
    siete.addEventListener('click', () => agregarNumero('7'));
    ocho.addEventListener('click', () => agregarNumero('8'));
    nueve.addEventListener('click', () => agregarNumero('9'));
    cuatro.addEventListener('click', () => agregarNumero('4'));
    cinco.addEventListener('click', () => agregarNumero('5'));
    seis.addEventListener('click', () => agregarNumero('6'));
    uno.addEventListener('click', () => agregarNumero('1'));
    dos.addEventListener('click', () => agregarNumero('2'));
    tres.addEventListener('click', () => agregarNumero('3'));
    cero.addEventListener('click', () => agregarNumero('0'));
    punto.addEventListener('click', () => agregarNumero('.'));
    // Event listeners para operaciones
    suma.addEventListener('click', () => manejarOperacion('+'));
    resta.addEventListener('click', () => manejarOperacion('-'));
    dividir.addEventListener('click', () => manejarOperacion('/'));
    multiplicar.addEventListener('click', () => manejarOperacion('x'));
    // Event listener para DEL
    del.addEventListener('click', () => {
        operacionActual = operacionActual.slice(0, -1);
        actualizarResultado();
    });
    // Event listener para RESET
    reset.addEventListener('click', () => {
        operacionActual = '';
        operacionAnterior = '';
        operador = '';
        actualizarResultado();
    });
    // Event listener para resultado
    resultadobtn.addEventListener('click', () => {
        calcular();
    });
});
