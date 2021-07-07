<template>
  <div id="Note">
    <br>
    <v-app id="inspire">
      <v-container fluid>
        <v-data-iterator class="pt-16"
            :items="items"
            :items-per-page.sync="itemsPerPage"
            :page.sync="page"
            :search="search"
            :sort-by="sortBy.toLowerCase()"
            :sort-desc="sortDesc"
            hide-default-footer
        >
          <template v-slot:header>
            <v-toolbar
                dark
                color="red darken-1"
                class="mb-1"
            >
              <v-text-field
                  v-model="search"
                  clearable
                  flat
                  solo-inverted
                  hide-details
                  prepend-inner-icon="mdi-magnify"
                  label="Search"
              ></v-text-field>
              <template v-if="$vuetify.breakpoint.mdAndUp">
                <v-spacer></v-spacer>
                <v-select
                    v-model="sortBy"
                    flat
                    solo-inverted
                    hide-details
                    :items="keys"
                    prepend-inner-icon="mdi-magnify"
                    label="Sort by"
                ></v-select>
                <v-spacer></v-spacer>


                <v-btn
                    fab
                    color="Red accent-1"



                    @click="dialog = !dialog"
                >
                  <v-icon>mdi-plus</v-icon>
                </v-btn>

                <v-dialog
                    v-model="dialog"
                    max-width="500px"
                >
                  <v-card>
                    <v-card-text>
                      <v-text-field label="Materia"></v-text-field>
                      <v-text-field label="Codigo"></v-text-field>
                      <v-text-field label="Nota1"></v-text-field>
                      <v-text-field label="Nota2"></v-text-field>
                      <v-text-field label="Nota3"></v-text-field>
                      <v-text-field label="Nota4"></v-text-field>
                      <v-text-field label="Nota5"></v-text-field>
                      <v-text-field label="Profesor"></v-text-field>

                      <small class="grey--text">* This doesn't actually save.</small>
                    </v-card-text>

                    <v-card-actions>
                      <v-spacer></v-spacer>

                      <v-btn
                          text
                          color="primary"
                          @click="dialog = false"
                      >
                        Submit
                      </v-btn>
                    </v-card-actions>
                  </v-card>
                </v-dialog>

                <v-spacer></v-spacer>

                <v-btn-toggle
                    v-model="sortDesc"
                    mandatory
                >
                  <v-btn
                      large
                      depressed
                      color="red"
                      :value="false"
                  >
                    <v-icon>mdi-arrow-up</v-icon>
                  </v-btn>
                  <v-btn
                      large
                      depressed
                      color="red lighten 2"
                      :value="true"
                  >
                    <v-icon>mdi-arrow-down</v-icon>
                  </v-btn>
                </v-btn-toggle>
              </template>
            </v-toolbar>
          </template>

          <template v-slot:default="props">
            <v-row>
              <v-col
                  v-for="item in props.items"
                  :key="item.name"
                  cols="12"
                  sm="6"
                  md="4"
                  lg="3"
              >
                <v-card>
                  <v-card-title class="subheading font-weight-bold">
                    {{ item.name}}
                  </v-card-title>

                  <v-divider></v-divider>

                  <v-list dense>
                    <v-list-item
                        v-for="(key, index) in filteredKeys"
                        :key="index"
                    >
                      <v-list-item-content :class="{ 'red--text': sortBy === key }">
                        {{ key }}:
                      </v-list-item-content>
                      <v-list-item-content
                          class="align-end"
                          :class="{ 'red--text': sortBy === key }"
                      >
                        {{ item[key.toLowerCase()] }}
                      </v-list-item-content>
                    </v-list-item>
                  </v-list>
                </v-card>
              </v-col>
            </v-row>
          </template>

          <template v-slot:footer>
            <v-row
                class="mt-2"
                align="center"
                justify="center"
            >
              <span class="grey--text">Items per page</span>
              <v-menu offset-y>
                <template v-slot:activator="{ on, attrs }">
                  <v-btn
                      dark
                      text
                      color="primary"
                      class="ml-2"
                      v-bind="attrs"
                      v-on="on"
                  >
                    {{ itemsPerPage }}
                    <v-icon>mdi-chevron-down</v-icon>
                  </v-btn>
                </template>
                <v-list >
                  <v-list-item
                      v-for="(number, index) in itemsPerPageArray"
                      :key="index"
                      @click="updateItemsPerPage(number)"

                  >
                    <v-list-item-title>{{ number }}</v-list-item-title>
                  </v-list-item>
                </v-list>
              </v-menu>

              <v-spacer></v-spacer>

              <span
                  class="mr-4
              grey--text"
              >
              Page {{ page }} of {{ numberOfPages }}
            </span>
              <v-btn
                  fab
                  dark
                  color="red darken-1"
                  class="mr-1"
                  @click="formerPage"
              >

                <v-icon>mdi-chevron-left</v-icon>
              </v-btn>
              <v-btn
                  fab
                  dark
                  color="red darken-1"
                  class="ml-1"
                  @click="nextPage"
              >
                <v-icon>mdi-chevron-right</v-icon>
              </v-btn>
            </v-row>
          </template>
        </v-data-iterator>
      </v-container>
    </v-app>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Note",


  data () {
    return {
      tablaItems: [],
      itemsPerPageArray: [4, 8, 12],
      search: '',
      dialog : false,
      filter: {},
      sortDesc: false,
      page: 1,
      itemsPerPage: 4,
      sortBy: 'name',
      keys: [
        'Codigo',
        'Nota 1',
        'Nota 2',
        'Nota 3',
        'Nota 4',
        'Nota 5',
        'Profesor',
        'Id',
      ],




      items: [
        {
          name: 'Biología',
          codigo: 159,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Matemáticas',
          codigo: 237,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Lenguaje',
          codigo: 262,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Sociales',
          codigo: 305,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Agricultura',
          codigo: 356,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Medio ambiente',
          codigo: 375,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Forestal',
          codigo: 392,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Geometria',
          codigo: 408,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Artes',
          codigo: 452,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Religión',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Escenicas',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Pedagogía',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Pedagogía3',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'KitKat4',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Baile',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },
        {
          name: 'Geometria',
          codigo: 518,
          Nota1: 6.0,
          Nota2: 24,
          Nota3: 4.0,
          Nota4: 87,
          Nota5: '14%',
          Profesor: '1%',
          Id: '1%',
        },

      ],
    }
  },


  computed: {
    numberOfPages () {
      return Math.ceil(this.items.length / this.itemsPerPage)
    },
    filteredKeys () {
      return this.keys.filter(key => key !== 'Name')
    },
  },
  methods: {

    beforeCreate() {
      let vue = this;
      axios.get("http://localhost:5050/Subject/get-all").then(function (response)  {
        vue.nameSubject =  response.data


      }).catch(function (error) {
        console.log(error);
      })
    },


    leerAPI(){
      axios.get('"http://localhost:5050/Subject/get-all"',
          {
        params: {
          'per_page': this.cantidadResultados
        }

      }).then(response => {
        this.usuarios = response.data.data
      }).catch(e => {
        console.log(e)
      })
    },
  created(){
    this.leerAPI()
  },

    nextPage () {
      if (this.page + 1 <= this.numberOfPages) this.page += 1
    },
    formerPage () {
      if (this.page - 1 >= 1) this.page -= 1
    },
    updateItemsPerPage (number) {
      this.itemsPerPage = number
    },
  },
}
</script>

<style scoped>

</style>