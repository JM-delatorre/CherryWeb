<template>
  <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
    <div class="container px-5">
      <a class="navbar-brand" href="#page-top">¿Qué quieres hacer?</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ms-auto">

          <li class="nav-item"><a class="nav-link" href="/">Principal</a></li>
          <li class="nav-item"><a class="nav-link" href="#!">Calendario</a></li>
          <li class="nav-item"><a class="nav-link" href="/pomodoro">Pomodoro</a></li>
          <li class="nav-item"><a class="nav-link" href="#!">Notas</a></li>
          <li class="nav-item"><a class="nav-link" href="/stats">Estadísticas</a></li>
          <!--<v-btn color="red" levation="13" raised rounded dark  v-on:click="abrirLogin()">Ingresar</v-btn>-->
          <!-- <v-btn color="red" levation="13" raised rounded v-on:click="alert('Hola')"> Ingresar</v-btn -->
        </ul>
      </div>
    </div>
  </nav>

</template>

<script>
export default {
  methods:{
    abrirLogin(){
      this.$router.push('/login');
    }
  }

}


</script>