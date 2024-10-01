const parragrafo = $("p");
const btn = $("#btn1");

$().ready(() => {
    $("#btn1").click(function () {
        $(parragrafo[0]).toggleClass("red");
    });
});

const bluebtn = document.querySelector("#btn2");
// en JS
// const parragrafo1 = document.querySelector("p")
bluebtn.onclick = function () {
    parragrafo[1].classList.toggle("blue");
}