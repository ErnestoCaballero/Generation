var xhr = new XMLHttpRequest();
window.onload = function() {
    document.getElementById("btnAcepto").addEventListener("click", miSubmit);
}

function miSubmit() {
    alert("Test JS");
    var nombre = document.getElementById("txtNombre").value
    var apellidoPaterno = document.getElementById("txtApellidoPaterno").value;
    var apellidoMaterno = document.getElementById("txtApellidoMaterno").value;
    var sexo = document.getElementById("txtSexo").value;
    var domicilio = document.getElementById("txtDomicilio").value;
    var edad = document.getElementById("txtEdad").value;
    var estatura = document.getElementById("txtEstatura").value;
    xhr.open("GET", "Practica3Servlet?txtNombre="+nombre+"&txtApellidoPaterno="+apellidoPaterno+"&txtApellidoMaterno="+apellidoMaterno+"&txtDomicilio="+domicilio+"&txtSexo="+sexo+"&txtEdad="+edad);
    xhr.onload = callBack;
    xhr.send(null);
}  

function callBack() {
    if(xhr.status == 200) {
        document.getElementById("divResultado").innerHTML = xhr.response;
    }
}