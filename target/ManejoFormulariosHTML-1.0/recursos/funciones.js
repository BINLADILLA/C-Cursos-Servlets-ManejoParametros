
function validarForma(form1) {//este archivo poseera el metodo validar forma para poder validar cada unode los elementos del formulario
    // de la clase manejo de formularios, aqui la funcion validar forma recibe al objeto forma de html
    var usuario = form1.usuario;
    if (usuario.value === "" || usuario.value === "Escribir usuario") {
        alert("debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;//con esto tenemos la validacion de usuario, se retorna false debido a que si es true la info se envia al action
        //del indexhtml, si es false se le indica al usuario la alerta que esta escrita arriba
    }
    var password = form1.password;
    if (password.value === "" || password.value.length < 3) {//aca pregunto si password esta vacio o tiene menos de tres elementos
        alert("escribir 3 o mas caracteres");
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = form1.tecnologia;
var checkSeleccionado = false;
//ahora revisamos si alguna de las tenologias del checkbox fue seleccionada
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {//aca preguntamos si tecnologias al ser varios elementos si el elemento seleccionado ha sido checkeado
            checkSeleccionado = true;//si algun elemento ha sido seleccionado pasamos a true el check seleccionado
//posterior revisamos en caso de que ninguna tecnologia haya sido seleccionada, osea checkseleccionado=false entonces mandamos una alerta
 
        }
    }
if (!checkSeleccionado) {
        alert("seleccionar una tecnologia");
        return false;
    }

    var generos = form1.genero;
    var radioSeleccionado = false;
    for (var i = 0; i < generos.length; i++)
    {
        if (generos[i].checked) {
            radioSeleccionado = true;

        }
    }
    if (!radioSeleccionado) {
        alert("debe seleccionar un genero");
        return false;

    }

    var ocupacion = form1.ocupacion;
    if (ocupacion.value === "") {
        alert("debe seleccionar una ocupacion");
        return false;
        //en este punto el formulario es valido asi que regresaremos return true

    }
    alert("formulario valido enviando datos al servidor");
    return true;
}
