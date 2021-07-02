import Vue from 'vue'
import VueRouter from 'vue-router'

import Home from '../views/Home.vue'
import HomeLoggedprueba from "../views/HomeLogged.vue";
import Pomodorojs from '../views/Pomodoro.vue'
import LoginRegister from "@/views/LoginRegister";


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,

  },
  {
    path: '/stats',
    name: 'stats',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Stats')
  },

  {
    path: '/logged',
    name: 'HomeLogged',
    // route level code-splitting
    //     // this generates a separate chunk (about.[hash].js) for this route
    //     // which is lazy-loaded when the route is visited.
    //     //component: () => import(/* webpackChunkName: "about" */ '../views/HomeLogged.vue')
    component: HomeLoggedprueba
  }

  , {

    path: '/pomodoro',
    name: 'Pomodoro',
    // route level code-splitting
    //     // this generates a separate chunk (about.[hash].js) for this route
    //     // which is lazy-loaded when the route is visited.
    //     //component: () => import(/* webpackChunkName: "about" */ '../views/Pomodoro.vue')
    component: Pomodorojs
  }
  , {

    path: '/login',
    name: 'Login',
    component: LoginRegister
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
