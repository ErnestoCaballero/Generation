var temp;
window.onload = function() {
    var miBotoncito = 0;
    miBotoncito = document.getElementById("btnBoton");
    miBotoncito.addEventListener("click", miFuncion);

    document.getElementById("btnBorrar").addEventListener("click", borrarTesto);
    document.getElementById("reapear").addEventListener("click", aparecerTesto);

    document.getElementById("parrafo").onmouseenter = mensajeConsola01;
    document.getElementById("parrafo").onmouseleave = mensajeConsola02;

    document.getElementById("btbNumero").addEventListener("click", generacionTexto);
    document.getElementById("btbInicio").addEventListener("click", juegoCasino);

    document.getElementById("btnRojo").addEventListener("click", cambiarRojo);
    document.getElementById("btnRojo").addEventListener("mouseenter",mensajeConsola01);
    document.getElementById("btnRojo").addEventListener("mouseleave",mensajeConsola02);

}

function miFuncion() {
    console.log("Diste click en el boton");
}

function borrarTesto() {
    temp = document.getElementById("parrafo").innerHTML;
    document.getElementById("parrafo").innerHTML = "";
}

function aparecerTesto() {
    document.getElementById("parrafo").innerHTML = temp;
}

function mensajeConsola01() {
    console.log("Pasaste sobre el párrafo");
}

function mensajeConsola02() {
    console.log("Dejaste el párrafo...")
}

function generacionTexto() {
    var numeroRandom = Math.floor(Math.random()*100+1);
    document.getElementById("prfPrueba01").innerHTML = numeroRandom;
}

function juegoCasino() {
    var numero = document.getElementById("prfPrueba01").innerHTML;

    if (numero > 50) {
        alert("Has Ganado, tío!");
    } else {
        alert("PERDISTE, Vuelve a intentarlo!");
    }

}

function cambiarRojo() {
    document.getElementById("parrafo").style.backgroundColor = "Grey";
}
