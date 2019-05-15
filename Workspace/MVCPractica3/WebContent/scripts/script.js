window.onload = function() {
    var miParrafo = document.getElementById("pLorem");
    miParrafo.addEventListener("click", mandarFormulario);
}

function mandarFormulario() {
    alert("Se dio click en el párrafo.");
    var miFormulario = document.form["frmNumeros"];
    miFormulario.submit();
}