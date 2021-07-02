<template>
  <div>
    <Header />
    <HelloWorld/>
  </div>

</template>

<script>
// @ is an alias to /src
import Header from '@/components/Header.vue'
import HelloWorld from '@/components/HelloWorld.vue'
//import BarraNavegacionOpcion2 from '@/components/BarraNavegacionOpcion2.vue'
export default {
  name: 'Home',
  components: {
    HelloWorld,
    Header

  }
}
</script>
