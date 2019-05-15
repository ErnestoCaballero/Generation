window.onload = () => {
    //alert("Test JS");
    var misVerduras = ["Platano", "Pepino", "Berenjena", "Caña"];

    var misVerdurasJson = JSON.stringify(misVerduras);

    console.log(misVerduras);
    console.log(misVerdurasJson);

    //Ejercicio para convertir un Json en una cadena (String)
    var miCadena = "{\"nombre\":\"Amy\", \"apellidoPaterno\":\"Luis\", \"apellidoMaterno\":\"\", \"domicilio\":\"Zapopan\", \"edad\":56, \"sexo\":\"Femenino\"}";
        
    
    miCadenaObj = JSON.parse(miCadena);
    console.log(miCadena);
    console.log(miCadenaObj);
    
}