$(document).ready(function(){
   $("#formLogin").submit(function(){
       event.preventDefault();
       autenticarUsuario();
   });
});

function autenticarUsuario(){
    let username = $("#username").val();
    let password = $("#password").val();
    
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            username: username,
            password: password
        }),
        success: function(result){
            let parsedResult = JSON.parse(result);
            if(parsedResult !== false){
                let username = parsedResult['username'];
                document.location.href = "perfil.html?username=" + username;
            }else{
                $("#warnings").text("Usuario y/o contraseña no válidos");
            }
        }
    });
}