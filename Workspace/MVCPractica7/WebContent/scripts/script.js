window.onload = () => {
    alert("JavaScript Test");

    var miBoton = document.getElementById("btnReset");
    console.log(miBoton);

    miBoton.addEventListener("click", reset);
}

function reset() {
    document.getElementById("txtNumero1").value = "";
    document.getElementById("txtNumero2").value = "";   
}