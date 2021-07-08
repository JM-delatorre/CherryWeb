<template>
  <div >

    <HeaderLogged />
    <VerCalendario>

    </VerCalendario>



  </div>

</template>

<script>
import HeaderLogged from '@/components/HeaderLogged.vue'
import VerCalendario from "../components/VerCalendario";
export default {
  name:'CalendarA',
  components:{
    HeaderLogged,
    VerCalendario
  }
}
</script>