<template>

    <v-content>
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
                        <h1
                            class="text-center display-2 red--text text--"
                        >Inicia Sesion en Cherry</h1>

                        <h4 class="text-center mt-4">Ingresa tus datos para iniciar sesion</h4>
                        <v-form>
                          <v-text-field
                              label="Email"
                              name="Email"
                              prepend-icon="email"
                              type="text"
                              color="red"
                          />

                          <v-text-field
                              id="password"
                              label="Password"
                              name="password"
                              prepend-icon="lock"
                              type="password"
                              color="red"
                          />
                        </v-form>

                      </v-card-text>
                      <div class="text-center mt-3">
                        <v-btn rounded color="red" dark>INICIAR SESION</v-btn>
                      </div>
                    </v-col>
                    <v-col cols="12" md="4" class="red">
                      <v-card-text class="white--text mt-12">
                        <h1 class="text-center display-1">¡Hola!</h1>
                        <h5
                            class="text-center"
                        >Ingresa tus datos para empezar una nueva travesia con nosotros</h5>
                      </v-card-text>
                      <div class="text-center">
                        <v-btn rounded outlined dark @click="step++">REGISTRATE</v-btn>
                      </div>
                    </v-col>
                  </v-row>
                </v-window-item>
                <v-window-item :value="2">
                  <v-row class="fill-height">
                    <v-col cols="12" md="4" class="red">
                      <v-card-text class="white--text mt-12">
                        <h1 class="text-center display-1">¡Bienvenido de nuevo!</h1>
                        <h5
                            class="text-center"
                        >Para mantenerte concetado con nosotros inicia sesion con tu informacion personal</h5>
                      </v-card-text>
                      <div class="text-center">
                        <v-btn rounded outlined dark @click="step--">INICIA SESION</v-btn>
                      </div>
                    </v-col>

                    <v-col cols="12" md="8">
                      <v-card-text class="mt-12">
                        <h1 class="text-center display-2 red--text text--red">Crea una Cuenta</h1>
                        <div class="text-center mt-4">

                        </div>
                        <h4 class="text-center mt-4">Ingresa tus datos para regisrtrate</h4>
                        <v-form>
                          <v-text-field
                              label="Name"
                              name="Name"
                              prepend-icon="person"
                              type="text"
                              color="red"
                          />
                          <v-text-field
                              label="Email"
                              name="Email"
                              prepend-icon="email"
                              type="text"
                              color="red"
                          />

                          <v-text-field
                              id="password"
                              label="Password"
                              name="password"
                              prepend-icon="lock"
                              type="password"
                              color="red"
                          />
                        </v-form>
                      </v-card-text>
                      <div class="text-center mt-n5">
                        <v-btn rounded color="red" dark>REGISTRARSE</v-btn>
                      </div>
                    </v-col>
                  </v-row>
                </v-window-item>
              </v-window>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-content>


</template>

<script>
export default {
  name: "LoginRegister",
  data: () => ({
    step: 1
  }),
  props: {
    source: String
  },
  methods:{
    volverHome(){
      this.$router.push('/');
    }
  }


}
</script>

