async function fetchJoke() {
    try {
        const response = await fetch('https://api.chucknorris.io/jokes/random');
        if (!response.ok) {
            throw new Error('Error en la red');
        }
        const data = await response.json();

        const jokeElement = document.getElementById('joke') as HTMLDivElement;
        const chuckNorrisIcon = document.getElementById('chuck-norris-icon') as HTMLImageElement;

        if (jokeElement && chuckNorrisIcon) {
            jokeElement.innerText = data.value;
            chuckNorrisIcon.src = data.icon_url;
        }
    } catch (error) {
        console.error('Error:', error);
        const jokeElement = document.getElementById('joke') as HTMLDivElement;
        if (jokeElement) {
            jokeElement.innerText = 'Error al obtener el chiste';
        }
    }
}

document.addEventListener('DOMContentLoaded', () => {
    fetchJoke();

    const newJokeButton = document.getElementById('new-joke') as HTMLButtonElement | null;
    if (newJokeButton) {
        newJokeButton.addEventListener('click', fetchJoke);
    }
});
async function fetchRicky() {
    try {
        const response = await fetch('https://rickandmortyapi.com/api/character/516');
        if (!response.ok) {
            throw new Error("Error en la red");
        }
        const data = await response.json();

        const nameElement = document.getElementById('name') as HTMLDivElement;
        const statusElement = document.getElementById('status') as HTMLDivElement;
        const speciesElement = document.getElementById('species') as HTMLDivElement;
        const typeElement = document.getElementById('type') as HTMLDivElement;
        const genderElement = document.getElementById('gender') as HTMLDivElement;
        const originElement = document.getElementById('origin') as HTMLDivElement;

        if (nameElement && statusElement && speciesElement && typeElement && genderElement && originElement) {
            nameElement.innerText = data.name;
            statusElement.innerHTML = data.status;
            speciesElement.innerHTML = data.species;
            typeElement.innerHTML = data.type;
            genderElement.innerHTML = data.gender;
            originElement.innerHTML = data.origin.name;
        }
    } catch (error) {
        console.log("Error:", error);
    }

}
document.addEventListener('DOMContentLoaded', () => {
    fetchRicky();

});
