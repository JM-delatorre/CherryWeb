import Vue from 'vue'
import App from './App.vue'
import router from './router'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'

import vuetify from './plugins/vuetify';

import HighchartsVue from "highcharts-vue";
import './assets/css/styles.css'
Vue.use(HighchartsVue);
Vue.config.productionTip = false
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin)
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

new Vue({
  router,
  vuetify,
  render: h => h(App)
}).$mount('#app')
