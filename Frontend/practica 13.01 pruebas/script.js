window.onload = function() {
    var factorial = parseInt(prompt("Give me a number to calculate its factorial"));
    console.log(factorial);
    var res = 1;

    for (var i = 1; i <= factorial; i++) {
        res *= i;
    }
    
    //FACTORIAL
    console.log("Using For Loop: ");
    console.log(factorial + "! = " + res);

    console.log("\nUsing a recursive Method: ");
    console.log(factorial + "! = " + factorial1(factorial));

    console.log(createLines()); 
    console.log("");

    //FIBONACCI
    console.log("Fibonacci serie!");
    var fibo = parseInt(prompt("What position of the Fibonacci serie do you want? "));
    
    console.log("Using While Loop:")
    console.log("In the " + fibo + " position, the number is " + fibonacci(fibo));

    console.log("\nUsing a recursive Method: ");
    console.log("In the " + fibo + " position, the number is " + fibonacciR(fibo));


}


function factorial1(numb) {
    if (numb == 1) {
        return 1;
    } else {
        return numb * factorial1(numb - 1);
    }
}

function createLines() {
    var lines = "-"
    for (var i = 0; i < 40; i++) {
       lines = lines + "-";
    }
    return lines;
}

function fibonacci(fibo) {
    var a = 1, b = 0, temp;

    while (fibo >= 0) {
        temp = a;
        a = a + b;
        b = temp;
        fibo--;
    }
    return b;
}

function fibonacciR(fibo) {
    if (fibo == 0) {
        return 1;
    } else if (fibo == 1) {
        return 1;
    } else {
        return fibonacciR(fibo - 1) + fibonacciR(fibo - 2);
    }
}

