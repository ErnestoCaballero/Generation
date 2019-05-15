$(document).ready(function(){
    $.getJSON("localhost:8080/pelicula", function(dataResult){
        var peliculasData;
        $.each(dataResult, function(key, value){
            peliculasData += '<tr>';
            peliculasData += '<td scope ="row">' + value.idPelicula + '</td>';
            peliculasData += '<td scope ="row">' + value.nombre + '</td>';
            peliculasData += '<td scope ="row">' + value.genero + '</td>';
            peliculasData += '<td scope ="row">' + value.duracion + '</td>';
            peliculasData += '<td scope ="row">' + value.clasificacion + '</td>';
            peliculasData += '</tr>';

        })
        $("#peliculasTable").append(peliculasData);
    })
})