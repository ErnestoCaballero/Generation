window.onload = function() {
    document.getElementById("btnMensaje").addEventListener("click", mostrarMensaje);

    document.getElementById("btnSumar").addEventListener("click", sumarNumeros);

    //Excercise 3
    var miForm = document.getElementById("myForm");
    miForm.addEventListener("focus", turnGreen);
    
}

function mostrarMensaje() {
    var mensaje = document.getElementById("txtMensaje").value;
    alert(mensaje);
}

function sumarNumeros() {
    var numero1 = parseInt(document.getElementById("txtNumero1").value);
    var numero2 = parseInt(document.getElementById("txtNumero2").value);

    alert("La suma de los números es: " + (numero1 + numero2));
}

function turnGreen() {
        //entrada.style.background = "Green";
}

