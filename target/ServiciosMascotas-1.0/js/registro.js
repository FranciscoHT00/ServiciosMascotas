$(document).ready(function(){   
    $("#formRegistro").submit(function(event) {
        event.preventDefault();
        let valido = validarCampos();
        if (valido) {
            registrarUsuario();
        }

    });
});

function validarCampos(){
    const nombre = document.getElementById("username");
    const contraseña = document.getElementById("password");
    const Repetir_Contraseña = document.getElementById("passwordC");
    const form = document.getElementById("form");
    const correo = document.getElementById("email");
    const parrafo = document.getElementById("warnings");
    
    let warnings = "";
    let valido = true;
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    parrafo.innerHTML = "";
    if(nombre.value.length < 6){
        warnings += "El nombre de usuario debe tener mínimo 6 carácteres<br>";
        valido = false;
    }
    if(contraseña.value.length < 8){
        warnings += "La contraseña no es valida<br>";
        valido = false;
    }
    if(Repetir_Contraseña.value.length < 8){
        warnings += "La confirmacion de contraseña no es valida<br>";
        valido = false;
    }
    if(!regexEmail.test(correo.value)){
        warnings += "El email es invalido<br>";
        valido = false;
    }    
    
    parrafo.innerHTML = warnings;   
    
    return valido;
}

function registrarUsuario(){
    let username = $("#username").val();
    let password = $("#password").val();
    let passwordC = $("#passwordC").val();
    let email = $("#email").val();
    let premium = $("#premium").prop("checked");
    
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioRegistro",
        data: $.param({
            username: username,
            password: password,
            email: email,
            premium: premium
        }),
        success: function(result){
            let parsedResult = JSON.parse(result);
            if(parsedResult === 1){
                $("#warnings").text("Usuario registrado exitosamente!");
            }else if(parsedResult === 0){
                $("#warnings").text("El nombre de usuario ya existe");
            }else{
                $("#warnings").text("Error al registrar el usuario");
            }
        }
    });
}