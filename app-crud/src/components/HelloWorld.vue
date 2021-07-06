<template>
  <div class="hello">
    <router-view/>
    <!-- Header-->
    <header class="masthead text-center text-white">
      <div class="masthead-content">
        <div class="container px-5">
          <h1 class="masthead-heading mb-0">Bienvenido a Cherry</h1>
          <h2 class="masthead-subheading mb-0">Tu asistente virtual que te ayudará a ser mas eficiente en la academia</h2>
          <a class="btn btn-primary btn-xl rounded-pill mt-5" href="#scroll">¿Qué es Cherry?</a>

        </div>
      </div>
      <div class="bg-circle-1 bg-circle"></div>
      <div class="bg-circle-2 bg-circle"></div>
      <div class="bg-circle-3 bg-circle"></div>
      <div class="bg-circle-4 bg-circle"></div>
    </header>
    <!-- Content section 1-->
    <section id="scroll">
      <div class="container px-5">
        <div class="row gx-5 align-items-center">
          <div class="col-lg-6 order-lg-2">
            <div class="p-5"><img class="img-fluid rounded-circle" src="../assets/img/ManejoTiempo.jpg" alt="..." /></div>
          </div>
          <div class="col-lg-6 order-lg-1">
            <div class="p-5">
              <h2 class="display-4"> Organización</h2>
              <p>Cherry es una aplicación que te permitirá poder manejar tu tiempo de forma adecuada para el éxito académico y el éxito profesional</p>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- Content section 2-->
    <section>
      <div class="container px-5">
        <div class="row gx-5 align-items-center">
          <div class="col-lg-6">
            <div class="p-5"><img class="img-fluid rounded-circle" src="../assets/img/MetodosEstudio.jpg" alt="..." /></div>
          </div>
          <div class="col-lg-6">
            <div class="p-5">
              <h2 class="display-4">Métodos</h2>
              <p>Contamos con un método para que puedas estudiar las materias y aproveches al máximo la concentración de tu cerebro</p>
            </div>
          </div>
        </div>
      </div>

    </section>
    <!-- Content section 3-->
    <section>

      <div class="container px-5">
        <div class="row gx-5 align-items-center">
          <div class="col-lg-6 order-lg-2">
            <div class="p-5"><img class="img-fluid rounded-circle" src="../assets/img/AhorroPapel.jpg" alt="..." /></div>
          </div>
          <div class="col-lg-6 order-lg-1">
            <div class="p-5">
              <h2 class="display-4">Eco Friendly</h2>
              <p>Con cherry, organizar tus notas y registros del semestre académico será más fácil y podrás reducir la cantidad de fotos y papel que usas en el año</p>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- Footer-->
    <footer class="py-5 bg-black">
      <div class="container px-5"><p class="m-0 text-center text-white small">Copyright &copy; Your Website 2021</p></div>
    </footer>

  </div>


</template>



<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #BF0866;
}
</style>

