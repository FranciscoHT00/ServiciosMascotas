const nombre = document.getElementById("username");
const contraseña = document.getElementById("password");
const form = document.getElementById("formLogin");
const parrafo = document.getElementById("warnings");

formLogin.addEventListener("submit", e=>{
    e.preventDefault();
    let warnings = "";
    let Ingresar = false;
    parrafo.innerHTML = "";
    if(nombre.value.length < 6){
        warnings += "Nombre muy corto minimo 6 caracteres<br>";
        Ingresar = true;
    }
    if(contraseña.value.length < 8){
        warnings += "La contraseña no es valida<br>";
        Ingresar = true;
    }

    if(Ingresar){
        parrafo.innerHTML = warnings;
    }
});
