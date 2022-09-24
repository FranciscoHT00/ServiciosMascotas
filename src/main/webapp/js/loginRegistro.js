const nombre = document.getElementById("username");
const contraseña = document.getElementById("password");
const Repetir_Contraseña = document.getElementById("passwordC");
const form = document.getElementById("form");
const correo = document.getElementById("email");
const parrafo = document.getElementById("warnings");

form.addEventListener("submit", e=>{
    e.preventDefault();
    let warnings = "";
    let Ingresar = false;
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    parrafo.innerHTML = "";
    if(nombre.value.length < 6){
        warnings += "El nombre de usuario debe tener mínimo 6 carácteres<br>";
        Ingresar = true;
    }
    if(contraseña.value.length < 8){
        warnings += "La contraseña no es valida<br>";
        Ingresar = true;
    }
    if(Repetir_Contraseña.value.length < 8){
        warnings += "La confirmacion de contraseña no es valida<br>";
        Ingresar = true;
    }
    if(!regexEmail.test(correo.value)){
        warnings += "El email es invalido<br>";
        Ingresar = true;
    }
    if(Ingresar){
        parrafo.innerHTML = warnings;
    }
})
