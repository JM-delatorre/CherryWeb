<template>

  <div id="Pomodoro">
    <v-app id="inspire">
      <v-container class="grey lighten-5">
      <v-row >
        <v-col align-self="center"
               justify="center"
               class="pt-16"
               >

            <v-dialog
                v-model="dialog"
                width="500"
            >
              <template v-slot:activator="{ on, attrs }">
                <v-btn
                    color="red lighten-2"
                    dark
                    v-bind="attrs"
                    v-on="on"
                >
                  ¿Que debo hacer?
                </v-btn>
              </template>

              <v-card>
                <v-card-title class="text-h5 grey lighten-2">
                  ¿Como usar pomodoro?
                </v-card-title>

                <v-card-text>
                  Empieza una sesion de 25 minutos, se te notificara cuando acaben y tendras que descansar 5 minutos
                </v-card-text>

                <v-divider></v-divider>

                <v-card-actions>
                  <v-spacer></v-spacer>
                  <v-btn
                      color="primary"
                      text
                      @click="dialog = false"
                  >
                    Ok
                  </v-btn>
                </v-card-actions>
              </v-card>
            </v-dialog>

        </v-col>

        <v-col >


          <div class="text-center">

        <v-progress-circular
            :rotate="270"
            :size="350"
            :width="15"
            :value="time"
            color="red"
        >
          <v-col
              align="center"
              justify="center">



            <v-avatar id = " Avatar "
                      color="warning lighten-2"
                      size="56"
            ></v-avatar>
            <v-img v-if="isRunning"
                   lazy-src="https://i.imgur.com/UOgJZnt.gif"
                   max-height="800"
                   max-width="400"
                   src="https://i.imgur.com/UOgJZnt.gifnp"
            ></v-img>

            <v-img v-else
                   lazy-src="https://i.imgur.com/0y1h6CB.gif"
                   max-height="800"
                   max-width="400"
                   src="https://i.imgur.com/0y1h6CB.gif"
            ></v-img>

          </v-col>
        </v-progress-circular>
          </div>
        </v-col>





      <v-col align-self="center"
             class="pt-16"
      >




      <v-row v-if="WasRunning"
             align="center"
             justify="space-between"
      >




        <v-btn id= "Continue" @click.native="start"

               outlined

               color = "green"
        >Continuar</v-btn>



        <v-btn id= "Stop" @click.native="stop"

               outlined

               color = "red"
        >Parar</v-btn>
        <v-btn id= "Clear" @click.native="reset"

               outlined

               color = "blue"

        >Limpiar</v-btn>


      </v-row>

      <v-row v-else>


        <v-btn id= "Start" @click.native="start"

               outlined

               color = "green"
        >Empezar</v-btn>






        <v-btn id= "Stop" @click.native="stop"

               outlined

               color = "red"
        >Parar</v-btn>
        <v-btn id= "Clear" @click.native="reset"

               outlined

               color = "blue"

        >Limpiar</v-btn>


      </v-row>

      </v-col>
      </v-row>
      </v-container>
    </v-app>
  </div>



</template>

<script>


export default {
  name: "Tempo",
  data() {
    return {
      interval: {},
      time: 0,
      valueStop: 0,
      isRunning: false,
      WasRunning : false,
      dialog: false,

    }
  },
  methods: {
    start() {
      alert("Has iniciado");
      this.isRunning = true;
      this.WasRunning = false;
      if (!this.timer) {
        this.timer = setInterval(() => {
          var realtime = Math.floor(((1500-this.time)/60))
          document.getElementById(" Avatar ").innerHTML= String(realtime)
          if (this.time < 1500) {

            this.time++

          } else {
            clearInterval(this.timer)
            alert("Has terminado")
            this.reset()
          }
        }, 5000)
      }
    },
    stop() {
      if (this.isRunning){
        this.WasRunning = true;

      }
      this.isRunning = false

      clearInterval(this.timer)
      this.timer = null
    },
    reset() {
      this.WasRunning = false;
      this.stop()
      this.time = 0
      this.secondes = 0
      this.minutes = 0
    },
    setTime(payload) {
      this.time = (payload.minutes * 60 + payload.secondes)
    }

  }


}


</script>

<style>
.v-progress-circular {
  margin: 10rem;
}


.pt-16 { padding-top: 50%; }


</style>
