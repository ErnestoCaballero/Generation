var numero1 = 0;
var numero2 = 0;
var suma = 0;

numero1 = parseInt(prompt("Dame un numero"));
numero2 = parseInt(prompt("Dame otro número"));
suma = numero1 + numero2;
//alert(suma);

if (isNaN(suma)) {
    alert("No estés inventando cosas");
} else {
    alert("La suma es: " + suma);
}
/*
for (var i=1; i<=10; i++) {
    alert("JS test " + i);
}*/

