<template>
  <div>
    <div class="buttons">
      <b-button v-on:click="crearChart() ">I am a Button</b-button>
      <b-button v-on:click="updateChart()">I am a Link</b-button>
      <b-button v-on:click="creartorat()">I am a Link2</b-button>
    </div>
    <section>
      <ul class="list-group list-group-horizontal">
        <li class="li1">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearChart()" class="btn" >
              <p class="margen_inferior_1em">
                <img src="../assets/img/statistics-5041374_960_720.png" alt=""></p>
              <p class="fuente_tam120">Agricultura y medio ambiente</p>
            </a>
          </div>
        </li>
        <li class="li2">
          <div class="vAlign" @mouseover="hover=true">
            <a v-on:click="crearChart()" class="btn" >
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
        <DataUsers/>
      </li>
      <li class="torta">
        <div id="container5" style="min-width: 310px; height: 400px; max-width: 600px; margin: 0 auto"></div>
      </li>
    </ul>
    <div class="centrif">
      <figure class="highcharts-figure">
        <div id="container6" ></div>
        <p class="highcharts-description">
          Chart showing ranges using horizontal columns. Each range is represented
          with a low and high value, with a bar between them.
        </p>
      </figure>
    </div>
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
  components: {
    DataUsers,

  },

  beforeCreate() {
    let vue = this;
   /* fetch("http://localhost:5050/Home/22")
        .then(resp => resp.json())
        .then(resp => {
          this.chartOptions.series[0].data = resp;
        });*/

    axios.get("http://localhost:5050/Home/23").then(function (response) {
      vue.chart2 = response.data
      console.log(vue.chart2)
    });
    axios.get("http://localhost:5050/Home/21").then(function (response) {
      vue.chart5 = response.data
      console.log(vue.chart5)
    });
  },

  data() {
    var chartorta;
    var charbase;
    var chart2;
    var chart5;
    var chart;
    let vue2 = this;
    return {
      hover: false,
      datos: [],

     /* chartOptions: {
        chart: {
          type: "column"
        },
        title: {
          text: 'Browser market shares. January, 2018'
        },
        subtitle: {
          text: 'Click the columns to view versions. Source: <a href="http://statcounter.com" target="_blank">statcounter.com</a>'
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
            text: 'Total percent market share'
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
            data: vue2.datos
          }
        ],
        drilldown: {
          series: [
            {
              name: "Chrome",
              id: "Chrome",
              data: [
                [
                  "v65.0",
                  0.1
                ],
                [
                  "v64.0",
                  1.3
                ],
                [
                  "v63.0",
                  53.02
                ],
                [
                  "v62.0",
                  1.4
                ],
                [
                  "v61.0",
                  0.88
                ],
                [
                  "v60.0",
                  0.56
                ],
                [
                  "v59.0",
                  0.45
                ],
                [
                  "v58.0",
                  0.49
                ],
                [
                  "v57.0",
                  0.32
                ],
                [
                  "v56.0",
                  0.29
                ],
                [
                  "v55.0",
                  0.79
                ],
                [
                  "v54.0",
                  0.18
                ],
                [
                  "v51.0",
                  0.13
                ],
                [
                  "v49.0",
                  2.16
                ],
                [
                  "v48.0",
                  0.13
                ],
                [
                  "v47.0",
                  0.11
                ],
                [
                  "v43.0",
                  0.17
                ],
                [
                  "v29.0",
                  0.26
                ]
              ]
            },
            {
              name: "Firefox",
              id: "Firefox",
              data: [
                [
                  "v58.0",
                  1.02
                ],
                [
                  "v57.0",
                  7.36
                ],
                [
                  "v56.0",
                  0.35
                ],
                [
                  "v55.0",
                  0.11
                ],
                [
                  "v54.0",
                  0.1
                ],
                [
                  "v52.0",
                  0.95
                ],
                [
                  "v51.0",
                  0.15
                ],
                [
                  "v50.0",
                  0.1
                ],
                [
                  "v48.0",
                  0.31
                ],
                [
                  "v47.0",
                  0.12
                ]
              ]
            },
            {
              name: "Internet Explorer",
              id: "Internet Explorer",
              data: [
                [
                  "v11.0",
                  6.2
                ],
                [
                  "v10.0",
                  0.29
                ],
                [
                  "v9.0",
                  0.27
                ],
                [
                  "v8.0",
                  0.47
                ]
              ]
            },
            {
              name: "Safari",
              id: "Safari",
              data: [
                [
                  "v11.0",
                  3.39
                ],
                [
                  "v10.1",
                  0.96
                ],
                [
                  "v10.0",
                  0.36
                ],
                [
                  "v9.1",
                  0.54
                ],
                [
                  "v9.0",
                  0.13
                ],
                [
                  "v5.1",
                  0.2
                ]
              ]
            },
            {
              name: "Edge",
              id: "Edge",
              data: [
                [
                  "v16",
                  2.6
                ],
                [
                  "v15",
                  0.92
                ],
                [
                  "v14",
                  0.4
                ],
                [
                  "v13",
                  0.1
                ]
              ]
            },
            {
              name: "Opera",
              id: "Opera",
              data: [
                [
                  "v50.0",
                  0.96
                ],
                [
                  "v49.0",
                  0.82
                ],
                [
                  "v12.1",
                  0.14
                ]
              ]
            }
          ]
        }


      },*/

    }
  },
mounted() {
    let vue=this;
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
},
  methods: {
    creartorat(){
      let vue=this;
      vue.chartorta=Highcharts.chart('container5', {
        chart: {
          type: 'pie'
        },
        series: [{
          name: 'Brands',
          colorByPoint: true,
          data: [{
            name: 'Chrome',
            y: 61.41,
            sliced: true,
            selected: true
          }, {
            name: 'Internet Explorer',
            y: 11.84
          }, {
            name: 'Firefox',
            y: 10.85
          }, {
            name: 'Edge',
            y: 4.67
          }, {
            name: 'Safari',
            y: 4.18
          }, {
            name: 'Sogou Explorer',
            y: 1.64
          }, {
            name: 'Opera',
            y: 1.6
          }, {
            name: 'QQ',
            y: 1.2
          }, {
            name: 'Other',
            y: 2.61
          }]
        }]
      });
    },
    crearChart() {
      let vue3 = this;
      vue3.chart = Highcharts.chart('container', {
        chart: {
          type: 'column'
        },
        title: {
          text: 'Browser market shares. January, 2018'
        },
        subtitle: {
          text: 'Click the columns to view versions. Source: <a href="http://statcounter.com" target="_blank">statcounter.com</a>'
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
            text: 'Total percent market share'
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
            name: "Browsers",
            colorByPoint: true,
            data: vue3.chart2
          }
        ],
        drilldown: {
          series: [
            {
              name: "Chrome",
              id: "Chrome",
              data: [
                [
                  "v65.0",
                  0.1
                ],
                [
                  "v64.0",
                  1.3
                ],
                [
                  "v63.0",
                  53.02
                ],
                [
                  "v62.0",
                  1.4
                ],
                [
                  "v61.0",
                  0.88
                ],
                [
                  "v60.0",
                  0.56
                ],
                [
                  "v59.0",
                  0.45
                ],
                [
                  "v58.0",
                  0.49
                ],
                [
                  "v57.0",
                  0.32
                ],
                [
                  "v56.0",
                  0.29
                ],
                [
                  "v55.0",
                  0.79
                ],
                [
                  "v54.0",
                  0.18
                ],
                [
                  "v51.0",
                  0.13
                ],
                [
                  "v49.0",
                  2.16
                ],
                [
                  "v48.0",
                  0.13
                ],
                [
                  "v47.0",
                  0.11
                ],
                [
                  "v43.0",
                  0.17
                ],
                [
                  "v29.0",
                  0.26
                ]
              ]
            },
            {
              name: "Firefox",
              id: "Firefox",
              data: [
                [
                  "v58.0",
                  1.02
                ],
                [
                  "v57.0",
                  7.36
                ],
                [
                  "v56.0",
                  0.35
                ],
                [
                  "v55.0",
                  0.11
                ],
                [
                  "v54.0",
                  0.1
                ],
                [
                  "v52.0",
                  0.95
                ],
                [
                  "v51.0",
                  0.15
                ],
                [
                  "v50.0",
                  0.1
                ],
                [
                  "v48.0",
                  0.31
                ],
                [
                  "v47.0",
                  0.12
                ]
              ]
            },
            {
              name: "Internet Explorer",
              id: "Internet Explorer",
              data: [
                [
                  "v11.0",
                  6.2
                ],
                [
                  "v10.0",
                  0.29
                ],
                [
                  "v9.0",
                  0.27
                ],
                [
                  "v8.0",
                  0.47
                ]
              ]
            },
            {
              name: "Safari",
              id: "Safari",
              data: [
                [
                  "v11.0",
                  3.39
                ],
                [
                  "v10.1",
                  0.96
                ],
                [
                  "v10.0",
                  0.36
                ],
                [
                  "v9.1",
                  0.54
                ],
                [
                  "v9.0",
                  0.13
                ],
                [
                  "v5.1",
                  0.2
                ]
              ]
            },
            {
              name: "Edge",
              id: "Edge",
              data: [
                [
                  "v16",
                  2.6
                ],
                [
                  "v15",
                  0.92
                ],
                [
                  "v14",
                  0.4
                ],
                [
                  "v13",
                  0.1
                ]
              ]
            },
            {
              name: "Opera",
              id: "Opera",
              data: [
                [
                  "v50.0",
                  0.96
                ],
                [
                  "v49.0",
                  0.82
                ],
                [
                  "v12.1",
                  0.14
                ]
              ]
            }
          ]
        }
      });
    },
    updateChart() {
      let vue4 = this;
      var newChartSeries = [
        {
          name: "Browsers",
          colorByPoint: true,
          data: [
            {
              name: "Chrome",
              y: 62.74,
              drilldown: "Chrome"
            },
            {
              name: "Firefox",
              y: 100.57,
              drilldown: "Firefox"
            },
            {
              name: "Internet Explorer",
              y: 75.23,
              drilldown: "Internet Explorer"
            },
            {
              name: "Safari",
              y: 55.58,
              drilldown: "Safari"
            },
            {
              name: "Edge",
              y: 4.02,
              drilldown: "Edge"
            },
            {
              name: "Opera",
              y: 1.92,
              drilldown: "Opera"
            },
            {
              name: "Other",
              y: 7.62,
              drilldown: null
            }
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








</style>