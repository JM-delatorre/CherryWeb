<template>
  <div>
    <HeaderLogged/>
    <HomeLoggedComponent/>
  </div>

</template>

<script>

import HeaderLogged from '@/components/HeaderLogged.vue'
import HomeLoggedComponent from '@/components/HomeLoggedComponent.vue'

export default {
  name: 'HomeLogged',
  components: {
    HomeLoggedComponent,
    HeaderLogged
  }
}
</script>

