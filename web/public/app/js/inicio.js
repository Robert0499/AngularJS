$(document).ready(function () {
  $('#show').mousedown(function () {
    $("#pass").removeAttr('type');
    $('#show').addClass('fa-eye-slash').removeClass('fa-eye');
  });
  $('#show').mouseup(function () {
    $("#pass").attr('type', 'password');
    $('#show').addClass('fa-eye').removeClass('fa-eye-slash');
  });
  $('#show1').mousedown(function () {
    $("#pass1").removeAttr('type');
    $('#show1').addClass('fa-eye-slash').removeClass('fa-eye');
  });
  $('#show1').mouseup(function () {
    $("#pass1").attr('type', 'password');
    $('#show1').addClass('fa-eye').removeClass('fa-eye-slash');
  });
});

//var form = document.getElementById('form1');
//tmp = true;
//form.addEventListener('submit', function (e) {
//  e.preventDefault();
//  clave1 = document.f1.password.value;
//  clave2 = document.f1.password2.value;
//  if (clave1 == clave2) {
//    tmp = true;
//  } else {
//    tmp = false;
//    toastr.error("Las contraseñas no coinciden, por favor verifica!");
//  }
//  if (tmp) {
//    this.submit();
//  }
//}, false);

function letter(e) {
  let key = e.keyCode || e.which;
  let teclado = String.fromCharCode(key).toLowerCase();
  let letras = " abcdefghijklmnñopqrstuvwxyz";
  let especiales = "8-37-38-46-164";
  let t_especial = false;
  for (var i in especiales) {
    if (key == especiales[i]) {
      t_especial = true;
      break;
    }
  }
  if (letras.indexOf(teclado) == -1 && !t_especial) {
    return false;
  }
}





