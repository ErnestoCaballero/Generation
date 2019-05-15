var xhr = new XMLHttpRequest();

window.onload = () => {
    document.getElementById("btnAcepta").addEventListener("click", miSubmit);
    //alert("Tset JS");
}

function miSubmit() {
    
    //Preparar mis datos
    var nombre = document.getElementById("txtNombre");
    var miFormulario = new FormData();
    miFormulario.append("txtNombre", nombre.value);
    
    //Preparo mis datos asíncronos o procesos asíncronos
    xhr.onreadystatechange = callBack;
    xhr.open("POST", "Practica2Servlet", true);
    xhr.send(miFormulario);

    //alert("Tu nombre es: " + nombre.value);
    
}

function callBack() {
    if(xhr.readyState == 4 && xhr.status == 200) {
        document.getElementById("divResultado").innerHTML = xhr.responseText;
    }
}