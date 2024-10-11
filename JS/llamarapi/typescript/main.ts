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
        const typeElement = document.getElementById('species') as HTMLDivElement;

        if (nameElement && statusElement && speciesElement) {
            nameElement.innerText = data.name;
            statusElement.innerHTML = data.status;
            speciesElement.innerHTML = data.species;

        }
    } catch (error) {

    }

}
