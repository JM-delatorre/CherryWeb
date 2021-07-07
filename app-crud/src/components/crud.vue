<template>
  <header class="header-content-complet">
    <div class="header-video">
      <video src="../assets/video/pexels-stan-kenzo-5636838.mp4" autoplay loop></video>
    </div>

    <div class="header-overlay">

    </div>
    <div class="header-content">
      <section class="primer_gr">
        <ul class="list-group list-group-horizontal">
          <li class="lista1">
            <div class="vAlign" @mouseover="hover=true">
              <a v-if="bandera==false" v-on:click="crearTodas()" class="btn" href="#container5" >
                <p class="margen_inferior_1em" >
                  <img src="../assets/img/statistics-5041374_960_720.png" alt=""></p>
                <p class="fuente_tam120"  style="font-family: 'Comic Sans MS';color: #157347">Estadisticas Diarias</p>
              </a>
              <a v-if="bandera==true" v-on:click="updateSemanal()" class="btn" href="#container5" >
                <p class="margen_inferior_1em" >
                  <img src="../assets/img/statistics-5041374_960_720.png" alt=""></p>
                <p class="fuente_tam120"  style="font-family: 'Comic Sans MS';color: #157347">Estadisticas Diarias</p>
              </a>

            </div>
          </li>
          <li class="lista2">
            <div class="vAlign" @mouseover="hover=true">
              <a v-on:click="crearComparar" class="btn" href="#containerComparar" >
                <p class="margen_inferior_1em">
                  <img src="../assets/img/power.png" alt=""></p>
                <p class="fuente_tam120" style="font-family: 'Comic Sans MS';color: #157347" >Comparativo Semanal</p>
              </a>
            </div>
          </li>
          <li class="lista3">
            <div class="vAlign" @mouseover="hover=true">
              <a v-on:click="crearMeta()" class="btn" href="#containerMeta">
                <p class="margen_inferior_1em">
                  <img src="../assets/img/ilustrator.png" alt=""></p>
                <p class="fuente_tam120"  style="font-family: 'Comic Sans MS';color: #157347">Promedio de Notas Y Porcentaje Alcanzado</p>
              </a>
            </div>
          </li>

        </ul>


      </section>
      <!--    <div class="buttons">
            <b-button v-on:click="crearChart() ">I am a Button</b-button>
            <b-button v-on:click="updateChart()">I am a Link</b-button>
            <b-button v-on:click="creartorat()">I am a Link2</b-button>
          </div>-->
      <section>
        <ul class="list-group list-group-horizontal">
          <li class="li1">
            <div class="vAlign" @mouseover="hover=true">
              <a v-on:click="updateMensual()" class="btn" href="#container5" >
                <p class="margen_inferior_1em">
                  <img src="../assets/img/rotar.png" alt=""></p>
                <p class="fuente_tam120" style="font-family: 'Comic Sans MS';color: #157347">Estadisticas Mensuales</p>
              </a>
            </div>
          </li>
          <li class="li2">
            <div class="vAlign" @mouseover="hover=true">
              <a v-on:click="updateAnual()" class="btn" >
                <p class="margen_inferior_1em">
                  <img src="../assets/img/cal2.png" alt=""></p>
                <p class="fuente_tam120" style="font-family: 'Comic Sans MS';color: #157347">Estadisticas Anuales</p>
              </a>
            </div>
          </li>
          <li class="li3">
            <div class="vAlign" @mouseover="hover=true">
              <a v-on:click="updateComparativo()" class="btn" href="#containerComparar">
                <p class="margen_inferior_1em">
                  <img src="../assets/img/personalization-statistics.png" alt=""></p>
                <p class="fuente_tam120" style="font-family: 'Comic Sans MS';color: #157347">Comparativo Mensual</p>
              </a>
            </div>
          </li>
<!--          <li class="li4">
            <div class="vAlign" @mouseover="hover=true">
              <a v-on:click="crearChart()" class="btn" >
                <p class="margen_inferior_1em">
                  <img src="../assets/img/calendarioilustra.png" alt=""></p>
                <p class="fuente_tam120" style="font-family: 'Comic Sans MS';color: #157347">Meta Anual</p>
              </a>
            </div>
          </li>-->

        </ul>
      </section>

      <ul class="list-group list-group-horizontal">
        <li class="lihig">
          <figure class="highcharts-figure">
            <div class="hig">
              <!--            <highcharts class="hc" :options="chartOptions" ref="chart"></highcharts>-->
            </div>
            <div id="container">
            </div>
            <p class="highcharts-description">

            </p>

          </figure>
        </li>

        <li class="liDatauser">
          <div class="Data">
            <b-table class="tabla" striped hover :items="post" :fields="fields"  ></b-table>
          </div>
        </li>
        <li class="torta">
          <div id="container5" style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>
        </li>
      </ul>
      <div class="centrif">
        <figure class="highcharts-figure">
          <div id="container6" ></div>
          <p class="highcharts-description">

          </p>
        </figure>
      </div>
      <div class="centrif">
        <figure class="highcharts-figure">
          <div id="containerComparar" ></div>
          <p class="highcharts-description">

          </p>
        </figure>
      </div>
      <section>
        <ul class="list-group list-group-horizontal">
          <li class="Meta">
            <div class="centrifMeta">
              <figure class="highcharts-figure">
                <div id="containerMeta" ></div>
                <p class="highcharts-description">
                </p>
              </figure>
            </div>
          </li>

          <li class="Alas">
            <div class="centrifAlas">
              <figure class="highcharts-figure">
                <div id="containerAlas"></div>
                <p class="highcharts-description">
                </p>
              </figure>
            </div>
          </li>

          <li class="Notas">
            <div class="centrifNotas">
              <figure class="highcharts-figure">
                <div id="containerNotas" ></div>
                <p class="highcharts-description">
                </p>
              </figure>
            </div>
          </li>



        </ul>
      </section>


    </div>

  </header>




</template>

<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script><script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/variable-pie.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-3d.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-more.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script src="https://code.highcharts.com/4.2.3/highcharts.js"></script>
<script src = "node_modules/highcharts-more/index.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-more.js"></script>
<script src="https://code.highcharts.com/modules/solid-gauge.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-more.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>

<!-- Latest compiled and minified JavaScript -->


<script>

import axios from "axios";
import DataUsers from "@/components/DataUsers";
import HighchartsVue from 'highcharts-vue'

import HighchartsMore from 'highcharts/highcharts-more'
import * as Highcharts from 'highcharts';
import more from 'highcharts/highcharts-more';
more(Highcharts);
HighchartsMore(Highcharts)
export default {
  name: "Crud",
  /*components: {
    DataUsers,

  },*/

  beforeCreate() {
    let vue = this;
   /* fetch("http://localhost:5050/Home/22")
        .then(resp => resp.json())
        .then(resp => {
          this.chartOptions.series[0].data = resp;
        });*/


    axios.get("http://localhost:5050/Home/200").then(function (response) {
      vue.chart2 = response.data
      console.log(vue.chart2)
    });
    axios.get("http://localhost:5050/Home/201").then(function (response) {
      vue.chart5 = response.data
      console.log(vue.chart5)
    });
    axios.get("http://localhost:5050/Home/202").then(function (response) {
      vue.chartUpdate = response.data

    });
    axios.get("http://localhost:5050/Home/200").then(function (response) {
      vue.chartSem = response.data

    });
  },

  data() {
    var chartorta;
    var charbase;
    var charComparar;
    var chart5;
    var chart2;
    var chart;
    var meta;
    var notas;
    var chartUpdate;
    var chartSem;
    let vue2 = this;
    var alas;
    var bandera=false;
    return {
      hover: false,
     /* datos: [],*/
      post:[],
      fields:[
      ],
      bandera:false,


    }
  },
mounted() {



  /*let vue=this;
vue.charbase= Highcharts.chart('container6', {

  chart: {
    type: 'columnrange',
    inverted: true
  },

  accessibility: {
    description: 'Image description: A column range chart compares the monthly temperature variations throughout 2017 in Vik I Sogn, Norway. The chart is interactive and displays the temperature range for each month when hovering over the data. The temperature is measured in degrees Celsius on the X-axis and the months are plotted on the Y-axis. The lowest temperature is recorded in March at minus 10.2 Celsius. The lowest range of temperatures is found in December ranging from a low of minus 9 to a high of 8.6 Celsius. The highest temperature is found in July at 26.2 Celsius. July also has the highest range of temperatures from 6 to 26.2 Celsius. The broadest range of temperatures is found in May ranging from a low of minus 0.6 to a high of 23.1 Celsius.'
  },

  title: {
    text: 'Temperature variation by month'
  },

  subtitle: {
    text: 'Observed in Vik i Sogn, Norway, 2017'
  },

  xAxis: {
    categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
      'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
  },

  yAxis: {
    title: {
      text: 'Temperature ( °C )'
    }
  },

  tooltip: {
    valueSuffix: '°C'
  },

  plotOptions: {
    columnrange: {
      dataLabels: {
        enabled: true,
        format: '{y}°C'
      }
    }
  },

  legend: {
    enabled: false
  },

  series: [{
    name: 'Temperatures',
    data: [
      [-9.9, 10.3],
      [-8.6, 8.5],
      [-10.2, 11.8],
      [-1.7, 12.2],
      [-0.6, 23.1],
      [3.7, 25.4],
      [6.0, 26.2],
      [6.7, 21.4],
      [3.5, 19.5],
      [-1.3, 16.0],
      [-8.7, 9.4],
      [-9.0, 8.6]
    ]
  }]

});
*/
},
  methods: {
    creartorat(){
      let vue=this;
      vue.chartorta=Highcharts.chart('container5', {
        chart: {
          type: 'pie'
        },
        series: [{
          name: 'Materias',
          colorByPoint: true,
          data: vue.chart2
        }]
      });
    },
    crearComparar(){
      let  vue=this;
     vue.charComparar=Highcharts.chart('containerComparar', {
        chart: {
          type: 'areaspline'
        },
        title: {
          text: 'Comparacion Semanal'
        },
        legend: {
          layout: 'vertical',
          align: 'left',
          verticalAlign: 'top',
          x: 150,
          y: 100,
          floating: true,
          borderWidth: 1,
          backgroundColor:
              Highcharts.defaultOptions.legend.backgroundColor || '#FFFFFF'
        },
        xAxis: {
          categories: [
            'Monday',
            'Tuesday',
            'Wednesday',
            'Thursday',
            'Friday',
            'Saturday',
            'Sunday'
          ],
          plotBands: [{ // visualize the weekend
            from: 4.5,
            to: 6.5,
            color: 'rgba(68, 170, 213, .2)'
          }]
        },
        yAxis: {
          title: {
            text: 'Horas'
          }
        },
        tooltip: {
          shared: true,
          valueSuffix: ' Horas'
        },
        credits: {
          enabled: false
        },
        plotOptions: {
          areaspline: {
            fillOpacity: 0.5
          }
        },
        series: [{
          name: 'Inlges',
          data: [3, 4, 3, 5, 4, 2, 3]
        }, {
          name: 'Frances',
          data: [1, 3, 4, 3, 3, 5, 4]
        },
          {
            name: 'Italiano',
            data: [2, 1, 1, 5, 3, 5, 4]
          },
          {
            name: 'Aleman',
            data: [1, 1, 1, 4, 3, 6, 4]
          },
          {
            name: 'Ruso',
            data: [2, 3, 3, 5, 5, 6, 4]
          },
          {
            name: 'Mandarin',
            data: [2, 1, 1, 2, 3, 1, 4]
          },
          {
            name: 'japones',
            data: [1, 3, 5, 2, 2,3, 4]
          },
          {
            name: 'Portugues',
            data: [1, 2, 3, 2, 1, 1, 0]
          },
        ]
      });

    },
    updateComparativo(){
      let  vue=this;
      vue.charComparar.update({
        title: {
          text: 'Comparacion Mensual'
        },
        xAxis: {
          categories: [
            'Wee1',
            'Week2',
            'Week3',
            'Week4',
          ],
          plotBands: [{ // visualize the weekend
            from: 4.5,
            to: 6.5,
            color: 'rgba(68, 170, 213, .2)'
          }]
        },
        series: [{
          name: 'Inlges',
          data: [3, 6, 8, 6]
        }, {
          name: 'Frances',
          data: [3, 4, 5, 6]
        },
          {
            name: 'Italiano',
            data: [6, 5, 3, 4]
          },
          {
            name: 'Aleman',
            data: [1, 1, 1, 6]
          },
          {
            name: 'Ruso',
            data: [2, 3, 3, 5 ]
          },
          {
            name: 'Mandarin',
            data: [6, 1, 1, 2]
          },
          {
            name: 'japones',
            data: [3, 3, 5, 8]
          },
          {
            name: 'Portugues',
            data: [5, 2, 3, 6 ]
          },
        ]

      })

    },
    crearChart() {
      let vue3 = this;
      vue3.chart = Highcharts.chart('container', {
        chart: {
          type: 'column'
        },
        title: {
          text: 'Horas por Materia Semanal'
        },
        subtitle: {
          text: "Comparacion por materia" /*'Click the columns to view versions. Source: <a href="http://statcounter.com" target="_blank">statcounter.com</a>'*/
        },
        accessibility: {
          announceNewData: {
            enabled: true
          }
        },
        xAxis: {
          type: 'category'
        },
        yAxis: {
          title: {
            text: 'Total Horas de Estudio'
          }

        },
        legend: {
          enabled: false
        },
        plotOptions: {
          series: {
            borderWidth: 0,
            dataLabels: {
              enabled: true,
              format: '{point.y:.1f}%'
            }
          }
        },

        tooltip: {
          headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
          pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
        },

        series: [
          {
            name: "Materia",
            colorByPoint: true,
            data: vue3.chart2
          }
        ],

      });
    },
    creartabla(){
      let vue=this;
      axios.get("http://localhost:5050/Home/200").
      then(function(response){
        vue.post=response.data
        // console.log(vue.post)
      } )
      vue.fields=[{
        key:"name",
        label:"Materia"
      },
        {
          key: "y",
          label: "Horas Estudio"
        },
        "Nota Promedio"]
    },
    crearMeta(){
      let vue=this;
      vue.alas= Highcharts.chart('containerAlas', {

        chart: {
          polar: true,
          type: 'line'
        },

        accessibility: {
          description: 'A spiderweb chart compares the allocated budget against actual spending within an organization. The spider chart has six spokes. Each spoke represents one of the 6 departments within the organization: sales, marketing, development, customer support, information technology and administration. The chart is interactive, and each data point is displayed upon hovering. The chart clearly shows that 4 of the 6 departments have overspent their budget with Marketing responsible for the greatest overspend of $20,000. The allocated budget and actual spending data points for each department are as follows: Sales. Budget equals $43,000; spending equals $50,000. Marketing. Budget equals $19,000; spending equals $39,000. Development. Budget equals $60,000; spending equals $42,000. Customer support. Budget equals $35,000; spending equals $31,000. Information technology. Budget equals $17,000; spending equals $26,000. Administration. Budget equals $10,000; spending equals $14,000.'
        },

        title: {
          text: 'Tiempo vs Nota',
          x: -80
        },

        pane: {
          size: '80%'
        },

        xAxis: {
          categories: ['Ingles', 'Frances', 'Italiano', 'Alemman',
            'Ruso', 'Mandarin',"Japones","Portugues"],
          tickmarkPlacement: 'on',
          lineWidth: 0
        },

        yAxis: {
          gridLineInterpolation: 'polygon',
          lineWidth: 0,
          min: 0
        },

        tooltip: {
          shared: true,
          pointFormat: '<span style="color:{series.color}">{series.name}: <b>%{point.y:,.0f}</b><br/>'
        },

        legend: {
          align: 'right',
          verticalAlign: 'middle',
          layout: 'vertical'
        },

        series: [{
          name: 'Nota',
          data: [30, 25, 65, 85, 50, 65,20,26],
          pointPlacement: 'on'
        }, {
          name: 'Horas Estudiadas',
          data: [48, 39, 42, 31, 26, 14,12,30],
          pointPlacement: 'on'
        }],

        responsive: {
          rules: [{
            condition: {
              maxWidth: 500
            },
            chartOptions: {
              legend: {
                align: 'center',
                verticalAlign: 'bottom',
                layout: 'horizontal'
              },
              pane: {
                size: '70%'
              }
            }
          }]
        }

      });

       vue.meta= Highcharts.chart('containerMeta', {

            chart: {
              type: 'gauge',
              plotBackgroundColor: null,
              plotBackgroundImage: null,
              plotBorderWidth: 0,
              plotShadow: false
            },

            title: {
              text: '% Objetivo'
            },

            pane: {
              startAngle: -150,
              endAngle: 150,
              background: [{
                backgroundColor: {
                  linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 },
                  stops: [
                    [0, '#FFF'],
                    [1, '#333']
                  ]
                },
                borderWidth: 0,
                outerRadius: '109%'
              }, {
                backgroundColor: {
                  linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 },
                  stops: [
                    [0, '#333'],
                    [1, '#FFF']
                  ]
                },
                borderWidth: 1,
                outerRadius: '107%'
              }, {
                // default background
              }, {
                backgroundColor: '#DDD',
                borderWidth: 0,
                outerRadius: '105%',
                innerRadius: '103%'
              }]
            },

            // the value axis
            yAxis: {
              min: 0,
              max: 100,

              minorTickInterval: 'auto',
              minorTickWidth: 1,
              minorTickLength: 10,
              minorTickPosition: 'inside',
              minorTickColor: '#666',

              tickPixelInterval: 30,
              tickWidth: 2,
              tickPosition: 'inside',
              tickLength: 10,
              tickColor: '#666',
              labels: {
                step: 2,
                rotation: 'auto'
              },
              title: {
                text: 'Meta %'
              },
              plotBands: [{
                from: 0,
                to: 40,
                color: '#DF5353' // green
              }, {
                from: 40,
                to: 75,
                color: '#DDDF0D' // yellow
              }, {
                from: 75,
                to: 100,
                color: '#55BF3B' // red
              }]
            },

            series: [{
              name: 'Meta',
              data: [30],
              tooltip: {
                valueSuffix: '%'
              }
            }]

          },

// Add some life
          /*   function (chart) {
               if (!chart.renderer.forExport) {
                 setInterval(function () {
                   var point = chart.series[0].points[0],
                       newVal,
                       inc = Math.round((Math.random() - 0.5) * 20);

                   newVal = point.y + inc;
                   if (newVal < 0 || newVal > 200) {
                     newVal = point.y - inc;
                   }

                   point.update(newVal);

                 }, 3000);
               }
             }*/);

     vue.notas=Highcharts.chart('containerNotas', {
        colors: ['#DF5353', '#DDDF0D', '#55BF3B'],
        chart: {
          type: 'column',
          inverted: true,
          polar: true
        },
        title: {
          text: 'Notas Promedio de Materia'
        },
        tooltip: {
          outside: true
        },
        pane: {
          size: '85%',
          innerSize: '20%',
          endAngle: 270
        },
        xAxis: {
          tickInterval: 1,
          labels: {
            align: 'right',
            useHTML: true,
            allowOverlap: true,
            step: 1,
            y: 3,
            style: {
              fontSize: '13px'
            }
          },
          lineWidth: 0,
          categories: [
            'Ingles <span class="f16"><span id="flag" class="flag no">' +
            '</span></span>',
            'Frances  <span class="f16"><span id="flag" class="flag us">' +
            '</span></span>',
            'Italiano <span class="f16"><span id="flag" class="flag de">' +
            '</span></span>',
            'Aleman <span class="f16"><span id="flag" class="flag ca">' +
            '</span></span>',
            'Mandarin <span class="f16"><span id="flag" class="flag at">' +
            '</span></span>',
            'Japones <span class="f16"><span id="flag" class="flag at">' +
            '</span></span>',
            'Portugues <span class="f16"><span id="flag" class="flag at">' +
            '</span></span>',
          ]
        },
        yAxis: {
          crosshair: {
            enabled: true,
            color: '#333'
          },
          lineWidth: 3,
          tickInterval: 0.5,
          reversedStacks: false,
          endOnTick: true,
          showLastLabel: true
        },
        plotOptions: {
          column: {
            stacking: 'normal',
            borderWidth: 0,
            pointPadding: 0,
            groupPadding: 0.30
          }
        },
        series: [{
          name:" Primera Nota",
          data: [1.8, 1, 0.3, 1.1, 1.4,1.5,0.7]
        }, {
          name:"Segunda Nota",
          data: [1.3,1.2, 0.8, 1, 0.6,0.3,0.2]
        }, {
          name: "Tercera Nota",
          data: [1.6, 1.5, 1.2, 1.3, 1.2,1.1,1.3]
        }]
      });


    },
    crearTodas(){
      let vue=this;
        vue.post=vue.chart2
      vue.bandera=true;
        // console.log(vue.post)

      vue.fields=[{
        key:"name",
        label:"Materia"
      },
        {
          key: "y",
          label: "Horas Estudio"
        },
        "Nota Promedio"]

      vue.chartorta=Highcharts.chart('container5', {
        chart: {
          type: 'pie'
        },
        title: {
          text: 'Horas por Materia. Semanal'
        },
        series: [{
          name: 'Materias',
          colorByPoint: true,
          data: vue.chart2
        }]
      });

      vue.chart = Highcharts.chart('container', {
        chart: {
          type: 'column'
        },
        title: {
          text: 'Horas por Materia. Semanal'
        },
        subtitle: {
          text: "Comparacion por materia" /*'Click the columns to view versions. Source: <a href="http://statcounter.com" target="_blank">statcounter.com</a>'*/
        },
        accessibility: {
          announceNewData: {
            enabled: true
          }
        },
        xAxis: {
          type: 'category'
        },
        yAxis: {
          title: {
            text: 'Total Horas de Estudio'
          }

        },
        legend: {
          enabled: false
        },
        plotOptions: {
          series: {
            borderWidth: 0,
            dataLabels: {
              enabled: true,
              format: '{point.y:.1f}'
            }
          }
        },

        tooltip: {
          headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
          pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}</b> Horas<br/>'
        },

        series: [
          {
            name: "Materia",
            colorByPoint: true,
            data: vue.chart2
          }
        ],

      });


    },
    updateTorta(){
      let vue=this;
      vue.chartorta.update({
        series: [{
          name: 'Materias',
          colorByPoint: true,
          data: vue.chart5
        }]

      })
    },

    updateChart() {
      let vue4 = this;
      var newChartSeries = [
        {
          name: "Browsers",
          colorByPoint: true,
          data: [

          ]
        }
      ];
      vue4.chart.update({
        //series:newChartSeries
        series: [
          {
            name: "Materia",
            colorByPoint: true,
            data: vue4.chart5
          }
        ],

      })
      console.log(vue4.chart5)
    },
    updateMensual(){
      let vue=this;
      vue.chart.update({
        title: {
          text: 'Horas por Materia. Mensual'
        },
        //series:newChartSeries
        series: [
          {
            name: "Materia",
            colorByPoint: true,
            data: vue.chart5
          }
        ],
      })
      vue.chartorta.update({
        title: {
          text: 'Horas por Materia. Mensual'
        },
        series: [{
          name: 'Materias',
          colorByPoint: true,
          data: vue.chart5
        }]

      })
      vue.post=vue.chart5


    },
    updateAnual(){
      let vue=this;
      vue.chart.update({
        title: {
          text: 'Horas por Materia. Anual'
        },
        //series:newChartSeries
        series: [
          {
            name: "Materia",
            colorByPoint: true,
            data: vue.chartUpdate
          }
        ],
      })
      vue.chartorta.update({
        title: {
          text: 'Horas por Materia. Anual'
        },
        series: [{
          name: 'Materias',
          colorByPoint: true,
          data: vue.chartUpdate
        }]

      })
      vue.post=vue.chartUpdate


    },
    updateSemanal(){
      let vue=this;
      vue.chart.update({
        title: {
          text: 'Horas por Materia. Semanal'
        },
        //series:newChartSeries
        series: [
          {
            name: "Materia",
            colorByPoint: true,
            data: vue.chartSem
          }
        ],
      })
      vue.chartorta.update({
        title: {
          text: 'Horas por Materia. Semanal'
        },
        series: [{
          name: 'Materias',
          colorByPoint: true,
          data: vue.chartSem
        }]

      })
      vue.post=vue.chartSem


    }
  }




}


</script>

<style scoped>
.btn:hover {
  background-color: #e9ecef;

}

.li1 {
  width: 33.3%;
  list-style: none;

}

.li2 {
  width: 33.3%;
  list-style: none;

}



.li3 {
  width: 33.3%;
  list-style: none;

}

.lihig {
  width: 33.3%;
  list-style: none;
}

.liDatauser {
  width: 33.3%;
  list-style: none;
}
.torta{
  width: 33.3%;
  list-style: none;
}
.list-group-horizontal{
  margin-left: 120px;
  margin-right: 120px;

}
.buttons{
  margin-top: 120px;
}
.centrif{
  margin-left: 120px;
  margin-right: 120px;
  list-style: none;
}

.primer_gr{
  margin-top: 150px;
}

.lista1{
  width: 33.3%;
  list-style: none;

}
.lista2{
  width: 33.3%;
  list-style: none;


}
.lista3{
  width: 33.3%;
  list-style: none;

}
header{
  height: 100%;
  width: 100%;
  display: flex;
  align-content: center;
}
.header-video{
  position: absolute;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  overflow: hidden;
}
.header-video video{
  min-width: 100%;
  min-height: 100%;
}
.header-overlay{
  height:100vh ;
  width: 100vw ;
  top: 0;
  left: 0;
  position: absolute;
  background: #303952;
  z-index: 1;
  opacity: .7;
}
.header-content{
  height: 100vh;
  width: 100vw;
  z-index: 2;
}
.header-content-complet{
  width: 100vw;
  height: 100vh;
}

.tabla{
  background-color: #e9ecef;
}
.Notas{
  width: 33%;
  margin-left: 5px;
  list-style: none;

}
.Meta{
  width: 33%;
  list-style: none;

}
.Alas{
  margin-left: 5px;
  width: 33%;
  list-style: none;
}













</style>