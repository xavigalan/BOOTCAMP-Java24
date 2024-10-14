"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
function fetchJoke() {
    return __awaiter(this, void 0, void 0, function* () {
        try {
            const response = yield fetch('https://api.chucknorris.io/jokes/random');
            if (!response.ok) {
                throw new Error('Error en la red');
            }
            const data = yield response.json();
            const jokeElement = document.getElementById('joke');
            const chuckNorrisIcon = document.getElementById('chuck-norris-icon');
            if (jokeElement && chuckNorrisIcon) {
                jokeElement.innerText = data.value;
                chuckNorrisIcon.src = data.icon_url;
            }
        }
        catch (error) {
            console.error('Error:', error);
            const jokeElement = document.getElementById('joke');
            if (jokeElement) {
                jokeElement.innerText = 'Error al obtener el chiste';
            }
        }
    });
}
document.addEventListener('DOMContentLoaded', () => {
    fetchJoke();
    const newJokeButton = document.getElementById('new-joke');
    if (newJokeButton) {
        newJokeButton.addEventListener('click', fetchJoke);
    }
});
function fetchRicky() {
    return __awaiter(this, void 0, void 0, function* () {
        try {
            const response = yield fetch('https://rickandmortyapi.com/api/character/516');
            if (!response.ok) {
                throw new Error("Error en la red");
            }
            const data = yield response.json();
            const nameElement = document.getElementById('name');
            const statusElement = document.getElementById('status');
            const speciesElement = document.getElementById('species');
            const typeElement = document.getElementById('type');
            const genderElement = document.getElementById('gender');
            const originElement = document.getElementById('origin');
            if (nameElement && statusElement && speciesElement && typeElement && genderElement && originElement) {
                nameElement.innerText = data.name;
                statusElement.innerHTML = data.status;
                speciesElement.innerHTML = data.species;
                typeElement.innerHTML = data.type;
                genderElement.innerHTML = data.gender;
                originElement.innerHTML = data.origin.name;
            }
        }
        catch (error) {
            console.log("Error:", error);
        }
    });
}
document.addEventListener('DOMContentLoaded', () => {
    fetchRicky();
});
