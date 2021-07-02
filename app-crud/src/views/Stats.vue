<template>
  <div class="home">
    <Header />
    <crud/>

  </div>

</template>

<script>
/*import Chart from "@/components/Chart";*/
import Crud from "@/components/crud";
import Header from '@/components/Header.vue'
/*import DataUsers from "@/components/DataUsers";*/
/*import Customer from "@/components/Customer";*/

export default {
  name: "Stats",
  components:{
    /* Chatchange,*/
  /*  Chart,*/
    Header,
    Crud,
   /* DataUsers,*/
   /* Customer*/
  }
};
</script>

<style scoped>

</style>