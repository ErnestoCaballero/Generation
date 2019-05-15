/*$(document).ready(
    function(){
        alert("Test en JQuery");
        $("#primero").hide();
        $(".tercero").hide();
    }
);*/

$(function() {
    alert("Test en JQuery");
    $(".botoncitos").click
    (
        function() {
            alert("Mi Test");
        }
    )
    $("#primero").dblclick
    (
        function() {
            alert("Mi otro botón");
        }
    )
    $("#btnBoton01").click(msgOtroTest);
    $("#btnBoton03").click(msgOtroTest);
    $("p").click(msgOtroTest);
});

function msgOtroTest() {
    alert("Mi otro mensaje");
}