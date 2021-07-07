<template>

    <v-main>
      <v-container class="fill-height" fluid>


        <v-row align="center" justify="center">
          <v-col cols="12" sm="8" md="8">
            <v-card class="elevation-12">
              <v-window v-model="step">
                <v-window-item :value="1">
                  <v-row>
                    <v-col cols="12" md="8">
                      <v-btn class="ma-2" color="red" dark v-on:click="volverHome()" >
                        <v-icon class = "material-icons arrow_back"> </v-icon>Volver
                      </v-btn>
                      <v-card-text class="mt-10">
                        <h1 class="text-center display-2 red--text text--">Inicia Sesion en Cherry</h1>
                        <h4 class="text-center mt-4">Ingresa tus datos para iniciar sesion</h4>
                        <v-form>
                          <v-text-field
                              id = "mail"
                              label="Email"
                              name="Email"
                              prepend-icon="email"
                              type="text"
                              color="red"
                              clearable
                          />

                          <v-text-field
                              id="passwordLogin"
                              label="Password"
                              name="passwordLogin"
                              prepend-icon="lock"
                              type="password"
                              color="red"
                              clearable
                          />
                        </v-form>
                        <div class = "errorLogin">
                          <h6 class="text-center mt-4" id = "textErrorLogin">Contraseña o usuario incorrectos</h6>
                        </div>
                        <div class="text-center mt-3">
                          <v-btn rounded color="red" dark v-on:click="loginMetodo()">INICIAR SESION</v-btn>
                        </div>

                      </v-card-text>

                    </v-col>
                    <v-col cols="12" md="4" class="red">
                      <v-card-text class="white--text mt-12">
                        <h1 class="text-center display-1">¡Hola!</h1>
                        <h5
                            class="text-center"
                        >Ingresa tus datos para empezar una nueva travesia con nosotros</h5>
                        <div class="text-center">
                          <v-btn rounded outlined dark @click="step++">REGISTRATE</v-btn>
                        </div>

                      </v-card-text>

                    </v-col>
                  </v-row>
                </v-window-item>
                <v-window-item :value="2">
                  <v-row class="fill-height">
                    <v-col cols="12" md="4" class="red">
                      <v-card-text class="white--text mt-12">
                        <h1 class="text-center display-1">¡Bienvenido de nuevo!</h1>
                        <h5 class="text-center">Para mantenerte concetado con nosotros inicia sesion con tu informacion personal</h5>
                        <div class="text-center">
                          <v-btn rounded outlined dark @click="step--">INICIA SESION</v-btn>
                        </div>
                      </v-card-text>
                    </v-col>

                    <v-col cols="12" md="8">
                      <v-card-text class="mt-12">
                        <h1 class="text-center display-2 red--text text--red">Crea una Cuenta</h1>
                        <div class="text-center mt-4">

                        </div>
                        <h4 class="text-center mt-4">Ingresa tus datos para registrate</h4>
                        <v-form>
                          <!--

                          -->
                          <v-text-field
                              id = "mailR"
                              label="Email"
                              name="mailR"
                              prepend-icon="email"
                              type="text"
                              color="red"
                              clearable
                          />

                          <v-text-field
                              id= "passwordRegister"
                              label="Password"
                              name="passwordRegister"
                              prepend-icon="lock"
                              type="password"
                              color="red"
                              clearable
                          />

                          <v-text-field
                              id = "nombre"
                              label="Name"
                              name="Name"
                              prepend-icon="person"
                              type="text"
                              color="red"
                              clearable
                          />

                        </v-form>

                        <div class = "registroExitoso">
                          <h6 class="text-center mt-4" id = "textRegistroExitoso">Registro exitoso</h6>
                        </div>
                        <br>
                        <br>
                        <div class="text-center mt-n5">
                          <v-btn rounded color="red" dark v-on:click="registro()">REGISTRARSE</v-btn>
                        </div>
                      </v-card-text>

                    </v-col>
                  </v-row>
                </v-window-item>
              </v-window>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-main>


</template>
<style>
  .errorLogin h6{
    color : #ff0000;
    visibility: hidden;
  }

  .registroExitoso h6{
    color : #15a200;
    visibility: hidden;
  }

</style>
<script>

import axios from "axios";


export default {
  name: "LoginRegister",
  data(){
    var step;
    var todosUsuarios;

    return{
      step: 1
    }

  },
  beforeCreate() {
    let vue = this;
    axios.get("http://localhost:5050/Home/All").then(function (response) {
      vue.todosUsuarios =  response.data

    });

    document.getElementById("textRegistroExitoso").style.visibility="hidden";
    document.getElementById("textErrorLogin").style.visibility="hidden";

  }
  ,
  props: {
    source: String
  },
  methods:{
    volverHome(){
      this.$router.push('/');
    },

    registroExitoso(){
      document.getElementById("textRegistroExitoso").innerText="Registro exitoso.";
      document.getElementById("textRegistroExitoso").style.color="#15a200";
      document.getElementById("textRegistroExitoso").style.visibility="visible";


    },

    registroNoExitoso(palabra){
      document.getElementById("textRegistroExitoso").innerText=palabra;
      document.getElementById("textRegistroExitoso").style.color="#ff0000";
      document.getElementById("textRegistroExitoso").style.visibility="visible";


    },

    registro(){

      let vue = this;


      let mailRegister = document.getElementById("mailR").value;

      console.log("Email: " + mailRegister);

      let pswRegister = document.getElementById("passwordRegister").value;
      console.log("PSW: " + pswRegister);

      let nombre =  document.getElementById("nombre").value;
      console.log("Nombre: " +nombre);

      let isRegistered = false;

      for (let i of  vue.todosUsuarios){
        if(i.correo == mailRegister){
          this.registroNoExitoso("Registro Fallido, el usuario ya existe.");
          isRegistered = true;
          break;
        }else if (mailRegister == "" && nombre == "" && pswRegister == ""){
          this.registroNoExitoso("Por Favor ingresa todos los campos.");
          isRegistered = true;
          break;
        }
      }

      if(!isRegistered){
        axios.post("http://localhost:5050/Home/register", {
          "id": vue.todosUsuarios.length,
          "correo": mailRegister,
          "password": pswRegister,
          "nombreApellido": nombre

        });

        this.registroExitoso();
        this.entradaExitosa();
      }

    },

    loginMetodo(){
      let vue = this;
      let mail =  document.getElementById("mail").value;
      console.log(mail);
      let psw =  document.getElementById("passwordLogin").value;
      console.log(psw);

      let loggueado = false;
      for (let i of  vue.todosUsuarios){
        if(i.correo == mail ){
          if(i.password == psw){
            loggueado = true;
            break;
          }

        }else if(i.correo == mail && i.password != psw){
          this.loginNoExitoso("Contraseña incorrecta");
          break;
        }else if(mail == "" && psw == ""){
          this.loginNoExitoso("Por favor ingresa todos los campos");
          break;
        } else{
          this.loginNoExitoso("Correo o Contraseña incorrectos");
          break;
        }
      }
      if(loggueado){
        this.loginExitoso();
        this.entradaExitosa();
      }
    },
    loginExitoso(){
      document.getElementById("textErrorLogin").innerText="Login exitoso.";
      document.getElementById("textErrorLogin").style.color="#15a200";
      document.getElementById("textErrorLogin").style.visibility="visible";


    },

    loginNoExitoso(palabra){
      document.getElementById("textErrorLogin").innerText=palabra;
      document.getElementById("textErrorLogin").style.color="#ff0000";
      document.getElementById("textErrorLogin").style.visibility="visible";


    },
    entradaExitosa(){
      this.$router.push('PomodoroLogged');
    }
  }



}
</script>

