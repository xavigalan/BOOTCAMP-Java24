"use strict";
const interruptor = document.getElementById("interruptor");
const bulb = document.getElementById("bulb");
const zoom = document.getElementById("zoom");
const zoomnum = document.getElementById("zoomnum");
zoom.addEventListener('input', () => {
    zoomnum.textContent = zoom.value;
    bulb.style.width = zoom.value + 'px';
});
zoomnum.textContent = zoom.value;
bulb.style.width = zoom.value + 'px';
const brillo = document.getElementById("brillo");
const brillonum = document.getElementById("brillonum");
brillo.addEventListener('input', () => {
    brillonum.textContent = brillo.value;
    bulb.style.opacity = brillo.value + "%";
});
brillonum.textContent = brillo.value;
bulb.style.opacity = brillo.value + "%";
const rotate = document.getElementById("rotate");
const rotatenum = document.getElementById("rotatenum");
rotate.addEventListener('input', () => {
    rotatenum.textContent = rotate.value;
    bulb.style.rotate = rotate.value + "deg";
});
rotatenum.textContent = rotate.value;
bulb.style.rotate = rotate.value + "deg";
let encendido = false;
function toggle() {
    encendido = !encendido;
    if (encendido) {
        interruptor.src = "bon.jpg";
        bulb.src = "on.jpg";
    }
    else {
        interruptor.src = "boff.jpg";
        bulb.src = "off.jpg";
    }
}
interruptor.addEventListener('click', toggle);
