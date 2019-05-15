const TAMANIO_VECTOR = 10;
var vector = [TAMANIO_VECTOR];
var i = 0;

while(i < TAMANIO_VECTOR) {
    vector[i] = Math.floor(Math.random() * 100);
    i++;
}

console.log(vector);

console.log("El número de pares en tu arreglo es: " + paresArreglo(vector, TAMANIO_VECTOR));
console.log("El número de impares en tu arreglo es: " + imparesArreglo(vector, TAMANIO_VECTOR));
console.log("El número de NaN's en tu arreglo es: " + nanArray(vector, TAMANIO_VECTOR));

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
