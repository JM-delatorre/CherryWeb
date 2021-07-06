<template>
  <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
    <div class="container px-5">
      <a class="navbar-brand" href="#page-top">Bienvenido</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ms-auto">

          <li class="nav-item"><a class="nav-link" href="/">Principal<v-icon class="material-icons home pb-2 " color= "grey" ></v-icon></a></li>
          <li class="nav-item"><a class="nav-link" href="/pomodoro">Pomodoro<v-icon class="material-icons timer pb-2 " color= "grey" ></v-icon></a></li>
          <v-btn color="red" levation="13" raised rounded dark  v-on:click="abrirLogin()">Ingresar <v-icon class = "material-icons login pl-2"> </v-icon></v-btn>

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
