

const form = document.getElementById("formRecuperar");
const correo = document.getElementById("correo");
const parrafo = document.getElementById("warnings");

form.addEventListener("submit", e=>{
    e.preventDefault();
    let warnings = "";
    let Ingresar = false;
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    parrafo.innerHTML = "";

    if(!regexEmail.test(correo.value)){
        warnings += "el email es invalido<br>";
        Ingresar = true;
    }
    if(Ingresar){
        parrafo.innerHTML = warnings;
    }
});
