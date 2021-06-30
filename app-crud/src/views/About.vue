<template>
  <div class="home">
<!--    <Chatchange/>>-->
    <Chart/>
    <crud/>
    <Customer/>
    <DataUsers/>



  </div>

</template>

<script>

import Customer from "@/components/Customer.vue";
import DataUsers from "@/components/DataUsers";
import Crud from "@/components/crud";
import Chart from "@/components/Chart";



export default {
  name: "graps",
  components:{
   /* Chatchange,*/

    Crud,
    DataUsers,
    Customer,
    Chart

  }

};
</script>

