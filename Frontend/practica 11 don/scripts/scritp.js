/*
Método old School
window.onload = main();

function main() {
    alert("JS test");
}*/

/*
Método clásico
window.onload = function () {
    alert("JS test");
}*/

/* Función flecha tipo ECMA Script 6
window.onload = () => {
    alert("JS test.");
} */

/*
$(function() {
    alert("JS test");
}
):*/

/*$(() => {
    alert("JS test");
});*/

window.onload = function() {
    /*var miBotoncitoMatar = 0;
    miBotoncitoMatar = document.getElementById("btnMatar");
    console.log(miBotoncitoMatar);
    miBotoncitoMatar.onclick = mensajeMatar;*/
    document.getElementById("btnMatar").onclick = mensajeMatar;
    console.log(document.getElementById("btnMatar"));
    
    document.getElementById("divParrafo").onmouseenter = mensajeConsola;

    document.getElementById("divParrafo").onmouseleave = function () {
        console.log("Saliste del div");
    }
    document.getElementById("divParrafo").ondblclick = () => {
        console.log("Diste doble click");
    }

    document.getElementById("boton1").onmouseenter = mensajeConsola2;
}

function mensajeMatar() {
    alert("MATARlos");
}

function mensajeConsola() {
    console.log("Entraste al div");
}

function mensajeConsola2() {
    console.log("Pasaste por el botoncito ")
}