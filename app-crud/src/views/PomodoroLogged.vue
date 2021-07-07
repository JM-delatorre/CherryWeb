<template>
  <div >

    <HeaderLogged/>


    <Tempo/>



  </div>

</template>

<script>
import Header from '@/components/Header.vue'
import Tempo from '@/components/Tempo.vue'
import HeaderLogged from "@/components/HeaderLogged.vue";

//import HelloWorld from '../components/HelloWorld.vue'
//import BarraNavegacionOpcion2 from '@/components/BarraNavegacionOpcion2.vue'
export default {
  name: 'PomodorojsLogged',
  components: {
    HeaderLogged,
    Tempo

  }
}


</script>
