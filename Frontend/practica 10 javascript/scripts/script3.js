//console.log(HolaMundo());

/*function HolaMundo() {
    return "Hola Mundo";
}*/

/*HolaMundo2();
Saludar("Ola k ase");
console.log(suma(10,20));
var num1 = parseInt(prompt("Introduce un número"));
var num2 = parseInt(prompt("Introduce otro número"));
console.log(suma(num1, num2));
num1 = parseInt(prompt("Introduce un número"));
console.log(isPrimo(12));*/










var tamaño = parseInt(prompt("Escoge el tamaño de tu arreglo:"));
var miArray = [];

for (var i = 0; i < tamaño; i++){
    var temp = parseInt(prompt("Ingresa el dato número " + (i+1)));
    miArray[i] = temp;
}

console.log("El número de pares en tu arreglo es: " + paresArreglo(miArray, tamaño));
console.log("El número de impares en tu arreglo es: " + imparesArreglo(miArray, tamaño));
console.log("El número de NaN's en tu arreglo es: " + nanArray(miArray, tamaño));

function paresArreglo(miArray, tamaño) {
    var cont = 0;
    for (var i = 0; i < tamaño; i++) {
        if (miArray[i]%2 == 0) {
            cont+=1;
        }
    } 
    return cont;
}

function imparesArreglo(miArray, tamaño) {
    var cont = 0;

    for (var i = 0; i < tamaño; i++) {
        if (miArray[i]%2 != 0 && isNaN(miArray[i])!=true) {
                cont++;
        } 
    } 
    return cont;
}

function nanArray(miArray, tamaño) {
    var cont = 0;
    for (var i = 0; i < tamaño; i++) {
        if(isNaN(miArray[i])){
            cont++;
        }
    }
    return cont;
}



















/*function HolaMundo2() {
    console.log("Hola Mundo");
}

function Saludar(mensaje) {
    console.log(mensaje);
}

function suma(num1, num2) {
    return num1 + num2;
}

function isPrimo(nombre) {
    var isprimo = true;  
    for (var i = numero-1; i > 1; i--) {
        if (numero%i == 0) {
            isprimo = false;
        }
    }
    return isprimo;
}*/

