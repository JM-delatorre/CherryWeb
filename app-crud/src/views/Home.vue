<template>
  <div class="home">
    <HelloWorld/>
  </div>




</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
//import BarraNavegacionOpcion2 from '@/components/BarraNavegacionOpcion2.vue'
export default {
  name: 'Home',
  components: {
    HelloWorld

  }
}
</script>
