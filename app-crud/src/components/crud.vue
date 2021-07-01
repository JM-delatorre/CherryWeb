<template>
  <div>
    <section class="primer_gr">
      <ul class="list-group list-group-horizontal">
        <li class="lista1">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearTodas()" class="btn"  href="#container5">
              <p class="margen_inferior_1em" >
                <img src="../assets/img/statistics-5041374_960_720.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>

          </div>
        </li>
        <li class="lista2">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearComparar" class="btn" href="#containerComparar" >
              <p class="margen_inferior_1em">
                <img src="../assets/img/power.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>
          </div>
        </li>
        <li class="lista3">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearMeta()" class="btn" href="#containerMeta">
              <p class="margen_inferior_1em">
                <img src="../assets/img/ilustrator.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
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
            <a v-on:click="updateChart()" class="btn" href="#container5" >
              <p class="margen_inferior_1em">
                <img src="../assets/img/rotar.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>
          </div>
        </li>
        <li class="li2">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="creartabla()" class="btn" >
              <p class="margen_inferior_1em">
                <img src="../assets/img/cal2.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>
          </div>
        </li>
        <li class="li3">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearChart()" class="btn">
              <p class="margen_inferior_1em">
                <img src="../assets/img/personalization-statistics.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>
          </div>
        </li>
        <li class="li4">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearChart()" class="btn" >
              <p class="margen_inferior_1em">
                <img src="../assets/img/calendarioilustra.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>
          </div>
        </li>

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
          <b-table striped hover :items="post" :fields="fields" ></b-table>
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
          <div class="centrif">
            <figure class="highcharts-figure">
              <div id="containerMeta" ></div>
              <p class="highcharts-description">
              </p>
            </figure>
          </div>

        </li>
        <li class="Notas">
          <div class="centrif">
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



</template>

<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script
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

<!-- Latest compiled and minified JavaScript -->


<script>

import axios from "axios";
import DataUsers from "@/components/DataUsers";
import HighchartsVue from 'highcharts-vue'
import Highcharts from 'highcharts'
import HighchartsMore from 'highcharts/highcharts-more'
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
    let vue2 = this;
    return {
      hover: false,
     /* datos: [],*/
      post:[],
      fields:[
      ]


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
          data: [3, 4, 3, 5, 4, 10, 12]
        }, {
          name: 'Frances',
          data: [1, 3, 4, 3, 3, 5, 4]
        },
          {
            name: 'Italiano',
            data: [2, 1, 1, 6, 9, 5, 4]
          },
          {
            name: 'Aleman',
            data: [1, 1, 1, 6, 9, 6, 4]
          },
          {
            name: 'Ruso',
            data: [2, 3, 3, 5, 7, 6, 4]
          },
          {
            name: 'Mandarin',
            data: [10, 1, 1, 2, 3, 1, 4]
          }
        ]
      });

    },
    crearChart() {
      let vue3 = this;
      vue3.chart = Highcharts.chart('container', {
        chart: {
          type: 'column'
        },
        title: {
          text: 'Horas por Materia. Enero, 2021'
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
       vue.meta= Highcharts.chart('containerMeta', {

            chart: {
              type: 'gauge',
              plotBackgroundColor: null,
              plotBackgroundImage: null,
              plotBorderWidth: 0,
              plotShadow: false
            },

            title: {
              text: 'Meta Meter'
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
            '</span></span>'
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
          name:" Nota Baja",
          data: [1.8, 1, 0, 0.5, 0]
        }, {
          name:"Nota Media",
          data: [0,0, 0, 0, 0]
        }, {
          name: " Nota Alta",
          data: [1, 1.5, 1.2, 1.3, 1.2]
        }]
      });


    },
    crearTodas(){
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

      vue.chart = Highcharts.chart('container', {
        chart: {
          type: 'column'
        },
        title: {
          text: 'Horas por Materia. Enero, 2021'
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
    }
  }




}


</script>

<style scoped>
.btn:hover {
  background: #BF0866;

}

.li1 {
  width: 25%;
  list-style: none;
}

.li2 {
  width: 25%;
  list-style: none;
}

.li4 {
  width: 25%;
  list-style: none;
}

.li3 {
  width: 25%;
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








</style>