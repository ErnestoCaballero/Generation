var xhr = new XMLHttpRequest();

window.onload = function() {
    document.getElementById("btnPress").addEventListener("click", processAjaxII);
    document.getElementById("btnPress2").addEventListener("click", appearFunction);
    alert("Test JS");
    var resultadoFuncion1 = mensajitu;
    var resultadoFuncion2 = mensajitu();

    console.log(resultadoFuncion1);
    console.log(resultadoFuncion2);
    
    document.getElementById("btnPress2").addEventListener("click", resultadoFuncion1(3, 1));
    
}

function processAjaxII() {
    //xhr.responseType("text/html");
    xhr.open("get", "result.html");
    xhr.onload = funcionCallBack;
    xhr.send(null);
}

function funcionCallBack() {
    if (xhr.status == 200) {
        console.log("Petición procesada con éxito");
        document.getElementById("divResult").innerHTML = xhr.responseText;
    } 
}

function appearFunction() {
    var x = "Here it is!"
    document.getElementById("hidden").innerHTML = x;
}

function mensajitu(x, y) {
    var miVariable = 2 + 2;
    return miVariable;
    console.log("La suma es: " + miVariable);
}