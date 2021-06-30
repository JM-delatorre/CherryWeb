<template>
 <div id="app">
   <!--<h1>Holaaaa</h1>
    <div id="nav" >
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>|
      <router-link to="/about">Calendar</router-link>|
      <router-link to="/about">Pomodoro</router-link>|
      <router-link to="/about">Grades</router-link>|
      <router-link to="/">Stats</router-link>


    </div>


    <router-view/>
-->
   <nav class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
     <div class="container px-5">
       <a class="navbar-brand" href="#page-top">¿Qué quieres hacer?</a>
       <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
       <div class="collapse navbar-collapse" id="navbarResponsive">
         <ul class="navbar-nav ms-auto">

           <li class="nav-item"><a class="nav-link" href="/">Principal</a></li>
           <li class="nav-item"><a class="nav-link" href="/about">Acerca</a></li>
           <li class="nav-item"><a class="nav-link" href="#!">Calendario</a></li>
           <li class="nav-item"><a class="nav-link" href="/pomodoro">Pomodoro</a></li>
           <li class="nav-item"><a class="nav-link" href="#!">Notas</a></li>
           <li class="nav-item"><a class="nav-link" href="/stats">Estadísticas</a></li>
           <a class="btn btn-primary btn-xl rounded-pill mt-5" href="#scroll">Ingresar</a>
         </ul>
       </div>
     </div>

   </nav>
   <router-view/>
   <!-- Header-->


  </div>


</template>
<script>
export default {
  name:'app'
}
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color:#BF0866;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #BF0866;
}
</style>
