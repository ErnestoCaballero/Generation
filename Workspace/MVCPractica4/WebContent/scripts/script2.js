console.log("Lets calculate the factorial!")
console.log("The factorial of 6 is " + factorial(6));

function factorial(num) {
    if (num == 1) {return 1}
    return num * factorial(num - 1);
}
