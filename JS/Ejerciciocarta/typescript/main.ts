const carta1 = document.getElementById("carta1") as HTMLImageElement;
const carta2 = document.getElementById("carta2") as HTMLImageElement;

if (carta1) {
    function encimacarta1() {
        carta1.addEventListener('mouseover', () => {
            carta1.src = "./card-front.png";
        });
    }
    function fueracarta1() {
        carta1.addEventListener('mouseout', () => {
            carta1.src = "./card-back.png";
        });

    }
    fueracarta1();
    encimacarta1();
};

if (carta2) {
    function encimacarta2() {
        carta2.addEventListener('mouseover', () => {
            carta2.src = "./card-front.png";
        });
    }
    function fueracarta2() {
        carta2.addEventListener('mouseout', () => {
            carta2.src = "./card-back.png";
        });

    }
    fueracarta2();
    encimacarta2();
};