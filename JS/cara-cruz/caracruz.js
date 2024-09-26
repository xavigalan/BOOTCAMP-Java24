function aleatorio() {
    let numero = Math.round(Math.random());
    console.log(numero);
    return numero;
}

if (aleatorio() == 1) {
    console.log("Cara")
} else {
    console.log("Cruz")
}
