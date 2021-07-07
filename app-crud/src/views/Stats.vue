<template>
  <div class="home">
    <HeaderLogged />
    <crud/>

  </div>

</template>

<script>
/*import Chart from "@/components/Chart";*/
import Crud from "@/components/crud";
import HeaderLogged from '@/components/HeaderLogged.vue'

/*import DataUsers from "@/components/DataUsers";*/
/*import Customer from "@/components/Customer";*/


export default {
  name: "Stats",
  components:{
    /* Chatchange,*/
  /*  Chart,*/
    HeaderLogged,
    Crud,
   /* DataUsers,*/
   /* Customer*/
  }
};
</script>

<style scoped>

</style>