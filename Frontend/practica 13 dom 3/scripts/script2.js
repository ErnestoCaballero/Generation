window.onload = function() {
    //Factorial
    document.getElementById("btnFactorial").addEventListener("click",mensaje);
    document.getElementById("btnReset01").addEventListener("click", reset);

    //Prime?
    document.getElementById("btnPrime").onclick = message01;
}

function mensaje() {
    var numb = parseInt(document.getElementById("txtNumber").value);
    console.log(numb + "! = " + factorial(numb));
    document.getElementById("resultFactorial").innerHTML = numb + "! = " + factorial(numb);
    
}

function factorial(numb) {
    if (numb == 1) {
        return 1;
    } else {
        return numb * factorial(numb - 1);
    }
    /*var res = 1;
    for (var i = 1; i <= numb; i++) {
        res *= i;
    }
    return res;*/
}

function reset() {
    document.getElementById("txtNumber").value = "";
    document.getElementById("resultFactorial").innerHTML = "";
}

function message01() {
    var prime = parseInt(document.getElementById("txtPrime").value);
    console.log(checkPrime(prime));
    document.getElementById("resultPrime").innerHTML = checkPrime(prime);
}

function checkPrime(prime) {
    
    for (var i = 2; i < prime; i++) {
        console.log(prime + " % " + i + " = " + (prime % i));
        if (prime % i == 0) {
            return prime + " is not a prime number. Is a multiple of " + i;
        } 
    }
    return prime + " is a prime number!"
}

