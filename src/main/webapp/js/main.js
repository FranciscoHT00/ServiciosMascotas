var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function(){
    
    
    getUsuario().then(function(){
        mostrarDatos();        
    });
    
});

async function getUsuario(){
    
    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioMostrar",
        data: $.param({
            username: username
        }),
        success: function(result){
            let parsedResult = JSON.parse(result);
            if(parsedResult !== false){
                user = parsedResult;
            }else{
                console.log("Error recuperando los datos del usuario.");
            }
        }
    });
}

function mostrarDatos(){
    
    $("#bienvenida").html("Bienvenido/a <br>" + user.username);
    $("#username").val(user.username);
    $("#nombres").val(user.nombres);
    $("#apellidos").val(user.apellidos);
    $("#email").val(user.email);
    $("#direccion").val(user.direccion);
    $("#saldo").val(user.saldo);
    
    if(user.premium === true){
        $("#premium").prop("checked", true);
    }else{
        $("#premium").prop("checked", false);
    }
    
}